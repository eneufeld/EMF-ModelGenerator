/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.modelmutator.intern.attribute;

import java.util.Collection;
import java.util.Random;

/**
 * Abstract class that defines methods for creating attributes in order
 * to generate or change Ecore models. Attributes are created
 * using a Random object.
 * 
 * @param <E> the attribute type of the attributes to create 
 */
public abstract class AttributeSetter<E> {

	/**
	 * Random object that is used to determine values for attributes created 
	 * by {@link #createNewAttribute()} and {@link #createNewAttributes()}.
	 */
	protected final Random random;


	public AttributeSetter(Random random) {
		this.random = random;
	}
	
	/**
	 * Creates one attribute of type <code>E</code>.
	 * The result is determined by <code>random</code>.
	 * 
	 * @return the created attribute
	 */
	public abstract E createNewAttribute();

	/**
	 * Creates a collection of attributes of type <code>E</code>. 
	 * The result is determined by <code>random</code>.
	 * 
	 * @param maxAmount the maximum amount of attributes to create
	 * @return all created attributes as a collection
	 */
	public abstract Collection<E> createNewAttributes(int maxAmount);

}