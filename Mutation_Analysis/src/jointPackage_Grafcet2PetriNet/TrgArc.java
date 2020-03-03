/**
 */
package jointPackage_Grafcet2PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgArc#getWeight <em>Weight</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.TrgArc#getNet <em>Net</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgArc()
 * @model abstract="true"
 * @generated
 */
public interface TrgArc extends TrgNamedElement {
	/**
	 * Returns the value of the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Weight</em>' attribute.
	 * @see #setWeight(int)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgArc_Weight()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	int getWeight();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.TrgArc#getWeight <em>Weight</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Weight</em>' attribute.
	 * @see #getWeight()
	 * @generated
	 */
	void setWeight(int value);

	/**
	 * Returns the value of the '<em><b>Net</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.TrgPetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Net</em>' container reference.
	 * @see #setNet(TrgPetriNet)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getTrgArc_Net()
	 * @see jointPackage_Grafcet2PetriNet.TrgPetriNet#getArcs
	 * @model opposite="arcs" required="true" transient="false" ordered="false"
	 * @generated
	 */
	TrgPetriNet getNet();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.TrgArc#getNet <em>Net</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Net</em>' container reference.
	 * @see #getNet()
	 * @generated
	 */
	void setNet(TrgPetriNet value);

} // TrgArc
