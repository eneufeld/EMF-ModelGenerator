package org.eclipse.emf.modelmutator.api;

import org.eclipse.emf.modelmutator.intern.ModelChanger;
import org.eclipse.emf.modelmutator.intern.ModelGenerator;

/**
 * Wraps the generator and the changer
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelMutator {

	/**
	 * Generates a model as specified in the config
	 * 
	 * @param config
	 */
	public static void generateModel(ModelMutatorConfiguration config) {
		ModelGenerator modelGenerator = new ModelGenerator(config);
		modelGenerator.mutate();
	}
	
	/**
	 * Modifies a model as specified in the config
	 * 
	 * @param config
	 */
	public static void changeModel(ModelMutatorConfiguration config) {
		ModelChanger modelChanger = new ModelChanger(config);
		modelChanger.mutate();
	}
}
