/**
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl.fin;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sell</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mydsl.fin.Sell#getBond <em>Bond</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.Sell#getOption <em>Option</em>}</li>
 * </ul>
 *
 * @see org.xtext.mydsl.fin.FinPackage#getSell()
 * @model
 * @generated
 */
public interface Sell extends Transaction
{
  /**
   * Returns the value of the '<em><b>Bond</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Bond</em>' reference.
   * @see #setBond(Bond)
   * @see org.xtext.mydsl.fin.FinPackage#getSell_Bond()
   * @model
   * @generated
   */
  Bond getBond();

  /**
   * Sets the value of the '{@link org.xtext.mydsl.fin.Sell#getBond <em>Bond</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Bond</em>' reference.
   * @see #getBond()
   * @generated
   */
  void setBond(Bond value);

  /**
   * Returns the value of the '<em><b>Option</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Option</em>' reference.
   * @see #setOption(Option)
   * @see org.xtext.mydsl.fin.FinPackage#getSell_Option()
   * @model
   * @generated
   */
  Option getOption();

  /**
   * Sets the value of the '{@link org.xtext.mydsl.fin.Sell#getOption <em>Option</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Option</em>' reference.
   * @see #getOption()
   * @generated
   */
  void setOption(Option value);

} // Sell
