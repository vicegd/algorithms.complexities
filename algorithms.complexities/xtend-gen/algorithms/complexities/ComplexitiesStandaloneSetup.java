/**
 * generated by Xtext 2.12.0
 */
package algorithms.complexities;

import algorithms.complexities.ComplexitiesStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class ComplexitiesStandaloneSetup extends ComplexitiesStandaloneSetupGenerated {
  public static void doSetup() {
    new ComplexitiesStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
