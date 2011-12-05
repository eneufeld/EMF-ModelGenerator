package org.eclipse.emf.modelmutator.api;

import org.eclipse.emf.modelmutator.intern.ModelChanger;
import org.eclipse.emf.modelmutator.intern.ModelGenerator;

/**
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 *
 */
public class ModelMutator {

	/**
	 * 
	 * @param root
	 */
	public static void generateModel(ModelMutatorConfiguration config){
		ModelGenerator modelGenerator=new ModelGenerator(config);
		modelGenerator.mutate();
	}
	/**
	 * 
	 * @param root
	 */
	public static void changeModel(ModelMutatorConfiguration config){
		ModelChanger modelChanger=new ModelChanger(config);
		modelChanger.mutate();
	}
}
