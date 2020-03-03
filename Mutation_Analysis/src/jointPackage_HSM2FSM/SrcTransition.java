/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.SrcTransition#getLabel <em>Label</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.SrcTransition#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.SrcTransition#getSource <em>Source</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.SrcTransition#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcTransition()
 * @model
 * @generated
 */
public interface SrcTransition extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcTransition_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcTransition#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>State Machine</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_HSM2FSM.SrcStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Machine</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Machine</em>' container reference.
	 * @see #setStateMachine(SrcStateMachine)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcTransition_StateMachine()
	 * @see jointPackage_HSM2FSM.SrcStateMachine#getTransitions
	 * @model opposite="transitions" required="true" transient="false"
	 * @generated
	 */
	SrcStateMachine getStateMachine();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcTransition#getStateMachine <em>State Machine</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Machine</em>' container reference.
	 * @see #getStateMachine()
	 * @generated
	 */
	void setStateMachine(SrcStateMachine value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(SrcAbstractState)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcTransition_Source()
	 * @model required="true"
	 * @generated
	 */
	SrcAbstractState getSource();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcTransition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(SrcAbstractState value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(SrcAbstractState)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getSrcTransition_Target()
	 * @model required="true"
	 * @generated
	 */
	SrcAbstractState getTarget();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.SrcTransition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(SrcAbstractState value);

} // SrcTransition
