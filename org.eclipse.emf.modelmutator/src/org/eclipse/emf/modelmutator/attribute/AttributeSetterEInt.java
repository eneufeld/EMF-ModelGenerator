/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.modelmutator.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random Integer values.
 * 
 * @see IAttributeSetter
 */
public class AttributeSetterEInt implements IAttributeSetter<Integer> {

	/**
	 * Random object that is used to determine values for attributes created 
	 * by {@link #createNewAttribute()} and {@link #createNewAttributes()}.
	 */
	private Random random;

	/**
	 * Creates a new AttributeSetter for Integer attributes.
	 * 
	 * @param random Random object used to create attribute values
	 */
	public AttributeSetterEInt(Random random) {
		this.random = random;
	}

	/**
	 * {@inheritDoc}
	 */
	public Integer createNewAttribute() {
		return random.nextInt();
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Integer> createNewAttributes(int maxAmount) {
		List<Integer> result = new ArrayList<Integer>(maxAmount);
		for (int i=0; i<maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}
