/**
 * generated by Xtext 2.12.0
 */
package algorithms.complexities.complexities.impl;

import algorithms.complexities.complexities.Calculation;
import algorithms.complexities.complexities.ComplexitiesPackage;
import algorithms.complexities.complexities.TimeUnits;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Calculation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link algorithms.complexities.complexities.impl.CalculationImpl#getComplexity <em>Complexity</em>}</li>
 *   <li>{@link algorithms.complexities.complexities.impl.CalculationImpl#getTime1 <em>Time1</em>}</li>
 *   <li>{@link algorithms.complexities.complexities.impl.CalculationImpl#getTime1Unit <em>Time1 Unit</em>}</li>
 *   <li>{@link algorithms.complexities.complexities.impl.CalculationImpl#getSize1 <em>Size1</em>}</li>
 *   <li>{@link algorithms.complexities.complexities.impl.CalculationImpl#getTime2Unit <em>Time2 Unit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CalculationImpl extends MinimalEObjectImpl.Container implements Calculation
{
  /**
   * The default value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplexity()
   * @generated
   * @ordered
   */
  protected static final String COMPLEXITY_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComplexity() <em>Complexity</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComplexity()
   * @generated
   * @ordered
   */
  protected String complexity = COMPLEXITY_EDEFAULT;

  /**
   * The default value of the '{@link #getTime1() <em>Time1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime1()
   * @generated
   * @ordered
   */
  protected static final int TIME1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getTime1() <em>Time1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime1()
   * @generated
   * @ordered
   */
  protected int time1 = TIME1_EDEFAULT;

  /**
   * The default value of the '{@link #getTime1Unit() <em>Time1 Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime1Unit()
   * @generated
   * @ordered
   */
  protected static final TimeUnits TIME1_UNIT_EDEFAULT = TimeUnits.SECONDS;

  /**
   * The cached value of the '{@link #getTime1Unit() <em>Time1 Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime1Unit()
   * @generated
   * @ordered
   */
  protected TimeUnits time1Unit = TIME1_UNIT_EDEFAULT;

  /**
   * The default value of the '{@link #getSize1() <em>Size1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize1()
   * @generated
   * @ordered
   */
  protected static final int SIZE1_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getSize1() <em>Size1</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSize1()
   * @generated
   * @ordered
   */
  protected int size1 = SIZE1_EDEFAULT;

  /**
   * The default value of the '{@link #getTime2Unit() <em>Time2 Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime2Unit()
   * @generated
   * @ordered
   */
  protected static final TimeUnits TIME2_UNIT_EDEFAULT = TimeUnits.SECONDS;

  /**
   * The cached value of the '{@link #getTime2Unit() <em>Time2 Unit</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTime2Unit()
   * @generated
   * @ordered
   */
  protected TimeUnits time2Unit = TIME2_UNIT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected CalculationImpl()
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
    return ComplexitiesPackage.Literals.CALCULATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getComplexity()
  {
    return complexity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComplexity(String newComplexity)
  {
    String oldComplexity = complexity;
    complexity = newComplexity;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComplexitiesPackage.CALCULATION__COMPLEXITY, oldComplexity, complexity));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getTime1()
  {
    return time1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime1(int newTime1)
  {
    int oldTime1 = time1;
    time1 = newTime1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComplexitiesPackage.CALCULATION__TIME1, oldTime1, time1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnits getTime1Unit()
  {
    return time1Unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime1Unit(TimeUnits newTime1Unit)
  {
    TimeUnits oldTime1Unit = time1Unit;
    time1Unit = newTime1Unit == null ? TIME1_UNIT_EDEFAULT : newTime1Unit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComplexitiesPackage.CALCULATION__TIME1_UNIT, oldTime1Unit, time1Unit));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getSize1()
  {
    return size1;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setSize1(int newSize1)
  {
    int oldSize1 = size1;
    size1 = newSize1;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComplexitiesPackage.CALCULATION__SIZE1, oldSize1, size1));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TimeUnits getTime2Unit()
  {
    return time2Unit;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTime2Unit(TimeUnits newTime2Unit)
  {
    TimeUnits oldTime2Unit = time2Unit;
    time2Unit = newTime2Unit == null ? TIME2_UNIT_EDEFAULT : newTime2Unit;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, ComplexitiesPackage.CALCULATION__TIME2_UNIT, oldTime2Unit, time2Unit));
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
      case ComplexitiesPackage.CALCULATION__COMPLEXITY:
        return getComplexity();
      case ComplexitiesPackage.CALCULATION__TIME1:
        return getTime1();
      case ComplexitiesPackage.CALCULATION__TIME1_UNIT:
        return getTime1Unit();
      case ComplexitiesPackage.CALCULATION__SIZE1:
        return getSize1();
      case ComplexitiesPackage.CALCULATION__TIME2_UNIT:
        return getTime2Unit();
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
      case ComplexitiesPackage.CALCULATION__COMPLEXITY:
        setComplexity((String)newValue);
        return;
      case ComplexitiesPackage.CALCULATION__TIME1:
        setTime1((Integer)newValue);
        return;
      case ComplexitiesPackage.CALCULATION__TIME1_UNIT:
        setTime1Unit((TimeUnits)newValue);
        return;
      case ComplexitiesPackage.CALCULATION__SIZE1:
        setSize1((Integer)newValue);
        return;
      case ComplexitiesPackage.CALCULATION__TIME2_UNIT:
        setTime2Unit((TimeUnits)newValue);
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
      case ComplexitiesPackage.CALCULATION__COMPLEXITY:
        setComplexity(COMPLEXITY_EDEFAULT);
        return;
      case ComplexitiesPackage.CALCULATION__TIME1:
        setTime1(TIME1_EDEFAULT);
        return;
      case ComplexitiesPackage.CALCULATION__TIME1_UNIT:
        setTime1Unit(TIME1_UNIT_EDEFAULT);
        return;
      case ComplexitiesPackage.CALCULATION__SIZE1:
        setSize1(SIZE1_EDEFAULT);
        return;
      case ComplexitiesPackage.CALCULATION__TIME2_UNIT:
        setTime2Unit(TIME2_UNIT_EDEFAULT);
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
      case ComplexitiesPackage.CALCULATION__COMPLEXITY:
        return COMPLEXITY_EDEFAULT == null ? complexity != null : !COMPLEXITY_EDEFAULT.equals(complexity);
      case ComplexitiesPackage.CALCULATION__TIME1:
        return time1 != TIME1_EDEFAULT;
      case ComplexitiesPackage.CALCULATION__TIME1_UNIT:
        return time1Unit != TIME1_UNIT_EDEFAULT;
      case ComplexitiesPackage.CALCULATION__SIZE1:
        return size1 != SIZE1_EDEFAULT;
      case ComplexitiesPackage.CALCULATION__TIME2_UNIT:
        return time2Unit != TIME2_UNIT_EDEFAULT;
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

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (complexity: ");
    result.append(complexity);
    result.append(", time1: ");
    result.append(time1);
    result.append(", time1Unit: ");
    result.append(time1Unit);
    result.append(", size1: ");
    result.append(size1);
    result.append(", time2Unit: ");
    result.append(time2Unit);
    result.append(')');
    return result.toString();
  }

} //CalculationImpl
