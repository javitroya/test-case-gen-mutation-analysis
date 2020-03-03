/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.TrgPlace;
import jointPackage_Grafcet2PetriNet.TrgTransition;
import jointPackage_Grafcet2PetriNet.TrgTransitionToPlace;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Transition To Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.TrgTransitionToPlaceImpl#getFrom <em>From</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.TrgTransitionToPlaceImpl#getTo <em>To</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgTransitionToPlaceImpl extends TrgArcImpl implements TrgTransitionToPlace {
	/**
	 * The cached value of the '{@link #getFrom() <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFrom()
	 * @generated
	 * @ordered
	 */
	protected TrgTransition from;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected TrgPlace to;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgTransitionToPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Grafcet2PetriNetPackage.Literals.TRG_TRANSITION_TO_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgTransition getFrom() {
		if (from != null && from.eIsProxy()) {
			InternalEObject oldFrom = (InternalEObject)from;
			from = (TrgTransition)eResolveProxy(oldFrom);
			if (from != oldFrom) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM, oldFrom, from));
			}
		}
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgTransition basicGetFrom() {
		return from;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFrom(TrgTransition newFrom, NotificationChain msgs) {
		TrgTransition oldFrom = from;
		from = newFrom;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM, oldFrom, newFrom);
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
	public void setFrom(TrgTransition newFrom) {
		if (newFrom != from) {
			NotificationChain msgs = null;
			if (from != null)
				msgs = ((InternalEObject)from).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION__OUTGOING_ARC, TrgTransition.class, msgs);
			if (newFrom != null)
				msgs = ((InternalEObject)newFrom).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION__OUTGOING_ARC, TrgTransition.class, msgs);
			msgs = basicSetFrom(newFrom, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM, newFrom, newFrom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPlace getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject)to;
			to = (TrgPlace)eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrgPlace basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTo(TrgPlace newTo, NotificationChain msgs) {
		TrgPlace oldTo = to;
		to = newTo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO, oldTo, newTo);
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
	public void setTo(TrgPlace newTo) {
		if (newTo != to) {
			NotificationChain msgs = null;
			if (to != null)
				msgs = ((InternalEObject)to).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC, TrgPlace.class, msgs);
			if (newTo != null)
				msgs = ((InternalEObject)newTo).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC, TrgPlace.class, msgs);
			msgs = basicSetTo(newTo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO, newTo, newTo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM:
				if (from != null)
					msgs = ((InternalEObject)from).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION__OUTGOING_ARC, TrgTransition.class, msgs);
				return basicSetFrom((TrgTransition)otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO:
				if (to != null)
					msgs = ((InternalEObject)to).eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC, TrgPlace.class, msgs);
				return basicSetTo((TrgPlace)otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM:
				return basicSetFrom(null, msgs);
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO:
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM:
				if (resolve) return getFrom();
				return basicGetFrom();
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO:
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM:
				setFrom((TrgTransition)newValue);
				return;
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO:
				setTo((TrgPlace)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM:
				setFrom((TrgTransition)null);
				return;
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO:
				setTo((TrgPlace)null);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__FROM:
				return from != null;
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO:
				return to != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgTransitionToPlaceImpl
