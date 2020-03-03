/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.TrgRoot#getStateMachines <em>State Machines</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgRoot()
 * @model
 * @generated
 */
public interface TrgRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>State Machines</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_HSM2FSM.TrgStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machines</em>' containment reference list.
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgRoot_StateMachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<TrgStateMachine> getStateMachines();

} // TrgRoot
