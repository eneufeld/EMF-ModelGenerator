/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.intern.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random Char values.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 * 
 * @see AttributeSetter
 */
public class AttributeSetterEChar extends AttributeSetter<Character> {

	/**
	 * Creates a new AttributeSetter for Char attributes.
	 * 
	 * @param random
	 *            Random object used to create attribute values
	 */
	public AttributeSetterEChar(Random random) {
		super(random);
	}

	/**
	 * {@inheritDoc}
	 */
	public Character createNewAttribute() {
		return (char) (getRandom().nextInt(94) + 33);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Character> createNewAttributes(int maxAmount) {
		List<Character> result = new ArrayList<Character>(maxAmount);
		for (int i = 0; i < maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}
}
