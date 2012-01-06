package org.eclipse.emf.modelmutator.intern;

import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;

/**
 * Allows to implement generator-specific functionality
 * 
 * TODO Can be removed at the current status
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelGenerator extends AbstractModelMutator {

	public ModelGenerator(ModelMutatorConfiguration config) {
		super(config);
	}

	@Override
	public void preMutate() {
	}

	@Override
	public void postMutate() {
	}
}
