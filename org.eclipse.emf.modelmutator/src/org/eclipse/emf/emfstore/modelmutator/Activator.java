/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The Plugin activator.
 * 
 * @author Stephan Köhler
 * @author Eugen Neufeld
 *
 */
public class Activator implements BundleActivator {

	private static BundleContext context;

	/**
	 * Returns the shared context.
	 * @return the context
	 */
	static BundleContext getContext() {
		return context;
	}

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public void start(BundleContext bundleContext) throws Exception {
		Activator.context = bundleContext;
	}
	// END SUPRESS CATCH EXCEPTION

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
	}
	// END SUPRESS CATCH EXCEPTION
}
