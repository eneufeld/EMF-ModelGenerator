/**
 * 
 */
package org.eclipse.emf.modelmutator.api;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;

/**
 * @author Eugen Neufeld
 * 
 */
public class ModelMutatorUtil {

	/**
	 * Returns the EPackage to the specified <code>nsURI</code>.
	 * 
	 * @param nsURI
	 *            the NsUri of the EPackage to get
	 * @return the EPackage belonging to <code>nsURI</code>
	 * @see Registry#getEPackage(String)
	 */
	public static EPackage getEPackage(String nsURI) {
		return EPackage.Registry.INSTANCE.getEPackage(nsURI);
	}

	/**
	 * Returns all valid references for an EObject. This excludes
	 * container/containment references. A reference is valid if it is neither
	 * derived nor volatile and if it is changeable and either many-valued or
	 * not already set.
	 * 
	 * @param eObject
	 *            the EObject to get references for
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return all valid references as a list
	 */
	public static List<EReference> getValidReferences(EObject eObject, Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		List<EReference> result = new LinkedList<EReference>();
		for (EReference reference : eObject.eClass().getEAllReferences()) {
			if (!reference.isContainer() && !reference.isContainment() && isValid(reference, eObject, exceptionLog, ignoreAndLog)
					&& (reference.isMany() || !eObject.eIsSet(reference))) {
				result.add(reference);
			}
		}
		return result;
	}

	/**
	 * Returns whether an EStructuralFeature is valid for an EObject or not. A
	 * reference is valid, if it can be set or added to.
	 * 
	 * @param feature
	 *            the EStructuralFeature in question
	 * @param eObject
	 *            the EObject to check the feature for
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return if the feature can be set or added to
	 */
	public static boolean isValid(EStructuralFeature feature, EObject eObject, Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		boolean result = false;
		try {
			if (feature.isMany()) {
				// has the maximum amount of referenced objects been reached?
				Collection<?> referencedItems = (Collection<?>) eObject.eGet(feature);
				if (feature.getUpperBound() >= 0 && referencedItems.size() >= feature.getUpperBound()) {
					return false;
				}
			}
			// can the feature be changed reflectively?
			result = feature.isChangeable() && !feature.isVolatile() && !feature.isDerived();
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
		}
		return result;
	}

	/**
	 * Handles <code>exception</code>, meaning it is thrown if
	 * <code>ignoreAndLog</code> is <code>false</code>. Otherwise
	 * <code>exception</code> is ignored and added to <code>exceptionLog</code>.
	 * 
	 * @param exception
	 *            the exception to handle
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 */
	private static void handle(RuntimeException exception, Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		if (ignoreAndLog) {
			exceptionLog.add(exception);
		} else {
			throw exception;
		}
	}
	
