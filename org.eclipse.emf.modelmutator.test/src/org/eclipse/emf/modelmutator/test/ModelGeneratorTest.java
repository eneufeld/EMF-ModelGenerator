package org.eclipse.emf.modelmutator.test;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.modelmutator.api.ModelMutator;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.junit.Assert;
import org.junit.Test;

import testModel.Node;
import testModel.TestModelFactory;

/**
 * Tests for the ModelGenerator
 * 
 * @author Eugen Neufeld
 * @author Stephan K�hler
 * @author Philip Achenbach
 */
public class ModelGeneratorTest extends ModelMutatorTest {

	/**
	 * Tests whether the root level has the expected width
	 */
	@Test
	public void testNumberRootElements() {
		int expectedWidth = width;
		
		ProjectSpace projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(projectSpace);
		mmc.setWidth(expectedWidth);
		ModelMutator.generateModel(mmc);
		
		Assert.assertEquals(expectedWidth, projectSpace.getProject().getModelElements().size());
	}
	
	/**
	 * Tests whether the model has the expected depth over all containment-levels
	 * 
	 * Recognizes restrictions of the metamodel
	 */
	@Test
	public void testModelDepth() {
		int expectedDepth = depth;
		
		ProjectSpace projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(projectSpace);
		mmc.setDepth(expectedDepth);
		ModelMutator.generateModel(mmc);
		
		// breadth-first search (BFS)
		List<EObject> parents = new LinkedList<EObject>();
		parents.add(projectSpace.getProject());
		
		List<EObject> children = new LinkedList<EObject>();
		Set<EClass> classes = new HashSet<EClass>();
		
		int depth = -1; // Count the Project root-Element as depth=0
		do {
			for (EObject parent : parents) {
				children.addAll(parent.eContents());
				classes.add(parent.eClass());
			}
			
			depth++;
			parents.clear();
			parents.addAll(children);
			children.clear();
			classes.clear();
		} while (!parents.isEmpty());
		
		if (depth < expectedDepth) {
			// The model is not as deep as we would expect - is this a restriction of the meta model?
			for (EClass clazz : classes) {
				if (clazz.getEAllContainments() != null && !clazz.getEAllContainments().isEmpty()) {
					// The metamodel would allow this model to go deeper, so the generator failed
					Assert.fail("The model is not as deep as the metamodel allows and the generator was expected to generate.");
				}
			}
			
			// This is a restriction of the metamodel, so the generator could not do anything about it
		} else if (depth > expectedDepth) {
			Assert.fail("The model is deeper as we would expect. (calculated: "+depth+", expected: "+expectedDepth+")");
		}
		
		// The depth matches the expected depth
	}
	
	/**
	 * Tests whether the model has the expected width on all containment-levels
	 */
	@Test
	public void testModelWidth() {
		int expectedWidth = width;
		
		ProjectSpace projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(projectSpace);
		mmc.setWidth(expectedWidth);
		ModelMutator.generateModel(mmc);
		
		int maxWidth = calculateMaxModelWidth(projectSpace.getProject());
		
		Assert.assertEquals("The calculated model width "+maxWidth+" does not match the expected width "+expectedWidth+".", expectedWidth, maxWidth);
	}
	
	private int calculateMaxModelWidth(EObject parent) {
		if (parent.eContents() == null || parent.eContents().isEmpty()) {
			return 0;
		}
		
		int maxWidth = parent.eContents().size();
		for (EObject child : parent.eContents()) {
			maxWidth = Math.max(maxWidth, calculateMaxModelWidth(child));
		}
		
		return maxWidth;
	}
	
	/**
	 * Tests whether the generator successfully skips the root-generation
	 */
	@Test
	public void testDoNotGenerateRoot(){
		ProjectSpace projectSpace = createProjectSpace();

		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(projectSpace);
		mmc.setDepth(2);
		mmc.setDoNotGenerateRoot(true);
		
		for (int i=0; i<5; i++) {
			Node newModelElement=TestModelFactory.eINSTANCE.createNode();
			newModelElement.setName("Test"+i);
			projectSpace.getProject().addModelElement(newModelElement);
		}
		
		ModelMutator.generateModel(mmc);
		Assert.assertEquals(5, projectSpace.getProject().getModelElements().size());
	}
	
	/**
	 * Tests whether the generator successfully generates all elements on the root level
	 */
	@Test
	public void testAllElementsOnRoot(){
		ProjectSpace projectSpace = createProjectSpace();
		
		ModelMutatorConfiguration mmc = createModelMutatorConfigurationSeed(projectSpace);
		mmc.setWidth(2);
		mmc.setAllElementsOnRoot(true);
		
		ModelMutator.generateModel(mmc);
		
		Set<EClass> differentClasses = new HashSet<EClass>();
		for (EObject eObject : projectSpace.getProject().getAllModelElements()) {
			differentClasses.add(eObject.eClass());
		}
		
		Assert.assertEquals(5, differentClasses.size());
	}

}