/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcTransition#getIncomingArc <em>Incoming Arc</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcTransition#getOutgoingArc <em>Outgoing Arc</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcTransition()
 * @model
 * @generated
 */
public interface SrcTransition extends SrcElement {
	/**
	 * Returns the value of the '<em><b>Incoming Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.SrcPlaceToTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcPlaceToTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Arc</em>' reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcTransition_IncomingArc()
	 * @see jointPackage_PetriNet2PNML.SrcPlaceToTransition#getTo
	 * @model opposite="to" required="true" ordered="false"
	 * @generated
	 */
	EList<SrcPlaceToTransition> getIncomingArc();

	/**
	 * Returns the value of the '<em><b>Outgoing Arc</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.SrcTransitionToPlace}.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcTransitionToPlace#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Arc</em>' reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcTransition_OutgoingArc()
	 * @see jointPackage_PetriNet2PNML.SrcTransitionToPlace#getFrom
	 * @model opposite="from" required="true" ordered="false"
	 * @generated
	 */
	EList<SrcTransitionToPlace> getOutgoingArc();

} // SrcTransition
