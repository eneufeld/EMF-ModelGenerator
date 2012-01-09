/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;


/**
 * The TestSuite.
 * @author Stephan Köhler
 * @author Eugen Neufeld
 *
 */
@RunWith(Suite.class)
@Suite.SuiteClasses({ ModelGeneratorTest.class, ModelChangerTest.class, ModelMutatorServerTest.class })
public class ModelMutatorTestSuite {

}
