/**
 * generated by Xtext 2.12.0
 */
package algorithms.complexities.complexities;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see algorithms.complexities.complexities.ComplexitiesPackage
 * @generated
 */
public interface ComplexitiesFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  ComplexitiesFactory eINSTANCE = algorithms.complexities.complexities.impl.ComplexitiesFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Calculation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Calculation</em>'.
   * @generated
   */
  Calculation createCalculation();

  /**
   * Returns a new object of class '<em>Execution Times</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Execution Times</em>'.
   * @generated
   */
  ExecutionTimes createExecutionTimes();

  /**
   * Returns a new object of class '<em>Sizes</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Sizes</em>'.
   * @generated
   */
  Sizes createSizes();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  ComplexitiesPackage getComplexitiesPackage();

} //ComplexitiesFactory
