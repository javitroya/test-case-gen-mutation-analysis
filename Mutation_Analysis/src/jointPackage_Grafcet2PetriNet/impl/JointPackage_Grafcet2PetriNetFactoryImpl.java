/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.*;

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
public class JointPackage_Grafcet2PetriNetFactoryImpl extends EFactoryImpl implements JointPackage_Grafcet2PetriNetFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static JointPackage_Grafcet2PetriNetFactory init() {
		try {
			JointPackage_Grafcet2PetriNetFactory theJointPackage_Grafcet2PetriNetFactory = (JointPackage_Grafcet2PetriNetFactory)EPackage.Registry.INSTANCE.getEFactory(JointPackage_Grafcet2PetriNetPackage.eNS_URI);
			if (theJointPackage_Grafcet2PetriNetFactory != null) {
				return theJointPackage_Grafcet2PetriNetFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new JointPackage_Grafcet2PetriNetFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Grafcet2PetriNetFactoryImpl() {
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
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM: return createJointMM();
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET: return createSrcGrafcet();
			case JointPackage_Grafcet2PetriNetPackage.SRC_STEP: return createSrcStep();
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION: return createSrcTransition();
			case JointPackage_Grafcet2PetriNetPackage.SRC_STEP_TO_TRANSITION: return createSrcStepToTransition();
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP: return createSrcTransitionToStep();
			case JointPackage_Grafcet2PetriNetPackage.TRG_PETRI_NET: return createTrgPetriNet();
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE: return createTrgPlace();
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION: return createTrgTransition();
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION: return createTrgPlaceToTransition();
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE: return createTrgTransitionToPlace();
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
	public SrcGrafcet createSrcGrafcet() {
		SrcGrafcetImpl srcGrafcet = new SrcGrafcetImpl();
		return srcGrafcet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcStep createSrcStep() {
		SrcStepImpl srcStep = new SrcStepImpl();
		return srcStep;
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
	public SrcStepToTransition createSrcStepToTransition() {
		SrcStepToTransitionImpl srcStepToTransition = new SrcStepToTransitionImpl();
		return srcStepToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcTransitionToStep createSrcTransitionToStep() {
		SrcTransitionToStepImpl srcTransitionToStep = new SrcTransitionToStepImpl();
		return srcTransitionToStep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPetriNet createTrgPetriNet() {
		TrgPetriNetImpl trgPetriNet = new TrgPetriNetImpl();
		return trgPetriNet;
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
	public TrgPlaceToTransition createTrgPlaceToTransition() {
		TrgPlaceToTransitionImpl trgPlaceToTransition = new TrgPlaceToTransitionImpl();
		return trgPlaceToTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgTransitionToPlace createTrgTransitionToPlace() {
		TrgTransitionToPlaceImpl trgTransitionToPlace = new TrgTransitionToPlaceImpl();
		return trgTransitionToPlace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public JointPackage_Grafcet2PetriNetPackage getJointPackage_Grafcet2PetriNetPackage() {
		return (JointPackage_Grafcet2PetriNetPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static JointPackage_Grafcet2PetriNetPackage getPackage() {
		return JointPackage_Grafcet2PetriNetPackage.eINSTANCE;
	}

} //JointPackage_Grafcet2PetriNetFactoryImpl
