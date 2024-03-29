/**
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl.fin.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mydsl.fin.Bond;
import org.xtext.mydsl.fin.FinPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Bond</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mydsl.fin.impl.BondImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.BondImpl#getFaceValue <em>Face Value</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.BondImpl#getCouponRate <em>Coupon Rate</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.BondImpl#getMaturity <em>Maturity</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.BondImpl#getYieldRate <em>Yield Rate</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BondImpl extends AssetImpl implements Bond
{
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
   * The default value of the '{@link #getFaceValue() <em>Face Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFaceValue()
   * @generated
   * @ordered
   */
  protected static final float FACE_VALUE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getFaceValue() <em>Face Value</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFaceValue()
   * @generated
   * @ordered
   */
  protected float faceValue = FACE_VALUE_EDEFAULT;

  /**
   * The default value of the '{@link #getCouponRate() <em>Coupon Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCouponRate()
   * @generated
   * @ordered
   */
  protected static final float COUPON_RATE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getCouponRate() <em>Coupon Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCouponRate()
   * @generated
   * @ordered
   */
  protected float couponRate = COUPON_RATE_EDEFAULT;

  /**
   * The default value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaturity()
   * @generated
   * @ordered
   */
  protected static final int MATURITY_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getMaturity() <em>Maturity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMaturity()
   * @generated
   * @ordered
   */
  protected int maturity = MATURITY_EDEFAULT;

  /**
   * The default value of the '{@link #getYieldRate() <em>Yield Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYieldRate()
   * @generated
   * @ordered
   */
  protected static final float YIELD_RATE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getYieldRate() <em>Yield Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getYieldRate()
   * @generated
   * @ordered
   */
  protected float yieldRate = YIELD_RATE_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected BondImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return FinPackage.Literals.BOND;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BOND__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getFaceValue()
  {
    return faceValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFaceValue(float newFaceValue)
  {
    float oldFaceValue = faceValue;
    faceValue = newFaceValue;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BOND__FACE_VALUE, oldFaceValue, faceValue));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getCouponRate()
  {
    return couponRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setCouponRate(float newCouponRate)
  {
    float oldCouponRate = couponRate;
    couponRate = newCouponRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BOND__COUPON_RATE, oldCouponRate, couponRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int getMaturity()
  {
    return maturity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setMaturity(int newMaturity)
  {
    int oldMaturity = maturity;
    maturity = newMaturity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BOND__MATURITY, oldMaturity, maturity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getYieldRate()
  {
    return yieldRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setYieldRate(float newYieldRate)
  {
    float oldYieldRate = yieldRate;
    yieldRate = newYieldRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.BOND__YIELD_RATE, oldYieldRate, yieldRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case FinPackage.BOND__NAME:
        return getName();
      case FinPackage.BOND__FACE_VALUE:
        return getFaceValue();
      case FinPackage.BOND__COUPON_RATE:
        return getCouponRate();
      case FinPackage.BOND__MATURITY:
        return getMaturity();
      case FinPackage.BOND__YIELD_RATE:
        return getYieldRate();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case FinPackage.BOND__NAME:
        setName((String)newValue);
        return;
      case FinPackage.BOND__FACE_VALUE:
        setFaceValue((Float)newValue);
        return;
      case FinPackage.BOND__COUPON_RATE:
        setCouponRate((Float)newValue);
        return;
      case FinPackage.BOND__MATURITY:
        setMaturity((Integer)newValue);
        return;
      case FinPackage.BOND__YIELD_RATE:
        setYieldRate((Float)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case FinPackage.BOND__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FinPackage.BOND__FACE_VALUE:
        setFaceValue(FACE_VALUE_EDEFAULT);
        return;
      case FinPackage.BOND__COUPON_RATE:
        setCouponRate(COUPON_RATE_EDEFAULT);
        return;
      case FinPackage.BOND__MATURITY:
        setMaturity(MATURITY_EDEFAULT);
        return;
      case FinPackage.BOND__YIELD_RATE:
        setYieldRate(YIELD_RATE_EDEFAULT);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case FinPackage.BOND__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FinPackage.BOND__FACE_VALUE:
        return faceValue != FACE_VALUE_EDEFAULT;
      case FinPackage.BOND__COUPON_RATE:
        return couponRate != COUPON_RATE_EDEFAULT;
      case FinPackage.BOND__MATURITY:
        return maturity != MATURITY_EDEFAULT;
      case FinPackage.BOND__YIELD_RATE:
        return yieldRate != YIELD_RATE_EDEFAULT;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", faceValue: ");
    result.append(faceValue);
    result.append(", couponRate: ");
    result.append(couponRate);
    result.append(", maturity: ");
    result.append(maturity);
    result.append(", yieldRate: ");
    result.append(yieldRate);
    result.append(')');
    return result.toString();
  }

} //BondImpl
