/**
 */
package jointPackage_Grafcet2PetriNet.util;

import jointPackage_Grafcet2PetriNet.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage
 * @generated
 */
public class JointPackage_Grafcet2PetriNetAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_Grafcet2PetriNetPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Grafcet2PetriNetAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_Grafcet2PetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointPackage_Grafcet2PetriNetSwitch<Adapter> modelSwitch =
		new JointPackage_Grafcet2PetriNetSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcLocatedElement(SrcLocatedElement object) {
				return createSrcLocatedElementAdapter();
			}
			@Override
			public Adapter caseSrcNamedElement(SrcNamedElement object) {
				return createSrcNamedElementAdapter();
			}
			@Override
			public Adapter caseSrcGrafcet(SrcGrafcet object) {
				return createSrcGrafcetAdapter();
			}
			@Override
			public Adapter caseSrcElement(SrcElement object) {
				return createSrcElementAdapter();
			}
			@Override
			public Adapter caseSrcStep(SrcStep object) {
				return createSrcStepAdapter();
			}
			@Override
			public Adapter caseSrcTransition(SrcTransition object) {
				return createSrcTransitionAdapter();
			}
			@Override
			public Adapter caseSrcConnection(SrcConnection object) {
				return createSrcConnectionAdapter();
			}
			@Override
			public Adapter caseSrcStepToTransition(SrcStepToTransition object) {
				return createSrcStepToTransitionAdapter();
			}
			@Override
			public Adapter caseSrcTransitionToStep(SrcTransitionToStep object) {
				return createSrcTransitionToStepAdapter();
			}
			@Override
			public Adapter caseTrgLocatedElement(TrgLocatedElement object) {
				return createTrgLocatedElementAdapter();
			}
			@Override
			public Adapter caseTrgNamedElement(TrgNamedElement object) {
				return createTrgNamedElementAdapter();
			}
			@Override
			public Adapter caseTrgPetriNet(TrgPetriNet object) {
				return createTrgPetriNetAdapter();
			}
			@Override
			public Adapter caseTrgElement(TrgElement object) {
				return createTrgElementAdapter();
			}
			@Override
			public Adapter caseTrgPlace(TrgPlace object) {
				return createTrgPlaceAdapter();
			}
			@Override
			public Adapter caseTrgTransition(TrgTransition object) {
				return createTrgTransitionAdapter();
			}
			@Override
			public Adapter caseTrgArc(TrgArc object) {
				return createTrgArcAdapter();
			}
			@Override
			public Adapter caseTrgPlaceToTransition(TrgPlaceToTransition object) {
				return createTrgPlaceToTransitionAdapter();
			}
			@Override
			public Adapter caseTrgTransitionToPlace(TrgTransitionToPlace object) {
				return createTrgTransitionToPlaceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcLocatedElement <em>Src Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcLocatedElement
	 * @generated
	 */
	public Adapter createSrcLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcNamedElement <em>Src Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcNamedElement
	 * @generated
	 */
	public Adapter createSrcNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcGrafcet <em>Src Grafcet</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcGrafcet
	 * @generated
	 */
	public Adapter createSrcGrafcetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcElement <em>Src Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcElement
	 * @generated
	 */
	public Adapter createSrcElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcStep <em>Src Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcStep
	 * @generated
	 */
	public Adapter createSrcStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcTransition <em>Src Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransition
	 * @generated
	 */
	public Adapter createSrcTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcConnection <em>Src Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcConnection
	 * @generated
	 */
	public Adapter createSrcConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcStepToTransition <em>Src Step To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcStepToTransition
	 * @generated
	 */
	public Adapter createSrcStepToTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.SrcTransitionToStep <em>Src Transition To Step</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.SrcTransitionToStep
	 * @generated
	 */
	public Adapter createSrcTransitionToStepAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgLocatedElement <em>Trg Located Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgLocatedElement
	 * @generated
	 */
	public Adapter createTrgLocatedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgNamedElement <em>Trg Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgNamedElement
	 * @generated
	 */
	public Adapter createTrgNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgPetriNet <em>Trg Petri Net</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgPetriNet
	 * @generated
	 */
	public Adapter createTrgPetriNetAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgElement <em>Trg Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgElement
	 * @generated
	 */
	public Adapter createTrgElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgPlace <em>Trg Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlace
	 * @generated
	 */
	public Adapter createTrgPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgTransition <em>Trg Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransition
	 * @generated
	 */
	public Adapter createTrgTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgArc <em>Trg Arc</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgArc
	 * @generated
	 */
	public Adapter createTrgArcAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgPlaceToTransition <em>Trg Place To Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgPlaceToTransition
	 * @generated
	 */
	public Adapter createTrgPlaceToTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_Grafcet2PetriNet.TrgTransitionToPlace <em>Trg Transition To Place</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_Grafcet2PetriNet.TrgTransitionToPlace
	 * @generated
	 */
	public Adapter createTrgTransitionToPlaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //JointPackage_Grafcet2PetriNetAdapterFactory
