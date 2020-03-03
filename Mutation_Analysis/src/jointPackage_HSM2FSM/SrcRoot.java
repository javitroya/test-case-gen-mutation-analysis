/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.SrcRoot#getStatemachines <em>Statemachines</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcRoot()
 * @model
 * @generated
 */
public interface SrcRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Statemachines</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_HSM2FSM.SrcStateMachine}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statemachines</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statemachines</em>' containment reference list.
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcRoot_Statemachines()
	 * @model containment="true"
	 * @generated
	 */
	EList<SrcStateMachine> getStatemachines();

} // SrcRoot
