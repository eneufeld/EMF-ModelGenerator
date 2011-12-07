/**
 * 
 */
package org.eclipse.emf.modelmutator.intern;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.api.ModelMutatorUtil;

/**
 * @author Eugen Neufeld
 * 
 */
public abstract class AbstractModelMutator {

	protected final ModelMutatorConfiguration configuration;

	public AbstractModelMutator(ModelMutatorConfiguration config) {
		this.configuration = config;
	}

	public abstract void preMutate();

	public abstract void postMutate();

	public void mutate() {
		preMutate();
		
		setContaintments();

		// TODO set references
		postMutate();
	}

	private void setContaintments() {
		Map<Integer, List<EObject>> depthToParentObjects = new LinkedHashMap<Integer, List<EObject>>();
		List<EObject> parentsInThisDepth = new LinkedList<EObject>();
		parentsInThisDepth.add(configuration.getRootEObject());
		int currentDepth = 0;
		depthToParentObjects.put(1, new LinkedList<EObject>());
		while (currentDepth < configuration.getDepth()) {
			// for all parent EObjects in this depth

			for (EObject nextParentEObject : parentsInThisDepth) {
				ModelMutatorUtil.setEObjectAttributes(nextParentEObject, configuration.getRandom(), configuration.getExceptionLog(), configuration.isIgnoreAndLog());
				List<EObject> children = generateChildren(nextParentEObject);
				// will the just created EObjects have children?
				depthToParentObjects.get(currentDepth + 1).addAll(children);
			}

			// proceed to the next level
			currentDepth++;
			parentsInThisDepth = depthToParentObjects.get(currentDepth);
			depthToParentObjects.put((currentDepth + 1), new LinkedList<EObject>());
		}
	}

	/**
	 * Generates children for a certain parent EObject. Generation includes
	 * setting containment references and attributes. All required references
	 * are set first, thus the specified width might be exceeded.
	 * 
	 * @param parentEObject
	 *            the EObject to generate children for
	 * @return all generated children as a list
	 * @see #generateContainments(EObject, EReference, int)
	 */
	private List<EObject> generateChildren(EObject parentEObject) {
		Map<EReference, List<EObject>> currentContainments = new HashMap<EReference, List<EObject>>();
		List<EObject> result = new LinkedList<EObject>();
		for (EObject curChild : parentEObject.eContents()) {
			if (!currentContainments.containsKey(curChild.eContainmentFeature()))
				currentContainments.put(curChild.eContainmentFeature(), new LinkedList<EObject>());
			currentContainments.get(curChild.eContainmentFeature()).add(curChild);
			result.add(curChild);
		}

		List<EReference> references = new LinkedList<EReference>();
		for (EReference reference : parentEObject.eClass().getEAllContainments()) {
			if (configuration.geteStructuralFeaturesToIgnore().contains(reference)
					|| !ModelMutatorUtil.isValid(reference, parentEObject, configuration.getExceptionLog(), configuration.isIgnoreAndLog())) {
				continue;
			}
			references.add(reference);
			int numCurrentContainments = 0;
			if (currentContainments.containsKey(reference))
				numCurrentContainments = currentContainments.get(reference).size();
			List<EObject> contain = generateMinContainments(parentEObject, reference, reference.getLowerBound() - numCurrentContainments);
			if (!currentContainments.containsKey(reference))
				currentContainments.put(reference, new LinkedList<EObject>());
			currentContainments.get(reference).addAll(contain);

			result.addAll(contain);
		}
		if (references.size() != 0) {
			for (int i = result.size(); i < configuration.getWidth() && references.size() != 0; i++) {
				Collections.shuffle(references, configuration.getRandom());
				EReference reference = references.get(0);
				int upperBound=Integer.MAX_VALUE;
				if(reference.getUpperBound()!=EReference.UNBOUNDED_MULTIPLICITY&&reference.getUpperBound()!=EReference.UNSPECIFIED_MULTIPLICITY)
					upperBound=reference.getUpperBound();
				if (currentContainments.get(reference).size() < upperBound) {
					List<EObject> contain = generateMinContainments(parentEObject, reference, 1);
					if (!currentContainments.containsKey(reference))
						currentContainments.put(reference, new LinkedList<EObject>());
					currentContainments.get(reference).addAll(contain);
					result.addAll(contain);
				} else {
					references.remove(reference);
					i--;
				}
			}
		}
		return result;
	}

	private List<EObject> generateMinContainments(EObject parentEObject, EReference reference, int width) {
		List<EObject> result = new LinkedList<EObject>();
		for (int i = 0; i < width; i++) {
			EClass eClass = getValidEClass(reference);

			// create child and add it to parentEObject
			EObject newChild = setContainment(parentEObject, eClass, reference);
			// was creating the child successful?
			if (newChild != null) {
				result.add(newChild);
			}
		}
		return result;
	}

	private EClass getValidEClass(EReference eReference) {
		List<EClass> allEClasses = new LinkedList<EClass>();

		allEClasses.addAll(ModelMutatorUtil.getAllEContainments(eReference));

		// only allow EClasses that appear in the specified EPackage
		allEClasses.retainAll(ModelMutatorUtil.getAllEClasses(configuration.getModelPackage()));
		// don't allow any EClass or sub class of all EClasses specified in
		// ignoredClasses
		for (EClass eClass : configuration.geteClassesToIgnore()) {
			allEClasses.remove(eClass);
			allEClasses.removeAll(ModelMutatorUtil.getAllSubEClasses(eClass));
		}
		if (allEClasses.isEmpty()) {
			// no valid EClass left
			return null;
		}
		// random seed all the time
		Collections.shuffle(allEClasses, configuration.getRandom());
		return allEClasses.get(0);
	}

	/**
	 * Creates a valid instance of <code>childClass</code> (includes setting
	 * attributes) and sets it as a child of <code>parentEObject</code> using
	 * AddCommand/SetCommand.
	 * 
	 * @param parentEObject
	 *            the EObject that shall contain the new instance of
	 *            <code>childClass</code>
	 * @param childClass
	 *            the EClass of the child that shall be contained in
	 *            <code>parentEObject</code>
	 * @param reference
	 *            the containment reference
	 * @return the instance of <code>childClass</code> that is contained in
	 *         <code>parentEObject</code> or <code>null</code> if the operation
	 *         failed
	 * 
	 * @see ModelGeneratorUtil#addPerCommand(EObject, EStructuralFeature,
	 *      Object, Set, boolean)
	 * @see ModelGeneratorUtil#setPerCommand(EObject, EStructuralFeature,
	 *      Object, Set, boolean)
	 */
	protected EObject setContainment(EObject parentEObject, EClass childClass, EReference reference) {
		// create and set attributes
		EObject newEObject = EcoreUtil.create(childClass);
		ModelMutatorUtil.setEObjectAttributes(newEObject, configuration.getRandom(), configuration.getExceptionLog(), configuration.isIgnoreAndLog());
		// reference created EObject to the parent
		if (reference.isMany()) {
			return ModelMutatorUtil.addPerCommand(parentEObject, reference, newEObject, configuration.getExceptionLog(), configuration.isIgnoreAndLog());
		} else {
			return ModelMutatorUtil.setPerCommand(parentEObject, reference, newEObject, configuration.getExceptionLog(), configuration.isIgnoreAndLog());
		}
	}
}
