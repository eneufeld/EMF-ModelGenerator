package org.eclipse.emf.modelmutator.generator;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.emfstore.client.model.ProjectSpace;
import org.eclipse.emf.modelmutator.api.ModelMutator;
import org.eclipse.emf.modelmutator.api.ModelMutatorConfiguration;
import org.eclipse.emf.modelmutator.mutator.ModelMutatorTest;
import org.junit.Assert;
import org.junit.Test;

import testModel.Kategorie;
import testModel.TestModelFactory;

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
	
	@Test
	public void testModelDepth() {
		// TODO This testcase fails with most depths!
		int expectedDepth = depth;
		
		ProjectSpace projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);
		mmc.setDepth(expectedDepth);
		ModelMutator.generateModel(mmc);
		
		int maxDepth = calculateMaxModelDepth(projectSpace.getProject(), 0);
		
		Assert.assertEquals("The calculated model depth "+maxDepth+" does not match the expected depth "+expectedDepth+".", expectedDepth, maxDepth);
	}
	
	private int calculateMaxModelDepth(EObject parent, int depth) {
		if (parent.eContents() == null || parent.eContents().isEmpty()) {
			return depth;
		}
		
		int maxDepth = 0;
		for (EObject child : parent.eContents()) {
			//if (!(child instanceof Element)) {
				printTree(depth, child);
				maxDepth = Math.max(maxDepth, calculateMaxModelDepth(child, depth + 1));
			//}
		}
		
		return maxDepth;
	}
	
	private void printTree(int depth, EObject child) {
		for (int i = 0; i < depth; i++) {
			System.out.print("  ");
		}
		System.out.println("| "+child+" ["+child.eContents().size()+"]");
	}
	
	@Test
	public void testModelWidth() {
		int expectedWidth = width;
		
		ProjectSpace projectSpace = createProjectSpace();
		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);
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
	
	@Test
	public void testDoNotGenerateRoot(){
		ProjectSpace projectSpace = createProjectSpace();

		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);
		mmc.setDepth(2);
		mmc.setDoNotGenerateRoot(true);
		
		for(int i=0; i<5; i++){
			Kategorie newModelElement=TestModelFactory.eINSTANCE.createKategorie();
			newModelElement.setName("Test"+i);
			projectSpace.getProject().addModelElement(newModelElement);
		}
		
		ModelMutator.generateModel(mmc);
		Assert.assertEquals(5, projectSpace.getProject().getModelElements().size());
	}
	
	@Test
	public void testAllElementsOnRoot(){
		ProjectSpace projectSpace = createProjectSpace();
		
		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);
		mmc.setWidth(2);
		mmc.setAllElementsOnRoot(true);
		
		ModelMutator.generateModel(mmc);
		Set<EClass> differentClasses=new HashSet<EClass>();
		for(EObject eObject : projectSpace.getProject().getAllModelElements()){
			differentClasses.add(eObject.eClass());
		}
		Assert.assertEquals(5, differentClasses.size());
	}

}
