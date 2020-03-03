/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgPlace#getIncomingArc <em>Incoming Arc</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgPlace#getOutgoingArc <em>Outgoing Arc</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgPlace()
 * @model
 * @generated
 */
public interface TrgPlace extends TrgElement {
	/**
	 * Returns the value of the '<em><b>Incoming Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Arc</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgPlace_IncomingArc()
	 * @see jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<TrgTransitionToPlace> getIncomingArc();

	/**
	 * Returns the value of the '<em><b>Outgoing Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Arc</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgPlace_OutgoingArc()
	 * @see jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<TrgPlaceToTransition> getOutgoingArc();

} // TrgPlace
