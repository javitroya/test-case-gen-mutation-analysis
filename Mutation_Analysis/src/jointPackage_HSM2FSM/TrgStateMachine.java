/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg State Machine</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.TrgStateMachine#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.TrgStateMachine#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.TrgStateMachine#getStates <em>States</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgStateMachine()
 * @model
 * @generated
 */
public interface TrgStateMachine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgStateMachine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.TrgStateMachine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Transitions</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_HSM2FSM.TrgTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.TrgTransition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transitions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transitions</em>' containment reference list.
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgStateMachine_Transitions()
	 * @see jointPackage_HSM2FSM.TrgTransition#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<TrgTransition> getTransitions();

	/**
	 * Returns the value of the '<em><b>States</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_HSM2FSM.TrgAbstractState}.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.TrgAbstractState#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>States</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>States</em>' containment reference list.
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgStateMachine_States()
	 * @see jointPackage_HSM2FSM.TrgAbstractState#getStateMachine
	 * @model opposite="stateMachine" containment="true"
	 * @generated
	 */
	EList<TrgAbstractState> getStates();

} // TrgStateMachine
