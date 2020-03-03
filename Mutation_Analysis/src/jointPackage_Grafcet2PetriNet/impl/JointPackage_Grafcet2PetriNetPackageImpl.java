/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.JointMM;
import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetFactory;
import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.SrcConnection;
import jointPackage_Grafcet2PetriNet.SrcElement;
import jointPackage_Grafcet2PetriNet.SrcGrafcet;
import jointPackage_Grafcet2PetriNet.SrcLocatedElement;
import jointPackage_Grafcet2PetriNet.SrcNamedElement;
import jointPackage_Grafcet2PetriNet.SrcStep;
import jointPackage_Grafcet2PetriNet.SrcStepToTransition;
import jointPackage_Grafcet2PetriNet.SrcTransition;
import jointPackage_Grafcet2PetriNet.SrcTransitionToStep;
import jointPackage_Grafcet2PetriNet.TrgArc;
import jointPackage_Grafcet2PetriNet.TrgElement;
import jointPackage_Grafcet2PetriNet.TrgLocatedElement;
import jointPackage_Grafcet2PetriNet.TrgNamedElement;
import jointPackage_Grafcet2PetriNet.TrgPetriNet;
import jointPackage_Grafcet2PetriNet.TrgPlace;
import jointPackage_Grafcet2PetriNet.TrgPlaceToTransition;
import jointPackage_Grafcet2PetriNet.TrgTransition;
import jointPackage_Grafcet2PetriNet.TrgTransitionToPlace;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_Grafcet2PetriNetPackageImpl extends EPackageImpl implements JointPackage_Grafcet2PetriNetPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass jointMMEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcLocatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcGrafcetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcConnectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcStepToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTransitionToStepEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgLocatedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPetriNetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPlaceToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTransitionToPlaceEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JointPackage_Grafcet2PetriNetPackageImpl() {
		super(eNS_URI, JointPackage_Grafcet2PetriNetFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link JointPackage_Grafcet2PetriNetPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JointPackage_Grafcet2PetriNetPackage init() {
		if (isInited) return (JointPackage_Grafcet2PetriNetPackage)EPackage.Registry.INSTANCE.getEPackage(JointPackage_Grafcet2PetriNetPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJointPackage_Grafcet2PetriNetPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JointPackage_Grafcet2PetriNetPackageImpl theJointPackage_Grafcet2PetriNetPackage = registeredJointPackage_Grafcet2PetriNetPackage instanceof JointPackage_Grafcet2PetriNetPackageImpl ? (JointPackage_Grafcet2PetriNetPackageImpl)registeredJointPackage_Grafcet2PetriNetPackage : new JointPackage_Grafcet2PetriNetPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJointPackage_Grafcet2PetriNetPackage.createPackageContents();

		// Initialize created meta-data
		theJointPackage_Grafcet2PetriNetPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJointPackage_Grafcet2PetriNetPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JointPackage_Grafcet2PetriNetPackage.eNS_URI, theJointPackage_Grafcet2PetriNetPackage);
		return theJointPackage_Grafcet2PetriNetPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getJointMM() {
		return jointMMEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJointMM_SourceRoot() {
		return (EReference)jointMMEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getJointMM_TargetRoot() {
		return (EReference)jointMMEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcLocatedElement() {
		return srcLocatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcLocatedElement_Location() {
		return (EAttribute)srcLocatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcNamedElement() {
		return srcNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcNamedElement_Name() {
		return (EAttribute)srcNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcGrafcet() {
		return srcGrafcetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcGrafcet_Elements() {
		return (EReference)srcGrafcetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcGrafcet_Connections() {
		return (EReference)srcGrafcetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcElement() {
		return srcElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcElement_Grafcet() {
		return (EReference)srcElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcStep() {
		return srcStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcStep_IsInitial() {
		return (EAttribute)srcStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcStep_IsActive() {
		return (EAttribute)srcStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcStep_Action() {
		return (EAttribute)srcStepEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcStep_IncomingConnections() {
		return (EReference)srcStepEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcStep_OutgoingConnections() {
		return (EReference)srcStepEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcTransition() {
		return srcTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcTransition_Condition() {
		return (EAttribute)srcTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransition_IncomingConnections() {
		return (EReference)srcTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransition_OutgoingConnections() {
		return (EReference)srcTransitionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcConnection() {
		return srcConnectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcConnection_Grafcet() {
		return (EReference)srcConnectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcStepToTransition() {
		return srcStepToTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcStepToTransition_From() {
		return (EReference)srcStepToTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcStepToTransition_To() {
		return (EReference)srcStepToTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcTransitionToStep() {
		return srcTransitionToStepEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransitionToStep_From() {
		return (EReference)srcTransitionToStepEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransitionToStep_To() {
		return (EReference)srcTransitionToStepEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgLocatedElement() {
		return trgLocatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrgLocatedElement_Location() {
		return (EAttribute)trgLocatedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgNamedElement() {
		return trgNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrgNamedElement_Name() {
		return (EAttribute)trgNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgPetriNet() {
		return trgPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPetriNet_Elements() {
		return (EReference)trgPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPetriNet_Arcs() {
		return (EReference)trgPetriNetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgElement() {
		return trgElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgElement_Net() {
		return (EReference)trgElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgPlace() {
		return trgPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPlace_IncomingArc() {
		return (EReference)trgPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPlace_OutgoingArc() {
		return (EReference)trgPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgTransition() {
		return trgTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgTransition_IncomingArc() {
		return (EReference)trgTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgTransition_OutgoingArc() {
		return (EReference)trgTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgArc() {
		return trgArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrgArc_Weight() {
		return (EAttribute)trgArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgArc_Net() {
		return (EReference)trgArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgPlaceToTransition() {
		return trgPlaceToTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPlaceToTransition_From() {
		return (EReference)trgPlaceToTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPlaceToTransition_To() {
		return (EReference)trgPlaceToTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgTransitionToPlace() {
		return trgTransitionToPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgTransitionToPlace_From() {
		return (EReference)trgTransitionToPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgTransitionToPlace_To() {
		return (EReference)trgTransitionToPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JointPackage_Grafcet2PetriNetFactory getJointPackage_Grafcet2PetriNetFactory() {
		return (JointPackage_Grafcet2PetriNetFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		jointMMEClass = createEClass(JOINT_MM);
		createEReference(jointMMEClass, JOINT_MM__SOURCE_ROOT);
		createEReference(jointMMEClass, JOINT_MM__TARGET_ROOT);

		srcLocatedElementEClass = createEClass(SRC_LOCATED_ELEMENT);
		createEAttribute(srcLocatedElementEClass, SRC_LOCATED_ELEMENT__LOCATION);

		srcNamedElementEClass = createEClass(SRC_NAMED_ELEMENT);
		createEAttribute(srcNamedElementEClass, SRC_NAMED_ELEMENT__NAME);

		srcGrafcetEClass = createEClass(SRC_GRAFCET);
		createEReference(srcGrafcetEClass, SRC_GRAFCET__ELEMENTS);
		createEReference(srcGrafcetEClass, SRC_GRAFCET__CONNECTIONS);

		srcElementEClass = createEClass(SRC_ELEMENT);
		createEReference(srcElementEClass, SRC_ELEMENT__GRAFCET);

		srcStepEClass = createEClass(SRC_STEP);
		createEAttribute(srcStepEClass, SRC_STEP__IS_INITIAL);
		createEAttribute(srcStepEClass, SRC_STEP__IS_ACTIVE);
		createEAttribute(srcStepEClass, SRC_STEP__ACTION);
		createEReference(srcStepEClass, SRC_STEP__INCOMING_CONNECTIONS);
		createEReference(srcStepEClass, SRC_STEP__OUTGOING_CONNECTIONS);

		srcTransitionEClass = createEClass(SRC_TRANSITION);
		createEAttribute(srcTransitionEClass, SRC_TRANSITION__CONDITION);
		createEReference(srcTransitionEClass, SRC_TRANSITION__INCOMING_CONNECTIONS);
		createEReference(srcTransitionEClass, SRC_TRANSITION__OUTGOING_CONNECTIONS);

		srcConnectionEClass = createEClass(SRC_CONNECTION);
		createEReference(srcConnectionEClass, SRC_CONNECTION__GRAFCET);

		srcStepToTransitionEClass = createEClass(SRC_STEP_TO_TRANSITION);
		createEReference(srcStepToTransitionEClass, SRC_STEP_TO_TRANSITION__FROM);
		createEReference(srcStepToTransitionEClass, SRC_STEP_TO_TRANSITION__TO);

		srcTransitionToStepEClass = createEClass(SRC_TRANSITION_TO_STEP);
		createEReference(srcTransitionToStepEClass, SRC_TRANSITION_TO_STEP__FROM);
		createEReference(srcTransitionToStepEClass, SRC_TRANSITION_TO_STEP__TO);

		trgLocatedElementEClass = createEClass(TRG_LOCATED_ELEMENT);
		createEAttribute(trgLocatedElementEClass, TRG_LOCATED_ELEMENT__LOCATION);

		trgNamedElementEClass = createEClass(TRG_NAMED_ELEMENT);
		createEAttribute(trgNamedElementEClass, TRG_NAMED_ELEMENT__NAME);

		trgPetriNetEClass = createEClass(TRG_PETRI_NET);
		createEReference(trgPetriNetEClass, TRG_PETRI_NET__ELEMENTS);
		createEReference(trgPetriNetEClass, TRG_PETRI_NET__ARCS);

		trgElementEClass = createEClass(TRG_ELEMENT);
		createEReference(trgElementEClass, TRG_ELEMENT__NET);

		trgPlaceEClass = createEClass(TRG_PLACE);
		createEReference(trgPlaceEClass, TRG_PLACE__INCOMING_ARC);
		createEReference(trgPlaceEClass, TRG_PLACE__OUTGOING_ARC);

		trgTransitionEClass = createEClass(TRG_TRANSITION);
		createEReference(trgTransitionEClass, TRG_TRANSITION__INCOMING_ARC);
		createEReference(trgTransitionEClass, TRG_TRANSITION__OUTGOING_ARC);

		trgArcEClass = createEClass(TRG_ARC);
		createEAttribute(trgArcEClass, TRG_ARC__WEIGHT);
		createEReference(trgArcEClass, TRG_ARC__NET);

		trgPlaceToTransitionEClass = createEClass(TRG_PLACE_TO_TRANSITION);
		createEReference(trgPlaceToTransitionEClass, TRG_PLACE_TO_TRANSITION__FROM);
		createEReference(trgPlaceToTransitionEClass, TRG_PLACE_TO_TRANSITION__TO);

		trgTransitionToPlaceEClass = createEClass(TRG_TRANSITION_TO_PLACE);
		createEReference(trgTransitionToPlaceEClass, TRG_TRANSITION_TO_PLACE__FROM);
		createEReference(trgTransitionToPlaceEClass, TRG_TRANSITION_TO_PLACE__TO);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		srcNamedElementEClass.getESuperTypes().add(this.getSrcLocatedElement());
		srcGrafcetEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcElementEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcStepEClass.getESuperTypes().add(this.getSrcElement());
		srcTransitionEClass.getESuperTypes().add(this.getSrcElement());
		srcConnectionEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcStepToTransitionEClass.getESuperTypes().add(this.getSrcConnection());
		srcTransitionToStepEClass.getESuperTypes().add(this.getSrcConnection());
		trgNamedElementEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgPetriNetEClass.getESuperTypes().add(this.getTrgNamedElement());
		trgElementEClass.getESuperTypes().add(this.getTrgNamedElement());
		trgPlaceEClass.getESuperTypes().add(this.getTrgElement());
		trgTransitionEClass.getESuperTypes().add(this.getTrgElement());
		trgArcEClass.getESuperTypes().add(this.getTrgNamedElement());
		trgPlaceToTransitionEClass.getESuperTypes().add(this.getTrgArc());
		trgTransitionToPlaceEClass.getESuperTypes().add(this.getTrgArc());

		// Initialize classes, features, and operations; add parameters
		initEClass(jointMMEClass, JointMM.class, "JointMM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJointMM_SourceRoot(), this.getSrcGrafcet(), null, "sourceRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointMM_TargetRoot(), this.getTrgPetriNet(), null, "targetRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcLocatedElementEClass, SrcLocatedElement.class, "SrcLocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcLocatedElement_Location(), ecorePackage.getEString(), "location", null, 1, 1, SrcLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcNamedElementEClass, SrcNamedElement.class, "SrcNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, SrcNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcGrafcetEClass, SrcGrafcet.class, "SrcGrafcet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcGrafcet_Elements(), this.getSrcElement(), this.getSrcElement_Grafcet(), "elements", null, 0, -1, SrcGrafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcGrafcet_Connections(), this.getSrcConnection(), this.getSrcConnection_Grafcet(), "connections", null, 0, -1, SrcGrafcet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcElementEClass, SrcElement.class, "SrcElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcElement_Grafcet(), this.getSrcGrafcet(), this.getSrcGrafcet_Elements(), "grafcet", null, 1, 1, SrcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcStepEClass, SrcStep.class, "SrcStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcStep_IsInitial(), ecorePackage.getEBoolean(), "isInitial", null, 1, 1, SrcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcStep_IsActive(), ecorePackage.getEBoolean(), "isActive", null, 1, 1, SrcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getSrcStep_Action(), ecorePackage.getEString(), "action", null, 1, 1, SrcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcStep_IncomingConnections(), this.getSrcTransitionToStep(), this.getSrcTransitionToStep_To(), "incomingConnections", null, 0, -1, SrcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcStep_OutgoingConnections(), this.getSrcStepToTransition(), this.getSrcStepToTransition_From(), "outgoingConnections", null, 0, -1, SrcStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcTransitionEClass, SrcTransition.class, "SrcTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcTransition_Condition(), ecorePackage.getEString(), "condition", null, 1, 1, SrcTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcTransition_IncomingConnections(), this.getSrcStepToTransition(), this.getSrcStepToTransition_To(), "incomingConnections", null, 0, -1, SrcTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcTransition_OutgoingConnections(), this.getSrcTransitionToStep(), this.getSrcTransitionToStep_From(), "outgoingConnections", null, 0, -1, SrcTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcConnectionEClass, SrcConnection.class, "SrcConnection", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcConnection_Grafcet(), this.getSrcGrafcet(), this.getSrcGrafcet_Connections(), "grafcet", null, 1, 1, SrcConnection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcStepToTransitionEClass, SrcStepToTransition.class, "SrcStepToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcStepToTransition_From(), this.getSrcStep(), this.getSrcStep_OutgoingConnections(), "from", null, 1, 1, SrcStepToTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcStepToTransition_To(), this.getSrcTransition(), this.getSrcTransition_IncomingConnections(), "to", null, 1, 1, SrcStepToTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcTransitionToStepEClass, SrcTransitionToStep.class, "SrcTransitionToStep", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcTransitionToStep_From(), this.getSrcTransition(), this.getSrcTransition_OutgoingConnections(), "from", null, 1, 1, SrcTransitionToStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcTransitionToStep_To(), this.getSrcStep(), this.getSrcStep_IncomingConnections(), "to", null, 1, 1, SrcTransitionToStep.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLocatedElementEClass, TrgLocatedElement.class, "TrgLocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgLocatedElement_Location(), ecorePackage.getEString(), "location", null, 1, 1, TrgLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgNamedElementEClass, TrgNamedElement.class, "TrgNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, TrgNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgPetriNetEClass, TrgPetriNet.class, "TrgPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgPetriNet_Elements(), this.getTrgElement(), this.getTrgElement_Net(), "elements", null, 0, -1, TrgPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPetriNet_Arcs(), this.getTrgArc(), this.getTrgArc_Net(), "arcs", null, 0, -1, TrgPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgElementEClass, TrgElement.class, "TrgElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgElement_Net(), this.getTrgPetriNet(), this.getTrgPetriNet_Elements(), "net", null, 1, 1, TrgElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgPlaceEClass, TrgPlace.class, "TrgPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgPlace_IncomingArc(), this.getTrgTransitionToPlace(), this.getTrgTransitionToPlace_To(), "incomingArc", null, 0, -1, TrgPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPlace_OutgoingArc(), this.getTrgPlaceToTransition(), this.getTrgPlaceToTransition_From(), "outgoingArc", null, 0, -1, TrgPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgTransitionEClass, TrgTransition.class, "TrgTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgTransition_IncomingArc(), this.getTrgPlaceToTransition(), this.getTrgPlaceToTransition_To(), "incomingArc", null, 1, -1, TrgTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgTransition_OutgoingArc(), this.getTrgTransitionToPlace(), this.getTrgTransitionToPlace_From(), "outgoingArc", null, 1, -1, TrgTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgArcEClass, TrgArc.class, "TrgArc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgArc_Weight(), ecorePackage.getEInt(), "weight", null, 1, 1, TrgArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgArc_Net(), this.getTrgPetriNet(), this.getTrgPetriNet_Arcs(), "net", null, 1, 1, TrgArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgPlaceToTransitionEClass, TrgPlaceToTransition.class, "TrgPlaceToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgPlaceToTransition_From(), this.getTrgPlace(), this.getTrgPlace_OutgoingArc(), "from", null, 1, 1, TrgPlaceToTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPlaceToTransition_To(), this.getTrgTransition(), this.getTrgTransition_IncomingArc(), "to", null, 1, 1, TrgPlaceToTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgTransitionToPlaceEClass, TrgTransitionToPlace.class, "TrgTransitionToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgTransitionToPlace_From(), this.getTrgTransition(), this.getTrgTransition_OutgoingArc(), "from", null, 1, 1, TrgTransitionToPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgTransitionToPlace_To(), this.getTrgPlace(), this.getTrgPlace_IncomingArc(), "to", null, 1, 1, TrgTransitionToPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //JointPackage_Grafcet2PetriNetPackageImpl
