/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgTransition#getIncomingArc <em>Incoming Arc</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgTransition#getOutgoingArc <em>Outgoing Arc</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgTransition()
 * @model
 * @generated
 */
public interface TrgTransition extends TrgElement {
	/**
	 * Returns the value of the '<em><b>Incoming Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Arc</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgTransition_IncomingArc()
	 * @see jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getTo
	 * @model opposite="to" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgPlaceToTransition> getIncomingArc();

	/**
	 * Returns the value of the '<em><b>Outgoing Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Arc</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgTransition_OutgoingArc()
	 * @see jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getFrom
	 * @model opposite="from" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgTransitionToPlace> getOutgoingArc();

} // TrgTransition
