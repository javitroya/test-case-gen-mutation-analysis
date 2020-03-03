/**
 */
package jointPackage_Grafcet2PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Transition To Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransitionToStep()
 * @model
 * @generated
 */
public interface SrcTransitionToStep extends SrcConnection {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcTransition#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SrcTransition)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransitionToStep_From()
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition#getOutgoingConnections
	 * @model opposite="outgoingConnections" required="true" ordered="false"
	 * @generated
	 */
	SrcTransition getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SrcTransition value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcStep#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SrcStep)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransitionToStep_To()
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#getIncomingConnections
	 * @model opposite="incomingConnections" required="true" ordered="false"
	 * @generated
	 */
	SrcStep getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SrcStep value);

} // SrcTransitionToStep
