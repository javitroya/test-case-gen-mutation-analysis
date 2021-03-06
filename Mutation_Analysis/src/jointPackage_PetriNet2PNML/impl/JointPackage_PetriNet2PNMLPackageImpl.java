/**
 */
package jointPackage_PetriNet2PNML.impl;

import jointPackage_PetriNet2PNML.JointMM;
import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLFactory;
import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;
import jointPackage_PetriNet2PNML.SrcArc;
import jointPackage_PetriNet2PNML.SrcElement;
import jointPackage_PetriNet2PNML.SrcLocatedElement;
import jointPackage_PetriNet2PNML.SrcNamedElement;
import jointPackage_PetriNet2PNML.SrcPetriNet;
import jointPackage_PetriNet2PNML.SrcPlace;
import jointPackage_PetriNet2PNML.SrcPlaceToTransition;
import jointPackage_PetriNet2PNML.SrcTransition;
import jointPackage_PetriNet2PNML.SrcTransitionToPlace;
import jointPackage_PetriNet2PNML.TrgArc;
import jointPackage_PetriNet2PNML.TrgIdedElement;
import jointPackage_PetriNet2PNML.TrgLabel;
import jointPackage_PetriNet2PNML.TrgLabeledElement;
import jointPackage_PetriNet2PNML.TrgLocatedElement;
import jointPackage_PetriNet2PNML.TrgName;
import jointPackage_PetriNet2PNML.TrgNetContent;
import jointPackage_PetriNet2PNML.TrgNetContentElement;
import jointPackage_PetriNet2PNML.TrgNetElement;
import jointPackage_PetriNet2PNML.TrgPNMLDocument;
import jointPackage_PetriNet2PNML.TrgPlace;
import jointPackage_PetriNet2PNML.TrgTransition;
import jointPackage_PetriNet2PNML.TrgURI;

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
public class JointPackage_PetriNet2PNMLPackageImpl extends EPackageImpl implements JointPackage_PetriNet2PNMLPackage {
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
	private EClass srcPetriNetEClass = null;

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
	private EClass srcPlaceEClass = null;

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
	private EClass srcArcEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcPlaceToTransitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass srcTransitionToPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgPNMLDocumentEClass = null;

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
	private EClass trgIdedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgURIEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgNetElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgNetContentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgLabeledElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgLabelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgNameEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgNetContentElementEClass = null;

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
	private EClass trgPlaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass trgTransitionEClass = null;

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
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private JointPackage_PetriNet2PNMLPackageImpl() {
		super(eNS_URI, JointPackage_PetriNet2PNMLFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link JointPackage_PetriNet2PNMLPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static JointPackage_PetriNet2PNMLPackage init() {
		if (isInited) return (JointPackage_PetriNet2PNMLPackage)EPackage.Registry.INSTANCE.getEPackage(JointPackage_PetriNet2PNMLPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredJointPackage_PetriNet2PNMLPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		JointPackage_PetriNet2PNMLPackageImpl theJointPackage_PetriNet2PNMLPackage = registeredJointPackage_PetriNet2PNMLPackage instanceof JointPackage_PetriNet2PNMLPackageImpl ? (JointPackage_PetriNet2PNMLPackageImpl)registeredJointPackage_PetriNet2PNMLPackage : new JointPackage_PetriNet2PNMLPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theJointPackage_PetriNet2PNMLPackage.createPackageContents();

		// Initialize created meta-data
		theJointPackage_PetriNet2PNMLPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theJointPackage_PetriNet2PNMLPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(JointPackage_PetriNet2PNMLPackage.eNS_URI, theJointPackage_PetriNet2PNMLPackage);
		return theJointPackage_PetriNet2PNMLPackage;
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
	public EClass getSrcPetriNet() {
		return srcPetriNetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcPetriNet_Elements() {
		return (EReference)srcPetriNetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcPetriNet_Arcs() {
		return (EReference)srcPetriNetEClass.getEStructuralFeatures().get(1);
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
	public EReference getSrcElement_Net() {
		return (EReference)srcElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcPlace() {
		return srcPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcPlace_IncomingArc() {
		return (EReference)srcPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcPlace_OutgoingArc() {
		return (EReference)srcPlaceEClass.getEStructuralFeatures().get(1);
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
	public EReference getSrcTransition_IncomingArc() {
		return (EReference)srcTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransition_OutgoingArc() {
		return (EReference)srcTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcArc() {
		return srcArcEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSrcArc_Weight() {
		return (EAttribute)srcArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcArc_Net() {
		return (EReference)srcArcEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcPlaceToTransition() {
		return srcPlaceToTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcPlaceToTransition_From() {
		return (EReference)srcPlaceToTransitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcPlaceToTransition_To() {
		return (EReference)srcPlaceToTransitionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSrcTransitionToPlace() {
		return srcTransitionToPlaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransitionToPlace_From() {
		return (EReference)srcTransitionToPlaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSrcTransitionToPlace_To() {
		return (EReference)srcTransitionToPlaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgPNMLDocument() {
		return trgPNMLDocumentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPNMLDocument_Xmlns() {
		return (EReference)trgPNMLDocumentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgPNMLDocument_Nets() {
		return (EReference)trgPNMLDocumentEClass.getEStructuralFeatures().get(1);
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
	public EClass getTrgIdedElement() {
		return trgIdedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrgIdedElement_Id() {
		return (EAttribute)trgIdedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgURI() {
		return trgURIEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrgURI_Value() {
		return (EAttribute)trgURIEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgNetElement() {
		return trgNetElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgNetElement_Type() {
		return (EReference)trgNetElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgNetElement_Contents() {
		return (EReference)trgNetElementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgNetElement_Name() {
		return (EReference)trgNetElementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgNetContent() {
		return trgNetContentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgNetContent_Name() {
		return (EReference)trgNetContentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgLabeledElement() {
		return trgLabeledElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgLabeledElement_Labels() {
		return (EReference)trgLabeledElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgLabel() {
		return trgLabelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTrgLabel_Text() {
		return (EAttribute)trgLabelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgName() {
		return trgNameEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTrgNetContentElement() {
		return trgNetContentElementEClass;
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
	public EReference getTrgArc_Source() {
		return (EReference)trgArcEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTrgArc_Target() {
		return (EReference)trgArcEClass.getEStructuralFeatures().get(1);
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
	public EClass getTrgTransition() {
		return trgTransitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JointPackage_PetriNet2PNMLFactory getJointPackage_PetriNet2PNMLFactory() {
		return (JointPackage_PetriNet2PNMLFactory)getEFactoryInstance();
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

		srcPetriNetEClass = createEClass(SRC_PETRI_NET);
		createEReference(srcPetriNetEClass, SRC_PETRI_NET__ELEMENTS);
		createEReference(srcPetriNetEClass, SRC_PETRI_NET__ARCS);

		srcElementEClass = createEClass(SRC_ELEMENT);
		createEReference(srcElementEClass, SRC_ELEMENT__NET);

		srcPlaceEClass = createEClass(SRC_PLACE);
		createEReference(srcPlaceEClass, SRC_PLACE__INCOMING_ARC);
		createEReference(srcPlaceEClass, SRC_PLACE__OUTGOING_ARC);

		srcTransitionEClass = createEClass(SRC_TRANSITION);
		createEReference(srcTransitionEClass, SRC_TRANSITION__INCOMING_ARC);
		createEReference(srcTransitionEClass, SRC_TRANSITION__OUTGOING_ARC);

		srcArcEClass = createEClass(SRC_ARC);
		createEAttribute(srcArcEClass, SRC_ARC__WEIGHT);
		createEReference(srcArcEClass, SRC_ARC__NET);

		srcPlaceToTransitionEClass = createEClass(SRC_PLACE_TO_TRANSITION);
		createEReference(srcPlaceToTransitionEClass, SRC_PLACE_TO_TRANSITION__FROM);
		createEReference(srcPlaceToTransitionEClass, SRC_PLACE_TO_TRANSITION__TO);

		srcTransitionToPlaceEClass = createEClass(SRC_TRANSITION_TO_PLACE);
		createEReference(srcTransitionToPlaceEClass, SRC_TRANSITION_TO_PLACE__FROM);
		createEReference(srcTransitionToPlaceEClass, SRC_TRANSITION_TO_PLACE__TO);

		trgPNMLDocumentEClass = createEClass(TRG_PNML_DOCUMENT);
		createEReference(trgPNMLDocumentEClass, TRG_PNML_DOCUMENT__XMLNS);
		createEReference(trgPNMLDocumentEClass, TRG_PNML_DOCUMENT__NETS);

		trgLocatedElementEClass = createEClass(TRG_LOCATED_ELEMENT);
		createEAttribute(trgLocatedElementEClass, TRG_LOCATED_ELEMENT__LOCATION);

		trgIdedElementEClass = createEClass(TRG_IDED_ELEMENT);
		createEAttribute(trgIdedElementEClass, TRG_IDED_ELEMENT__ID);

		trgURIEClass = createEClass(TRG_URI);
		createEAttribute(trgURIEClass, TRG_URI__VALUE);

		trgNetElementEClass = createEClass(TRG_NET_ELEMENT);
		createEReference(trgNetElementEClass, TRG_NET_ELEMENT__TYPE);
		createEReference(trgNetElementEClass, TRG_NET_ELEMENT__CONTENTS);
		createEReference(trgNetElementEClass, TRG_NET_ELEMENT__NAME);

		trgNetContentEClass = createEClass(TRG_NET_CONTENT);
		createEReference(trgNetContentEClass, TRG_NET_CONTENT__NAME);

		trgLabeledElementEClass = createEClass(TRG_LABELED_ELEMENT);
		createEReference(trgLabeledElementEClass, TRG_LABELED_ELEMENT__LABELS);

		trgLabelEClass = createEClass(TRG_LABEL);
		createEAttribute(trgLabelEClass, TRG_LABEL__TEXT);

		trgNameEClass = createEClass(TRG_NAME);

		trgNetContentElementEClass = createEClass(TRG_NET_CONTENT_ELEMENT);

		trgArcEClass = createEClass(TRG_ARC);
		createEReference(trgArcEClass, TRG_ARC__SOURCE);
		createEReference(trgArcEClass, TRG_ARC__TARGET);

		trgPlaceEClass = createEClass(TRG_PLACE);

		trgTransitionEClass = createEClass(TRG_TRANSITION);
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
		srcPetriNetEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcElementEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcPlaceEClass.getESuperTypes().add(this.getSrcElement());
		srcTransitionEClass.getESuperTypes().add(this.getSrcElement());
		srcArcEClass.getESuperTypes().add(this.getSrcNamedElement());
		srcPlaceToTransitionEClass.getESuperTypes().add(this.getSrcArc());
		srcTransitionToPlaceEClass.getESuperTypes().add(this.getSrcArc());
		trgPNMLDocumentEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgIdedElementEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgURIEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgNetElementEClass.getESuperTypes().add(this.getTrgIdedElement());
		trgNetContentEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgLabeledElementEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgLabelEClass.getESuperTypes().add(this.getTrgLocatedElement());
		trgNameEClass.getESuperTypes().add(this.getTrgLabeledElement());
		trgNetContentElementEClass.getESuperTypes().add(this.getTrgNetContent());
		trgNetContentElementEClass.getESuperTypes().add(this.getTrgIdedElement());
		trgArcEClass.getESuperTypes().add(this.getTrgNetContent());
		trgArcEClass.getESuperTypes().add(this.getTrgIdedElement());
		trgPlaceEClass.getESuperTypes().add(this.getTrgNetContentElement());
		trgTransitionEClass.getESuperTypes().add(this.getTrgNetContentElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(jointMMEClass, JointMM.class, "JointMM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getJointMM_SourceRoot(), this.getSrcPetriNet(), null, "sourceRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getJointMM_TargetRoot(), this.getTrgPNMLDocument(), null, "targetRoot", null, 1, 1, JointMM.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(srcLocatedElementEClass, SrcLocatedElement.class, "SrcLocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcLocatedElement_Location(), ecorePackage.getEString(), "location", null, 1, 1, SrcLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcNamedElementEClass, SrcNamedElement.class, "SrcNamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcNamedElement_Name(), ecorePackage.getEString(), "name", null, 1, 1, SrcNamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcPetriNetEClass, SrcPetriNet.class, "SrcPetriNet", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcPetriNet_Elements(), this.getSrcElement(), this.getSrcElement_Net(), "elements", null, 0, -1, SrcPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcPetriNet_Arcs(), this.getSrcArc(), this.getSrcArc_Net(), "arcs", null, 0, -1, SrcPetriNet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcElementEClass, SrcElement.class, "SrcElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcElement_Net(), this.getSrcPetriNet(), this.getSrcPetriNet_Elements(), "net", null, 1, 1, SrcElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcPlaceEClass, SrcPlace.class, "SrcPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcPlace_IncomingArc(), this.getSrcTransitionToPlace(), this.getSrcTransitionToPlace_To(), "incomingArc", null, 0, -1, SrcPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcPlace_OutgoingArc(), this.getSrcPlaceToTransition(), this.getSrcPlaceToTransition_From(), "outgoingArc", null, 0, -1, SrcPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcTransitionEClass, SrcTransition.class, "SrcTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcTransition_IncomingArc(), this.getSrcPlaceToTransition(), this.getSrcPlaceToTransition_To(), "incomingArc", null, 1, -1, SrcTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcTransition_OutgoingArc(), this.getSrcTransitionToPlace(), this.getSrcTransitionToPlace_From(), "outgoingArc", null, 1, -1, SrcTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcArcEClass, SrcArc.class, "SrcArc", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSrcArc_Weight(), ecorePackage.getEInt(), "weight", null, 1, 1, SrcArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcArc_Net(), this.getSrcPetriNet(), this.getSrcPetriNet_Arcs(), "net", null, 1, 1, SrcArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcPlaceToTransitionEClass, SrcPlaceToTransition.class, "SrcPlaceToTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcPlaceToTransition_From(), this.getSrcPlace(), this.getSrcPlace_OutgoingArc(), "from", null, 1, 1, SrcPlaceToTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcPlaceToTransition_To(), this.getSrcTransition(), this.getSrcTransition_IncomingArc(), "to", null, 1, 1, SrcPlaceToTransition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(srcTransitionToPlaceEClass, SrcTransitionToPlace.class, "SrcTransitionToPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSrcTransitionToPlace_From(), this.getSrcTransition(), this.getSrcTransition_OutgoingArc(), "from", null, 1, 1, SrcTransitionToPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getSrcTransitionToPlace_To(), this.getSrcPlace(), this.getSrcPlace_IncomingArc(), "to", null, 1, 1, SrcTransitionToPlace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgPNMLDocumentEClass, TrgPNMLDocument.class, "TrgPNMLDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgPNMLDocument_Xmlns(), this.getTrgURI(), null, "xmlns", null, 1, 1, TrgPNMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgPNMLDocument_Nets(), this.getTrgNetElement(), null, "nets", null, 1, -1, TrgPNMLDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLocatedElementEClass, TrgLocatedElement.class, "TrgLocatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgLocatedElement_Location(), ecorePackage.getEString(), "location", null, 1, 1, TrgLocatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgIdedElementEClass, TrgIdedElement.class, "TrgIdedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgIdedElement_Id(), ecorePackage.getEString(), "id", null, 1, 1, TrgIdedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgURIEClass, TrgURI.class, "TrgURI", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgURI_Value(), ecorePackage.getEString(), "value", null, 1, 1, TrgURI.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgNetElementEClass, TrgNetElement.class, "TrgNetElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgNetElement_Type(), this.getTrgURI(), null, "type", null, 1, 1, TrgNetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgNetElement_Contents(), this.getTrgNetContent(), null, "contents", null, 0, -1, TrgNetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgNetElement_Name(), this.getTrgName(), null, "name", null, 0, 1, TrgNetElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgNetContentEClass, TrgNetContent.class, "TrgNetContent", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgNetContent_Name(), this.getTrgName(), null, "name", null, 0, 1, TrgNetContent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLabeledElementEClass, TrgLabeledElement.class, "TrgLabeledElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgLabeledElement_Labels(), this.getTrgLabel(), null, "labels", null, 0, -1, TrgLabeledElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgLabelEClass, TrgLabel.class, "TrgLabel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTrgLabel_Text(), ecorePackage.getEString(), "text", null, 1, 1, TrgLabel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgNameEClass, TrgName.class, "TrgName", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgNetContentElementEClass, TrgNetContentElement.class, "TrgNetContentElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgArcEClass, TrgArc.class, "TrgArc", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTrgArc_Source(), this.getTrgNetContentElement(), null, "source", null, 1, 1, TrgArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTrgArc_Target(), this.getTrgNetContentElement(), null, "target", null, 1, 1, TrgArc.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(trgPlaceEClass, TrgPlace.class, "TrgPlace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(trgTransitionEClass, TrgTransition.class, "TrgTransition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //JointPackage_PetriNet2PNMLPackageImpl
