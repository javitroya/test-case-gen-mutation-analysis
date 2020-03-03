/**
 */
package jointPackage_HSM2FSM.impl;

import java.util.Collection;

import jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage;
import jointPackage_HSM2FSM.SrcAbstractState;
import jointPackage_HSM2FSM.SrcStateMachine;
import jointPackage_HSM2FSM.SrcTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src State Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcStateMachineImpl#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcStateMachineImpl#getTransitions <em>Transitions</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcStateMachineImpl#getStates <em>States</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcStateMachineImpl extends MinimalEObjectImpl.Container implements SrcStateMachine {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTransitions() <em>Transitions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransitions()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcTransition> transitions;

	/**
	 * The cached value of the '{@link #getStates() <em>States</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStates()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcAbstractState> states;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcStateMachineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_HSM2FSMPackage.Literals.SRC_STATE_MACHINE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcTransition> getTransitions() {
		if (transitions == null) {
			transitions = new EObjectContainmentWithInverseEList<SrcTransition>(SrcTransition.class, this, JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS, JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE);
		}
		return transitions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SrcAbstractState> getStates() {
		if (states == null) {
			states = new EObjectContainmentWithInverseEList<SrcAbstractState>(SrcAbstractState.class, this, JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES, JointPackage_HSM2FSMPackage.SRC_ABSTRACT_STATE__STATE_MACHINE);
		}
		return states;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTransitions()).basicAdd(otherEnd, msgs);
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getStates()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS:
				return ((InternalEList<?>)getTransitions()).basicRemove(otherEnd, msgs);
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES:
				return ((InternalEList<?>)getStates()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__NAME:
				return getName();
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS:
				return getTransitions();
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES:
				return getStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__NAME:
				setName((String)newValue);
				return;
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				getTransitions().addAll((Collection<? extends SrcTransition>)newValue);
				return;
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES:
				getStates().clear();
				getStates().addAll((Collection<? extends SrcAbstractState>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS:
				getTransitions().clear();
				return;
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES:
				getStates().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS:
				return transitions != null && !transitions.isEmpty();
			case JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__STATES:
				return states != null && !states.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //SrcStateMachineImpl
