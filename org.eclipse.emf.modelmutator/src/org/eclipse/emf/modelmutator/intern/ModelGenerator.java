/**
 * 
 */
package org.eclipse.emf.modelmutator.intern;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.api.ModelMutatorUtil;

/**
 * @author Eugen Neufeld
 * 
 */
public class ModelGenerator extends AbstractModelMutator {

	public ModelGenerator(ModelMutatorConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void preMutate() {

//		for (int i = 0; i < configuration.getWidth(); i++) {
//			EClass validClass = getValidEClass(configuration.getRootEObject(),configuration.getModelPackage(),configuration.geteClassesToIgnore(),configuration.getRandom());
//			if (validClass.isInterface() || validClass.isAbstract()) {
//				throw new IllegalArgumentException("Root mustn't be abstract or an interface!");
//			}
//			EObject eObject = EcoreUtil.create(validClass);
//
//			addElement(configuration.getRootEObject(), eObject);
//		}

	}

	@Override
	public void postMutate() {
		// TODO Auto-generated method stub

	}

	

	private void addElement(EObject parent, EObject child) {
		Map<EClass, List<EObject>> result = new LinkedHashMap<EClass, List<EObject>>();
		List<EObject> newList = new LinkedList<EObject>();
		newList.add(parent);
		result.put(parent.eClass(), newList);

		for (EReference reference : parent.eClass().getEAllContainments()) {
			if (configuration.geteStructuralFeaturesToIgnore().contains(reference))
				continue;

			ModelMutatorUtil.addPerCommand(parent, reference, child, configuration.getExceptionLog(), configuration.isIgnoreAndLog());

		}
	}
}
