/**
 * <copyright> Copyright (c) 2008-2009 Jonas Helming, Maximilian Koegel. All rights reserved. This program and the
 * accompanying materials are made available under the terms of the Eclipse Public License v1.0 which accompanies this
 * distribution, and is available at http://www.eclipse.org/legal/epl-v10.html </copyright>
 */
package org.eclipse.emf.modelmutator.intern.attribute;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * Class for creating random Date values.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @see AttributeSetter
 */
public class AttributeSetterEDate extends AttributeSetter<Date> {

	private static final long HUNDRED_YEARS_MILLIS = 3155670000000l;

	/**
	 * Creates a new AttributeSetter for Date attributes.
	 * 
	 * @param random
	 *            Random object used to create attribute values
	 */
	public AttributeSetterEDate(Random random) {
		super(random);
	}

	/**
	 * {@inheritDoc}
	 */
	public Date createNewAttribute() {
		long value = (long) (random.nextDouble() * HUNDRED_YEARS_MILLIS);
		return new Date(value);
	}

	/**
	 * {@inheritDoc}
	 */
	public Collection<Date> createNewAttributes(int maxAmount) {
		List<Date> result = new ArrayList<Date>(maxAmount);
		for (int i = 0; i < maxAmount; i++) {
			result.add(createNewAttribute());
		}
		return result;
	}

}
