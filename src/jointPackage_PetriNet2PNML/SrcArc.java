/**
 */
package jointPackage_PetriNet2PNML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcArc#getWeight <em>Weight</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.SrcArc#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcArc()
 * @model abstract="true"
 * @generated
 */
public interface SrcArc extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcArc_Weight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcArc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_PetriNet2PNML.SrcPetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(SrcPetriNet)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getSrcArc_Net()
	 * @see jointPackage_PetriNet2PNML.SrcPetriNet#getArcs
	 * @model opposite="arcs" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SrcPetriNet getNet();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.SrcArc#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(SrcPetriNet value);

} // SrcArc
