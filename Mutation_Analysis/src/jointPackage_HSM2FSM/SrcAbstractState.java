/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Abstract State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.SrcAbstractState#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.SrcAbstractState#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.SrcAbstractState#getCompositeStates <em>Composite States</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcAbstractState()
 * @model abstract="true"
 * @generated
 */
public interface SrcAbstractState extends EObject {
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
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcAbstractState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcAbstractState#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.SrcStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(SrcStateMachine)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcAbstractState_StateMachine()
	 * @see jointPackage_HSM2FSM.SrcStateMachine#getStates
	 * @model opposite="states" required="true" transient="false"
	 * @generated
	 */
	SrcStateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcAbstractState#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(SrcStateMachine value);

	/**
	 * Returns the value of the '<em><b>Composite States</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.SrcCompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Composite States</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Composite States</em>' reference.
	 * @see #setCompositeStates(SrcCompositeState)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcAbstractState_CompositeStates()
	 * @see jointPackage_HSM2FSM.SrcCompositeState#getStates
	 * @model opposite="states"
	 * @generated
	 */
	SrcCompositeState getCompositeStates();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcAbstractState#getCompositeStates <em>Composite States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Composite States</em>' reference.
	 * @see #getCompositeStates()
	 * @generated
	 */
	void setCompositeStates(SrcCompositeState value);

} // SrcAbstractState
