/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Located Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgLocatedElement#getLocation <em>Location</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgLocatedElement()
 * @model abstract="true"
 * @generated
 */
public interface TrgLocatedElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgLocatedElement_Location()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgLocatedElement#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // TrgLocatedElement
