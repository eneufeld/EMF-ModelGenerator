/**
 * 
 */
package org.eclipse.emf.modelmutator.intern;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
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

	public abstract void mutate();

	protected EClass getValidEClass() {
		List<EClass> allEClasses = new LinkedList<EClass>();
		for (EReference reference : configuration.getRootEObject().eClass().getEAllContainments()) {
			allEClasses.addAll(ModelMutatorUtil.getAllEContainments(reference));
		}
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
		Collections.shuffle(allEClasses, configuration.getRandom());
		return allEClasses.get(0);
	}

	protected void addElement(EObject parent, Collection<EObject> children) {
		Map<EClass, List<EObject>> result = new LinkedHashMap<EClass, List<EObject>>();
		List<EObject> newList = new LinkedList<EObject>();
		newList.add(parent);
		result.put(parent.eClass(), newList);

		for (EReference reference : parent.eClass().getEAllContainments()) {
			if (configuration.geteStructuralFeaturesToIgnore().contains(reference))
				continue;
			for (EObject child : children) {
				ModelMutatorUtil.addPerCommand(parent, reference, child, configuration.getExceptionLog(), configuration.isIgnoreAndLog());
			}
		}
	}
}
