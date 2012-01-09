/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.test;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.emfstore.client.model.Usersession;
import org.eclipse.emf.emfstore.common.model.Project;
import org.eclipse.emf.emfstore.common.model.util.ModelUtil;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutator;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.emfstore.modelmutator.api.ModelMutatorUtil;
import org.eclipse.emf.emfstore.server.exceptions.EmfStoreException;
import org.eclipse.emf.emfstore.server.model.ProjectInfo;
import org.eclipse.emf.emfstore.server.model.versioning.ChangePackage;
import org.eclipse.emf.emfstore.server.model.versioning.PrimaryVersionSpec;
import org.eclipse.emf.emfstore.server.model.versioning.VersionSpec;
import org.junit.Before;
import org.junit.Test;

/**
 * The implementation of the Server Tests.
 * @author Eugen Neufeld
 * @author Stephan Köhler
 *
 */
public class ModelMutatorServerTest extends ModelMutatorServerSetup {
	// private Project fullProject;
	private ProjectInfo projectInfo;
	private ProjectSpace projectSpace;
	private String modelKey = "http://org/eclipse/emf/modelmutator/org.eclipse.emf.emfstore.modelmutator.testModel";
	private int width = 10;
	private int depth = 4;
	private long seed = 1234567800;
	private String projectName = "generated";
	private String projectDescription = "TestProject2";

	@Override
	@Before
	public void beforeTest() throws EmfStoreException {
		super.beforeTest();

		projectSpace = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createProjectSpace();
		projectSpace.setProject(org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE.createProject());
		projectSpace.setProjectName(projectName);
		projectSpace.setProjectDescription(projectDescription);
		projectSpace.setLocalOperations(org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE
			.createOperationComposite());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(ModelUtil.getResourceLoadOptions());
		projectSpace.initResources(resourceSet);

		Usersession session = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE.createUsersession();
		session.setServerInfo(SetupHelper.getServerInfo());
		session.setUsername("super");
		session.setPassword("super");
		session.setSessionId(getSessionId());
		projectSpace.setUsersession(session);
		projectSpace.eResource().getContents().add(session);
		projectSpace.eResource().getContents().add(session.getServerInfo());

		EPackage pckge = ModelMutatorUtil.getEPackage(modelKey);

		ModelMutatorConfiguration config = new ModelMutatorConfiguration(pckge, projectSpace.getProject(), seed);
		config.setDepth(depth);
		config.setWidth(width);
		List<EStructuralFeature> eStructuralFeaturesToIgnore = new ArrayList<EStructuralFeature>();
		eStructuralFeaturesToIgnore.addAll(projectSpace.getProject().eClass().getEAllContainments());
		eStructuralFeaturesToIgnore.remove(projectSpace.getProject().eClass().getEStructuralFeature("modelElements"));
		config.seteStructuralFeaturesToIgnore(eStructuralFeaturesToIgnore);
		
		ModelMutator.generateModel(config);
		

		// count num of projects
		assertTrue(getConnectionManager().getProjectList(getSessionId()).size() == getProjectsOnServerBeforeTest());

		// add project to Server
		projectSpace.shareProject(session);
		projectInfo = projectSpace.getProjectInfo();

		// check that number increased
		assertTrue(getConnectionManager().getProjectList(getSessionId()).size() == getProjectsOnServerBeforeTest() + 1);
	}

	@SuppressWarnings("unused")
	private EClass getValidEClass(EObject root, EPackage pckge, List<EClass> ignoredClasses) {
		List<EClass> allEClasses = new LinkedList<EClass>();
		for (EReference reference : root.eClass().getEAllContainments()) {
			allEClasses.addAll(ModelMutatorUtil.getAllEContainments(reference));
		}
		// only allow EClasses that appear in the specified EPackage
		allEClasses.retainAll(ModelMutatorUtil.getAllEClasses(pckge));
		// don't allow any EClass or sub class of all EClasses specified in ignoredClasses
		for (EClass eClass : ignoredClasses) {
			allEClasses.remove(eClass);
			allEClasses.removeAll(ModelMutatorUtil.getAllSubEClasses(eClass));
		}
		if (allEClasses.isEmpty()) {
			// no valid EClass left
			return null;
		}
		Collections.shuffle(allEClasses, new Random(System.currentTimeMillis()));
		return allEClasses.get(0);
	}

	/**
	 * Tests the generation of models.
	 * @throws EmfStoreException Server exception
	 */
	@Test
	public void generateModelTest() throws EmfStoreException {
		Project pro = getConnectionManager().getProject(getSessionId(), projectSpace.getProjectId(),
			VersionSpec.HEAD_VERSION);
		/* For Debug only
		 * try {
			System.out.println("Print: "+ModelMutatorHelper.eObjectToString(pro));
		} catch (SerializationException e) {
			e.printStackTrace();
		}*/
		assertEqual(projectSpace.getProject(), pro);

	}

	/**
	 * Tests the changing of models in the EMFStore.
	 * @throws EmfStoreException Emf Store exception
	 */
	@SuppressWarnings("unused")
	@Test
	public void changeModelTest() throws EmfStoreException {
		// try {
		System.out.println("BEFORE CHANGES:" + projectSpace.getProject().getAllModelElements().size());
		// System.out.println(ModelUtil.eObjectToString(projectSpace.getProject()));
		ModelMutatorConfiguration mmc = new ModelMutatorTest().createModelMutatorConfigurationRandom(projectSpace);
		ModelMutator.changeModel(mmc);

		System.out.println("VERSION BEFORE commit:" + projectInfo.getVersion().getIdentifier());
		PrimaryVersionSpec version = projectSpace.commit();
		System.out.println("VERSION AFTER commit:" + version.getIdentifier());

		ChangePackage cpServer = getConnectionManager().getChanges(getSessionId(), projectInfo.getProjectId(),
			projectInfo.getVersion(), VersionSpec.HEAD_VERSION).get(0);
		ChangePackage changePackage = projectSpace.getChanges(projectInfo.getVersion(), version).get(0);

		// System.out.println("CHANGES LOCAL:");
		// System.out.println(ModelUtil.eObjectToString(changePackage));
		// System.out.println("CHANGES SERVER:");
		// System.out.println(ModelUtil.eObjectToString(cpServer));

		Project pro = getConnectionManager().getProject(getSessionId(), projectSpace.getProjectId(),
			VersionSpec.HEAD_VERSION);

		System.out.println("APPLIED CHANGES:" + projectSpace.getProject().getAllModelElements().size());
		// System.out.println(ModelUtil.eObjectToString(projectSpace.getProject()));
		System.out.println("FROM SERVER:" + pro.getAllModelElements().size());
		// System.out.println(ModelUtil.eObjectToString(pro));
		/* Debug only
		 * try {
			System.out.println(ModelMutatorHelper.eObjectToString(projectSpace.getProject()));
			System.out.println("\n\n\n"+ModelMutatorHelper.eObjectToString(pro));
		} catch (SerializationException e) {
			
			e.printStackTrace();
		}
		*/
		assertEqual(projectSpace.getProject(), pro);
		// } catch (SerializationException e) {
		// e.printStackTrace();
		// }
	}

}
