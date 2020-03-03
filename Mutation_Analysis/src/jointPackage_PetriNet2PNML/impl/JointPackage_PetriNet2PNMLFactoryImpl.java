/**
 */
package jointPackage_PetriNet2PNML.impl;

import jointPackage_PetriNet2PNML.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class JointPackage_PetriNet2PNMLFactoryImpl extends EFactoryImpl implements JointPackage_PetriNet2PNMLFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointPackage_PetriNet2PNMLFactory init() {
		try {
			JointPackage_PetriNet2PNMLFactory theJointPackage_PetriNet2PNMLFactory = (JointPackage_PetriNet2PNMLFactory)EPackage.Registry.INSTANCE.getEFactory(JointPackage_PetriNet2PNMLPackage.eNS_URI);
			if (theJointPackage_PetriNet2PNMLFactory != null) {
				return theJointPackage_PetriNet2PNMLFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JointPackage_PetriNet2PNMLFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_PetriNet2PNMLFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM: return createJointMM();
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET: return createSrcPetriNet();
			case JointPackage_PetriNet2PNMLPackage.SRC_PLACE: return createSrcPlace();
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION: return createSrcTransition();
			case JointPackage_PetriNet2PNMLPackage.SRC_PLACE_TO_TRANSITION: return createSrcPlaceToTransition();
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION_TO_PLACE: return createSrcTransitionToPlace();
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT: return createTrgPNMLDocument();
			case JointPackage_PetriNet2PNMLPackage.TRG_URI: return createTrgURI();
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT: return createTrgNetElement();
			case JointPackage_PetriNet2PNMLPackage.TRG_LABEL: return createTrgLabel();
			case JointPackage_PetriNet2PNMLPackage.TRG_NAME: return createTrgName();
			case JointPackage_PetriNet2PNMLPackage.TRG_ARC: return createTrgArc();
			case JointPackage_PetriNet2PNMLPackage.TRG_PLACE: return createTrgPlace();
			case JointPackage_PetriNet2PNMLPackage.TRG_TRANSITION: return createTrgTransition();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JointMM createJointMM() {
		JointMMImpl jointMM = new JointMMImpl();
		return jointMM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcPetriNet createSrcPetriNet() {
		SrcPetriNetImpl srcPetriNet = new SrcPetriNetImpl();
		return srcPetriNet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcPlace createSrcPlace() {
		SrcPlaceImpl srcPlace = new SrcPlaceImpl();
		return srcPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcTransition createSrcTransition() {
		SrcTransitionImpl srcTransition = new SrcTransitionImpl();
		return srcTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcPlaceToTransition createSrcPlaceToTransition() {
		SrcPlaceToTransitionImpl srcPlaceToTransition = new SrcPlaceToTransitionImpl();
		return srcPlaceToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcTransitionToPlace createSrcTransitionToPlace() {
		SrcTransitionToPlaceImpl srcTransitionToPlace = new SrcTransitionToPlaceImpl();
		return srcTransitionToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPNMLDocument createTrgPNMLDocument() {
		TrgPNMLDocumentImpl trgPNMLDocument = new TrgPNMLDocumentImpl();
		return trgPNMLDocument;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgURI createTrgURI() {
		TrgURIImpl trgURI = new TrgURIImpl();
		return trgURI;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgNetElement createTrgNetElement() {
		TrgNetElementImpl trgNetElement = new TrgNetElementImpl();
		return trgNetElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgLabel createTrgLabel() {
		TrgLabelImpl trgLabel = new TrgLabelImpl();
		return trgLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgName createTrgName() {
		TrgNameImpl trgName = new TrgNameImpl();
		return trgName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgArc createTrgArc() {
		TrgArcImpl trgArc = new TrgArcImpl();
		return trgArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPlace createTrgPlace() {
		TrgPlaceImpl trgPlace = new TrgPlaceImpl();
		return trgPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgTransition createTrgTransition() {
		TrgTransitionImpl trgTransition = new TrgTransitionImpl();
		return trgTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JointPackage_PetriNet2PNMLPackage getJointPackage_PetriNet2PNMLPackage() {
		return (JointPackage_PetriNet2PNMLPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JointPackage_PetriNet2PNMLPackage getPackage() {
		return JointPackage_PetriNet2PNMLPackage.eINSTANCE;
	}

} //JointPackage_PetriNet2PNMLFactoryImpl
