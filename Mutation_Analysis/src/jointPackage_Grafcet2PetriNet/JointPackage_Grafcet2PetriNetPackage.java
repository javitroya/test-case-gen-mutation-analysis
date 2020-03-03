/**
 */
package jointPackage_Grafcet2PetriNet;

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
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetFactory
 * @model kind="package"
 * @generated
 */
public interface JointPackage_Grafcet2PetriNetPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "jointPackage_Grafcet2PetriNet";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://jointPackage_grafcet2petrinet/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "jointPackage_Grafcet2PetriNet";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_Grafcet2PetriNetPackage eINSTANCE = jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl.init();

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.JointMMImpl <em>Joint MM</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.JointMMImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getJointMM()
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
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcLocatedElementImpl <em>Src Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcLocatedElementImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcLocatedElement()
	 * @generated
	 */
	int SRC_LOCATED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Src Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Src Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_LOCATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcNamedElementImpl <em>Src Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcNamedElementImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcNamedElement()
	 * @generated
	 */
	int SRC_NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT__LOCATION = SRC_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT__NAME = SRC_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT_FEATURE_COUNT = SRC_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_NAMED_ELEMENT_OPERATION_COUNT = SRC_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcGrafcetImpl <em>Src Grafcet</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcGrafcetImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcGrafcet()
	 * @generated
	 */
	int SRC_GRAFCET = 3;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_GRAFCET__LOCATION = SRC_NAMED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_GRAFCET__NAME = SRC_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_GRAFCET__ELEMENTS = SRC_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_GRAFCET__CONNECTIONS = SRC_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_GRAFCET_FEATURE_COUNT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Grafcet</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_GRAFCET_OPERATION_COUNT = SRC_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcElementImpl <em>Src Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcElementImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcElement()
	 * @generated
	 */
	int SRC_ELEMENT = 4;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT__LOCATION = SRC_NAMED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT__NAME = SRC_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT__GRAFCET = SRC_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT_FEATURE_COUNT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_ELEMENT_OPERATION_COUNT = SRC_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcStepImpl <em>Src Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcStepImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcStep()
	 * @generated
	 */
	int SRC_STEP = 5;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__LOCATION = SRC_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__NAME = SRC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__GRAFCET = SRC_ELEMENT__GRAFCET;

	/**
	 * The feature id for the '<em><b>Is Initial</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__IS_INITIAL = SRC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Active</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__IS_ACTIVE = SRC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Action</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__ACTION = SRC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__INCOMING_CONNECTIONS = SRC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP__OUTGOING_CONNECTIONS = SRC_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Src Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_FEATURE_COUNT = SRC_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Src Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_OPERATION_COUNT = SRC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcTransitionImpl <em>Src Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcTransitionImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcTransition()
	 * @generated
	 */
	int SRC_TRANSITION = 6;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__LOCATION = SRC_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__NAME = SRC_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__GRAFCET = SRC_ELEMENT__GRAFCET;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__CONDITION = SRC_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Incoming Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__INCOMING_CONNECTIONS = SRC_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Outgoing Connections</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION__OUTGOING_CONNECTIONS = SRC_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Src Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_FEATURE_COUNT = SRC_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Src Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_OPERATION_COUNT = SRC_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcConnectionImpl <em>Src Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcConnectionImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcConnection()
	 * @generated
	 */
	int SRC_CONNECTION = 7;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CONNECTION__LOCATION = SRC_NAMED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CONNECTION__NAME = SRC_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CONNECTION__GRAFCET = SRC_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Src Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CONNECTION_FEATURE_COUNT = SRC_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Src Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_CONNECTION_OPERATION_COUNT = SRC_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcStepToTransitionImpl <em>Src Step To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcStepToTransitionImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcStepToTransition()
	 * @generated
	 */
	int SRC_STEP_TO_TRANSITION = 8;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION__LOCATION = SRC_CONNECTION__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION__NAME = SRC_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION__GRAFCET = SRC_CONNECTION__GRAFCET;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION__FROM = SRC_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION__TO = SRC_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Step To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION_FEATURE_COUNT = SRC_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Step To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_STEP_TO_TRANSITION_OPERATION_COUNT = SRC_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcTransitionToStepImpl <em>Src Transition To Step</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.SrcTransitionToStepImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcTransitionToStep()
	 * @generated
	 */
	int SRC_TRANSITION_TO_STEP = 9;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP__LOCATION = SRC_CONNECTION__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP__NAME = SRC_CONNECTION__NAME;

	/**
	 * The feature id for the '<em><b>Grafcet</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP__GRAFCET = SRC_CONNECTION__GRAFCET;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP__FROM = SRC_CONNECTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP__TO = SRC_CONNECTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Src Transition To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP_FEATURE_COUNT = SRC_CONNECTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Src Transition To Step</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SRC_TRANSITION_TO_STEP_OPERATION_COUNT = SRC_CONNECTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgLocatedElementImpl <em>Trg Located Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgLocatedElementImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgLocatedElement()
	 * @generated
	 */
	int TRG_LOCATED_ELEMENT = 10;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT__LOCATION = 0;

	/**
	 * The number of structural features of the '<em>Trg Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Trg Located Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_LOCATED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgNamedElementImpl <em>Trg Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgNamedElementImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgNamedElement()
	 * @generated
	 */
	int TRG_NAMED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_ELEMENT__LOCATION = TRG_LOCATED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_ELEMENT__NAME = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_ELEMENT_FEATURE_COUNT = TRG_LOCATED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_NAMED_ELEMENT_OPERATION_COUNT = TRG_LOCATED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgPetriNetImpl <em>Trg Petri Net</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgPetriNetImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgPetriNet()
	 * @generated
	 */
	int TRG_PETRI_NET = 12;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PETRI_NET__LOCATION = TRG_NAMED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PETRI_NET__NAME = TRG_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Elements</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PETRI_NET__ELEMENTS = TRG_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Arcs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PETRI_NET__ARCS = TRG_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PETRI_NET_FEATURE_COUNT = TRG_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Petri Net</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PETRI_NET_OPERATION_COUNT = TRG_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgElementImpl <em>Trg Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgElementImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgElement()
	 * @generated
	 */
	int TRG_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT__LOCATION = TRG_NAMED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT__NAME = TRG_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT__NET = TRG_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Trg Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT_FEATURE_COUNT = TRG_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Trg Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ELEMENT_OPERATION_COUNT = TRG_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceImpl <em>Trg Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgPlaceImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgPlace()
	 * @generated
	 */
	int TRG_PLACE = 14;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__LOCATION = TRG_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__NAME = TRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__NET = TRG_ELEMENT__NET;

	/**
	 * The feature id for the '<em><b>Incoming Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__INCOMING_ARC = TRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE__OUTGOING_ARC = TRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_FEATURE_COUNT = TRG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_OPERATION_COUNT = TRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgTransitionImpl <em>Trg Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgTransitionImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgTransition()
	 * @generated
	 */
	int TRG_TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__LOCATION = TRG_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__NAME = TRG_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__NET = TRG_ELEMENT__NET;

	/**
	 * The feature id for the '<em><b>Incoming Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__INCOMING_ARC = TRG_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Arc</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION__OUTGOING_ARC = TRG_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_FEATURE_COUNT = TRG_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_OPERATION_COUNT = TRG_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgArcImpl <em>Trg Arc</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgArcImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgArc()
	 * @generated
	 */
	int TRG_ARC = 16;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARC__LOCATION = TRG_NAMED_ELEMENT__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARC__NAME = TRG_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARC__WEIGHT = TRG_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARC__NET = TRG_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARC_FEATURE_COUNT = TRG_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Arc</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_ARC_OPERATION_COUNT = TRG_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceToTransitionImpl <em>Trg Place To Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgPlaceToTransitionImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgPlaceToTransition()
	 * @generated
	 */
	int TRG_PLACE_TO_TRANSITION = 17;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION__LOCATION = TRG_ARC__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION__NAME = TRG_ARC__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION__WEIGHT = TRG_ARC__WEIGHT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION__NET = TRG_ARC__NET;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION__FROM = TRG_ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION__TO = TRG_ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Place To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION_FEATURE_COUNT = TRG_ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Place To Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_PLACE_TO_TRANSITION_OPERATION_COUNT = TRG_ARC_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgTransitionToPlaceImpl <em>Trg Transition To Place</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see jointPackage_Grafcet2PetriNet.impl.TrgTransitionToPlaceImpl
	 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgTransitionToPlace()
	 * @generated
	 */
	int TRG_TRANSITION_TO_PLACE = 18;

	/**
	 * The feature id for the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE__LOCATION = TRG_ARC__LOCATION;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE__NAME = TRG_ARC__NAME;

	/**
	 * The feature id for the '<em><b>Weight</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE__WEIGHT = TRG_ARC__WEIGHT;

	/**
	 * The feature id for the '<em><b>Net</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE__NET = TRG_ARC__NET;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE__FROM = TRG_ARC_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE__TO = TRG_ARC_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Trg Transition To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE_FEATURE_COUNT = TRG_ARC_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Trg Transition To Place</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRG_TRANSITION_TO_PLACE_OPERATION_COUNT = TRG_ARC_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Joint MM</em>'.
	 * @see jointPackage_Grafcet2PetriNet.JointMM
	 * @generated
	 */
	EClass getJointMM();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Grafcet2PetriNet.JointMM#getSourceRoot <em>Source Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Root</em>'.
	 * @see jointPackage_Grafcet2PetriNet.JointMM#getSourceRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_SourceRoot();

	/**
	 * Returns the meta object for the containment reference '{@link jointPackage_Grafcet2PetriNet.JointMM#getTargetRoot <em>Target Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Root</em>'.
	 * @see jointPackage_Grafcet2PetriNet.JointMM#getTargetRoot()
	 * @see #getJointMM()
	 * @generated
	 */
	EReference getJointMM_TargetRoot();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcLocatedElement <em>Src Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Located Element</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcLocatedElement
	 * @generated
	 */
	EClass getSrcLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.SrcLocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcLocatedElement#getLocation()
	 * @see #getSrcLocatedElement()
	 * @generated
	 */
	EAttribute getSrcLocatedElement_Location();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcNamedElement <em>Src Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Named Element</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcNamedElement
	 * @generated
	 */
	EClass getSrcNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.SrcNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcNamedElement#getName()
	 * @see #getSrcNamedElement()
	 * @generated
	 */
	EAttribute getSrcNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcGrafcet <em>Src Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Grafcet</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcGrafcet
	 * @generated
	 */
	EClass getSrcGrafcet();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Grafcet2PetriNet.SrcGrafcet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcGrafcet#getElements()
	 * @see #getSrcGrafcet()
	 * @generated
	 */
	EReference getSrcGrafcet_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Grafcet2PetriNet.SrcGrafcet#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcGrafcet#getConnections()
	 * @see #getSrcGrafcet()
	 * @generated
	 */
	EReference getSrcGrafcet_Connections();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcElement <em>Src Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Element</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcElement
	 * @generated
	 */
	EClass getSrcElement();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Grafcet2PetriNet.SrcElement#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grafcet</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcElement#getGrafcet()
	 * @see #getSrcElement()
	 * @generated
	 */
	EReference getSrcElement_Grafcet();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcStep <em>Src Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Step</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep
	 * @generated
	 */
	EClass getSrcStep();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.SrcStep#isIsInitial <em>Is Initial</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Initial</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#isIsInitial()
	 * @see #getSrcStep()
	 * @generated
	 */
	EAttribute getSrcStep_IsInitial();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.SrcStep#isIsActive <em>Is Active</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Active</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#isIsActive()
	 * @see #getSrcStep()
	 * @generated
	 */
	EAttribute getSrcStep_IsActive();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.SrcStep#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#getAction()
	 * @see #getSrcStep()
	 * @generated
	 */
	EAttribute getSrcStep_Action();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.SrcStep#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connections</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#getIncomingConnections()
	 * @see #getSrcStep()
	 * @generated
	 */
	EReference getSrcStep_IncomingConnections();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.SrcStep#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connections</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep#getOutgoingConnections()
	 * @see #getSrcStep()
	 * @generated
	 */
	EReference getSrcStep_OutgoingConnections();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcTransition <em>Src Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Transition</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition
	 * @generated
	 */
	EClass getSrcTransition();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.SrcTransition#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition#getCondition()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EAttribute getSrcTransition_Condition();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.SrcTransition#getIncomingConnections <em>Incoming Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Connections</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition#getIncomingConnections()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EReference getSrcTransition_IncomingConnections();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.SrcTransition#getOutgoingConnections <em>Outgoing Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Connections</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition#getOutgoingConnections()
	 * @see #getSrcTransition()
	 * @generated
	 */
	EReference getSrcTransition_OutgoingConnections();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcConnection <em>Src Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Connection</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcConnection
	 * @generated
	 */
	EClass getSrcConnection();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Grafcet2PetriNet.SrcConnection#getGrafcet <em>Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Grafcet</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcConnection#getGrafcet()
	 * @see #getSrcConnection()
	 * @generated
	 */
	EReference getSrcConnection_Grafcet();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition <em>Src Step To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Step To Transition</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStepToTransition
	 * @generated
	 */
	EClass getSrcStepToTransition();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStepToTransition#getFrom()
	 * @see #getSrcStepToTransition()
	 * @generated
	 */
	EReference getSrcStepToTransition_From();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcStepToTransition#getTo()
	 * @see #getSrcStepToTransition()
	 * @generated
	 */
	EReference getSrcStepToTransition_To();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep <em>Src Transition To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Src Transition To Step</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransitionToStep
	 * @generated
	 */
	EClass getSrcTransitionToStep();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getFrom()
	 * @see #getSrcTransitionToStep()
	 * @generated
	 */
	EReference getSrcTransitionToStep_From();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransitionToStep#getTo()
	 * @see #getSrcTransitionToStep()
	 * @generated
	 */
	EReference getSrcTransitionToStep_To();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgLocatedElement <em>Trg Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Located Element</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgLocatedElement
	 * @generated
	 */
	EClass getTrgLocatedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.TrgLocatedElement#getLocation <em>Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Location</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgLocatedElement#getLocation()
	 * @see #getTrgLocatedElement()
	 * @generated
	 */
	EAttribute getTrgLocatedElement_Location();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgNamedElement <em>Trg Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Named Element</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgNamedElement
	 * @generated
	 */
	EClass getTrgNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.TrgNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgNamedElement#getName()
	 * @see #getTrgNamedElement()
	 * @generated
	 */
	EAttribute getTrgNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgPetriNet <em>Trg Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Petri Net</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPetriNet
	 * @generated
	 */
	EClass getTrgPetriNet();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Grafcet2PetriNet.TrgPetriNet#getElements <em>Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Elements</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPetriNet#getElements()
	 * @see #getTrgPetriNet()
	 * @generated
	 */
	EReference getTrgPetriNet_Elements();

	/**
	 * Returns the meta object for the containment reference list '{@link jointPackage_Grafcet2PetriNet.TrgPetriNet#getArcs <em>Arcs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arcs</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPetriNet#getArcs()
	 * @see #getTrgPetriNet()
	 * @generated
	 */
	EReference getTrgPetriNet_Arcs();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgElement <em>Trg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Element</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgElement
	 * @generated
	 */
	EClass getTrgElement();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Grafcet2PetriNet.TrgElement#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Net</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgElement#getNet()
	 * @see #getTrgElement()
	 * @generated
	 */
	EReference getTrgElement_Net();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgPlace <em>Trg Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Place</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlace
	 * @generated
	 */
	EClass getTrgPlace();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.TrgPlace#getIncomingArc <em>Incoming Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Arc</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlace#getIncomingArc()
	 * @see #getTrgPlace()
	 * @generated
	 */
	EReference getTrgPlace_IncomingArc();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.TrgPlace#getOutgoingArc <em>Outgoing Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Arc</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlace#getOutgoingArc()
	 * @see #getTrgPlace()
	 * @generated
	 */
	EReference getTrgPlace_OutgoingArc();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgTransition <em>Trg Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Transition</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransition
	 * @generated
	 */
	EClass getTrgTransition();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.TrgTransition#getIncomingArc <em>Incoming Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Arc</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransition#getIncomingArc()
	 * @see #getTrgTransition()
	 * @generated
	 */
	EReference getTrgTransition_IncomingArc();

	/**
	 * Returns the meta object for the reference list '{@link jointPackage_Grafcet2PetriNet.TrgTransition#getOutgoingArc <em>Outgoing Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Arc</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransition#getOutgoingArc()
	 * @see #getTrgTransition()
	 * @generated
	 */
	EReference getTrgTransition_OutgoingArc();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgArc <em>Trg Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Arc</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgArc
	 * @generated
	 */
	EClass getTrgArc();

	/**
	 * Returns the meta object for the attribute '{@link jointPackage_Grafcet2PetriNet.TrgArc#getWeight <em>Weight</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Weight</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgArc#getWeight()
	 * @see #getTrgArc()
	 * @generated
	 */
	EAttribute getTrgArc_Weight();

	/**
	 * Returns the meta object for the container reference '{@link jointPackage_Grafcet2PetriNet.TrgArc#getNet <em>Net</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Net</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgArc#getNet()
	 * @see #getTrgArc()
	 * @generated
	 */
	EReference getTrgArc_Net();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition <em>Trg Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Place To Transition</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlaceToTransition
	 * @generated
	 */
	EClass getTrgPlaceToTransition();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getFrom()
	 * @see #getTrgPlaceToTransition()
	 * @generated
	 */
	EReference getTrgPlaceToTransition_From();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlaceToTransition#getTo()
	 * @see #getTrgPlaceToTransition()
	 * @generated
	 */
	EReference getTrgPlaceToTransition_To();

	/**
	 * Returns the meta object for class '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace <em>Trg Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trg Transition To Place</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransitionToPlace
	 * @generated
	 */
	EClass getTrgTransitionToPlace();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getFrom()
	 * @see #getTrgTransitionToPlace()
	 * @generated
	 */
	EReference getTrgTransitionToPlace_From();

	/**
	 * Returns the meta object for the reference '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransitionToPlace#getTo()
	 * @see #getTrgTransitionToPlace()
	 * @generated
	 */
	EReference getTrgTransitionToPlace_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	JointPackage_Grafcet2PetriNetFactory getJointPackage_Grafcet2PetriNetFactory();

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
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.JointMMImpl <em>Joint MM</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.JointMMImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getJointMM()
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
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcLocatedElementImpl <em>Src Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcLocatedElementImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcLocatedElement()
		 * @generated
		 */
		EClass SRC_LOCATED_ELEMENT = eINSTANCE.getSrcLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_LOCATED_ELEMENT__LOCATION = eINSTANCE.getSrcLocatedElement_Location();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcNamedElementImpl <em>Src Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcNamedElementImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcNamedElement()
		 * @generated
		 */
		EClass SRC_NAMED_ELEMENT = eINSTANCE.getSrcNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_NAMED_ELEMENT__NAME = eINSTANCE.getSrcNamedElement_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcGrafcetImpl <em>Src Grafcet</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcGrafcetImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcGrafcet()
		 * @generated
		 */
		EClass SRC_GRAFCET = eINSTANCE.getSrcGrafcet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_GRAFCET__ELEMENTS = eINSTANCE.getSrcGrafcet_Elements();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_GRAFCET__CONNECTIONS = eINSTANCE.getSrcGrafcet_Connections();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcElementImpl <em>Src Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcElementImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcElement()
		 * @generated
		 */
		EClass SRC_ELEMENT = eINSTANCE.getSrcElement();

		/**
		 * The meta object literal for the '<em><b>Grafcet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_ELEMENT__GRAFCET = eINSTANCE.getSrcElement_Grafcet();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcStepImpl <em>Src Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcStepImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcStep()
		 * @generated
		 */
		EClass SRC_STEP = eINSTANCE.getSrcStep();

		/**
		 * The meta object literal for the '<em><b>Is Initial</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_STEP__IS_INITIAL = eINSTANCE.getSrcStep_IsInitial();

		/**
		 * The meta object literal for the '<em><b>Is Active</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_STEP__IS_ACTIVE = eINSTANCE.getSrcStep_IsActive();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_STEP__ACTION = eINSTANCE.getSrcStep_Action();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STEP__INCOMING_CONNECTIONS = eINSTANCE.getSrcStep_IncomingConnections();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STEP__OUTGOING_CONNECTIONS = eINSTANCE.getSrcStep_OutgoingConnections();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcTransitionImpl <em>Src Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcTransitionImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcTransition()
		 * @generated
		 */
		EClass SRC_TRANSITION = eINSTANCE.getSrcTransition();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SRC_TRANSITION__CONDITION = eINSTANCE.getSrcTransition_Condition();

		/**
		 * The meta object literal for the '<em><b>Incoming Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION__INCOMING_CONNECTIONS = eINSTANCE.getSrcTransition_IncomingConnections();

		/**
		 * The meta object literal for the '<em><b>Outgoing Connections</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION__OUTGOING_CONNECTIONS = eINSTANCE.getSrcTransition_OutgoingConnections();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcConnectionImpl <em>Src Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcConnectionImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcConnection()
		 * @generated
		 */
		EClass SRC_CONNECTION = eINSTANCE.getSrcConnection();

		/**
		 * The meta object literal for the '<em><b>Grafcet</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_CONNECTION__GRAFCET = eINSTANCE.getSrcConnection_Grafcet();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcStepToTransitionImpl <em>Src Step To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcStepToTransitionImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcStepToTransition()
		 * @generated
		 */
		EClass SRC_STEP_TO_TRANSITION = eINSTANCE.getSrcStepToTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STEP_TO_TRANSITION__FROM = eINSTANCE.getSrcStepToTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_STEP_TO_TRANSITION__TO = eINSTANCE.getSrcStepToTransition_To();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.SrcTransitionToStepImpl <em>Src Transition To Step</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.SrcTransitionToStepImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getSrcTransitionToStep()
		 * @generated
		 */
		EClass SRC_TRANSITION_TO_STEP = eINSTANCE.getSrcTransitionToStep();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION_TO_STEP__FROM = eINSTANCE.getSrcTransitionToStep_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SRC_TRANSITION_TO_STEP__TO = eINSTANCE.getSrcTransitionToStep_To();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgLocatedElementImpl <em>Trg Located Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgLocatedElementImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgLocatedElement()
		 * @generated
		 */
		EClass TRG_LOCATED_ELEMENT = eINSTANCE.getTrgLocatedElement();

		/**
		 * The meta object literal for the '<em><b>Location</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_LOCATED_ELEMENT__LOCATION = eINSTANCE.getTrgLocatedElement_Location();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgNamedElementImpl <em>Trg Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgNamedElementImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgNamedElement()
		 * @generated
		 */
		EClass TRG_NAMED_ELEMENT = eINSTANCE.getTrgNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_NAMED_ELEMENT__NAME = eINSTANCE.getTrgNamedElement_Name();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgPetriNetImpl <em>Trg Petri Net</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgPetriNetImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgPetriNet()
		 * @generated
		 */
		EClass TRG_PETRI_NET = eINSTANCE.getTrgPetriNet();

		/**
		 * The meta object literal for the '<em><b>Elements</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PETRI_NET__ELEMENTS = eINSTANCE.getTrgPetriNet_Elements();

		/**
		 * The meta object literal for the '<em><b>Arcs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PETRI_NET__ARCS = eINSTANCE.getTrgPetriNet_Arcs();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgElementImpl <em>Trg Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgElementImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgElement()
		 * @generated
		 */
		EClass TRG_ELEMENT = eINSTANCE.getTrgElement();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ELEMENT__NET = eINSTANCE.getTrgElement_Net();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceImpl <em>Trg Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgPlaceImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgPlace()
		 * @generated
		 */
		EClass TRG_PLACE = eINSTANCE.getTrgPlace();

		/**
		 * The meta object literal for the '<em><b>Incoming Arc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PLACE__INCOMING_ARC = eINSTANCE.getTrgPlace_IncomingArc();

		/**
		 * The meta object literal for the '<em><b>Outgoing Arc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PLACE__OUTGOING_ARC = eINSTANCE.getTrgPlace_OutgoingArc();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgTransitionImpl <em>Trg Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgTransitionImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgTransition()
		 * @generated
		 */
		EClass TRG_TRANSITION = eINSTANCE.getTrgTransition();

		/**
		 * The meta object literal for the '<em><b>Incoming Arc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION__INCOMING_ARC = eINSTANCE.getTrgTransition_IncomingArc();

		/**
		 * The meta object literal for the '<em><b>Outgoing Arc</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION__OUTGOING_ARC = eINSTANCE.getTrgTransition_OutgoingArc();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgArcImpl <em>Trg Arc</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgArcImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgArc()
		 * @generated
		 */
		EClass TRG_ARC = eINSTANCE.getTrgArc();

		/**
		 * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRG_ARC__WEIGHT = eINSTANCE.getTrgArc_Weight();

		/**
		 * The meta object literal for the '<em><b>Net</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_ARC__NET = eINSTANCE.getTrgArc_Net();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceToTransitionImpl <em>Trg Place To Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgPlaceToTransitionImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgPlaceToTransition()
		 * @generated
		 */
		EClass TRG_PLACE_TO_TRANSITION = eINSTANCE.getTrgPlaceToTransition();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PLACE_TO_TRANSITION__FROM = eINSTANCE.getTrgPlaceToTransition_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_PLACE_TO_TRANSITION__TO = eINSTANCE.getTrgPlaceToTransition_To();

		/**
		 * The meta object literal for the '{@link jointPackage_Grafcet2PetriNet.impl.TrgTransitionToPlaceImpl <em>Trg Transition To Place</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see jointPackage_Grafcet2PetriNet.impl.TrgTransitionToPlaceImpl
		 * @see jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetPackageImpl#getTrgTransitionToPlace()
		 * @generated
		 */
		EClass TRG_TRANSITION_TO_PLACE = eINSTANCE.getTrgTransitionToPlace();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION_TO_PLACE__FROM = eINSTANCE.getTrgTransitionToPlace_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRG_TRANSITION_TO_PLACE__TO = eINSTANCE.getTrgTransitionToPlace_To();

	}

} //JointPackage_Grafcet2PetriNetPackage
