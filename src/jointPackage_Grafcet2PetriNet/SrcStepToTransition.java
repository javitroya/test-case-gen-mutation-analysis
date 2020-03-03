/**
 */
package jointPackage_Grafcet2PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Step To Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStepToTransition()
 * @model
 * @generated
 */
public interface SrcStepToTransition extends SrcConnection {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcStep#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SrcStep)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStepToTransition_From()
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#getOutgoingConnections
	 * @model opposite="outgoingConnections" required="true" ordered="false"
	 * @generated
	 */
	SrcStep getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SrcStep value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcTransition#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SrcTransition)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStepToTransition_To()
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition#getIncomingConnections
	 * @model opposite="incomingConnections" required="true" ordered="false"
	 * @generated
	 */
	SrcTransition getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SrcTransition value);

} // SrcStepToTransition
