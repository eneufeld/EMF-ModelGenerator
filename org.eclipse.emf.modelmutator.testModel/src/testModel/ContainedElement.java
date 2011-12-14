/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel;

import java.util.Date;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contained Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link testModel.ContainedElement#getName <em>Name</em>}</li>
 *   <li>{@link testModel.ContainedElement#getByteArray <em>Byte Array</em>}</li>
 *   <li>{@link testModel.ContainedElement#getByteObject <em>Byte Object</em>}</li>
 *   <li>{@link testModel.ContainedElement#getChar <em>Char</em>}</li>
 *   <li>{@link testModel.ContainedElement#getCharacter <em>Character</em>}</li>
 *   <li>{@link testModel.ContainedElement#getDate <em>Date</em>}</li>
 *   <li>{@link testModel.ContainedElement#getDiagnosticChain <em>Diagnostic Chain</em>}</li>
 *   <li>{@link testModel.ContainedElement#getDouble <em>Double</em>}</li>
 *   <li>{@link testModel.ContainedElement#getDoubleObj <em>Double Obj</em>}</li>
 *   <li>{@link testModel.ContainedElement#getFloat <em>Float</em>}</li>
 *   <li>{@link testModel.ContainedElement#getElementType <em>Element Type</em>}</li>
 *   <li>{@link testModel.ContainedElement#getRef <em>Ref</em>}</li>
 *   <li>{@link testModel.ContainedElement#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link testModel.ContainedElement#getEnumerator <em>Enumerator</em>}</li>
 *   <li>{@link testModel.ContainedElement#getElist <em>Elist</em>}</li>
 *   <li>{@link testModel.ContainedElement#getClass_ <em>Class</em>}</li>
 *   <li>{@link testModel.ContainedElement#getMap <em>Map</em>}</li>
 *   <li>{@link testModel.ContainedElement#getTreeIterator <em>Tree Iterator</em>}</li>
 * </ul>
 * </p>
 *
 * @see testModel.TestModelPackage#getContainedElement()
 * @model
 * @generated
 */
public interface ContainedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see testModel.TestModelPackage#getContainedElement_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Array</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Array</em>' attribute.
	 * @see #setByteArray(byte[])
	 * @see testModel.TestModelPackage#getContainedElement_ByteArray()
	 * @model
	 * @generated
	 */
	byte[] getByteArray();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getByteArray <em>Byte Array</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Array</em>' attribute.
	 * @see #getByteArray()
	 * @generated
	 */
	void setByteArray(byte[] value);

	/**
	 * Returns the value of the '<em><b>Byte Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte Object</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte Object</em>' attribute.
	 * @see #setByteObject(Byte)
	 * @see testModel.TestModelPackage#getContainedElement_ByteObject()
	 * @model
	 * @generated
	 */
	Byte getByteObject();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getByteObject <em>Byte Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte Object</em>' attribute.
	 * @see #getByteObject()
	 * @generated
	 */
	void setByteObject(Byte value);

	/**
	 * Returns the value of the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Char</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Char</em>' attribute.
	 * @see #setChar(char)
	 * @see testModel.TestModelPackage#getContainedElement_Char()
	 * @model
	 * @generated
	 */
	char getChar();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getChar <em>Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Char</em>' attribute.
	 * @see #getChar()
	 * @generated
	 */
	void setChar(char value);

	/**
	 * Returns the value of the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' attribute.
	 * @see #setCharacter(Character)
	 * @see testModel.TestModelPackage#getContainedElement_Character()
	 * @model
	 * @generated
	 */
	Character getCharacter();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getCharacter <em>Character</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Character</em>' attribute.
	 * @see #getCharacter()
	 * @generated
	 */
	void setCharacter(Character value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute.
	 * @see #setDate(Date)
	 * @see testModel.TestModelPackage#getContainedElement_Date()
	 * @model
	 * @generated
	 */
	Date getDate();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getDate <em>Date</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' attribute.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(Date value);

	/**
	 * Returns the value of the '<em><b>Diagnostic Chain</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnostic Chain</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnostic Chain</em>' attribute.
	 * @see #setDiagnosticChain(DiagnosticChain)
	 * @see testModel.TestModelPackage#getContainedElement_DiagnosticChain()
	 * @model transient="true"
	 * @generated
	 */
	DiagnosticChain getDiagnosticChain();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getDiagnosticChain <em>Diagnostic Chain</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Diagnostic Chain</em>' attribute.
	 * @see #getDiagnosticChain()
	 * @generated
	 */
	void setDiagnosticChain(DiagnosticChain value);

	/**
	 * Returns the value of the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double</em>' attribute.
	 * @see #setDouble(double)
	 * @see testModel.TestModelPackage#getContainedElement_Double()
	 * @model
	 * @generated
	 */
	double getDouble();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getDouble <em>Double</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double</em>' attribute.
	 * @see #getDouble()
	 * @generated
	 */
	void setDouble(double value);

	/**
	 * Returns the value of the '<em><b>Double Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Double Obj</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Double Obj</em>' attribute.
	 * @see #setDoubleObj(Double)
	 * @see testModel.TestModelPackage#getContainedElement_DoubleObj()
	 * @model
	 * @generated
	 */
	Double getDoubleObj();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getDoubleObj <em>Double Obj</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Double Obj</em>' attribute.
	 * @see #getDoubleObj()
	 * @generated
	 */
	void setDoubleObj(Double value);

	/**
	 * Returns the value of the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Float</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Float</em>' attribute.
	 * @see #setFloat(float)
	 * @see testModel.TestModelPackage#getContainedElement_Float()
	 * @model
	 * @generated
	 */
	float getFloat();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getFloat <em>Float</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Float</em>' attribute.
	 * @see #getFloat()
	 * @generated
	 */
	void setFloat(float value);

	/**
	 * Returns the value of the '<em><b>Element Type</b></em>' attribute.
	 * The literals are from the enumeration {@link testModel.ElementType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element Type</em>' attribute.
	 * @see testModel.ElementType
	 * @see #setElementType(ElementType)
	 * @see testModel.TestModelPackage#getContainedElement_ElementType()
	 * @model
	 * @generated
	 */
	ElementType getElementType();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getElementType <em>Element Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Element Type</em>' attribute.
	 * @see testModel.ElementType
	 * @see #getElementType()
	 * @generated
	 */
	void setElementType(ElementType value);

	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference list.
	 * The list contents are of type {@link testModel.referenziertesElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference list.
	 * @see testModel.TestModelPackage#getContainedElement_Ref()
	 * @model
	 * @generated
	 */
	EList<referenziertesElement> getRef();

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' containment reference list.
	 * The list contents are of type {@link testModel.upperBound}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' containment reference list.
	 * @see testModel.TestModelPackage#getContainedElement_UpperBound()
	 * @model containment="true" upper="2"
	 * @generated
	 */
	EList<upperBound> getUpperBound();

	/**
	 * Returns the value of the '<em><b>Enumerator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Enumerator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Enumerator</em>' attribute.
	 * @see #setEnumerator(Enumerator)
	 * @see testModel.TestModelPackage#getContainedElement_Enumerator()
	 * @model transient="true"
	 * @generated
	 */
	Enumerator getEnumerator();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getEnumerator <em>Enumerator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enumerator</em>' attribute.
	 * @see #getEnumerator()
	 * @generated
	 */
	void setEnumerator(Enumerator value);

	/**
	 * Returns the value of the '<em><b>Elist</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Elist</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elist</em>' attribute.
	 * @see #setElist(EList)
	 * @see testModel.TestModelPackage#getContainedElement_Elist()
	 * @model many="false" transient="true"
	 * @generated
	 */
	EList<String> getElist();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getElist <em>Elist</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Elist</em>' attribute.
	 * @see #getElist()
	 * @generated
	 */
	void setElist(EList<String> value);

	/**
	 * Returns the value of the '<em><b>Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Class</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Class</em>' attribute.
	 * @see #setClass(Class)
	 * @see testModel.TestModelPackage#getContainedElement_Class()
	 * @model transient="true"
	 * @generated
	 */
	Class<String> getClass_();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getClass_ <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Class</em>' attribute.
	 * @see #getClass_()
	 * @generated
	 */
	void setClass(Class<String> value);

	/**
	 * Returns the value of the '<em><b>Map</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Map</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Map</em>' attribute.
	 * @see #setMap(Map)
	 * @see testModel.TestModelPackage#getContainedElement_Map()
	 * @model transient="true"
	 * @generated
	 */
	Map<ContainedElement, referenziertesElement> getMap();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getMap <em>Map</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map</em>' attribute.
	 * @see #getMap()
	 * @generated
	 */
	void setMap(Map<ContainedElement, referenziertesElement> value);

	/**
	 * Returns the value of the '<em><b>Tree Iterator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tree Iterator</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tree Iterator</em>' attribute.
	 * @see #setTreeIterator(TreeIterator)
	 * @see testModel.TestModelPackage#getContainedElement_TreeIterator()
	 * @model transient="true"
	 * @generated
	 */
	TreeIterator<String> getTreeIterator();

	/**
	 * Sets the value of the '{@link testModel.ContainedElement#getTreeIterator <em>Tree Iterator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tree Iterator</em>' attribute.
	 * @see #getTreeIterator()
	 * @generated
	 */
	void setTreeIterator(TreeIterator<String> value);

} // ContainedElement
