package org.eclipse.emf.modelmutator.generator;

import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.modelmutator.api.ModelMutator;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.mutator.ModelMutatorTest;
import org.junit.Assert;
import org.junit.Test;

/**
 * 
 * @author Eugen Neufeld
 * 
 */
public class ModelGeneratorTest extends ModelMutatorTest {

	@Test
	public void testNumberRootElements() {
		ProjectSpace projectSpace = createProjectSpace();

		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);

		ModelMutator.generateModel(mmc);

		Assert.assertEquals(width, projectSpace.getProject().getModelElements().size());
	}

}
