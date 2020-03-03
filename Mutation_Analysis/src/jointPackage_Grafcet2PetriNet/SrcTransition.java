/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Src Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcTransition#getCondition <em>Condition</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcTransition#getIncomingConnections <em>Incoming Connections</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.SrcTransition#getOutgoingConnections <em>Outgoing Connections</em>}</li>
 * </ul>
 *
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransition()
 * @model
 * @generated
 */
public interface SrcTransition extends SrcElement {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' attribute.
	 * @see #setCondition(String)
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransition_Condition()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	String getCondition();

	/**
	 * Sets the value of the '{@link jointPackage_Grafcet2PetriNet.SrcTransition#getCondition <em>Condition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' attribute.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(String value);

	/**
	 * Returns the value of the '<em><b>Incoming Connections</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.SrcStepToTransition}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Connections</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransition_IncomingConnections()
	 * @see jointPackage_Grafcet2PetriNet.SrcStepToTransition#getTo
	 * @model opposite="to" ordered="false"
	 * @generated
	 */
	EList<SrcStepToTransition> getIncomingConnections();

	/**
	 * Returns the value of the '<em><b>Outgoing Connections</b></em>' reference list.
	 * The list contents are of type {@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep}.
	 * It is bidirectional and its opposite is '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Connections</em>' reference list.
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#getSrcTransition_OutgoingConnections()
	 * @see jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getFrom
	 * @model opposite="from" ordered="false"
	 * @generated
	 */
	EList<SrcTransitionToStep> getOutgoingConnections();

} // SrcTransition
