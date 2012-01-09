/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.api;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * Configuration for the ModelMutator.
 * 
 * @author Eugen Neufeld
 * @author Stephan Köhler
 * @author Philip Achenbach
 */
public class ModelMutatorConfiguration {

	private final EPackage modelPackage;
	private final EObject rootEObject;
	private final Random random;

	private int depth;
	private int width;

	private boolean ignoreAndLog;
	private Collection<EClass> eClassesToIgnore;
	private Collection<EStructuralFeature> eStructuralFeaturesToIgnore;
	private Set<RuntimeException> exceptionLog;

	private boolean doNotGenerateRoot;
	private boolean allElementsOnRoot;


	/**
	 * The constructor for the configuration.
	 * 
	 * @param modelPackage the EPackage
	 * @param rootEObject the rootObject for the generation/change
	 * @param seed the seed for the generation/change
	 */
	public ModelMutatorConfiguration(EPackage modelPackage, EObject rootEObject, long seed) {
		this.modelPackage = modelPackage;
		this.rootEObject = rootEObject;
		this.random = new Random(seed);

		this.eClassesToIgnore = new LinkedHashSet<EClass>();
		this.eStructuralFeaturesToIgnore = new LinkedHashSet<EStructuralFeature>();
		this.exceptionLog = new LinkedHashSet<RuntimeException>();
		this.ignoreAndLog = true;
		
		this.depth = 5; // Default depth
		this.width = 5; // Default width
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth
	 *            the depth to set
	 */
	public void setDepth(int depth) {
		this.depth = depth;
	}

	/**
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}

	/**
	 * @param width
	 *            the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * @return the ignoreAndLog
	 */
	public boolean isIgnoreAndLog() {
		return ignoreAndLog;
	}

	/**
	 * @param ignoreAndLog
	 *            the ignoreAndLog to set
	 */
	public void setIgnoreAndLog(boolean ignoreAndLog) {
		this.ignoreAndLog = ignoreAndLog;
	}

	/**
	 * @return the eClassesToIgnore
	 */
	public Collection<EClass> geteClassesToIgnore() {
		return eClassesToIgnore;
	}

	/**
	 * @param eClassesToIgnore
	 *            the eClassesToIgnore to set
	 */
	public void seteClassesToIgnore(Collection<EClass> eClassesToIgnore) {
		this.eClassesToIgnore = eClassesToIgnore;
	}

	/**
	 * @return the modelPackage
	 */
	public EPackage getModelPackage() {
		return modelPackage;
	}

	/**
	 * @return the rootEObject
	 */
	public EObject getRootEObject() {
		return rootEObject;
	}

	/**
	 * @return the exceptionLog
	 */
	public Set<RuntimeException> getExceptionLog() {
		return exceptionLog;
	}

	/**
	 * @param exceptionLog
	 *            the exceptionLog to set
	 */
	public void setExceptionLog(Set<RuntimeException> exceptionLog) {
		this.exceptionLog = exceptionLog;
	}

	/**
	 * @return the random
	 */
	public Random getRandom() {
		return random;
	}

	/**
	 * @return the eStructuralFeaturesToIgnore
	 */
	public Collection<EStructuralFeature> geteStructuralFeaturesToIgnore() {
		return eStructuralFeaturesToIgnore;
	}

	/**
	 * @param eStructuralFeaturesToIgnore
	 *            the eStructuralFeaturesToIgnore to set
	 */
	public void seteStructuralFeaturesToIgnore(Collection<EStructuralFeature> eStructuralFeaturesToIgnore) {
		this.eStructuralFeaturesToIgnore = eStructuralFeaturesToIgnore;
	}

	/**
	 * @return the doNotGenerateRoot
	 */
	public boolean isDoNotGenerateRoot() {
		return doNotGenerateRoot;
	}

	/**
	 * @param doNotGenerateRoot
	 *            the doNotGenerateRoot to set
	 */
	public void setDoNotGenerateRoot(boolean doNotGenerateRoot) {
		this.doNotGenerateRoot = doNotGenerateRoot;
	}

	/**
	 * @return the allElementsOnRoot
	 */
	public boolean isAllElementsOnRoot() {
		return allElementsOnRoot;
	}

	/**
	 * @param allElementsOnRoot
	 *            the allElementsOnRoot to set
	 */
	public void setAllElementsOnRoot(boolean allElementsOnRoot) {
		this.allElementsOnRoot = allElementsOnRoot;
	}

}
