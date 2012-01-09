/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.test;

import org.eclipse.core.runtime.Plugin;
import org.osgi.framework.BundleContext;

/**
 * The Activator for the plugin.
 * @author Stephan Köhler
 * @author Eugen Neufeld
 * @author Philip Achenbach
 *
 */
public class Activator extends Plugin {

	/**
	 * The shared instance.
	 */
	private static Activator plugin;

	private static BundleContext context;

	/**
	 * Returns the shared context.
	 * @return the shared context
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
		plugin = this;
	}
	// END SUPRESS CATCH EXCEPTION

	/**
	 * {@inheritDoc}
	 */
	// BEGIN SUPRESS CATCH EXCEPTION
	public void stop(BundleContext bundleContext) throws Exception {
		Activator.context = null;
		plugin = null;
	}
	// END SUPRESS CATCH EXCEPTION
	
	/**
	 * Returns the shared instance.
	 * 
	 * @return the shared instance
	 */
	public static Activator getDefault() {
		return plugin;
	}

}
