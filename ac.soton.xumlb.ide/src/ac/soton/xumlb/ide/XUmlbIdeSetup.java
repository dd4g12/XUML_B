/*
 * generated by Xtext 2.22.0
 */
package ac.soton.xumlb.ide;

import ac.soton.xumlb.XUmlbRuntimeModule;
import ac.soton.xumlb.XUmlbStandaloneSetup;
import com.google.inject.Guice;
import com.google.inject.Injector;
import org.eclipse.xtext.util.Modules2;

/**
 * Initialization support for running Xtext languages as language servers.
 */
public class XUmlbIdeSetup extends XUmlbStandaloneSetup {

	@Override
	public Injector createInjector() {
		return Guice.createInjector(Modules2.mixin(new XUmlbRuntimeModule(), new XUmlbIdeModule()));
	}
	
}
