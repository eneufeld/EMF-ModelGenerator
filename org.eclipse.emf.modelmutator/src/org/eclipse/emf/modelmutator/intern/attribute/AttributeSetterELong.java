/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.modelmutator.intern.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random Long values.
 * 
 * @author Eugen Neufeld
 * @author Stephan K�hler
 * @see AttributeSetter
 */
public class AttributeSetterELong extends AttributeSetter<Long> {

	/**
	 * Creates a new AttributeSetter for Long attributes.
	 * 
	 * @param random
	 *            Random object used to create attribute values
	 */
	public AttributeSetterELong(Random random) {
		super(random);
	}

	/**
	 * {@inheritDoc}
	 */
	public Long createNewAttribute() {
		return random.nextLong();
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Long> createNewAttributes(int maxAmount) {
		List<Long> result = new ArrayList<Long>(maxAmount);
		for (int i = 0; i < maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}