/**
 */
package jointPackage_Grafcet2PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgElement#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgElement()
 * @model abstract="true"
 * @generated
 */
public interface TrgElement extends TrgNamedElement {
	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgPetriNet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(TrgPetriNet)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgElement_Net()
	 * @see jointPackage_Grafcet2PetriNet.TrgPetriNet#getElements
	 * @model opposite="elements" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TrgPetriNet getNet();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.TrgElement#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(TrgPetriNet value);

} // TrgElement
