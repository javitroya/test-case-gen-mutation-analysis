/**
 */
package jointPackage_Grafcet2PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Transition To Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgTransitionToPlace()
 * @model
 * @generated
 */
public interface TrgTransitionToPlace extends TrgArc {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgTransition#getOutgoingArc <em>Outgoing Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(TrgTransition)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgTransitionToPlace_From()
	 * @see jointPackage_Grafcet2PetriNet.TrgTransition#getOutgoingArc
	 * @model opposite="outgoingArc" required="true" ordered="false"
	 * @generated
	 */
	TrgTransition getFrom();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(TrgTransition value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgPlace#getIncomingArc <em>Incoming Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(TrgPlace)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgTransitionToPlace_To()
	 * @see jointPackage_Grafcet2PetriNet.TrgPlace#getIncomingArc
	 * @model opposite="incomingArc" required="true" ordered="false"
	 * @generated
	 */
	TrgPlace getTo();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(TrgPlace value);

} // TrgTransitionToPlace
