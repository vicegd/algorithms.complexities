/**
 * generated by Xtext 2.12.0
 */
package algorithms.complexities.ide;

import algorithms.complexities.ComplexitiesRuntimeModule;
import algorithms.complexities.ComplexitiesStandaloneSetup;
import algorithms.complexities.ide.ComplexitiesIdeModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class ComplexitiesIdeSetup extends ComplexitiesStandaloneSetup {
  @Override
  public Injector createInjector() {
    ComplexitiesRuntimeModule _complexitiesRuntimeModule = new ComplexitiesRuntimeModule();
    ComplexitiesIdeModule _complexitiesIdeModule = new ComplexitiesIdeModule();
    return Guice.createInjector(Modules2.mixin(_complexitiesRuntimeModule, _complexitiesIdeModule));
  }
}
