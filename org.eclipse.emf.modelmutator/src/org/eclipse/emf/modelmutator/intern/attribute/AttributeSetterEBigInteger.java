/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.modelmutator.intern.attribute;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random BigInteger values.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 * 
 * @see AttributeSetter
 */
public class AttributeSetterEBigInteger extends AttributeSetter<BigInteger> {

	/**
	 * Creates a new AttributeSetter for Integer attributes.
	 * 
	 * @param random
	 *            Random object used to create attribute values
	 */
	public AttributeSetterEBigInteger(Random random) {
		super(random);
	}

	/**
	 * {@inheritDoc}
	 */
	public BigInteger createNewAttribute() {
		return new BigInteger(20, random);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<BigInteger> createNewAttributes(int maxAmount) {
		List<BigInteger> result = new ArrayList<BigInteger>(maxAmount);
		for (int i = 0; i < maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}
