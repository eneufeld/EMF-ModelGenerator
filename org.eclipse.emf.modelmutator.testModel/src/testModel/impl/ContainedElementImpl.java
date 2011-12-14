/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel.impl;

import java.util.Collection;
import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testModel.ContainedElement;
import testModel.ElementType;
import testModel.TestModelPackage;
import testModel.referenziertesElement;
import testModel.upperBound;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contained Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testModel.impl.ContainedElementImpl#getName <em>Name</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getByteArray <em>Byte Array</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getByteObject <em>Byte Object</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getChar <em>Char</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getCharacter <em>Character</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getDate <em>Date</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getDiagnosticChain <em>Diagnostic Chain</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getDouble <em>Double</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getDoubleObj <em>Double Obj</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getFloat <em>Float</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getRef <em>Ref</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getEnumerator <em>Enumerator</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getElist <em>Elist</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getMap <em>Map</em>}</li>
 *   <li>{@link testModel.impl.ContainedElementImpl#getTreeIterator <em>Tree Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContainedElementImpl extends EObjectImpl implements ContainedElement {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] BYTE_ARRAY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteArray() <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteArray()
	 * @generated
	 * @ordered
	 */
	protected byte[] byteArray = BYTE_ARRAY_EDEFAULT;

	/**
	 * The default value of the '{@link #getByteObject() <em>Byte Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObject()
	 * @generated
	 * @ordered
	 */
	protected static final Byte BYTE_OBJECT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getByteObject() <em>Byte Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByteObject()
	 * @generated
	 * @ordered
	 */
	protected Byte byteObject = BYTE_OBJECT_EDEFAULT;

	/**
	 * The default value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected static final char CHAR_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getChar() <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChar()
	 * @generated
	 * @ordered
	 */
	protected char char_ = CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected static final Character CHARACTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharacter() <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharacter()
	 * @generated
	 * @ordered
	 */
	protected Character character = CHARACTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected Date date = DATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagnosticChain() <em>Diagnostic Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticChain()
	 * @generated
	 * @ordered
	 */
	protected static final DiagnosticChain DIAGNOSTIC_CHAIN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnosticChain() <em>Diagnostic Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosticChain()
	 * @generated
	 * @ordered
	 */
	protected DiagnosticChain diagnosticChain = DIAGNOSTIC_CHAIN_EDEFAULT;

	/**
	 * The default value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected static final double DOUBLE_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getDouble() <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDouble()
	 * @generated
	 * @ordered
	 */
	protected double double_ = DOUBLE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDoubleObj() <em>Double Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObj()
	 * @generated
	 * @ordered
	 */
	protected static final Double DOUBLE_OBJ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDoubleObj() <em>Double Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDoubleObj()
	 * @generated
	 * @ordered
	 */
	protected Double doubleObj = DOUBLE_OBJ_EDEFAULT;

	/**
	 * The default value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected static final float FLOAT_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getFloat() <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFloat()
	 * @generated
	 * @ordered
	 */
	protected float float_ = FLOAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected static final ElementType ELEMENT_TYPE_EDEFAULT = ElementType.TYPE1;

	/**
	 * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElementType()
	 * @generated
	 * @ordered
	 */
	protected ElementType elementType = ELEMENT_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getRef() <em>Ref</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRef()
	 * @generated
	 * @ordered
	 */
	protected EList<referenziertesElement> ref;

	/**
	 * The cached value of the '{@link #getUpperBound() <em>Upper Bound</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUpperBound()
	 * @generated
	 * @ordered
	 */
	protected EList<upperBound> upperBound;

	/**
	 * The default value of the '{@link #getEnumerator() <em>Enumerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerator()
	 * @generated
	 * @ordered
	 */
	protected static final Enumerator ENUMERATOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnumerator() <em>Enumerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnumerator()
	 * @generated
	 * @ordered
	 */
	protected Enumerator enumerator = ENUMERATOR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getElist() <em>Elist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElist()
	 * @generated
	 * @ordered
	 */
	protected EList<String> elist;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected Class<String> class_;

	/**
	 * The cached value of the '{@link #getMap() <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMap()
	 * @generated
	 * @ordered
	 */
	protected Map<ContainedElement, referenziertesElement> map;

	/**
	 * The cached value of the '{@link #getTreeIterator() <em>Tree Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTreeIterator()
	 * @generated
	 * @ordered
	 */
	protected TreeIterator<String> treeIterator;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContainedElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.CONTAINED_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getByteArray() {
		return byteArray;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteArray(byte[] newByteArray) {
		byte[] oldByteArray = byteArray;
		byteArray = newByteArray;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__BYTE_ARRAY, oldByteArray, byteArray));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Byte getByteObject() {
		return byteObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByteObject(Byte newByteObject) {
		Byte oldByteObject = byteObject;
		byteObject = newByteObject;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__BYTE_OBJECT, oldByteObject, byteObject));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getChar() {
		return char_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChar(char newChar) {
		char oldChar = char_;
		char_ = newChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__CHAR, oldChar, char_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Character getCharacter() {
		return character;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharacter(Character newCharacter) {
		Character oldCharacter = character;
		character = newCharacter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__CHARACTER, oldCharacter, character));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(Date newDate) {
		Date oldDate = date;
		date = newDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__DATE, oldDate, date));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticChain getDiagnosticChain() {
		return diagnosticChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnosticChain(DiagnosticChain newDiagnosticChain) {
		DiagnosticChain oldDiagnosticChain = diagnosticChain;
		diagnosticChain = newDiagnosticChain;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN, oldDiagnosticChain, diagnosticChain));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getDouble() {
		return double_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDouble(double newDouble) {
		double oldDouble = double_;
		double_ = newDouble;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__DOUBLE, oldDouble, double_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Double getDoubleObj() {
		return doubleObj;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDoubleObj(Double newDoubleObj) {
		Double oldDoubleObj = doubleObj;
		doubleObj = newDoubleObj;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__DOUBLE_OBJ, oldDoubleObj, doubleObj));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getFloat() {
		return float_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFloat(float newFloat) {
		float oldFloat = float_;
		float_ = newFloat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__FLOAT, oldFloat, float_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ElementType getElementType() {
		return elementType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElementType(ElementType newElementType) {
		ElementType oldElementType = elementType;
		elementType = newElementType == null ? ELEMENT_TYPE_EDEFAULT : newElementType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__ELEMENT_TYPE, oldElementType, elementType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<referenziertesElement> getRef() {
		if (ref == null) {
			ref = new EObjectResolvingEList<referenziertesElement>(referenziertesElement.class, this, TestModelPackage.CONTAINED_ELEMENT__REF);
		}
		return ref;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<upperBound> getUpperBound() {
		if (upperBound == null) {
			upperBound = new EObjectContainmentEList<upperBound>(upperBound.class, this, TestModelPackage.CONTAINED_ELEMENT__UPPER_BOUND);
		}
		return upperBound;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Enumerator getEnumerator() {
		return enumerator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnumerator(Enumerator newEnumerator) {
		Enumerator oldEnumerator = enumerator;
		enumerator = newEnumerator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__ENUMERATOR, oldEnumerator, enumerator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getElist() {
		return elist;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setElist(EList<String> newElist) {
		EList<String> oldElist = elist;
		elist = newElist;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__ELIST, oldElist, elist));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Class<String> getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(Class<String> newClass) {
		Class<String> oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Map<ContainedElement, referenziertesElement> getMap() {
		return map;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMap(Map<ContainedElement, referenziertesElement> newMap) {
		Map<ContainedElement, referenziertesElement> oldMap = map;
		map = newMap;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__MAP, oldMap, map));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TreeIterator<String> getTreeIterator() {
		return treeIterator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTreeIterator(TreeIterator<String> newTreeIterator) {
		TreeIterator<String> oldTreeIterator = treeIterator;
		treeIterator = newTreeIterator;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.CONTAINED_ELEMENT__TREE_ITERATOR, oldTreeIterator, treeIterator));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestModelPackage.CONTAINED_ELEMENT__UPPER_BOUND:
				return ((InternalEList<?>)getUpperBound()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TestModelPackage.CONTAINED_ELEMENT__NAME:
				return getName();
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_ARRAY:
				return getByteArray();
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_OBJECT:
				return getByteObject();
			case TestModelPackage.CONTAINED_ELEMENT__CHAR:
				return getChar();
			case TestModelPackage.CONTAINED_ELEMENT__CHARACTER:
				return getCharacter();
			case TestModelPackage.CONTAINED_ELEMENT__DATE:
				return getDate();
			case TestModelPackage.CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN:
				return getDiagnosticChain();
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE:
				return getDouble();
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE_OBJ:
				return getDoubleObj();
			case TestModelPackage.CONTAINED_ELEMENT__FLOAT:
				return getFloat();
			case TestModelPackage.CONTAINED_ELEMENT__ELEMENT_TYPE:
				return getElementType();
			case TestModelPackage.CONTAINED_ELEMENT__REF:
				return getRef();
			case TestModelPackage.CONTAINED_ELEMENT__UPPER_BOUND:
				return getUpperBound();
			case TestModelPackage.CONTAINED_ELEMENT__ENUMERATOR:
				return getEnumerator();
			case TestModelPackage.CONTAINED_ELEMENT__ELIST:
				return getElist();
			case TestModelPackage.CONTAINED_ELEMENT__CLASS:
				return getClass_();
			case TestModelPackage.CONTAINED_ELEMENT__MAP:
				return getMap();
			case TestModelPackage.CONTAINED_ELEMENT__TREE_ITERATOR:
				return getTreeIterator();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TestModelPackage.CONTAINED_ELEMENT__NAME:
				setName((String)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_ARRAY:
				setByteArray((byte[])newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_OBJECT:
				setByteObject((Byte)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__CHAR:
				setChar((Character)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__CHARACTER:
				setCharacter((Character)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DATE:
				setDate((Date)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN:
				setDiagnosticChain((DiagnosticChain)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE:
				setDouble((Double)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE_OBJ:
				setDoubleObj((Double)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__FLOAT:
				setFloat((Float)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__ELEMENT_TYPE:
				setElementType((ElementType)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__REF:
				getRef().clear();
				getRef().addAll((Collection<? extends referenziertesElement>)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__UPPER_BOUND:
				getUpperBound().clear();
				getUpperBound().addAll((Collection<? extends upperBound>)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__ENUMERATOR:
				setEnumerator((Enumerator)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__ELIST:
				setElist((EList<String>)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__CLASS:
				setClass((Class<String>)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__MAP:
				setMap((Map<ContainedElement, referenziertesElement>)newValue);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__TREE_ITERATOR:
				setTreeIterator((TreeIterator<String>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TestModelPackage.CONTAINED_ELEMENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_ARRAY:
				setByteArray(BYTE_ARRAY_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_OBJECT:
				setByteObject(BYTE_OBJECT_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__CHAR:
				setChar(CHAR_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__CHARACTER:
				setCharacter(CHARACTER_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DATE:
				setDate(DATE_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN:
				setDiagnosticChain(DIAGNOSTIC_CHAIN_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE:
				setDouble(DOUBLE_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE_OBJ:
				setDoubleObj(DOUBLE_OBJ_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__FLOAT:
				setFloat(FLOAT_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__ELEMENT_TYPE:
				setElementType(ELEMENT_TYPE_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__REF:
				getRef().clear();
				return;
			case TestModelPackage.CONTAINED_ELEMENT__UPPER_BOUND:
				getUpperBound().clear();
				return;
			case TestModelPackage.CONTAINED_ELEMENT__ENUMERATOR:
				setEnumerator(ENUMERATOR_EDEFAULT);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__ELIST:
				setElist((EList<String>)null);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__CLASS:
				setClass((Class<String>)null);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__MAP:
				setMap((Map<ContainedElement, referenziertesElement>)null);
				return;
			case TestModelPackage.CONTAINED_ELEMENT__TREE_ITERATOR:
				setTreeIterator((TreeIterator<String>)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TestModelPackage.CONTAINED_ELEMENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_ARRAY:
				return BYTE_ARRAY_EDEFAULT == null ? byteArray != null : !BYTE_ARRAY_EDEFAULT.equals(byteArray);
			case TestModelPackage.CONTAINED_ELEMENT__BYTE_OBJECT:
				return BYTE_OBJECT_EDEFAULT == null ? byteObject != null : !BYTE_OBJECT_EDEFAULT.equals(byteObject);
			case TestModelPackage.CONTAINED_ELEMENT__CHAR:
				return char_ != CHAR_EDEFAULT;
			case TestModelPackage.CONTAINED_ELEMENT__CHARACTER:
				return CHARACTER_EDEFAULT == null ? character != null : !CHARACTER_EDEFAULT.equals(character);
			case TestModelPackage.CONTAINED_ELEMENT__DATE:
				return DATE_EDEFAULT == null ? date != null : !DATE_EDEFAULT.equals(date);
			case TestModelPackage.CONTAINED_ELEMENT__DIAGNOSTIC_CHAIN:
				return DIAGNOSTIC_CHAIN_EDEFAULT == null ? diagnosticChain != null : !DIAGNOSTIC_CHAIN_EDEFAULT.equals(diagnosticChain);
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE:
				return double_ != DOUBLE_EDEFAULT;
			case TestModelPackage.CONTAINED_ELEMENT__DOUBLE_OBJ:
				return DOUBLE_OBJ_EDEFAULT == null ? doubleObj != null : !DOUBLE_OBJ_EDEFAULT.equals(doubleObj);
			case TestModelPackage.CONTAINED_ELEMENT__FLOAT:
				return float_ != FLOAT_EDEFAULT;
			case TestModelPackage.CONTAINED_ELEMENT__ELEMENT_TYPE:
				return elementType != ELEMENT_TYPE_EDEFAULT;
			case TestModelPackage.CONTAINED_ELEMENT__REF:
				return ref != null && !ref.isEmpty();
			case TestModelPackage.CONTAINED_ELEMENT__UPPER_BOUND:
				return upperBound != null && !upperBound.isEmpty();
			case TestModelPackage.CONTAINED_ELEMENT__ENUMERATOR:
				return ENUMERATOR_EDEFAULT == null ? enumerator != null : !ENUMERATOR_EDEFAULT.equals(enumerator);
			case TestModelPackage.CONTAINED_ELEMENT__ELIST:
				return elist != null;
			case TestModelPackage.CONTAINED_ELEMENT__CLASS:
				return class_ != null;
			case TestModelPackage.CONTAINED_ELEMENT__MAP:
				return map != null;
			case TestModelPackage.CONTAINED_ELEMENT__TREE_ITERATOR:
				return treeIterator != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", byteArray: ");
		result.append(byteArray);
		result.append(", byteObject: ");
		result.append(byteObject);
		result.append(", char: ");
		result.append(char_);
		result.append(", Character: ");
		result.append(character);
		result.append(", date: ");
		result.append(date);
		result.append(", DiagnosticChain: ");
		result.append(diagnosticChain);
		result.append(", double: ");
		result.append(double_);
		result.append(", DoubleObj: ");
		result.append(doubleObj);
		result.append(", float: ");
		result.append(float_);
		result.append(", elementType: ");
		result.append(elementType);
		result.append(", Enumerator: ");
		result.append(enumerator);
		result.append(", elist: ");
		result.append(elist);
		result.append(", Class: ");
		result.append(class_);
		result.append(", Map: ");
		result.append(map);
		result.append(", TreeIterator: ");
		result.append(treeIterator);
		result.append(')');
		return result.toString();
	}

} //ContainedElementImpl
