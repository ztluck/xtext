
package org.eclipse.xtext.ui.tests.editor.outline;

/**
 * Initialization support for running Xtext languages 
 * without equinox extension registry
 */
public class Bug326937TestLanguageStandaloneSetup extends Bug326937TestLanguageStandaloneSetupGenerated{

	public static void doSetup() {
		new Bug326937TestLanguageStandaloneSetup().createInjectorAndDoEMFRegistration();
	}
}

