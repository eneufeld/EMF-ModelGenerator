package org.eclipse.emf.modelmutator.mutator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.api.ModelMutatorUtil;
import org.junit.After;
import org.junit.Before;

public class ModelMutatorTest {
	protected static final String modelKey = "http://org/eclipse/emf/modelmutator/testModel";
	protected static final String projectName = "generated";
	protected static final String projectDescription = "TestProject2";

	protected static final long seed = 1234567800;//1234567890l;
	protected static final int width = 10;
	protected static final int depth = 4;

	@Before
	public void beforeTest() {

	}

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

	protected ModelMutatorConfiguration createModelMutatorConfigurationRandom(ProjectSpace projectSpace) {
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
