/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Grafcet</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcGrafcet#getElements <em>Elements</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcGrafcet#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcGrafcet()
 * @model
 * @generated
 */
public interface SrcGrafcet extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.SrcElement}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcElement#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Elements</em>' containment reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcGrafcet_Elements()
	 * @see jointPackage_Grafcet2PetriNet.SrcElement#getGrafcet
	 * @model opposite="grafcet" containment="true" ordered="false"
	 * @generated
	 */
	EList<SrcElement> getElements();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.SrcConnection}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcConnection#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcGrafcet_Connections()
	 * @see jointPackage_Grafcet2PetriNet.SrcConnection#getGrafcet
	 * @model opposite="grafcet" containment="true" ordered="false"
	 * @generated
	 */
	EList<SrcConnection> getConnections();

} // SrcGrafcet
