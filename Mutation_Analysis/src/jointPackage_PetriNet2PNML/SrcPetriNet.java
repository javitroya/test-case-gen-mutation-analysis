/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcPetriNet#getElements <em>Elements</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcPetriNet#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPetriNet()
 * @model
 * @generated
 */
public interface SrcPetriNet extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.SrcElement}.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcElement#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPetriNet_Elements()
	 * @see jointPackage_PetriNet2PNML.SrcElement#getNet
	 * @model opposite="net" containment="true" ordered="false"
	 * @generated
	 */
	EList<SrcElement> getElements();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.SrcArc}.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcArc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcPetriNet_Arcs()
	 * @see jointPackage_PetriNet2PNML.SrcArc#getNet
	 * @model opposite="net" containment="true" ordered="false"
	 * @generated
	 */
	EList<SrcArc> getArcs();

} // SrcPetriNet
