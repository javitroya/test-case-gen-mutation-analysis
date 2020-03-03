/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.TrgAbstractState#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.TrgAbstractState#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.TrgAbstractState#getCompositeStates <em>Composite States</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface TrgAbstractState extends EObject {
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
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgAbstractState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.TrgAbstractState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.TrgStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(TrgStateMachine)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgAbstractState_StateMachine()
	 * @see jointPackage_HSM2FSM.TrgStateMachine#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	TrgStateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.TrgAbstractState#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(TrgStateMachine value);

	/**
	 * Returns the value of the '<em><b>Composite States</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.TrgCompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite States</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite States</em>' reference.
	 * @see #setCompositeStates(TrgCompositeState)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getTrgAbstractState_CompositeStates()
	 * @see jointPackage_HSM2FSM.TrgCompositeState#getStates
	 * @model opposite="states"
	 * @generated
	 */
	TrgCompositeState getCompositeStates();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.TrgAbstractState#getCompositeStates <em>Composite States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite States</em>' reference.
	 * @see #getCompositeStates()
	 * @generated
	 */
	void setCompositeStates(TrgCompositeState value);

} // TrgAbstractState
