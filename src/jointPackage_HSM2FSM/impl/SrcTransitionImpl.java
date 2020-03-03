/**
 */
package jointPackage_HSM2FSM.impl;

import jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage;
import jointPackage_HSM2FSM.SrcAbstractState;
import jointPackage_HSM2FSM.SrcStateMachine;
import jointPackage_HSM2FSM.SrcTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcTransitionImpl#getLabel <em>Label</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcTransitionImpl#getStateMachine <em>State Machine</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcTransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link jointPackage_HSM2FSM.impl.SrcTransitionImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcTransitionImpl extends MinimalEObjectImpl.Container implements SrcTransition {
	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected SrcAbstractState source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected SrcAbstractState target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_HSM2FSMPackage.Literals.SRC_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.SRC_TRANSITION__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcStateMachine getStateMachine() {
		if (eContainerFeatureID() != JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE) return null;
		return (SrcStateMachine)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateMachine(SrcStateMachine newStateMachine, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateMachine, JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateMachine(SrcStateMachine newStateMachine) {
		if (newStateMachine != eInternalContainer() || (eContainerFeatureID() != JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE && newStateMachine != null)) {
			if (EcoreUtil.isAncestor(this, newStateMachine))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateMachine != null)
				msgs = ((InternalEObject)newStateMachine).eInverseAdd(this, JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS, SrcStateMachine.class, msgs);
			msgs = basicSetStateMachine(newStateMachine, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE, newStateMachine, newStateMachine));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcAbstractState getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (SrcAbstractState)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_HSM2FSMPackage.SRC_TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcAbstractState basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(SrcAbstractState newSource) {
		SrcAbstractState oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.SRC_TRANSITION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcAbstractState getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject)target;
			target = (SrcAbstractState)eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_HSM2FSMPackage.SRC_TRANSITION__TARGET, oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcAbstractState basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(SrcAbstractState newTarget) {
		SrcAbstractState oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_HSM2FSMPackage.SRC_TRANSITION__TARGET, oldTarget, target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateMachine((SrcStateMachine)otherEnd, msgs);
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
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				return basicSetStateMachine(null, msgs);
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
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				return eInternalContainer().eInverseRemove(this, JointPackage_HSM2FSMPackage.SRC_STATE_MACHINE__TRANSITIONS, SrcStateMachine.class, msgs);
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
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__LABEL:
				return getLabel();
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				return getStateMachine();
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__TARGET:
				if (resolve) return getTarget();
				return basicGetTarget();
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
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__LABEL:
				setLabel((String)newValue);
				return;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				setStateMachine((SrcStateMachine)newValue);
				return;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__SOURCE:
				setSource((SrcAbstractState)newValue);
				return;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__TARGET:
				setTarget((SrcAbstractState)newValue);
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
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__LABEL:
				setLabel(LABEL_EDEFAULT);
				return;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				setStateMachine((SrcStateMachine)null);
				return;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__SOURCE:
				setSource((SrcAbstractState)null);
				return;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__TARGET:
				setTarget((SrcAbstractState)null);
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
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__STATE_MACHINE:
				return getStateMachine() != null;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__SOURCE:
				return source != null;
			case JointPackage_HSM2FSMPackage.SRC_TRANSITION__TARGET:
				return target != null;
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
		result.append(" (label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //SrcTransitionImpl
