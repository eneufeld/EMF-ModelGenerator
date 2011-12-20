package org.eclipse.emf.modelmutator.intern;

import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;

/**
 * Allows to implement changer-specific functionality
 * 
 * TODO Can be removed at the current status
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelChanger extends AbstractModelMutator {

	public ModelChanger(ModelMutatorConfiguration config) {
		super(config);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void preMutate() {
		// TODO delete stuff randomly 

	}

	@Override
	public void postMutate() {
		// TODO Auto-generated method stub

	}

}
