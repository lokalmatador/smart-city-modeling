/*
 * generated by Xtext 2.36.0
 */
package org.smartcitymodel.ide;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;
import org.smartcitymodel.DslRuntimeModule;
import org.smartcitymodel.DslStandaloneSetup;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class DslIdeSetup extends DslStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new DslRuntimeModule(), new DslIdeModule()));
	}
	
}
