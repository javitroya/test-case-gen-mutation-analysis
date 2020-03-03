/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg PNML Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgPNMLDocument#getXmlns <em>Xmlns</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgPNMLDocument#getNets <em>Nets</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgPNMLDocument()
 * @model
 * @generated
 */
public interface TrgPNMLDocument extends TrgLocatedElement {
	/**
	 * Returns the value of the '<em><b>Xmlns</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Xmlns</em>' containment reference.
	 * @see #setXmlns(TrgURI)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgPNMLDocument_Xmlns()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	TrgURI getXmlns();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgPNMLDocument#getXmlns <em>Xmlns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xmlns</em>' containment reference.
	 * @see #getXmlns()
	 * @generated
	 */
	void setXmlns(TrgURI value);

	/**
	 * Returns the value of the '<em><b>Nets</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.TrgNetElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nets</em>' containment reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgPNMLDocument_Nets()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	EList<TrgNetElement> getNets();

} // TrgPNMLDocument
