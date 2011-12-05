/**
 * 
 */
package org.eclipse.emf.modelmutator.api;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

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
	private final Random random;
	
	private int depth;
	private int width;
	private boolean ignoreAndLog;
	private Collection<EClass> eClassesToIgnore;
	private Set<RuntimeException> exceptionLog;
	
	public ModelMutatorConfiguration(EPackage modelPackage,EObject rootEObject,long seed){
		this.modelPackage=modelPackage;
		this.rootEObject=rootEObject;
		this.random=new Random(seed);
		
		this.eClassesToIgnore=new ArrayList<EClass>();
		this.exceptionLog=new LinkedHashSet<RuntimeException>();
		this.ignoreAndLog=true;
		this.depth=5;
		this.width=5;
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
	 * @return the exceptionLog
	 */
	public Set<RuntimeException> getExceptionLog() {
		return exceptionLog;
	}

	/**
	 * @param exceptionLog the exceptionLog to set
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
	
}
