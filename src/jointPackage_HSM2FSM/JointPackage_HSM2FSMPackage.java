/**
 */
package jointPackage_HSM2FSM;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMFactory
 * @model kind="package"
 * @generated
 */
public interface JointPackage_HSM2FSMPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jointPackage_HSM2FSM";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jointPackage_hsm2fsm/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jointPackage_HSM2FSM";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_HSM2FSMPackage eINSTANCE = jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl.init();

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.JointMMImpl <em>Joint MM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.JointMMImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getJointMM()
	 * @generated
	 */
	int JOINT_MM = 0;

	/**
	 * The feature id for the '<em><b>Source Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM__SOURCE_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Target Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM__TARGET_ROOT = 1;

	/**
	 * The number of structural features of the '<em>Joint MM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Joint MM</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JOINT_MM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcRootImpl <em>Src Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcRootImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcRoot()
	 * @generated
	 */
	int SRC_ROOT = 1;

	/**
	 * The feature id for the '<em><b>Statemachines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ROOT__STATEMACHINES = 0;

	/**
	 * The number of structural features of the '<em>Src Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcStateMachineImpl <em>Src State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcStateMachineImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcStateMachine()
	 * @generated
	 */
	int SRC_STATE_MACHINE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STATE_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STATE_MACHINE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STATE_MACHINE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Src State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STATE_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Src State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcTransitionImpl <em>Src Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcTransitionImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcTransition()
	 * @generated
	 */
	int SRC_TRANSITION = 3;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Src Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Src Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcAbstractStateImpl <em>Src Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcAbstractStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcAbstractState()
	 * @generated
	 */
	int SRC_ABSTRACT_STATE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ABSTRACT_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ABSTRACT_STATE__STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ABSTRACT_STATE__COMPOSITE_STATES = 2;

	/**
	 * The number of structural features of the '<em>Src Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ABSTRACT_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Src Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ABSTRACT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcInitialStateImpl <em>Src Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcInitialStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcInitialState()
	 * @generated
	 */
	int SRC_INITIAL_STATE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INITIAL_STATE__NAME = SRC_ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INITIAL_STATE__STATE_MACHINE = SRC_ABSTRACT_STATE__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INITIAL_STATE__COMPOSITE_STATES = SRC_ABSTRACT_STATE__COMPOSITE_STATES;

	/**
	 * The number of structural features of the '<em>Src Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INITIAL_STATE_FEATURE_COUNT = SRC_ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_INITIAL_STATE_OPERATION_COUNT = SRC_ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcRegularStateImpl <em>Src Regular State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcRegularStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcRegularState()
	 * @generated
	 */
	int SRC_REGULAR_STATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REGULAR_STATE__NAME = SRC_ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REGULAR_STATE__STATE_MACHINE = SRC_ABSTRACT_STATE__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REGULAR_STATE__COMPOSITE_STATES = SRC_ABSTRACT_STATE__COMPOSITE_STATES;

	/**
	 * The number of structural features of the '<em>Src Regular State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REGULAR_STATE_FEATURE_COUNT = SRC_ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Src Regular State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_REGULAR_STATE_OPERATION_COUNT = SRC_ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.SrcCompositeStateImpl <em>Src Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.SrcCompositeStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcCompositeState()
	 * @generated
	 */
	int SRC_COMPOSITE_STATE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_COMPOSITE_STATE__NAME = SRC_ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_COMPOSITE_STATE__STATE_MACHINE = SRC_ABSTRACT_STATE__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_COMPOSITE_STATE__COMPOSITE_STATES = SRC_ABSTRACT_STATE__COMPOSITE_STATES;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_COMPOSITE_STATE__STATES = SRC_ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_COMPOSITE_STATE_FEATURE_COUNT = SRC_ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_COMPOSITE_STATE_OPERATION_COUNT = SRC_ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgRootImpl <em>Trg Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgRootImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgRoot()
	 * @generated
	 */
	int TRG_ROOT = 8;

	/**
	 * The feature id for the '<em><b>State Machines</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ROOT__STATE_MACHINES = 0;

	/**
	 * The number of structural features of the '<em>Trg Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ROOT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ROOT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgStateMachineImpl <em>Trg State Machine</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgStateMachineImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgStateMachine()
	 * @generated
	 */
	int TRG_STATE_MACHINE = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATE_MACHINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Transitions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATE_MACHINE__TRANSITIONS = 1;

	/**
	 * The feature id for the '<em><b>States</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATE_MACHINE__STATES = 2;

	/**
	 * The number of structural features of the '<em>Trg State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATE_MACHINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trg State Machine</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_STATE_MACHINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgTransitionImpl <em>Trg Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgTransitionImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgTransition()
	 * @generated
	 */
	int TRG_TRANSITION = 10;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__LABEL = 0;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__SOURCE = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__TARGET = 3;

	/**
	 * The number of structural features of the '<em>Trg Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Trg Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgAbstractStateImpl <em>Trg Abstract State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgAbstractStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgAbstractState()
	 * @generated
	 */
	int TRG_ABSTRACT_STATE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ABSTRACT_STATE__NAME = 0;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ABSTRACT_STATE__STATE_MACHINE = 1;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ABSTRACT_STATE__COMPOSITE_STATES = 2;

	/**
	 * The number of structural features of the '<em>Trg Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ABSTRACT_STATE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Trg Abstract State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ABSTRACT_STATE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgInitialStateImpl <em>Trg Initial State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgInitialStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgInitialState()
	 * @generated
	 */
	int TRG_INITIAL_STATE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INITIAL_STATE__NAME = TRG_ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INITIAL_STATE__STATE_MACHINE = TRG_ABSTRACT_STATE__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INITIAL_STATE__COMPOSITE_STATES = TRG_ABSTRACT_STATE__COMPOSITE_STATES;

	/**
	 * The number of structural features of the '<em>Trg Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INITIAL_STATE_FEATURE_COUNT = TRG_ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Initial State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_INITIAL_STATE_OPERATION_COUNT = TRG_ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgRegularStateImpl <em>Trg Regular State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgRegularStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgRegularState()
	 * @generated
	 */
	int TRG_REGULAR_STATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGULAR_STATE__NAME = TRG_ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGULAR_STATE__STATE_MACHINE = TRG_ABSTRACT_STATE__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGULAR_STATE__COMPOSITE_STATES = TRG_ABSTRACT_STATE__COMPOSITE_STATES;

	/**
	 * The number of structural features of the '<em>Trg Regular State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGULAR_STATE_FEATURE_COUNT = TRG_ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Trg Regular State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_REGULAR_STATE_OPERATION_COUNT = TRG_ABSTRACT_STATE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_HSM2FSM.impl.TrgCompositeStateImpl <em>Trg Composite State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_HSM2FSM.impl.TrgCompositeStateImpl
	 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgCompositeState()
	 * @generated
	 */
	int TRG_COMPOSITE_STATE = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOSITE_STATE__NAME = TRG_ABSTRACT_STATE__NAME;

	/**
	 * The feature id for the '<em><b>State Machine</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOSITE_STATE__STATE_MACHINE = TRG_ABSTRACT_STATE__STATE_MACHINE;

	/**
	 * The feature id for the '<em><b>Composite States</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOSITE_STATE__COMPOSITE_STATES = TRG_ABSTRACT_STATE__COMPOSITE_STATES;

	/**
	 * The feature id for the '<em><b>States</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOSITE_STATE__STATES = TRG_ABSTRACT_STATE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOSITE_STATE_FEATURE_COUNT = TRG_ABSTRACT_STATE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Composite State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_COMPOSITE_STATE_OPERATION_COUNT = TRG_ABSTRACT_STATE_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint MM</em>'.
	 * @see jointPackage_HSM2FSM.JointMM
	 * @generated
	 */
	EClass getJointMM();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_HSM2FSM.JointMM#getSourceRoot <em>Source Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Root</em>'.
	 * @see jointPackage_HSM2FSM.JointMM#getSourceRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_SourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_HSM2FSM.JointMM#getTargetRoot <em>Target Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Root</em>'.
	 * @see jointPackage_HSM2FSM.JointMM#getTargetRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_TargetRoot();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcRoot <em>Src Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Root</em>'.
	 * @see jointPackage_HSM2FSM.SrcRoot
	 * @generated
	 */
	EClass getSrcRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_HSM2FSM.SrcRoot#getStatemachines <em>Statemachines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Statemachines</em>'.
	 * @see jointPackage_HSM2FSM.SrcRoot#getStatemachines()
	 * @see #getSrcRoot()
	 * @generated
	 */
	EReference getSrcRoot_Statemachines();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcStateMachine <em>Src State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src State Machine</em>'.
	 * @see jointPackage_HSM2FSM.SrcStateMachine
	 * @generated
	 */
	EClass getSrcStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_HSM2FSM.SrcStateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_HSM2FSM.SrcStateMachine#getName()
	 * @see #getSrcStateMachine()
	 * @generated
	 */
	EAttribute getSrcStateMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_HSM2FSM.SrcStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see jointPackage_HSM2FSM.SrcStateMachine#getTransitions()
	 * @see #getSrcStateMachine()
	 * @generated
	 */
	EReference getSrcStateMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_HSM2FSM.SrcStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see jointPackage_HSM2FSM.SrcStateMachine#getStates()
	 * @see #getSrcStateMachine()
	 * @generated
	 */
	EReference getSrcStateMachine_States();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcTransition <em>Src Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Transition</em>'.
	 * @see jointPackage_HSM2FSM.SrcTransition
	 * @generated
	 */
	EClass getSrcTransition();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_HSM2FSM.SrcTransition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jointPackage_HSM2FSM.SrcTransition#getLabel()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EAttribute getSrcTransition_Label();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_HSM2FSM.SrcTransition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see jointPackage_HSM2FSM.SrcTransition#getStateMachine()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EReference getSrcTransition_StateMachine();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_HSM2FSM.SrcTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jointPackage_HSM2FSM.SrcTransition#getSource()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EReference getSrcTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_HSM2FSM.SrcTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see jointPackage_HSM2FSM.SrcTransition#getTarget()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EReference getSrcTransition_Target();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcAbstractState <em>Src Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Abstract State</em>'.
	 * @see jointPackage_HSM2FSM.SrcAbstractState
	 * @generated
	 */
	EClass getSrcAbstractState();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_HSM2FSM.SrcAbstractState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_HSM2FSM.SrcAbstractState#getName()
	 * @see #getSrcAbstractState()
	 * @generated
	 */
	EAttribute getSrcAbstractState_Name();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_HSM2FSM.SrcAbstractState#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see jointPackage_HSM2FSM.SrcAbstractState#getStateMachine()
	 * @see #getSrcAbstractState()
	 * @generated
	 */
	EReference getSrcAbstractState_StateMachine();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_HSM2FSM.SrcAbstractState#getCompositeStates <em>Composite States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite States</em>'.
	 * @see jointPackage_HSM2FSM.SrcAbstractState#getCompositeStates()
	 * @see #getSrcAbstractState()
	 * @generated
	 */
	EReference getSrcAbstractState_CompositeStates();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcInitialState <em>Src Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Initial State</em>'.
	 * @see jointPackage_HSM2FSM.SrcInitialState
	 * @generated
	 */
	EClass getSrcInitialState();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcRegularState <em>Src Regular State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Regular State</em>'.
	 * @see jointPackage_HSM2FSM.SrcRegularState
	 * @generated
	 */
	EClass getSrcRegularState();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.SrcCompositeState <em>Src Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Composite State</em>'.
	 * @see jointPackage_HSM2FSM.SrcCompositeState
	 * @generated
	 */
	EClass getSrcCompositeState();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_HSM2FSM.SrcCompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see jointPackage_HSM2FSM.SrcCompositeState#getStates()
	 * @see #getSrcCompositeState()
	 * @generated
	 */
	EReference getSrcCompositeState_States();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgRoot <em>Trg Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Root</em>'.
	 * @see jointPackage_HSM2FSM.TrgRoot
	 * @generated
	 */
	EClass getTrgRoot();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_HSM2FSM.TrgRoot#getStateMachines <em>State Machines</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>State Machines</em>'.
	 * @see jointPackage_HSM2FSM.TrgRoot#getStateMachines()
	 * @see #getTrgRoot()
	 * @generated
	 */
	EReference getTrgRoot_StateMachines();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgStateMachine <em>Trg State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg State Machine</em>'.
	 * @see jointPackage_HSM2FSM.TrgStateMachine
	 * @generated
	 */
	EClass getTrgStateMachine();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_HSM2FSM.TrgStateMachine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_HSM2FSM.TrgStateMachine#getName()
	 * @see #getTrgStateMachine()
	 * @generated
	 */
	EAttribute getTrgStateMachine_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_HSM2FSM.TrgStateMachine#getTransitions <em>Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transitions</em>'.
	 * @see jointPackage_HSM2FSM.TrgStateMachine#getTransitions()
	 * @see #getTrgStateMachine()
	 * @generated
	 */
	EReference getTrgStateMachine_Transitions();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_HSM2FSM.TrgStateMachine#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>States</em>'.
	 * @see jointPackage_HSM2FSM.TrgStateMachine#getStates()
	 * @see #getTrgStateMachine()
	 * @generated
	 */
	EReference getTrgStateMachine_States();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgTransition <em>Trg Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Transition</em>'.
	 * @see jointPackage_HSM2FSM.TrgTransition
	 * @generated
	 */
	EClass getTrgTransition();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_HSM2FSM.TrgTransition#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see jointPackage_HSM2FSM.TrgTransition#getLabel()
	 * @see #getTrgTransition()
	 * @generated
	 */
	EAttribute getTrgTransition_Label();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_HSM2FSM.TrgTransition#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see jointPackage_HSM2FSM.TrgTransition#getStateMachine()
	 * @see #getTrgTransition()
	 * @generated
	 */
	EReference getTrgTransition_StateMachine();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_HSM2FSM.TrgTransition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see jointPackage_HSM2FSM.TrgTransition#getSource()
	 * @see #getTrgTransition()
	 * @generated
	 */
	EReference getTrgTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_HSM2FSM.TrgTransition#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see jointPackage_HSM2FSM.TrgTransition#getTarget()
	 * @see #getTrgTransition()
	 * @generated
	 */
	EReference getTrgTransition_Target();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgAbstractState <em>Trg Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Abstract State</em>'.
	 * @see jointPackage_HSM2FSM.TrgAbstractState
	 * @generated
	 */
	EClass getTrgAbstractState();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_HSM2FSM.TrgAbstractState#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_HSM2FSM.TrgAbstractState#getName()
	 * @see #getTrgAbstractState()
	 * @generated
	 */
	EAttribute getTrgAbstractState_Name();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_HSM2FSM.TrgAbstractState#getStateMachine <em>State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Machine</em>'.
	 * @see jointPackage_HSM2FSM.TrgAbstractState#getStateMachine()
	 * @see #getTrgAbstractState()
	 * @generated
	 */
	EReference getTrgAbstractState_StateMachine();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_HSM2FSM.TrgAbstractState#getCompositeStates <em>Composite States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Composite States</em>'.
	 * @see jointPackage_HSM2FSM.TrgAbstractState#getCompositeStates()
	 * @see #getTrgAbstractState()
	 * @generated
	 */
	EReference getTrgAbstractState_CompositeStates();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgInitialState <em>Trg Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Initial State</em>'.
	 * @see jointPackage_HSM2FSM.TrgInitialState
	 * @generated
	 */
	EClass getTrgInitialState();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgRegularState <em>Trg Regular State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Regular State</em>'.
	 * @see jointPackage_HSM2FSM.TrgRegularState
	 * @generated
	 */
	EClass getTrgRegularState();

	/**
	 * Returns the meta object for class '{@link jointPackage_HSM2FSM.TrgCompositeState <em>Trg Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Composite State</em>'.
	 * @see jointPackage_HSM2FSM.TrgCompositeState
	 * @generated
	 */
	EClass getTrgCompositeState();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_HSM2FSM.TrgCompositeState#getStates <em>States</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>States</em>'.
	 * @see jointPackage_HSM2FSM.TrgCompositeState#getStates()
	 * @see #getTrgCompositeState()
	 * @generated
	 */
	EReference getTrgCompositeState_States();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JointPackage_HSM2FSMFactory getJointPackage_HSM2FSMFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.JointMMImpl <em>Joint MM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.JointMMImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getJointMM()
		 * @generated
		 */
		EClass JOINT_MM = eINSTANCE.getJointMM();

		/**
		 * The meta object literal for the '<em><b>Source Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_MM__SOURCE_ROOT = eINSTANCE.getJointMM_SourceRoot();

		/**
		 * The meta object literal for the '<em><b>Target Root</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference JOINT_MM__TARGET_ROOT = eINSTANCE.getJointMM_TargetRoot();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcRootImpl <em>Src Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcRootImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcRoot()
		 * @generated
		 */
		EClass SRC_ROOT = eINSTANCE.getSrcRoot();

		/**
		 * The meta object literal for the '<em><b>Statemachines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ROOT__STATEMACHINES = eINSTANCE.getSrcRoot_Statemachines();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcStateMachineImpl <em>Src State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcStateMachineImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcStateMachine()
		 * @generated
		 */
		EClass SRC_STATE_MACHINE = eINSTANCE.getSrcStateMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_STATE_MACHINE__NAME = eINSTANCE.getSrcStateMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STATE_MACHINE__TRANSITIONS = eINSTANCE.getSrcStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STATE_MACHINE__STATES = eINSTANCE.getSrcStateMachine_States();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcTransitionImpl <em>Src Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcTransitionImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcTransition()
		 * @generated
		 */
		EClass SRC_TRANSITION = eINSTANCE.getSrcTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_TRANSITION__LABEL = eINSTANCE.getSrcTransition_Label();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION__STATE_MACHINE = eINSTANCE.getSrcTransition_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION__SOURCE = eINSTANCE.getSrcTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION__TARGET = eINSTANCE.getSrcTransition_Target();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcAbstractStateImpl <em>Src Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcAbstractStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcAbstractState()
		 * @generated
		 */
		EClass SRC_ABSTRACT_STATE = eINSTANCE.getSrcAbstractState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_ABSTRACT_STATE__NAME = eINSTANCE.getSrcAbstractState_Name();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ABSTRACT_STATE__STATE_MACHINE = eINSTANCE.getSrcAbstractState_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Composite States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ABSTRACT_STATE__COMPOSITE_STATES = eINSTANCE.getSrcAbstractState_CompositeStates();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcInitialStateImpl <em>Src Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcInitialStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcInitialState()
		 * @generated
		 */
		EClass SRC_INITIAL_STATE = eINSTANCE.getSrcInitialState();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcRegularStateImpl <em>Src Regular State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcRegularStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcRegularState()
		 * @generated
		 */
		EClass SRC_REGULAR_STATE = eINSTANCE.getSrcRegularState();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.SrcCompositeStateImpl <em>Src Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.SrcCompositeStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getSrcCompositeState()
		 * @generated
		 */
		EClass SRC_COMPOSITE_STATE = eINSTANCE.getSrcCompositeState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_COMPOSITE_STATE__STATES = eINSTANCE.getSrcCompositeState_States();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgRootImpl <em>Trg Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgRootImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgRoot()
		 * @generated
		 */
		EClass TRG_ROOT = eINSTANCE.getTrgRoot();

		/**
		 * The meta object literal for the '<em><b>State Machines</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ROOT__STATE_MACHINES = eINSTANCE.getTrgRoot_StateMachines();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgStateMachineImpl <em>Trg State Machine</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgStateMachineImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgStateMachine()
		 * @generated
		 */
		EClass TRG_STATE_MACHINE = eINSTANCE.getTrgStateMachine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_STATE_MACHINE__NAME = eINSTANCE.getTrgStateMachine_Name();

		/**
		 * The meta object literal for the '<em><b>Transitions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_STATE_MACHINE__TRANSITIONS = eINSTANCE.getTrgStateMachine_Transitions();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_STATE_MACHINE__STATES = eINSTANCE.getTrgStateMachine_States();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgTransitionImpl <em>Trg Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgTransitionImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgTransition()
		 * @generated
		 */
		EClass TRG_TRANSITION = eINSTANCE.getTrgTransition();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_TRANSITION__LABEL = eINSTANCE.getTrgTransition_Label();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION__STATE_MACHINE = eINSTANCE.getTrgTransition_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION__SOURCE = eINSTANCE.getTrgTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION__TARGET = eINSTANCE.getTrgTransition_Target();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgAbstractStateImpl <em>Trg Abstract State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgAbstractStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgAbstractState()
		 * @generated
		 */
		EClass TRG_ABSTRACT_STATE = eINSTANCE.getTrgAbstractState();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_ABSTRACT_STATE__NAME = eINSTANCE.getTrgAbstractState_Name();

		/**
		 * The meta object literal for the '<em><b>State Machine</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ABSTRACT_STATE__STATE_MACHINE = eINSTANCE.getTrgAbstractState_StateMachine();

		/**
		 * The meta object literal for the '<em><b>Composite States</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ABSTRACT_STATE__COMPOSITE_STATES = eINSTANCE.getTrgAbstractState_CompositeStates();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgInitialStateImpl <em>Trg Initial State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgInitialStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgInitialState()
		 * @generated
		 */
		EClass TRG_INITIAL_STATE = eINSTANCE.getTrgInitialState();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgRegularStateImpl <em>Trg Regular State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgRegularStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgRegularState()
		 * @generated
		 */
		EClass TRG_REGULAR_STATE = eINSTANCE.getTrgRegularState();

		/**
		 * The meta object literal for the '{@link jointPackage_HSM2FSM.impl.TrgCompositeStateImpl <em>Trg Composite State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_HSM2FSM.impl.TrgCompositeStateImpl
		 * @see jointPackage_HSM2FSM.impl.JointPackage_HSM2FSMPackageImpl#getTrgCompositeState()
		 * @generated
		 */
		EClass TRG_COMPOSITE_STATE = eINSTANCE.getTrgCompositeState();

		/**
		 * The meta object literal for the '<em><b>States</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_COMPOSITE_STATE__STATES = eINSTANCE.getTrgCompositeState_States();

	}

} //JointPackage_HSM2FSMPackage
