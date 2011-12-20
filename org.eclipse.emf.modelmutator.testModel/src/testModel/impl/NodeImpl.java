/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel.impl;

import java.math.BigDecimal;
import java.math.BigInteger;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import testModel.ContainedLeaf;
import testModel.Node;
import testModel.TestModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link testModel.impl.NodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#getBigdeci <em>Bigdeci</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#getBigint <em>Bigint</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#isBool <em>Bool</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#getBoolean <em>Boolean</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#getByte <em>Byte</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#getSubNode <em>Sub Node</em>}</li>
 *   <li>{@link testModel.impl.NodeImpl#getContains <em>Contains</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NodeImpl extends EObjectImpl implements Node {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = "";

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
	 * The default value of the '{@link #getBigdeci() <em>Bigdeci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigdeci()
	 * @generated
	 * @ordered
	 */
	protected static final BigDecimal BIGDECI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBigdeci() <em>Bigdeci</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigdeci()
	 * @generated
	 * @ordered
	 */
	protected BigDecimal bigdeci = BIGDECI_EDEFAULT;

	/**
	 * The default value of the '{@link #getBigint() <em>Bigint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigint()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger BIGINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBigint() <em>Bigint</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBigint()
	 * @generated
	 * @ordered
	 */
	protected BigInteger bigint = BIGINT_EDEFAULT;

	/**
	 * The default value of the '{@link #isBool() <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBool()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BOOL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBool() <em>Bool</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBool()
	 * @generated
	 * @ordered
	 */
	protected boolean bool = BOOL_EDEFAULT;

	/**
	 * The default value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected static final Boolean BOOLEAN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBoolean() <em>Boolean</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoolean()
	 * @generated
	 * @ordered
	 */
	protected Boolean boolean_ = BOOLEAN_EDEFAULT;

	/**
	 * The default value of the '{@link #getByte() <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByte()
	 * @generated
	 * @ordered
	 */
	protected static final byte BYTE_EDEFAULT = 0x00;

	/**
	 * The cached value of the '{@link #getByte() <em>Byte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getByte()
	 * @generated
	 * @ordered
	 */
	protected byte byte_ = BYTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubNode() <em>Sub Node</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubNode()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> subNode;

	/**
	 * The cached value of the '{@link #getContains() <em>Contains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContains()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainedLeaf> contains;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TestModelPackage.Literals.NODE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.NODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigDecimal getBigdeci() {
		return bigdeci;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigdeci(BigDecimal newBigdeci) {
		BigDecimal oldBigdeci = bigdeci;
		bigdeci = newBigdeci;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.NODE__BIGDECI, oldBigdeci, bigdeci));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getBigint() {
		return bigint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBigint(BigInteger newBigint) {
		BigInteger oldBigint = bigint;
		bigint = newBigint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.NODE__BIGINT, oldBigint, bigint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBool() {
		return bool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBool(boolean newBool) {
		boolean oldBool = bool;
		bool = newBool;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.NODE__BOOL, oldBool, bool));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Boolean getBoolean() {
		return boolean_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBoolean(Boolean newBoolean) {
		Boolean oldBoolean = boolean_;
		boolean_ = newBoolean;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.NODE__BOOLEAN, oldBoolean, boolean_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte getByte() {
		return byte_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setByte(byte newByte) {
		byte oldByte = byte_;
		byte_ = newByte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TestModelPackage.NODE__BYTE, oldByte, byte_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getSubNode() {
		if (subNode == null) {
			subNode = new EObjectResolvingEList<Node>(Node.class, this, TestModelPackage.NODE__SUB_NODE);
		}
		return subNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainedLeaf> getContains() {
		if (contains == null) {
			contains = new EObjectContainmentEList<ContainedLeaf>(ContainedLeaf.class, this, TestModelPackage.NODE__CONTAINS);
		}
		return contains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TestModelPackage.NODE__CONTAINS:
				return ((InternalEList<?>)getContains()).basicRemove(otherEnd, msgs);
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
			case TestModelPackage.NODE__NAME:
				return getName();
			case TestModelPackage.NODE__BIGDECI:
				return getBigdeci();
			case TestModelPackage.NODE__BIGINT:
				return getBigint();
			case TestModelPackage.NODE__BOOL:
				return isBool();
			case TestModelPackage.NODE__BOOLEAN:
				return getBoolean();
			case TestModelPackage.NODE__BYTE:
				return getByte();
			case TestModelPackage.NODE__SUB_NODE:
				return getSubNode();
			case TestModelPackage.NODE__CONTAINS:
				return getContains();
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
			case TestModelPackage.NODE__NAME:
				setName((String)newValue);
				return;
			case TestModelPackage.NODE__BIGDECI:
				setBigdeci((BigDecimal)newValue);
				return;
			case TestModelPackage.NODE__BIGINT:
				setBigint((BigInteger)newValue);
				return;
			case TestModelPackage.NODE__BOOL:
				setBool((Boolean)newValue);
				return;
			case TestModelPackage.NODE__BOOLEAN:
				setBoolean((Boolean)newValue);
				return;
			case TestModelPackage.NODE__BYTE:
				setByte((Byte)newValue);
				return;
			case TestModelPackage.NODE__SUB_NODE:
				getSubNode().clear();
				getSubNode().addAll((Collection<? extends Node>)newValue);
				return;
			case TestModelPackage.NODE__CONTAINS:
				getContains().clear();
				getContains().addAll((Collection<? extends ContainedLeaf>)newValue);
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
			case TestModelPackage.NODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case TestModelPackage.NODE__BIGDECI:
				setBigdeci(BIGDECI_EDEFAULT);
				return;
			case TestModelPackage.NODE__BIGINT:
				setBigint(BIGINT_EDEFAULT);
				return;
			case TestModelPackage.NODE__BOOL:
				setBool(BOOL_EDEFAULT);
				return;
			case TestModelPackage.NODE__BOOLEAN:
				setBoolean(BOOLEAN_EDEFAULT);
				return;
			case TestModelPackage.NODE__BYTE:
				setByte(BYTE_EDEFAULT);
				return;
			case TestModelPackage.NODE__SUB_NODE:
				getSubNode().clear();
				return;
			case TestModelPackage.NODE__CONTAINS:
				getContains().clear();
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
			case TestModelPackage.NODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case TestModelPackage.NODE__BIGDECI:
				return BIGDECI_EDEFAULT == null ? bigdeci != null : !BIGDECI_EDEFAULT.equals(bigdeci);
			case TestModelPackage.NODE__BIGINT:
				return BIGINT_EDEFAULT == null ? bigint != null : !BIGINT_EDEFAULT.equals(bigint);
			case TestModelPackage.NODE__BOOL:
				return bool != BOOL_EDEFAULT;
			case TestModelPackage.NODE__BOOLEAN:
				return BOOLEAN_EDEFAULT == null ? boolean_ != null : !BOOLEAN_EDEFAULT.equals(boolean_);
			case TestModelPackage.NODE__BYTE:
				return byte_ != BYTE_EDEFAULT;
			case TestModelPackage.NODE__SUB_NODE:
				return subNode != null && !subNode.isEmpty();
			case TestModelPackage.NODE__CONTAINS:
				return contains != null && !contains.isEmpty();
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
		result.append(", bigdeci: ");
		result.append(bigdeci);
		result.append(", bigint: ");
		result.append(bigint);
		result.append(", bool: ");
		result.append(bool);
		result.append(", Boolean: ");
		result.append(boolean_);
		result.append(", byte: ");
		result.append(byte_);
		result.append(')');
		return result.toString();
	}

} //NodeImpl
