/**
 * 
 */
package org.eclipse.emf.modelmutator.intern;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;

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
	public void mutate() {
		List<EObject> objects = new ArrayList<EObject>();
		for (int i = 0; i < configuration.getWidth(); i++) {
			EClass validClass = getValidEClass();
			if (validClass.isInterface() || validClass.isAbstract()) {
				throw new IllegalArgumentException("Root mustn't be abstract or an interface!");
			}
			EObject eObject = EcoreUtil.create(validClass);
			objects.add(eObject);
		}
		addElement(configuration.getRootEObject(), objects);
	}

}
