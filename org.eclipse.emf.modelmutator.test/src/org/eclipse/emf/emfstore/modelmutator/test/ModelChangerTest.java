/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.test;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.common.model.util.SerializationException;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutator;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutatorConfiguration;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the ModelChanger.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelChangerTest extends ModelMutatorTest {

	private ProjectSpace projectSpace;

	
	/** 
	 * {@inheritDoc}
	 */
	@Before
	public void beforeTest() {
		// Generate the model before each change-test
		projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(projectSpace);
		ModelMutator.generateModel(mmc);
	}

	/**
	 * {@inheritDoc}
	 */
	@After
	public void afterTest() {
		// Cleanup
		projectSpace = null;
	}
	/**
	 * Tests whether two changes with the same seed generate the same result.
	 * 
	 * @throws SerializationException gets thrown on serialization error
	 */
	@Test
	public void testSetAttributesSeed() throws SerializationException {
		ProjectSpace ps1=EcoreUtil.copy(projectSpace);
		ProjectSpace ps2=EcoreUtil.copy(projectSpace);
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(ps1);
		ModelMutator.changeModel(mmc);
		String stringOrg = ModelMutatorHelper.eObjectToString(ps1.getProject());
		
		ModelMutatorConfiguration mmc2 = createModelMutatorConfigurationSeed(ps2);
		ModelMutator.changeModel(mmc2);
		String stringNew = ModelMutatorHelper.eObjectToString(ps2.getProject());
		
//		Assert.assertTrue(EcoreUtil.equals(ps1.getProject(), ps2.getProject()));
		Assert.assertEquals(stringNew, stringOrg);
	}
	/**
	 * Tests whether two changes with distinct seeds generate different results.
	 * 
	 * @throws SerializationException Gets thrown on serialization error
	 */
	@Test
	public void testSetAttributesRandom() throws SerializationException {
		ProjectSpace ps1=EcoreUtil.copy(projectSpace);
		ProjectSpace ps2=EcoreUtil.copy(projectSpace);
		
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationRandom(ps1);
		ModelMutator.changeModel(mmc);
		String stringOrg = ModelMutatorHelper.eObjectToString(ps1.getProject());
		
		ModelMutatorConfiguration mmc2 = createModelMutatorConfigurationRandom(ps2);
		ModelMutator.changeModel(mmc2);
		String stringNew = ModelMutatorHelper.eObjectToString(ps2.getProject());
			
		Assert.assertNotSame(stringNew, stringOrg);
	}
	@Test
	public void finalCall(){
		Assert.assertTrue(true);
	}
	
	
}
