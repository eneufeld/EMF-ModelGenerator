package org.eclipse.emf.modelmutator.changer;

import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.modelmutator.api.ModelMutator;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.mutator.ModelMutatorHelper;
import org.eclipse.emf.modelmutator.mutator.ModelMutatorTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ModelChangerTest extends ModelMutatorTest {

	private ProjectSpace projectSpace;

	@Before
	public void beforeTest() {
		projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);

		ModelMutator.generateModel(mmc);
	}

	@After
	public void afterTest() {
		projectSpace = null;
	}

//	@Test
	public void testSetAttributesRandom() {

		try {

			ModelMutatorConfiguration mmc = createModelMutatorConfiurationRandom(projectSpace);
			ModelMutator.changeModel(mmc);
			String stringOrg = ModelMutatorHelper.eObjectToString(projectSpace.getProject());
			ModelMutatorConfiguration mmc2 = createModelMutatorConfiurationRandom(projectSpace);
			ModelMutator.changeModel(mmc2);
			String stringNew = ModelMutatorHelper.eObjectToString(projectSpace.getProject());
			
			Assert.assertNotSame(stringNew, stringOrg);
		} catch (SerializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Test
	public void testSetAttributesSeed() {

		try {
			System.out.println("");
			ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);
			ModelMutator.changeModel(mmc);
			String stringOrg = ModelMutatorHelper.eObjectToString(projectSpace.getProject());
			System.out.println("");
			ModelMutatorConfiguration mmc2 = createModelMutatorConfiurationSeed(projectSpace);
			ModelMutator.changeModel(mmc2);
			String stringNew = ModelMutatorHelper.eObjectToString(projectSpace.getProject());

			Assert.assertEquals(stringNew, stringOrg);
		} catch (SerializationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
