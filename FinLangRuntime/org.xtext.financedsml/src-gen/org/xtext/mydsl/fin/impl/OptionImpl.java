/**
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl.fin.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.xtext.mydsl.fin.FinPackage;
import org.xtext.mydsl.fin.Option;
import org.xtext.mydsl.fin.OptionType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Option</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getUnderlyingPrice <em>Underlying Price</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getStrikePrice <em>Strike Price</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getTimeToExpiration <em>Time To Expiration</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getRiskFreeRate <em>Risk Free Rate</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getVolatility <em>Volatility</em>}</li>
 *   <li>{@link org.xtext.mydsl.fin.impl.OptionImpl#getDividendYield <em>Dividend Yield</em>}</li>
 * </ul>
 *
 * @generated
 */
public class OptionImpl extends AssetImpl implements Option
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
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final OptionType TYPE_EDEFAULT = OptionType.CALL;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected OptionType type = TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getUnderlyingPrice() <em>Underlying Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnderlyingPrice()
   * @generated
   * @ordered
   */
  protected static final float UNDERLYING_PRICE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getUnderlyingPrice() <em>Underlying Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnderlyingPrice()
   * @generated
   * @ordered
   */
  protected float underlyingPrice = UNDERLYING_PRICE_EDEFAULT;

  /**
   * The default value of the '{@link #getStrikePrice() <em>Strike Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrikePrice()
   * @generated
   * @ordered
   */
  protected static final float STRIKE_PRICE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getStrikePrice() <em>Strike Price</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrikePrice()
   * @generated
   * @ordered
   */
  protected float strikePrice = STRIKE_PRICE_EDEFAULT;

  /**
   * The default value of the '{@link #getTimeToExpiration() <em>Time To Expiration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeToExpiration()
   * @generated
   * @ordered
   */
  protected static final float TIME_TO_EXPIRATION_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getTimeToExpiration() <em>Time To Expiration</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTimeToExpiration()
   * @generated
   * @ordered
   */
  protected float timeToExpiration = TIME_TO_EXPIRATION_EDEFAULT;

  /**
   * The default value of the '{@link #getRiskFreeRate() <em>Risk Free Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskFreeRate()
   * @generated
   * @ordered
   */
  protected static final float RISK_FREE_RATE_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getRiskFreeRate() <em>Risk Free Rate</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRiskFreeRate()
   * @generated
   * @ordered
   */
  protected float riskFreeRate = RISK_FREE_RATE_EDEFAULT;

  /**
   * The default value of the '{@link #getVolatility() <em>Volatility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolatility()
   * @generated
   * @ordered
   */
  protected static final float VOLATILITY_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getVolatility() <em>Volatility</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVolatility()
   * @generated
   * @ordered
   */
  protected float volatility = VOLATILITY_EDEFAULT;

  /**
   * The default value of the '{@link #getDividendYield() <em>Dividend Yield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDividendYield()
   * @generated
   * @ordered
   */
  protected static final float DIVIDEND_YIELD_EDEFAULT = 0.0F;

  /**
   * The cached value of the '{@link #getDividendYield() <em>Dividend Yield</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDividendYield()
   * @generated
   * @ordered
   */
  protected float dividendYield = DIVIDEND_YIELD_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OptionImpl()
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
    return FinPackage.Literals.OPTION;
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
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public OptionType getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setType(OptionType newType)
  {
    OptionType oldType = type;
    type = newType == null ? TYPE_EDEFAULT : newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getUnderlyingPrice()
  {
    return underlyingPrice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUnderlyingPrice(float newUnderlyingPrice)
  {
    float oldUnderlyingPrice = underlyingPrice;
    underlyingPrice = newUnderlyingPrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__UNDERLYING_PRICE, oldUnderlyingPrice, underlyingPrice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getStrikePrice()
  {
    return strikePrice;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrikePrice(float newStrikePrice)
  {
    float oldStrikePrice = strikePrice;
    strikePrice = newStrikePrice;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__STRIKE_PRICE, oldStrikePrice, strikePrice));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getTimeToExpiration()
  {
    return timeToExpiration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setTimeToExpiration(float newTimeToExpiration)
  {
    float oldTimeToExpiration = timeToExpiration;
    timeToExpiration = newTimeToExpiration;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__TIME_TO_EXPIRATION, oldTimeToExpiration, timeToExpiration));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getRiskFreeRate()
  {
    return riskFreeRate;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setRiskFreeRate(float newRiskFreeRate)
  {
    float oldRiskFreeRate = riskFreeRate;
    riskFreeRate = newRiskFreeRate;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__RISK_FREE_RATE, oldRiskFreeRate, riskFreeRate));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getVolatility()
  {
    return volatility;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setVolatility(float newVolatility)
  {
    float oldVolatility = volatility;
    volatility = newVolatility;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__VOLATILITY, oldVolatility, volatility));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public float getDividendYield()
  {
    return dividendYield;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDividendYield(float newDividendYield)
  {
    float oldDividendYield = dividendYield;
    dividendYield = newDividendYield;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, FinPackage.OPTION__DIVIDEND_YIELD, oldDividendYield, dividendYield));
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
      case FinPackage.OPTION__NAME:
        return getName();
      case FinPackage.OPTION__TYPE:
        return getType();
      case FinPackage.OPTION__UNDERLYING_PRICE:
        return getUnderlyingPrice();
      case FinPackage.OPTION__STRIKE_PRICE:
        return getStrikePrice();
      case FinPackage.OPTION__TIME_TO_EXPIRATION:
        return getTimeToExpiration();
      case FinPackage.OPTION__RISK_FREE_RATE:
        return getRiskFreeRate();
      case FinPackage.OPTION__VOLATILITY:
        return getVolatility();
      case FinPackage.OPTION__DIVIDEND_YIELD:
        return getDividendYield();
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
      case FinPackage.OPTION__NAME:
        setName((String)newValue);
        return;
      case FinPackage.OPTION__TYPE:
        setType((OptionType)newValue);
        return;
      case FinPackage.OPTION__UNDERLYING_PRICE:
        setUnderlyingPrice((Float)newValue);
        return;
      case FinPackage.OPTION__STRIKE_PRICE:
        setStrikePrice((Float)newValue);
        return;
      case FinPackage.OPTION__TIME_TO_EXPIRATION:
        setTimeToExpiration((Float)newValue);
        return;
      case FinPackage.OPTION__RISK_FREE_RATE:
        setRiskFreeRate((Float)newValue);
        return;
      case FinPackage.OPTION__VOLATILITY:
        setVolatility((Float)newValue);
        return;
      case FinPackage.OPTION__DIVIDEND_YIELD:
        setDividendYield((Float)newValue);
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
      case FinPackage.OPTION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case FinPackage.OPTION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case FinPackage.OPTION__UNDERLYING_PRICE:
        setUnderlyingPrice(UNDERLYING_PRICE_EDEFAULT);
        return;
      case FinPackage.OPTION__STRIKE_PRICE:
        setStrikePrice(STRIKE_PRICE_EDEFAULT);
        return;
      case FinPackage.OPTION__TIME_TO_EXPIRATION:
        setTimeToExpiration(TIME_TO_EXPIRATION_EDEFAULT);
        return;
      case FinPackage.OPTION__RISK_FREE_RATE:
        setRiskFreeRate(RISK_FREE_RATE_EDEFAULT);
        return;
      case FinPackage.OPTION__VOLATILITY:
        setVolatility(VOLATILITY_EDEFAULT);
        return;
      case FinPackage.OPTION__DIVIDEND_YIELD:
        setDividendYield(DIVIDEND_YIELD_EDEFAULT);
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
      case FinPackage.OPTION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case FinPackage.OPTION__TYPE:
        return type != TYPE_EDEFAULT;
      case FinPackage.OPTION__UNDERLYING_PRICE:
        return underlyingPrice != UNDERLYING_PRICE_EDEFAULT;
      case FinPackage.OPTION__STRIKE_PRICE:
        return strikePrice != STRIKE_PRICE_EDEFAULT;
      case FinPackage.OPTION__TIME_TO_EXPIRATION:
        return timeToExpiration != TIME_TO_EXPIRATION_EDEFAULT;
      case FinPackage.OPTION__RISK_FREE_RATE:
        return riskFreeRate != RISK_FREE_RATE_EDEFAULT;
      case FinPackage.OPTION__VOLATILITY:
        return volatility != VOLATILITY_EDEFAULT;
      case FinPackage.OPTION__DIVIDEND_YIELD:
        return dividendYield != DIVIDEND_YIELD_EDEFAULT;
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
    result.append(", type: ");
    result.append(type);
    result.append(", underlyingPrice: ");
    result.append(underlyingPrice);
    result.append(", strikePrice: ");
    result.append(strikePrice);
    result.append(", timeToExpiration: ");
    result.append(timeToExpiration);
    result.append(", riskFreeRate: ");
    result.append(riskFreeRate);
    result.append(", volatility: ");
    result.append(volatility);
    result.append(", dividendYield: ");
    result.append(dividendYield);
    result.append(')');
    return result.toString();
  }

} //OptionImpl
