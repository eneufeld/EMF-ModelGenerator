/*******************************************************************************
 * Copyright (c) 2008-2011 Chair for Applied Software Engineering,
 * All rights reserved. This program and the accompanying materials are made available under the terms of the Eclipse
 * Public License v1.0 which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * Contributors:
 ******************************************************************************/
package org.eclipse.emf.emfstore.modelmutator.testModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.emf.emfstore.modelmutator.testModel.TestModelFactory
 * @model kind="package"
 * @generated
 */
public interface TestModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "org.eclipse.emf.emfstore.modelmutator.testModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/eclipse/emf/modelmutator/org.eclipse.emf.emfstore.modelmutator.testModel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.eclipse.emf.modelmutator.testModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TestModelPackage eINSTANCE = org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.NodeImpl
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Bigdeci</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BIGDECI = 1;

	/**
	 * The feature id for the '<em><b>Bigint</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BIGINT = 2;

	/**
	 * The feature id for the '<em><b>Bool</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BOOL = 3;

	/**
	 * The feature id for the '<em><b>Boolean</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BOOLEAN = 4;

	/**
	 * The feature id for the '<em><b>Byte</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__BYTE = 5;

	/**
	 * The feature id for the '<em><b>Sub Node</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__SUB_NODE = 6;

	/**
	 * The feature id for the '<em><b>Contains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__CONTAINS = 7;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.ContainedLeafImpl <em>Contained Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.ContainedLeafImpl
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getContainedLeaf()
	 * @generated
	 */
	int CONTAINED_LEAF = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__NAME = 0;

	/**
	 * The feature id for the '<em><b>Byte Array</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__BYTE_ARRAY = 1;

	/**
	 * The feature id for the '<em><b>Byte Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__BYTE_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Char</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__CHAR = 3;

	/**
	 * The feature id for the '<em><b>Character</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__CHARACTER = 4;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__DATE = 5;

	/**
	 * The feature id for the '<em><b>Double</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__DOUBLE = 6;

	/**
	 * The feature id for the '<em><b>Double Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__DOUBLE_OBJ = 7;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__FLOAT = 8;

	/**
	 * The feature id for the '<em><b>Element Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__ELEMENT_TYPE = 9;

	/**
	 * The feature id for the '<em><b>Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__REF = 10;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF__UPPER_BOUND = 11;

	/**
	 * The number of structural features of the '<em>Contained Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINED_LEAF_FEATURE_COUNT = 12;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.LeafsImpl <em>Leafs</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.LeafsImpl
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getLeafs()
	 * @generated
	 */
	int LEAFS = 5;

	/**
	 * The number of structural features of the '<em>Leafs</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEAFS_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.referedLeafImpl <em>refered Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.referedLeafImpl
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getreferedLeaf()
	 * @generated
	 */
	int REFERED_LEAF = 2;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__FLOAT = LEAFS_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Int</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__INT = LEAFS_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Integer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__INTEGER = LEAFS_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__LONG = LEAFS_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Long Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__LONG_OBJ = LEAFS_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Short</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__SHORT = LEAFS_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Short Obj</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__SHORT_OBJ = LEAFS_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__NAME = LEAFS_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Not Changeable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__NOT_CHANGEABLE = LEAFS_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Multi Ref</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF__MULTI_REF = LEAFS_FEATURE_COUNT + 9;

	/**
	 * The number of structural features of the '<em>refered Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERED_LEAF_FEATURE_COUNT = LEAFS_FEATURE_COUNT + 10;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.multiRefLeafImpl <em>multi Ref Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.multiRefLeafImpl
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getmultiRefLeaf()
	 * @generated
	 */
	int MULTI_REF_LEAF = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_LEAF__NAME = LEAFS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>multi Ref Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MULTI_REF_LEAF_FEATURE_COUNT = LEAFS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.upperBoundLeafImpl <em>upper Bound Leaf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.upperBoundLeafImpl
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getupperBoundLeaf()
	 * @generated
	 */
	int UPPER_BOUND_LEAF = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_LEAF__NAME = LEAFS_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>upper Bound Leaf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UPPER_BOUND_LEAF_FEATURE_COUNT = LEAFS_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ElementType <em>Element Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ElementType
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getElementType()
	 * @generated
	 */
	int ELEMENT_TYPE = 6;


	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getName()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigdeci <em>Bigdeci</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bigdeci</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigdeci()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Bigdeci();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigint <em>Bigint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bigint</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBigint()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Bigint();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#isBool <em>Bool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bool</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#isBool()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Bool();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBoolean <em>Boolean</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Boolean</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getBoolean()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Boolean();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getByte <em>Byte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getByte()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Byte();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getSubNode <em>Sub Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Sub Node</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getSubNode()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_SubNode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Node#getContains <em>Contains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contains</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Node#getContains()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Contains();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf <em>Contained Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Contained Leaf</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf
	 * @generated
	 */
	EClass getContainedLeaf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getName()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getByteArray <em>Byte Array</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Array</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getByteArray()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_ByteArray();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getByteObject <em>Byte Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Byte Object</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getByteObject()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_ByteObject();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getChar <em>Char</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Char</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getChar()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_Char();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getCharacter <em>Character</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Character</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getCharacter()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_Character();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getDate()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_Date();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getDouble <em>Double</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getDouble()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_Double();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getDoubleObj <em>Double Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Double Obj</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getDoubleObj()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_DoubleObj();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getFloat()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_Float();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Element Type</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getElementType()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EAttribute getContainedLeaf_ElementType();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getRef <em>Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Ref</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getRef()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EReference getContainedLeaf_Ref();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Upper Bound</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ContainedLeaf#getUpperBound()
	 * @see #getContainedLeaf()
	 * @generated
	 */
	EReference getContainedLeaf_UpperBound();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf <em>refered Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>refered Leaf</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf
	 * @generated
	 */
	EClass getreferedLeaf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getFloat()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_Float();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getInt <em>Int</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Int</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getInt()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_Int();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getInteger <em>Integer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Integer</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getInteger()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_Integer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getLong()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_Long();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getLongObj <em>Long Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long Obj</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getLongObj()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_LongObj();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getShort <em>Short</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getShort()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_Short();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getShortObj <em>Short Obj</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Short Obj</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getShortObj()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_ShortObj();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getName()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_Name();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getNotChangeable <em>Not Changeable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Not Changeable</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getNotChangeable()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EAttribute getreferedLeaf_NotChangeable();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getMultiRef <em>Multi Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Multi Ref</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.referedLeaf#getMultiRef()
	 * @see #getreferedLeaf()
	 * @generated
	 */
	EReference getreferedLeaf_MultiRef();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.modelmutator.testModel.multiRefLeaf <em>multi Ref Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>multi Ref Leaf</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.multiRefLeaf
	 * @generated
	 */
	EClass getmultiRefLeaf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.multiRefLeaf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.multiRefLeaf#getName()
	 * @see #getmultiRefLeaf()
	 * @generated
	 */
	EAttribute getmultiRefLeaf_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.modelmutator.testModel.upperBoundLeaf <em>upper Bound Leaf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>upper Bound Leaf</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.upperBoundLeaf
	 * @generated
	 */
	EClass getupperBoundLeaf();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.emf.emfstore.modelmutator.testModel.upperBoundLeaf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.upperBoundLeaf#getName()
	 * @see #getupperBoundLeaf()
	 * @generated
	 */
	EAttribute getupperBoundLeaf_Name();

	/**
	 * Returns the meta object for class '{@link org.eclipse.emf.emfstore.modelmutator.testModel.Leafs <em>Leafs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Leafs</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.Leafs
	 * @generated
	 */
	EClass getLeafs();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ElementType <em>Element Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Element Type</em>'.
	 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ElementType
	 * @generated
	 */
	EEnum getElementType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TestModelFactory getTestModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.NodeImpl
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__NAME = eINSTANCE.getNode_Name();

		/**
		 * The meta object literal for the '<em><b>Bigdeci</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BIGDECI = eINSTANCE.getNode_Bigdeci();

		/**
		 * The meta object literal for the '<em><b>Bigint</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BIGINT = eINSTANCE.getNode_Bigint();

		/**
		 * The meta object literal for the '<em><b>Bool</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BOOL = eINSTANCE.getNode_Bool();

		/**
		 * The meta object literal for the '<em><b>Boolean</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BOOLEAN = eINSTANCE.getNode_Boolean();

		/**
		 * The meta object literal for the '<em><b>Byte</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__BYTE = eINSTANCE.getNode_Byte();

		/**
		 * The meta object literal for the '<em><b>Sub Node</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__SUB_NODE = eINSTANCE.getNode_SubNode();

		/**
		 * The meta object literal for the '<em><b>Contains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__CONTAINS = eINSTANCE.getNode_Contains();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.ContainedLeafImpl <em>Contained Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.ContainedLeafImpl
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getContainedLeaf()
		 * @generated
		 */
		EClass CONTAINED_LEAF = eINSTANCE.getContainedLeaf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__NAME = eINSTANCE.getContainedLeaf_Name();

		/**
		 * The meta object literal for the '<em><b>Byte Array</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__BYTE_ARRAY = eINSTANCE.getContainedLeaf_ByteArray();

		/**
		 * The meta object literal for the '<em><b>Byte Object</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__BYTE_OBJECT = eINSTANCE.getContainedLeaf_ByteObject();

		/**
		 * The meta object literal for the '<em><b>Char</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__CHAR = eINSTANCE.getContainedLeaf_Char();

		/**
		 * The meta object literal for the '<em><b>Character</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__CHARACTER = eINSTANCE.getContainedLeaf_Character();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__DATE = eINSTANCE.getContainedLeaf_Date();

		/**
		 * The meta object literal for the '<em><b>Double</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__DOUBLE = eINSTANCE.getContainedLeaf_Double();

		/**
		 * The meta object literal for the '<em><b>Double Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__DOUBLE_OBJ = eINSTANCE.getContainedLeaf_DoubleObj();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__FLOAT = eINSTANCE.getContainedLeaf_Float();

		/**
		 * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTAINED_LEAF__ELEMENT_TYPE = eINSTANCE.getContainedLeaf_ElementType();

		/**
		 * The meta object literal for the '<em><b>Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_LEAF__REF = eINSTANCE.getContainedLeaf_Ref();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINED_LEAF__UPPER_BOUND = eINSTANCE.getContainedLeaf_UpperBound();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.referedLeafImpl <em>refered Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.referedLeafImpl
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getreferedLeaf()
		 * @generated
		 */
		EClass REFERED_LEAF = eINSTANCE.getreferedLeaf();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__FLOAT = eINSTANCE.getreferedLeaf_Float();

		/**
		 * The meta object literal for the '<em><b>Int</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__INT = eINSTANCE.getreferedLeaf_Int();

		/**
		 * The meta object literal for the '<em><b>Integer</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__INTEGER = eINSTANCE.getreferedLeaf_Integer();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__LONG = eINSTANCE.getreferedLeaf_Long();

		/**
		 * The meta object literal for the '<em><b>Long Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__LONG_OBJ = eINSTANCE.getreferedLeaf_LongObj();

		/**
		 * The meta object literal for the '<em><b>Short</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__SHORT = eINSTANCE.getreferedLeaf_Short();

		/**
		 * The meta object literal for the '<em><b>Short Obj</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__SHORT_OBJ = eINSTANCE.getreferedLeaf_ShortObj();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__NAME = eINSTANCE.getreferedLeaf_Name();

		/**
		 * The meta object literal for the '<em><b>Not Changeable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERED_LEAF__NOT_CHANGEABLE = eINSTANCE.getreferedLeaf_NotChangeable();

		/**
		 * The meta object literal for the '<em><b>Multi Ref</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERED_LEAF__MULTI_REF = eINSTANCE.getreferedLeaf_MultiRef();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.multiRefLeafImpl <em>multi Ref Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.multiRefLeafImpl
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getmultiRefLeaf()
		 * @generated
		 */
		EClass MULTI_REF_LEAF = eINSTANCE.getmultiRefLeaf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MULTI_REF_LEAF__NAME = eINSTANCE.getmultiRefLeaf_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.upperBoundLeafImpl <em>upper Bound Leaf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.upperBoundLeafImpl
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getupperBoundLeaf()
		 * @generated
		 */
		EClass UPPER_BOUND_LEAF = eINSTANCE.getupperBoundLeaf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UPPER_BOUND_LEAF__NAME = eINSTANCE.getupperBoundLeaf_Name();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.impl.LeafsImpl <em>Leafs</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.LeafsImpl
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getLeafs()
		 * @generated
		 */
		EClass LEAFS = eINSTANCE.getLeafs();

		/**
		 * The meta object literal for the '{@link org.eclipse.emf.emfstore.modelmutator.testModel.ElementType <em>Element Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.ElementType
		 * @see org.eclipse.emf.emfstore.modelmutator.testModel.impl.TestModelPackageImpl#getElementType()
		 * @generated
		 */
		EEnum ELEMENT_TYPE = eINSTANCE.getElementType();

	}

} //TestModelPackage
