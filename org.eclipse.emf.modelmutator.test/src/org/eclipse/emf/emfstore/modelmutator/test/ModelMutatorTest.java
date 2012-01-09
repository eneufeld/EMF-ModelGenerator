/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutatorUtil;
import org.junit.After;
import org.junit.Before;

/**
 * Implements basic helper methods to setup the base-classes for the test.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelMutatorTest {

	/**
	 * The modelKey for the used model.
	 */
	protected static final String modelKey = "http://org/eclipse/emf/modelmutator/org.eclipse.emf.emfstore.modelmutator.testModel";
	/**
	 * The name for the project.
	 */
	protected static final String projectName = "generated";
	/**
	 * The description for the project.
	 */
	protected static final String projectDescription = "TestProject2";

	/**
	 * The seed that is used for the model.
	 */
	protected static final long seed = 1234567800;//1234567890l;
	/**
	 * The model width.
	 */
	protected static final int width = 10;
	/**
	 * The model depth.
	 */
	protected static final int depth = 4;

	/**
	 * Gets executed before the test.
	 */
	@Before
	public void beforeTest() {

	}

	/**
	 * Gets executed after the test.
	 */
	@After
	public void afterTest() {

	}

	protected ProjectSpace createProjectSpace() {
		ProjectSpace projectSpace = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createProjectSpace();
		projectSpace.setProject(org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.createProject());
		projectSpace.setProjectName(projectName);
		projectSpace.setProjectDescription(projectDescription);
		projectSpace.setLocalOperations(org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createOperationComposite());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(getResourceLoadOptions());
		projectSpace.initResources(resourceSet);
		return projectSpace;
	}

	private static Map<Object, Object> getResourceLoadOptions() {
		HashMap<Object, Object> resourceLoadOptions = new HashMap<Object, Object>();
		// options.put(XMLResource.OPTION_CONFIGURATION_CACHE, true)
		resourceLoadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
		resourceLoadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		return resourceLoadOptions;
	}

	/**
	 * @param projectSpace the project Space
	 * @return a valid configuration
	 */
	protected ModelMutatorConfiguration createModelMutatorConfigurationSeed(ProjectSpace projectSpace) {
		ModelMutatorConfiguration mmc = new ModelMutatorConfiguration(ModelMutatorUtil.getEPackage(modelKey), projectSpace.getProject(), seed);
		mmc.setDepth(depth);
		mmc.setWidth(width);
		List<EStructuralFeature> eStructuralFeaturesToIgnore = new ArrayList<EStructuralFeature>();
		eStructuralFeaturesToIgnore.addAll(projectSpace.getProject().eClass().getEAllContainments());
		eStructuralFeaturesToIgnore.remove(projectSpace.getProject().eClass().getEStructuralFeature("modelElements"));
		mmc.seteStructuralFeaturesToIgnore(eStructuralFeaturesToIgnore);
		return mmc;
	}

	/**
	 * @param projectSpace the project Space
	 * @return a valid configuration
	 */
	public ModelMutatorConfiguration createModelMutatorConfigurationRandom(ProjectSpace projectSpace) {
		ModelMutatorConfiguration mmc = new ModelMutatorConfiguration(ModelMutatorUtil.getEPackage(modelKey), projectSpace.getProject(),
				System.currentTimeMillis());
		mmc.setDepth(depth);
		mmc.setWidth(width);
		List<EStructuralFeature> eStructuralFeaturesToIgnore = new ArrayList<EStructuralFeature>();
		eStructuralFeaturesToIgnore.addAll(projectSpace.getProject().eClass().getEAllContainments());
		eStructuralFeaturesToIgnore.remove(projectSpace.getProject().eClass().getEStructuralFeature("modelElements"));
		mmc.seteStructuralFeaturesToIgnore(eStructuralFeaturesToIgnore);
		return mmc;
	}

}
