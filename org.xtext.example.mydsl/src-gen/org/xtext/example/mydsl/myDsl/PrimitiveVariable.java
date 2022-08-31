/**
 * generated by Xtext 2.27.0
 */
package org.xtext.example.mydsl.myDsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primitive Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.example.mydsl.myDsl.PrimitiveVariable#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveVariable()
 * @model
 * @generated
 */
public interface PrimitiveVariable extends Variable
{
  /**
   * Returns the value of the '<em><b>Type</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' containment reference.
   * @see #setType(Primitive)
   * @see org.xtext.example.mydsl.myDsl.MyDslPackage#getPrimitiveVariable_Type()
   * @model containment="true"
   * @generated
   */
  Primitive getType();

  /**
   * Sets the value of the '{@link org.xtext.example.mydsl.myDsl.PrimitiveVariable#getType <em>Type</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' containment reference.
   * @see #getType()
   * @generated
   */
  void setType(Primitive value);

} // PrimitiveVariable