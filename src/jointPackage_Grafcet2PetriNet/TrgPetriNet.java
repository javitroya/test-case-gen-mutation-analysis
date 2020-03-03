/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Petri Net</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgPetriNet#getElements <em>Elements</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgPetriNet#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgPetriNet()
 * @model
 * @generated
 */
public interface TrgPetriNet extends TrgNamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.TrgElement}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgElement#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgPetriNet_Elements()
	 * @see jointPackage_Grafcet2PetriNet.TrgElement#getNet
	 * @model opposite="net" containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgElement> getElements();

	/**
	 * Returns the value of the '<em><b>Arcs</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.TrgArc}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgArc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arcs</em>' containment reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgPetriNet_Arcs()
	 * @see jointPackage_Grafcet2PetriNet.TrgArc#getNet
	 * @model opposite="net" containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgArc> getArcs();

} // TrgPetriNet
