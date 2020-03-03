/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Joint MM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.JointMM#getSourceRoot <em>Source Root</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.JointMM#getTargetRoot <em>Target Root</em>}</li>
 * </ul>
 *
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getJointMM()
 * @model
 * @generated
 */
public interface JointMM extends EObject {
	/**
	 * Returns the value of the '<em><b>Source Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Root</em>' containment reference.
	 * @see #setSourceRoot(SrcRoot)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getJointMM_SourceRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	SrcRoot getSourceRoot();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.JointMM#getSourceRoot <em>Source Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Root</em>' containment reference.
	 * @see #getSourceRoot()
	 * @generated
	 */
	void setSourceRoot(SrcRoot value);

	/**
	 * Returns the value of the '<em><b>Target Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Root</em>' containment reference.
	 * @see #setTargetRoot(TrgRoot)
	 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage#getJointMM_TargetRoot()
	 * @model containment="true" required="true"
	 * @generated
	 */
	TrgRoot getTargetRoot();

	/**
	 * Sets the value of the '{@link jointPackage_HSM2FSM.JointMM#getTargetRoot <em>Target Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Root</em>' containment reference.
	 * @see #getTargetRoot()
	 * @generated
	 */
	void setTargetRoot(TrgRoot value);

} // JointMM
