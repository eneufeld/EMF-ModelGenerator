/**
 * 
 */
package org.eclipse.emf.modelmutator.api;

import java.util.Collection;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

/**
 * @author Eugen Neufeld
 *
 */
public class ModelMutatorConfiguration {

	private final EPackage modelPackage;
	private final EObject rootEObject;
	private final long seed;
	
	private int depth;
	private int width;
	private boolean ignoreAndLog;
	private Collection<EClass> eClassesToIgnore;
	
	public ModelMutatorConfiguration(EPackage modelPackage,EObject rootEObject,long seed){
		this.modelPackage=modelPackage;
		this.rootEObject=rootEObject;
		this.seed=seed;
	}

	/**
	 * @return the depth
	 */
	public int getDepth() {
		return depth;
	}

	/**
	 * @param depth the depth to set
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
	 * @param width the width to set
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
	 * @param ignoreAndLog the ignoreAndLog to set
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
	 * @param eClassesToIgnore the eClassesToIgnore to set
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
	 * @return the seed
	 */
	public long getSeed() {
		return seed;
	}
	
}
