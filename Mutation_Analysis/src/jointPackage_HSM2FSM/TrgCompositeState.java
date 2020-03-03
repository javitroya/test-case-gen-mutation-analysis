/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.TrgCompositeState#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgCompositeState()
 * @model
 * @generated
 */
public interface TrgCompositeState extends TrgAbstractState {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_HSM2FSM.TrgAbstractState}.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.TrgAbstractState#getCompositeStates <em>Composite States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgCompositeState_States()
	 * @see jointPackage_HSM2FSM.TrgAbstractState#getCompositeStates
	 * @model opposite="compositeStates"
	 * @generated
	 */
	EList<TrgAbstractState> getStates();

} // TrgCompositeState