	/**
	 * Returns all possible EClasses, excluding abstract classes and interfaces,
	 * that can be contained when using <code>reference</code>.
	 * 
	 * @param reference the EReference to get containable EClasses for
	 * @return a set of all EClasses that can be contained when using <code>reference</code>
	 */
//	private static Map<EReference, List<EClass>> allEContainments = new LinkedHashMap<EReference, List<EClass>>();
	public static List<EClass> getAllEContainments(EReference reference) {
		//ONLY PERFORMANCE
		/*
		if(allEContainments.containsKey(reference)) {
			return allEContainments.get(reference);
		}
		if(reference == null) {
			allEContainments.put(reference, new LinkedList<EClass>());
			return allEContainments.get(reference);
		}
		*/
		List<EClass> result = new LinkedList<EClass>();
		EClass referenceType = reference.getEReferenceType();
		// no abstracts or interfaces
		if(canHaveInstance(referenceType)) {
			result.add(referenceType);
		}
		// 'referenceType: EObject' allows all kinds of EObjects
		if(EcorePackage.eINSTANCE.getEObject().equals(referenceType)) {
			return getAllEClasses();
		}
		// all sub EClasses can be referenced as well
		result.addAll(getAllSubEClasses(referenceType));
		
		// save the result for upcoming method calls
		//allEContainments.put(reference, result);
		return result;
	}
	/**
	 * Returns whether <code>eClass</code> can be instantiated or not.
	 * An EClass can be instantiated, if it is neither an interface nor abstract.
	 * 
	 * @param eClass the EClass in question
	 * @return whether <code>eClass</code> can be instantiated or not. 
	 */
	public static boolean canHaveInstance(EClass eClass) {
		return !eClass.isInterface() && !eClass.isAbstract();
	}
	/**
	 * Returns all subclasses of an EClass, excluding abstract classes
	 * and interfaces.
	 * 
	 * @param eClass the EClass to get subclasses for
	 * @return all subclasses of <code>eClass</code>
	 */
	public static List<EClass> getAllSubEClasses(EClass eClass) {
		//PERFORMANCE
		/*
		if(eClassToSubEClasses.containsKey(eClass)) {
			return eClassToSubEClasses.get(eClass);
		}
		if(eClass == null) {
			eClassToSubEClasses.put(eClass, new LinkedList<EClass>());
			return eClassToSubEClasses.get(eClass);
		}
		*/
		List<EClass> allEClasses = getAllEClasses();
		List<EClass> result = new LinkedList<EClass>();
		for (EClass possibleSubClass : allEClasses) {
			// is the EClass really a subClass, while not being abstract or an interface?
			if (eClass.isSuperTypeOf(possibleSubClass) && canHaveInstance(possibleSubClass)) {
				result.add(possibleSubClass);
			}
		}
		
		// save the result for upcoming method calls
//		eClassToSubEClasses.put(eClass, result);
		return result;
	}
	/**
	 * Iterates over all registered EPackages in order to retrieve all available 
	 * EClasses, excluding abstract classes and interfaces, and returns them as a Set. 
	 * 
	 * @return a set of all EClasses that are contained in registered EPackages
	 * @see Registry
	 */
	public static List<EClass> getAllEClasses() {
		// were all EClasses computed before?
		/* PERFORMANCE
		if (allEClasses != null) {
			return allEClasses;
		}
		*/
		List<EClass> allEClasses = new LinkedList<EClass>();
		Registry registry = EPackage.Registry.INSTANCE;
		// for all registered EPackages
		for (Entry<String, Object> entry : registry.entrySet()) {
			EPackage ePackage = registry.getEPackage(entry.getKey());
			for(EClass eClass : getAllEClasses(ePackage)) {
				// no abstracts or interfaces
				if(canHaveInstance(eClass)) {
					allEClasses.add(eClass);
				}
			}
		}
		return allEClasses;
	}
	/**
	 * Retrieve all EClasses that are contained in <code>ePackage</code>. 
	 * 
	 * @param ePackage the package to get contained EClasses from
	 * @return a set of EClasses contained in <code>ePackage</code>
	 */
	public static List<EClass> getAllEClasses(EPackage ePackage) {
		/* PERFORMANCE
		if(packageToModelElementEClasses.containsKey(ePackage)) {
			return packageToModelElementEClasses.get(ePackage);
		}
		if(ePackage == null) {
			packageToModelElementEClasses.put(ePackage, new LinkedList<EClass>());
			return packageToModelElementEClasses.get(ePackage);	
		}
		*/
		
		List<EClass> result = new LinkedList<EClass>();
		// obtain all EClasses from sub packages
		for(EPackage subPackage : ePackage.getESubpackages()) {
			result.addAll(getAllEClasses(subPackage));
		}
		// obtain all EClasses that are direct contents of the EPackage
		for(EClassifier classifier : ePackage.getEClassifiers()) {
			if(classifier instanceof EClass) {
				result.add((EClass) classifier);
			}
		}
		
		// save the result for upcoming method calls
		//packageToModelElementEClasses.put(ePackage, result);
		return result;
	}
	
	/**
	 * Adds <code>newValue</code> to the many-valued feature of 
	 * <code>eObject</code> using an AddCommand. 
	 * Exceptions are caught if <code>ignoreAndLog</code> is
	 * true, otherwise a RuntimeException might be thrown if the command fails.  
	 * 
	 * @param eObject the EObject to which <code>newObject</code> shall be added
	 * @param feature the EStructuralFeature that <code>newObject</code> shall be added to
	 * @param newValue the Object that shall be added to <code>feature</code>
	 * @param exceptionLog the current log of exceptions
	 * @param ignoreAndLog should exceptions be ignored and added to <code>exceptionLog</code>?
	 * @return <code>newValue</code> if the <code>AddCommand</code> was performed successful
	 * or <code>null</code> if it failed
	 * @see AddCommand#AddCommand(EditingDomain, EObject, EStructuralFeature, Object)
	 */
	public static EObject addPerCommand(EObject eObject, EStructuralFeature feature, Object newValue,
		Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		try {
			if(feature.isUnique() && ((Collection<?>) eObject.eGet(feature)).contains(newValue)) {
				// unique feature already contains object -> nothing to do
				return null;
			}
			new AddCommand(domain, eObject, feature, newValue).doExecute();
			if(newValue instanceof EObject) {
				return (EObject) newValue;
			} else {
				return null;
			}
		} catch(RuntimeException e){
			handle(e, exceptionLog, ignoreAndLog);
			return null;
		}
	}
}
