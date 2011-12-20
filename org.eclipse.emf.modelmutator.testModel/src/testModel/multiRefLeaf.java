/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package testModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>multi Ref Leaf</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link testModel.multiRefLeaf#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see testModel.TestModelPackage#getmultiRefLeaf()
 * @model
 * @generated
 */
public interface multiRefLeaf extends Leafs {
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
	 * @see testModel.TestModelPackage#getmultiRefLeaf_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link testModel.multiRefLeaf#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // multiRefLeaf
