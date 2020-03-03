/**
 *
 * $Id$
 */
package jointPackage_HSM2FSM.validation;

import jointPackage_HSM2FSM.TrgAbstractState;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link jointPackage_HSM2FSM.TrgCompositeState}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface TrgCompositeStateValidator {
	boolean validate();

	boolean validateStates(EList<TrgAbstractState> value);
}
