/**
 */
package jointPackage_PetriNet2PNML;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Arc</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgArc#getSource <em>Source</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgArc#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgArc()
 * @model
 * @generated
 */
public interface TrgArc extends TrgNetContent, TrgIdedElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(TrgNetContentElement)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgArc_Source()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgNetContentElement getSource();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgArc#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(TrgNetContentElement value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(TrgNetContentElement)
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgArc_Target()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TrgNetContentElement getTarget();

	/**
	 * Sets the value of the '{@link jointPackage_PetriNet2PNML.TrgArc#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(TrgNetContentElement value);

} // TrgArc
