/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage
 * @generated
 */
public interface JointPackage_HSM2FSMFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_HSM2FSMFactory eINSTANCE = jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint MM</em>'.
	 * @generated
	 */
	JointMM createJointMM();

	/**
	 * Returns a new object of class '<em>Src Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Root</em>'.
	 * @generated
	 */
	SrcRoot createSrcRoot();

	/**
	 * Returns a new object of class '<em>Src State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src State Machine</em>'.
	 * @generated
	 */
	SrcStateMachine createSrcStateMachine();

	/**
	 * Returns a new object of class '<em>Src Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Transition</em>'.
	 * @generated
	 */
	SrcTransition createSrcTransition();

	/**
	 * Returns a new object of class '<em>Src Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Initial State</em>'.
	 * @generated
	 */
	SrcInitialState createSrcInitialState();

	/**
	 * Returns a new object of class '<em>Src Regular State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Regular State</em>'.
	 * @generated
	 */
	SrcRegularState createSrcRegularState();

	/**
	 * Returns a new object of class '<em>Src Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Composite State</em>'.
	 * @generated
	 */
	SrcCompositeState createSrcCompositeState();

	/**
	 * Returns a new object of class '<em>Trg Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Root</em>'.
	 * @generated
	 */
	TrgRoot createTrgRoot();

	/**
	 * Returns a new object of class '<em>Trg State Machine</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg State Machine</em>'.
	 * @generated
	 */
	TrgStateMachine createTrgStateMachine();

	/**
	 * Returns a new object of class '<em>Trg Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Transition</em>'.
	 * @generated
	 */
	TrgTransition createTrgTransition();

	/**
	 * Returns a new object of class '<em>Trg Initial State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Initial State</em>'.
	 * @generated
	 */
	TrgInitialState createTrgInitialState();

	/**
	 * Returns a new object of class '<em>Trg Regular State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Regular State</em>'.
	 * @generated
	 */
	TrgRegularState createTrgRegularState();

	/**
	 * Returns a new object of class '<em>Trg Composite State</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Composite State</em>'.
	 * @generated
	 */
	TrgCompositeState createTrgCompositeState();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JointPackage_HSM2FSMPackage getJointPackage_HSM2FSMPackage();

} //JointPackage_HSM2FSMFactory
