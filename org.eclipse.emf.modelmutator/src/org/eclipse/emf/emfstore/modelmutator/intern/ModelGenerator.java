/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.intern;

import org.eclipse.emf.emfstore.modelmutator.api.ModelMutatorConfiguration;

/**
 * Allows to implement generator-specific functionality.
 * 
 * TODO Can be removed at the current status
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelGenerator extends AbstractModelMutator {

	/**
	 * The constructor.
	 * @param config the config used in the process
	 */
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
