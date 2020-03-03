/**
 */
package jointPackage_PetriNet2PNML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcElement#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcElement()
 * @model abstract="true"
 * @generated
 */
public interface SrcElement extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcPetriNet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(SrcPetriNet)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcElement_Net()
	 * @see jointPackage_PetriNet2PNML.SrcPetriNet#getElements
	 * @model opposite="elements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SrcPetriNet getNet();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcElement#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(SrcPetriNet value);

} // SrcElement
