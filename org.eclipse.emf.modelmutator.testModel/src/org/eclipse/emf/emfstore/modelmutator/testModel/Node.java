/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.testModel;

import java.math.BigDecimal;
import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigdeci <em>Bigdeci</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigint <em>Bigint</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#isBool <em>Bool</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getByte <em>Byte</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getSubNode <em>Sub Node</em>}</li>
 *   <li>{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Name()
	 * @model default=""
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Bigdeci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bigdeci</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bigdeci</em>' attribute.
	 * @see #setBigdeci(BigDecimal)
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Bigdeci()
	 * @model
	 * @generated
	 */
	BigDecimal getBigdeci();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigdeci <em>Bigdeci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bigdeci</em>' attribute.
	 * @see #getBigdeci()
	 * @generated
	 */
	void setBigdeci(BigDecimal value);

	/**
	 * Returns the value of the '<em><b>Bigint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bigint</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bigint</em>' attribute.
	 * @see #setBigint(BigInteger)
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Bigint()
	 * @model
	 * @generated
	 */
	BigInteger getBigint();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigint <em>Bigint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bigint</em>' attribute.
	 * @see #getBigint()
	 * @generated
	 */
	void setBigint(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bool</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bool</em>' attribute.
	 * @see #setBool(boolean)
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Bool()
	 * @model
	 * @generated
	 */
	boolean isBool();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#isBool <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bool</em>' attribute.
	 * @see #isBool()
	 * @generated
	 */
	void setBool(boolean value);

	/**
	 * Returns the value of the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Boolean</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Boolean</em>' attribute.
	 * @see #setBoolean(Boolean)
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Boolean()
	 * @model
	 * @generated
	 */
	Boolean getBoolean();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBoolean <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Boolean</em>' attribute.
	 * @see #getBoolean()
	 * @generated
	 */
	void setBoolean(Boolean value);

	/**
	 * Returns the value of the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Byte</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Byte</em>' attribute.
	 * @see #setByte(byte)
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Byte()
	 * @model
	 * @generated
	 */
	byte getByte();

	/**
	 * Sets the value of the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getByte <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Byte</em>' attribute.
	 * @see #getByte()
	 * @generated
	 */
	void setByte(byte value);

	/**
	 * Returns the value of the '<em><b>Sub Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.emf.emfstore.modelmutator.testModel.Node}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Node</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Node</em>' reference list.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_SubNode()
	 * @model
	 * @generated
	 */
	EList<Node> getSubNode();

	/**
	 * Returns the value of the '<em><b>Contains</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contains</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contains</em>' containment reference list.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelPackage#getNode_Contains()
	 * @model containment="true"
	 * @generated
	 */
	EList<ContainedLeaf> getContains();

} // Node
