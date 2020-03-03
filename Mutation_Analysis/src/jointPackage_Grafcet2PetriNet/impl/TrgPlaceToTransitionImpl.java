/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.TrgPlace;
import jointPackage_Grafcet2PetriNet.TrgPlaceToTransition;
import jointPackage_Grafcet2PetriNet.TrgTransition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Place To Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceToTransitionImpl#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceToTransitionImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgPlaceToTransitionImpl extends TrgArcImpl implements TrgPlaceToTransition {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TrgPlace from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected TrgTransition to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgPlaceToTransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Grafcet2PetriNetPackage.Literals.TRG_PLACE_TO_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPlace getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (TrgPlace)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPlace basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(TrgPlace newFrom, NotificationChain msgs) {
		TrgPlace oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM, oldFrom, newFrom);
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
	public void setFrom(TrgPlace newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC, TrgPlace.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC, TrgPlace.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgTransition getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (TrgTransition)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTransition basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(TrgTransition newTo, NotificationChain msgs) {
		TrgTransition oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO, oldTo, newTo);
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
	public void setTo(TrgTransition newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION__INCOMING_ARC, TrgTransition.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION__INCOMING_ARC, TrgTransition.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC, TrgPlace.class, msgs);
				return basicSetFrom((TrgPlace)otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION__INCOMING_ARC, TrgTransition.class, msgs);
				return basicSetTo((TrgTransition)otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM:
				return basicSetFrom(null, msgs);
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO:
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO:
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM:
				setFrom((TrgPlace)newValue);
				return;
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO:
				setTo((TrgTransition)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM:
				setFrom((TrgPlace)null);
				return;
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO:
				setTo((TrgTransition)null);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM:
				return from != null;
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgPlaceToTransitionImpl
