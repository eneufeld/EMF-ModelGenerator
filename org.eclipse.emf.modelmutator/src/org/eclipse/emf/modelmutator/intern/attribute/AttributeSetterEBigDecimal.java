/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.modelmutator.intern.attribute;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random BigDecimal values.
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @see AttributeSetter
 */
public class AttributeSetterEBigDecimal extends AttributeSetter<BigDecimal> {

	/**
	 * Creates a new AttributeSetter for BigDecimal attributes.
	 * 
	 * @param random
	 *            Random object used to create attribute values
	 */
	public AttributeSetterEBigDecimal(Random random) {
		super(random);
	}

	/**
	 * {@inheritDoc}
	 */
	public BigDecimal createNewAttribute() {
		return new BigDecimal(random.nextDouble() * random.nextInt());
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<BigDecimal> createNewAttributes(int maxAmount) {
		List<BigDecimal> result = new ArrayList<BigDecimal>(maxAmount);
		for (int i = 0; i < maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}
