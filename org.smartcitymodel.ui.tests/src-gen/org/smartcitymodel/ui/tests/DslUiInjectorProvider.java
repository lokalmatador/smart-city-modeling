/*
 * generated by Xtext 2.36.0
 */
package org.smartcitymodel.ui.tests;

import com.google.inject.Injector;
import org.eclipse.xtext.testing.IInjectorProvider;
import org.smartcitymodel.ui.internal.SmartcitymodelActivator;

public class DslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return SmartcitymodelActivator.getInstance().getInjector("org.smartcitymodel.Dsl");
	}

}
