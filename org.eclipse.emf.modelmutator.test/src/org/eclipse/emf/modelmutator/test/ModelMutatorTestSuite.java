package org.eclipse.emf.modelmutator.test;

import org.eclipse.emf.modelmutator.changer.ModelChangerTest;
import org.eclipse.emf.modelmutator.generator.ModelGeneratorTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;


@RunWith(Suite.class)
@Suite.SuiteClasses({ ModelGeneratorTest.class,ModelChangerTest.class})
public class ModelMutatorTestSuite {

}
