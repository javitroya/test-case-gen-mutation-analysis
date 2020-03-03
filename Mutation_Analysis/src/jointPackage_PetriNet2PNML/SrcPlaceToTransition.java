/**
 */
package jointPackage_PetriNet2PNML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Place To Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcPlaceToTransition#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcPlaceToTransition#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPlaceToTransition()
 * @model
 * @generated
 */
public interface SrcPlaceToTransition extends SrcArc {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcPlace#getOutgoingArc <em>Outgoing Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SrcPlace)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPlaceToTransition_From()
	 * @see jointPackage_PetriNet2PNML.SrcPlace#getOutgoingArc
	 * @model opposite="outgoingArc" required="true" ordered="false"
	 * @generated
	 */
	SrcPlace getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcPlaceToTransition#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SrcPlace value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcTransition#getIncomingArc <em>Incoming Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SrcTransition)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPlaceToTransition_To()
	 * @see jointPackage_PetriNet2PNML.SrcTransition#getIncomingArc
	 * @model opposite="incomingArc" required="true" ordered="false"
	 * @generated
	 */
	SrcTransition getTo();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcPlaceToTransition#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SrcTransition value);

} // SrcPlaceToTransition
