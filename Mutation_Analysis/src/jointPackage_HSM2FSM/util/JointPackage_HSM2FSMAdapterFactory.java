/**
 */
package jointPackage_HSM2FSM.util;

import jointPackage_HSM2FSM.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage
 * @generated
 */
public class JointPackage_HSM2FSMAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_HSM2FSMPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_HSM2FSMAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = JointPackage_HSM2FSMPackage.eINSTANCE;
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
	protected JointPackage_HSM2FSMSwitch<Adapter> modelSwitch =
		new JointPackage_HSM2FSMSwitch<Adapter>() {
			@Override
			public Adapter caseJointMM(JointMM object) {
				return createJointMMAdapter();
			}
			@Override
			public Adapter caseSrcRoot(SrcRoot object) {
				return createSrcRootAdapter();
			}
			@Override
			public Adapter caseSrcStateMachine(SrcStateMachine object) {
				return createSrcStateMachineAdapter();
			}
			@Override
			public Adapter caseSrcTransition(SrcTransition object) {
				return createSrcTransitionAdapter();
			}
			@Override
			public Adapter caseSrcAbstractState(SrcAbstractState object) {
				return createSrcAbstractStateAdapter();
			}
			@Override
			public Adapter caseSrcInitialState(SrcInitialState object) {
				return createSrcInitialStateAdapter();
			}
			@Override
			public Adapter caseSrcRegularState(SrcRegularState object) {
				return createSrcRegularStateAdapter();
			}
			@Override
			public Adapter caseSrcCompositeState(SrcCompositeState object) {
				return createSrcCompositeStateAdapter();
			}
			@Override
			public Adapter caseTrgRoot(TrgRoot object) {
				return createTrgRootAdapter();
			}
			@Override
			public Adapter caseTrgStateMachine(TrgStateMachine object) {
				return createTrgStateMachineAdapter();
			}
			@Override
			public Adapter caseTrgTransition(TrgTransition object) {
				return createTrgTransitionAdapter();
			}
			@Override
			public Adapter caseTrgAbstractState(TrgAbstractState object) {
				return createTrgAbstractStateAdapter();
			}
			@Override
			public Adapter caseTrgInitialState(TrgInitialState object) {
				return createTrgInitialStateAdapter();
			}
			@Override
			public Adapter caseTrgRegularState(TrgRegularState object) {
				return createTrgRegularStateAdapter();
			}
			@Override
			public Adapter caseTrgCompositeState(TrgCompositeState object) {
				return createTrgCompositeStateAdapter();
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
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.JointMM <em>Joint MM</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.JointMM
	 * @generated
	 */
	public Adapter createJointMMAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcRoot <em>Src Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcRoot
	 * @generated
	 */
	public Adapter createSrcRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcStateMachine <em>Src State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcStateMachine
	 * @generated
	 */
	public Adapter createSrcStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcTransition <em>Src Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcTransition
	 * @generated
	 */
	public Adapter createSrcTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcAbstractState <em>Src Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcAbstractState
	 * @generated
	 */
	public Adapter createSrcAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcInitialState <em>Src Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcInitialState
	 * @generated
	 */
	public Adapter createSrcInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcRegularState <em>Src Regular State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcRegularState
	 * @generated
	 */
	public Adapter createSrcRegularStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.SrcCompositeState <em>Src Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.SrcCompositeState
	 * @generated
	 */
	public Adapter createSrcCompositeStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgRoot <em>Trg Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgRoot
	 * @generated
	 */
	public Adapter createTrgRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgStateMachine <em>Trg State Machine</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgStateMachine
	 * @generated
	 */
	public Adapter createTrgStateMachineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgTransition <em>Trg Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgTransition
	 * @generated
	 */
	public Adapter createTrgTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgAbstractState <em>Trg Abstract State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgAbstractState
	 * @generated
	 */
	public Adapter createTrgAbstractStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgInitialState <em>Trg Initial State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgInitialState
	 * @generated
	 */
	public Adapter createTrgInitialStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgRegularState <em>Trg Regular State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgRegularState
	 * @generated
	 */
	public Adapter createTrgRegularStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link jointPackage_HSM2FSM.TrgCompositeState <em>Trg Composite State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see jointPackage_HSM2FSM.TrgCompositeState
	 * @generated
	 */
	public Adapter createTrgCompositeStateAdapter() {
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

} //JointPackage_HSM2FSMAdapterFactory
