/*
 * generated by Xtext 2.33.0
 */
package org.xtext.mydsl


/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
class FinStandaloneSetup extends FinStandaloneSetupGenerated {

	def static void doSetup() {
		new FinStandaloneSetup().createInjectorAndDoEMFRegistration()
	}
}
