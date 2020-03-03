/**
 */
package jointPackage_PetriNet2PNML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Net Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgNetContent#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgNetContent()
 * @model abstract="true"
 * @generated
 */
public interface TrgNetContent extends TrgLocatedElement {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(TrgName)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgNetContent_Name()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgName getName();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgNetContent#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(TrgName value);

} // TrgNetContent
