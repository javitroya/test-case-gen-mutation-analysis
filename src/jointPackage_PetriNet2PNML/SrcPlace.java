/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Place</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcPlace#getIncomingArc <em>Incoming Arc</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcPlace#getOutgoingArc <em>Outgoing Arc</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPlace()
 * @model
 * @generated
 */
public interface SrcPlace extends SrcElement {
	/**
	 * Returns the value of the '<em><b>Incoming Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.SrcTransitionToPlace}.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcTransitionToPlace#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Arc</em>' reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPlace_IncomingArc()
	 * @see jointPackage_PetriNet2PNML.SrcTransitionToPlace#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<SrcTransitionToPlace> getIncomingArc();

	/**
	 * Returns the value of the '<em><b>Outgoing Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.SrcPlaceToTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcPlaceToTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Arc</em>' reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPlace_OutgoingArc()
	 * @see jointPackage_PetriNet2PNML.SrcPlaceToTransition#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<SrcPlaceToTransition> getOutgoingArc();

} // SrcPlace
