/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.SrcStep;
import jointPackage_Grafcet2PetriNet.SrcTransition;
import jointPackage_Grafcet2PetriNet.SrcTransitionToStep;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Transition To Step</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.SrcTransitionToStepImpl#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.SrcTransitionToStepImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcTransitionToStepImpl extends SrcConnectionImpl implements SrcTransitionToStep {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected SrcTransition from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected SrcStep to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcTransitionToStepImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Grafcet2PetriNetPackage.Literals.SRC_TRANSITION_TO_STEP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcTransition getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (SrcTransition)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcTransition basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(SrcTransition newFrom, NotificationChain msgs) {
		SrcTransition oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM, oldFrom, newFrom);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFrom(SrcTransition newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION__OUTGOING_CONNECTIONS, SrcTransition.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION__OUTGOING_CONNECTIONS, SrcTransition.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcStep getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (SrcStep)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SrcStep basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(SrcStep newTo, NotificationChain msgs) {
		SrcStep oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO, oldTo, newTo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTo(SrcStep newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.SRC_STEP__INCOMING_CONNECTIONS, SrcStep.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.SRC_STEP__INCOMING_CONNECTIONS, SrcStep.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION__OUTGOING_CONNECTIONS, SrcTransition.class, msgs);
				return basicSetFrom((SrcTransition)otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.SRC_STEP__INCOMING_CONNECTIONS, SrcStep.class, msgs);
				return basicSetTo((SrcStep)otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM:
				return basicSetFrom(null, msgs);
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO:
				return basicSetTo(null, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO:
				if (resolve) return getTo();
				return basicGetTo();
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM:
				setFrom((SrcTransition)newValue);
				return;
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO:
				setTo((SrcStep)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM:
				setFrom((SrcTransition)null);
				return;
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO:
				setTo((SrcStep)null);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__FROM:
				return from != null;
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //SrcTransitionToStepImpl
