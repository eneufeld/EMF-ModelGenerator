/**
 * 
 */
package org.eclipse.emf.modelmutator.intern;

import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;

/**
 * @author Eugen Neufeld
 *
 */
public abstract class AbstractModelMutator {

	protected final ModelMutatorConfiguration configuration;
	
	public AbstractModelMutator(ModelMutatorConfiguration config){
		this.configuration=config;
	}
}
