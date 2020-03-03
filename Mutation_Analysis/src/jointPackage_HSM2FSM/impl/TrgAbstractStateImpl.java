/**
 */
package jointPackage_HSM2FSM.impl;

import jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage;
import jointPackage_HSM2FSM.TrgAbstractState;
import jointPackage_HSM2FSM.TrgCompositeState;
import jointPackage_HSM2FSM.TrgStateMachine;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Abstract State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.impl.TrgAbstractStateImpl#getName <em>Name</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.TrgAbstractStateImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.TrgAbstractStateImpl#getCompositeStates <em>Composite States</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TrgAbstractStateImpl extends MinimalEObjectImpl.Container implements TrgAbstractState {
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
	 * The cached value of the '{@link #getCompositeStates() <em>Composite States</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompositeStates()
	 * @generated
	 * @ordered
	 */
	protected TrgCompositeState compositeStates;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgAbstractStateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_HSM2FSMPackage.Literals.TRG_ABSTRACT_STATE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgStateMachine getStateMachine() {
		if (eContainerFeatureID() != JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE) return null;
		return (TrgStateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(TrgStateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(TrgStateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, JointPackage_HSM2FSMPackage.TRG_STATE_MACHINE__STATES, TrgStateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgCompositeState getCompositeStates() {
		if (compositeStates != null && compositeStates.eIsProxy()) {
			InternalEObject oldCompositeStates = (InternalEObject)compositeStates;
			compositeStates = (TrgCompositeState)eResolveProxy(oldCompositeStates);
			if (compositeStates != oldCompositeStates) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES, oldCompositeStates, compositeStates));
			}
		}
		return compositeStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgCompositeState basicGetCompositeStates() {
		return compositeStates;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompositeStates(TrgCompositeState newCompositeStates, NotificationChain msgs) {
		TrgCompositeState oldCompositeStates = compositeStates;
		compositeStates = newCompositeStates;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES, oldCompositeStates, newCompositeStates);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompositeStates(TrgCompositeState newCompositeStates) {
		if (newCompositeStates != compositeStates) {
			NotificationChain msgs = null;
			if (compositeStates != null)
				msgs = ((InternalEObject)compositeStates).eInverseRemove(this, JointPackage_HSM2FSMPackage.TRG_COMPOSITE_STATE__STATES, TrgCompositeState.class, msgs);
			if (newCompositeStates != null)
				msgs = ((InternalEObject)newCompositeStates).eInverseAdd(this, JointPackage_HSM2FSMPackage.TRG_COMPOSITE_STATE__STATES, TrgCompositeState.class, msgs);
			msgs = basicSetCompositeStates(newCompositeStates, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES, newCompositeStates, newCompositeStates));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((TrgStateMachine)otherEnd, msgs);
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES:
				if (compositeStates != null)
					msgs = ((InternalEObject)compositeStates).eInverseRemove(this, JointPackage_HSM2FSMPackage.TRG_COMPOSITE_STATE__STATES, TrgCompositeState.class, msgs);
				return basicSetCompositeStates((TrgCompositeState)otherEnd, msgs);
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
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES:
				return basicSetCompositeStates(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, JointPackage_HSM2FSMPackage.TRG_STATE_MACHINE__STATES, TrgStateMachine.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__NAME:
				return getName();
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				return getStateMachine();
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES:
				if (resolve) return getCompositeStates();
				return basicGetCompositeStates();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__NAME:
				setName((String)newValue);
				return;
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				setStateMachine((TrgStateMachine)newValue);
				return;
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES:
				setCompositeStates((TrgCompositeState)newValue);
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
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				setStateMachine((TrgStateMachine)null);
				return;
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES:
				setCompositeStates((TrgCompositeState)null);
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
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__STATE_MACHINE:
				return getStateMachine() != null;
			case JointPackage_HSM2FSMPackage.TRG_ABSTRACT_STATE__COMPOSITE_STATES:
				return compositeStates != null;
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

} //TrgAbstractStateImpl
