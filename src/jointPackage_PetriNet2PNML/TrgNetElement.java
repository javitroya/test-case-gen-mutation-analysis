/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Net Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgNetElement#getType <em>Type</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgNetElement#getContents <em>Contents</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgNetElement#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgNetElement()
 * @model
 * @generated
 */
public interface TrgNetElement extends TrgIdedElement {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TrgURI)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgNetElement_Type()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgURI getType();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgNetElement#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TrgURI value);

	/**
	 * Returns the value of the '<em><b>Contents</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.TrgNetContent}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contents</em>' containment reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgNetElement_Contents()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgNetContent> getContents();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' containment reference.
	 * @see #setName(TrgName)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgNetElement_Name()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	TrgName getName();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgNetElement#getName <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' containment reference.
	 * @see #getName()
	 * @generated
	 */
	void setName(TrgName value);

} // TrgNetElement
