/**
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.xtext.mydsl.FinRuntimeModule;
import org.xtext.mydsl.FinStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
@SuppressWarnings("all")
public class FinIdeSetup extends FinStandaloneSetup {
  @Override
  public Injector createInjector() {
    FinRuntimeModule _finRuntimeModule = new FinRuntimeModule();
    FinIdeModule _finIdeModule = new FinIdeModule();
    return Guice.createInjector(Modules2.mixin(_finRuntimeModule, _finIdeModule));
  }
}