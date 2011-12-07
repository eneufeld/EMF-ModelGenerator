/**
 * 
 */
package org.eclipse.emf.modelmutator.api;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.modelmutator.intern.attribute.AttributSetterEString;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetter;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEBigDecimal;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEBigInteger;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEBoolean;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEByte;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEByteArray;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEChar;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEDate;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEDouble;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEEnum;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEFloat;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEInt;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterELong;
import org.eclipse.emf.modelmutator.intern.attribute.AttributeSetterEShort;

/**
 * @author Eugen Neufeld
 * @author Stephan Köhler
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
	 * @param reference
	 *            the EReference to get containable EClasses for
	 * @return a set of all EClasses that can be contained when using
	 *         <code>reference</code>
	 */
	// private static Map<EReference, List<EClass>> allEContainments = new
	// LinkedHashMap<EReference, List<EClass>>();
	public static List<EClass> getAllEContainments(EReference reference) {
		// ONLY PERFORMANCE
		/*
		 * if(allEContainments.containsKey(reference)) { return
		 * allEContainments.get(reference); } if(reference == null) {
		 * allEContainments.put(reference, new LinkedList<EClass>()); return
		 * allEContainments.get(reference); }
		 */
		List<EClass> result = new LinkedList<EClass>();
		EClass referenceType = reference.getEReferenceType();
		// no abstracts or interfaces
		if (canHaveInstance(referenceType)) {
			result.add(referenceType);
		}
		// 'referenceType: EObject' allows all kinds of EObjects
		if (EcorePackage.eINSTANCE.getEObject().equals(referenceType)) {
			return getAllEClasses();
		}
		// all sub EClasses can be referenced as well
		result.addAll(getAllSubEClasses(referenceType));

		// save the result for upcoming method calls
		// allEContainments.put(reference, result);
		return result;
	}

	/**
	 * Returns whether <code>eClass</code> can be instantiated or not. An EClass
	 * can be instantiated, if it is neither an interface nor abstract.
	 * 
	 * @param eClass
	 *            the EClass in question
	 * @return whether <code>eClass</code> can be instantiated or not.
	 */
	public static boolean canHaveInstance(EClass eClass) {
		return !eClass.isInterface() && !eClass.isAbstract();
	}

	/**
	 * Returns all subclasses of an EClass, excluding abstract classes and
	 * interfaces.
	 * 
	 * @param eClass
	 *            the EClass to get subclasses for
	 * @return all subclasses of <code>eClass</code>
	 */
	public static List<EClass> getAllSubEClasses(EClass eClass) {
		// PERFORMANCE
		/*
		 * if(eClassToSubEClasses.containsKey(eClass)) { return
		 * eClassToSubEClasses.get(eClass); } if(eClass == null) {
		 * eClassToSubEClasses.put(eClass, new LinkedList<EClass>()); return
		 * eClassToSubEClasses.get(eClass); }
		 */
		List<EClass> allEClasses = getAllEClasses();
		List<EClass> result = new LinkedList<EClass>();
		for (EClass possibleSubClass : allEClasses) {
			// is the EClass really a subClass, while not being abstract or an
			// interface?
			if (eClass.isSuperTypeOf(possibleSubClass) && canHaveInstance(possibleSubClass)) {
				result.add(possibleSubClass);
			}
		}

		// save the result for upcoming method calls
		// eClassToSubEClasses.put(eClass, result);
		return result;
	}

	/**
	 * Iterates over all registered EPackages in order to retrieve all available
	 * EClasses, excluding abstract classes and interfaces, and returns them as
	 * a Set.
	 * 
	 * @return a set of all EClasses that are contained in registered EPackages
	 * @see Registry
	 */
	public static List<EClass> getAllEClasses() {
		// were all EClasses computed before?
		/*
		 * PERFORMANCE if (allEClasses != null) { return allEClasses; }
		 */
		List<EClass> allEClasses = new LinkedList<EClass>();
		Registry registry = EPackage.Registry.INSTANCE;
		// for all registered EPackages
		for (Entry<String, Object> entry : registry.entrySet()) {
			EPackage ePackage = registry.getEPackage(entry.getKey());
			for (EClass eClass : getAllEClasses(ePackage)) {
				// no abstracts or interfaces
				if (canHaveInstance(eClass)) {
					allEClasses.add(eClass);
				}
			}
		}
		return allEClasses;
	}

	/**
	 * Retrieve all EClasses that are contained in <code>ePackage</code>.
	 * 
	 * @param ePackage
	 *            the package to get contained EClasses from
	 * @return a set of EClasses contained in <code>ePackage</code>
	 */
	public static List<EClass> getAllEClasses(EPackage ePackage) {
		/*
		 * PERFORMANCE if(packageToModelElementEClasses.containsKey(ePackage)) {
		 * return packageToModelElementEClasses.get(ePackage); } if(ePackage ==
		 * null) { packageToModelElementEClasses.put(ePackage, new
		 * LinkedList<EClass>()); return
		 * packageToModelElementEClasses.get(ePackage); }
		 */

		List<EClass> result = new LinkedList<EClass>();
		// obtain all EClasses from sub packages
		for (EPackage subPackage : ePackage.getESubpackages()) {
			result.addAll(getAllEClasses(subPackage));
		}
		// obtain all EClasses that are direct contents of the EPackage
		for (EClassifier classifier : ePackage.getEClassifiers()) {
			if (classifier instanceof EClass) {
				result.add((EClass) classifier);
			}
		}

		// save the result for upcoming method calls
		// packageToModelElementEClasses.put(ePackage, result);
		return result;
	}

	/**
	 * Adds <code>newValue</code> to the many-valued feature of
	 * <code>eObject</code> using an AddCommand. Exceptions are caught if
	 * <code>ignoreAndLog</code> is true, otherwise a RuntimeException might be
	 * thrown if the command fails.
	 * 
	 * @param eObject
	 *            the EObject to which <code>newObject</code> shall be added
	 * @param feature
	 *            the EStructuralFeature that <code>newObject</code> shall be
	 *            added to
	 * @param newValue
	 *            the Object that shall be added to <code>feature</code>
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return <code>newValue</code> if the <code>AddCommand</code> was
	 *         performed successful or <code>null</code> if it failed
	 * @see AddCommand#AddCommand(EditingDomain, EObject, EStructuralFeature,
	 *      Object)
	 */
	public static EObject addPerCommand(EObject eObject, EStructuralFeature feature, Object newValue, Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		try {
			if (feature.isUnique() && ((Collection<?>) eObject.eGet(feature)).contains(newValue)) {
				// unique feature already contains object -> nothing to do
				return null;
			}
			new AddCommand(domain, eObject, feature, newValue).doExecute();
			if (newValue instanceof EObject) {
				return (EObject) newValue;
			} else {
				return null;
			}
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
			return null;
		}
	}
	/**
	 * Adds all <code>objects</code> to the many-valued feature of 
	 * <code>eObject</code> using an AddCommand. 
	 * Exceptions are caught if <code>ignoreAndLog</code> is
	 * true, otherwise a RuntimeException might be thrown if the command fails.  
	 * 
	 * @param eObject the EObject to which <code>objects</code> shall be added
	 * @param feature the EReference that <code>objects</code> shall be added to
	 * @param objects collection of objects that shall be added to <code>feature</code>
	 * @param exceptionLog the current log of exceptions
	 * @param ignoreAndLog should exceptions be ignored and added to <code>exceptionLog</code>?
	 */
	public static void addPerCommand(EObject eObject, EStructuralFeature feature, Collection<?> objects,
		Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		try {
			for(Object object : objects) {
				if(feature.isUnique() && ((Collection<?>) eObject.eGet(feature)).contains(object)) {
					// object already exists in unique feature, don't add it again
					objects.remove(object);
				}
			}
			// no objects to add left
			if(objects.isEmpty()) {
				return;
			}
			new AddCommand(domain, eObject, feature, objects).doExecute();
		} catch(RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
		}
	}
	/**
	 * Sets a feature between <code>eObject</code> and <code>newValue</code>
	 * using a SetCommand. Exceptions are caught if <code>ignoreAndLog</code> is
	 * true, otherwise a RuntimeException might be thrown if the command fails.
	 * 
	 * @param eObject
	 *            the EObject for which <code>feature</code> shall be set
	 * @param feature
	 *            the EStructuralFeature that shall be set
	 * @param newValue
	 *            the Object that shall be set as a feature in
	 *            <code>parentEObject</code>
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @return <code>newValue</code> if the <code>SetCommand</code> was
	 *         performed successful or <code>null</code> if it failed
	 * @see SetCommand
	 */
	public static EObject setPerCommand(EObject eObject, EStructuralFeature feature, Object newValue, Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		// no new value to set? -> unset the feature
		if (newValue == null) {
			newValue = SetCommand.UNSET_VALUE;
		}
		try {
			new SetCommand(domain, eObject, feature, newValue).doExecute();
			if (newValue instanceof EObject) {
				return (EObject) newValue;
			} else {
				return null;
			}
		} catch (RuntimeException e) {
			handle(e, exceptionLog, ignoreAndLog);
			return null;
		}
	}
	/**
	 * Removes <code>objects</code> from a feature of <code>eObject</code>
	 * using a RemoveCommand. Exceptions are caught if <code>ignoreAndLog</code> is
	 * true, otherwise a RuntimeException might be thrown if the command fails.  
	 * 
	 * @param eObject the EObject to remove <code>objects</code> from
	 * @param feature the EStructuralFeature <code>objects</code> shall be removed from
	 * @param objects collection of Objects that shall be removed
	 * @param exceptionLog the current log of exceptions
	 * @param ignoreAndLog should exceptions be ignored and added to <code>exceptionLog</code>?
	 * @see RemoveCommand
	 */
	public static void removePerCommand(EObject eObject, EStructuralFeature feature, Collection<?> objects,
		Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		EditingDomain domain = AdapterFactoryEditingDomain.getEditingDomainFor(eObject);
		try {
			new RemoveCommand(domain, eObject, feature, objects).doExecute();
		} catch(RuntimeException e){
			handle(e, exceptionLog, ignoreAndLog);
		}
	}
	/**
	 * Sets all possible attributes of known types to random values using
	 * {@link IAttributeSetter} and SetCommands/AddCommands.
	 * 
	 * @param eObject
	 *            the EObject to set attributes for
	 * @param random
	 *            the Random object used to determine the creation of attributes
	 * @param exceptionLog
	 *            the current log of exceptions
	 * @param ignoreAndLog
	 *            should exceptions be ignored and added to
	 *            <code>exceptionLog</code>?
	 * @see IAttributeSetter
	 * @see AttributeHandler
	 * @see #addPerCommand(EObject, EStructuralFeature, Collection, Set,
	 *      boolean)
	 * @see #addPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 * @see #setPerCommand(EObject, EStructuralFeature, Object, Set, boolean)
	 */
	public static void setEObjectAttributes(EObject eObject, Random random, Set<RuntimeException> exceptionLog, boolean ignoreAndLog) {
		Map<EClassifier, AttributeSetter<?>> attributeSetters = getAttributeSetters(random);

		for (EAttribute attribute : eObject.eClass().getEAllAttributes()) {
			EClassifier attributeType = attribute.getEAttributeType();

			if(eObject.eIsSet(attribute)&&attribute.isMany()) {
				removePerCommand(eObject, attribute, (Collection<?>) eObject.eGet(attribute),
						exceptionLog, ignoreAndLog);
			}
				
			if (!isValid(attribute, eObject, exceptionLog, ignoreAndLog)) {
				continue;
			}

			// the attribute setter used to create new attributes
			AttributeSetter<?> attributeSetter = null;

			// is there a setter for this attribute?
			if (attributeSetters.containsKey(attributeType)) {
				attributeSetter = attributeSetters.get(attributeType);
			} else if (isEnum(attributeType)) {
				attributeSetter = getEEnumSetter((EEnum) attributeType,random);
			}

			// was there a fitting attribute setter?
			if (attributeSetter != null) {
				if (attribute.isMany()) {
					int numberOfAttributes = computeFeatureAmount(attribute, random);
					addPerCommand(eObject, attribute, attributeSetter.createNewAttributes(numberOfAttributes), exceptionLog, ignoreAndLog);
				} else {
					setPerCommand(eObject, attribute, attributeSetter.createNewAttribute(), exceptionLog, ignoreAndLog);
				}
			}
		}
	}

	/**
	 * Returns whether <code>attributeType</code> is an instance of EEnum.
	 * 
	 * @param attributeType
	 *            the EClassifier in question
	 * @return is <code>attributeType</code> an instance of EEnum?
	 */
	private static boolean isEnum(EClassifier attributeType) {
		return EcorePackage.eINSTANCE.getEEnum().isInstance(attributeType);
	}

	/**
	 * Computes the random amount of objects to add to a feature.
	 * 
	 * @param feature
	 *            the feature to compute the amount of objects for
	 * @param random
	 *            the Random object used to obtain random values
	 * @return 1 if the feature is single valued,<br>
	 *         a random value from 0 to 10 if the feature is many-valued and has
	 *         no upper bound,<br>
	 *         a random value between the feature's lower and upper bound
	 *         otherwise
	 */
	private static int computeFeatureAmount(EStructuralFeature feature, Random random) {
		if (!feature.isMany()) {
			return 1;
		}
		if (feature.getUpperBound() < feature.getLowerBound()) {
			return random.nextInt(10);
		}
		return feature.getLowerBound() + random.nextInt(feature.getUpperBound() - feature.getLowerBound() + 1);
	}

	/**
	 * Returns a map containing an AttributeSetter-instance for each attribute
	 * type, granting access to all AttributeSetters.
	 * 
	 * @return the map that maps every attribute type to its attribute setter
	 * @see AttributeSetter
	 */
	public static Map<EClassifier, AttributeSetter<?>> getAttributeSetters(Random random) {

		EcorePackage ecoreInstance = EcorePackage.eINSTANCE;

		HashMap<EClassifier, AttributeSetter<?>> attributeSetters = new LinkedHashMap<EClassifier, AttributeSetter<?>>();
		AttributeSetter<?> oAttributeSetter;

		oAttributeSetter = new AttributeSetterEBoolean(random);
		attributeSetters.put(ecoreInstance.getEBoolean(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEBooleanObject(), oAttributeSetter);

		attributeSetters.put(ecoreInstance.getEByteArray(), new AttributeSetterEByteArray(random, 100));

		attributeSetters.put(ecoreInstance.getEString(), new AttributSetterEString(random));

		oAttributeSetter = new AttributeSetterEInt(random);
		attributeSetters.put(ecoreInstance.getEInt(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEIntegerObject(), oAttributeSetter);

		attributeSetters.put(ecoreInstance.getEDate(), new AttributeSetterEDate(random));

		oAttributeSetter = new AttributeSetterELong(random);
		attributeSetters.put(ecoreInstance.getELong(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getELongObject(), oAttributeSetter);

		oAttributeSetter = new AttributeSetterEByte(random);
		attributeSetters.put(ecoreInstance.getEByte(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEByteObject(), oAttributeSetter);

		oAttributeSetter = new AttributeSetterEChar(random);
		attributeSetters.put(ecoreInstance.getEChar(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getECharacterObject(), oAttributeSetter);

		oAttributeSetter = new AttributeSetterEDouble(random);
		attributeSetters.put(ecoreInstance.getEDouble(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEDoubleObject(), oAttributeSetter);

		oAttributeSetter = new AttributeSetterEFloat(random);
		attributeSetters.put(ecoreInstance.getEFloat(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEFloatObject(), oAttributeSetter);

		oAttributeSetter = new AttributeSetterEShort(random);
		attributeSetters.put(ecoreInstance.getEShort(), oAttributeSetter);
		attributeSetters.put(ecoreInstance.getEShortObject(), oAttributeSetter);

		attributeSetters.put(ecoreInstance.getEBigInteger(), new AttributeSetterEBigInteger(random));

		attributeSetters.put(ecoreInstance.getEBigDecimal(), new AttributeSetterEBigDecimal(random));

		return attributeSetters;

	}

	/**
	 * Returns an instance of the EEnum AttributeSetter belonging to the EEnum
	 * specified by eEnum.
	 * 
	 * @param eEnum
	 *            the EEnum to create the AttributeSetter for
	 * @return a new AttributeSetterEEnum instance
	 */
	public static AttributeSetter<?> getEEnumSetter(EEnum eEnum,Random random) {
		return new AttributeSetterEEnum(eEnum, random);
	}
}
