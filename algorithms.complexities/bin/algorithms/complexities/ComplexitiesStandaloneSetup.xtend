/*
 * generated by Xtext 2.12.0
 */
package algorithms.complexities


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class ComplexitiesStandaloneSetup extends ComplexitiesStandaloneSetupGenerated {

	def static void doSetup() {
		new ComplexitiesStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}