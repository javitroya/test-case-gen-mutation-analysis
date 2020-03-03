/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Step</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStep#isIsInitial <em>Is Initial</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStep#isIsActive <em>Is Active</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStep#getAction <em>Action</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStep#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcStep#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStep()
 * @model
 * @generated
 */
public interface SrcStep extends SrcElement {
	/**
	 * Returns the value of the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Initial</em>' attribute.
	 * @see #setIsInitial(boolean)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStep_IsInitial()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsInitial();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcStep#isIsInitial <em>Is Initial</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Initial</em>' attribute.
	 * @see #isIsInitial()
	 * @generated
	 */
	void setIsInitial(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Active</em>' attribute.
	 * @see #setIsActive(boolean)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStep_IsActive()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	boolean isIsActive();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcStep#isIsActive <em>Is Active</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Active</em>' attribute.
	 * @see #isIsActive()
	 * @generated
	 */
	void setIsActive(boolean value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' attribute.
	 * @see #setAction(String)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStep_Action()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getAction();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcStep#getAction <em>Action</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' attribute.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStep_IncomingConnections()
	 * @see jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<SrcTransitionToStep> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.SrcStepToTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcStep_OutgoingConnections()
	 * @see jointPackage_Grafcet2PetriNet.SrcStepToTransition#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<SrcStepToTransition> getOutgoingConnections();

} // SrcStep
