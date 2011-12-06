package org.eclipse.emf.modemutator.generator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.modelmutator.api.ModelMutator;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.api.ModelMutatorUtil;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * 
 * @author Eugen Neufeld
 * 
 */
public class ModelGeneratorTest {

	private static final String modelKey = "http://org/eclipse/example/bowling";
	private static final String projectName = "generated";
	private static final String projectDescription = "TestProject2";

	private static final long seed = 1234567890l;
	private static final int width = 5;
	private static final int depth = 2;

	@Before
	public void beforeTest() {

	}

	@After
	public void afterTest() {

	}

	private static ProjectSpace createProjectSpace() {
		ProjectSpace projectSpace = org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE
				.createProjectSpace();
		projectSpace
				.setProject(org.eclipse.emf.emfstore.common.model.ModelFactory.eINSTANCE
						.createProject());
		projectSpace.setProjectName(projectName);
		projectSpace.setProjectDescription(projectDescription);
		projectSpace
				.setLocalOperations(org.eclipse.emf.emfstore.client.model.ModelFactory.eINSTANCE
						.createOperationComposite());
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().putAll(getResourceLoadOptions());
		projectSpace.initResources(resourceSet);
		return projectSpace;
	}

	private static Map<Object, Object> getResourceLoadOptions() {
		HashMap<Object, Object> resourceLoadOptions = new HashMap<Object, Object>();
		// options.put(XMLResource.OPTION_CONFIGURATION_CACHE, true)
		resourceLoadOptions.put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE,
				Boolean.TRUE);
		resourceLoadOptions
				.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, true);
		return resourceLoadOptions;
	}
	
	
	@Test
	public void testNumberRootElements() {
		ProjectSpace projectSpace = createProjectSpace();

		ModelMutatorConfiguration mmc = new ModelMutatorConfiguration(
				ModelMutatorUtil.getEPackage(modelKey),
				projectSpace.getProject(), seed);
		mmc.setDepth(depth);
		mmc.setWidth(width);
		List<EStructuralFeature> eStructuralFeaturesToIgnore=new ArrayList<EStructuralFeature>();
		eStructuralFeaturesToIgnore.addAll(projectSpace.getProject().eClass().getEAllContainments());
		eStructuralFeaturesToIgnore.remove(projectSpace.getProject().eClass().getEStructuralFeature("modelElements"));
		mmc.seteStructuralFeaturesToIgnore(eStructuralFeaturesToIgnore);

		ModelMutator.generateModel(mmc);

		Assert.assertEquals(width, projectSpace.getProject().getModelElements()
				.size());
	}
}
