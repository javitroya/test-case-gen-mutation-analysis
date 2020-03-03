/**
 */
package jointPackage_PetriNet2PNML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Transition To Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcTransitionToPlace#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcTransitionToPlace#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcTransitionToPlace()
 * @model
 * @generated
 */
public interface SrcTransitionToPlace extends SrcArc {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcTransition#getOutgoingArc <em>Outgoing Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SrcTransition)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcTransitionToPlace_From()
	 * @see jointPackage_PetriNet2PNML.SrcTransition#getOutgoingArc
	 * @model opposite="outgoingArc" required="true" ordered="false"
	 * @generated
	 */
	SrcTransition getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcTransitionToPlace#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SrcTransition value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcPlace#getIncomingArc <em>Incoming Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(SrcPlace)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcTransitionToPlace_To()
	 * @see jointPackage_PetriNet2PNML.SrcPlace#getIncomingArc
	 * @model opposite="incomingArc" required="true" ordered="false"
	 * @generated
	 */
	SrcPlace getTo();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcTransitionToPlace#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(SrcPlace value);

} // SrcTransitionToPlace
