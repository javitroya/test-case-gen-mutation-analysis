/**
 */
package jointPackage_Grafcet2PetriNet;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcConnection#getGrafcet <em>Grafcet</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcConnection()
 * @model abstract="true"
 * @generated
 */
public interface SrcConnection extends SrcNamedElement {
	/**
	 * Returns the value of the '<em><b>Grafcet</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcGrafcet#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grafcet</em>' container reference.
	 * @see #setGrafcet(SrcGrafcet)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcConnection_Grafcet()
	 * @see jointPackage_Grafcet2PetriNet.SrcGrafcet#getConnections
	 * @model opposite="connections" required="true" transient="false" ordered="false"
	 * @generated
	 */
	SrcGrafcet getGrafcet();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcConnection#getGrafcet <em>Grafcet</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grafcet</em>' container reference.
	 * @see #getGrafcet()
	 * @generated
	 */
	void setGrafcet(SrcGrafcet value);

} // SrcConnection
