/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Composite State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.SrcCompositeState#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcCompositeState()
 * @model
 * @generated
 */
public interface SrcCompositeState extends SrcAbstractState {
	/**
	 * Returns the value of the '<em><b>States</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_HSM2FSM.SrcAbstractState}.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.SrcAbstractState#getCompositeStates <em>Composite States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' reference list.
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcCompositeState_States()
	 * @see jointPackage_HSM2FSM.SrcAbstractState#getCompositeStates
	 * @model opposite="compositeStates"
	 * @generated
	 */
	EList<SrcAbstractState> getStates();

} // SrcCompositeState
