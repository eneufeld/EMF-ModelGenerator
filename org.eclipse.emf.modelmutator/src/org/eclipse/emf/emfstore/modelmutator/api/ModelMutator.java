/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.api;

import org.eclipse.emf.emfstore.modelmutator.intern.ModelChanger;
import org.eclipse.emf.emfstore.modelmutator.intern.ModelGenerator;

/**
 * Wraps the generator and the changer.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelMutator {


	/**
	 * Generates a model as specified in the config.
	 * 
	 * @param config the configuration
	 */
	public static void generateModel(ModelMutatorConfiguration config) {
		ModelGenerator modelGenerator = new ModelGenerator(config);
		modelGenerator.mutate();
	}
	
	/**
	 * Modifies a model as specified in the config.
	 * 
	 * @param config the configuration
	 */
	public static void changeModel(ModelMutatorConfiguration config) {
		ModelChanger modelChanger = new ModelChanger(config);
		modelChanger.mutate();
	}
}
