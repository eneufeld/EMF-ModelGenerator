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
	public void testDoNotGenerateRoot(){
		ProjectSpace projectSpace = createProjectSpace();

		ModelMutatorConfiguration mmc = createModelMutatorConfiurationSeed(projectSpace);
		mmc.setDepth(2);
		mmc.setDoNotGenerateRoot(true);
		
		for(int i=0;i<5;i++){
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
		for(EObject eObject:projectSpace.getProject().getAllModelElements()){
			differentClasses.add(eObject.eClass());
		}
		Assert.assertEquals(5, differentClasses.size());
	}

}
