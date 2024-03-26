/*
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl.ide

import com.google.inject.Guice
import org.eclipse.xtext.util.Modules2
import org.xtext.mydsl.FinRuntimeModule
import org.xtext.mydsl.FinStandaloneSetup

/**
 * Initialization support for running Xtext languages as language servers.
 */
class FinIdeSetup extends FinStandaloneSetup {

	override createInjector() {
		Guice.createInjector(Modules2.mixin(new FinRuntimeModule, new FinIdeModule))
	}
	
}
