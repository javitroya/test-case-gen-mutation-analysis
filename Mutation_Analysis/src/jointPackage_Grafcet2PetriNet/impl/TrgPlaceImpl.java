/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import java.util.Collection;

import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.TrgPlace;
import jointPackage_Grafcet2PetriNet.TrgPlaceToTransition;
import jointPackage_Grafcet2PetriNet.TrgTransitionToPlace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg Place</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceImpl#getIncomingArc <em>Incoming Arc</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.TrgPlaceImpl#getOutgoingArc <em>Outgoing Arc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgPlaceImpl extends TrgElementImpl implements TrgPlace {
	/**
	 * The cached value of the '{@link #getIncomingArc() <em>Incoming Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingArc()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgTransitionToPlace> incomingArc;

	/**
	 * The cached value of the '{@link #getOutgoingArc() <em>Outgoing Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingArc()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgPlaceToTransition> outgoingArc;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgPlaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Grafcet2PetriNetPackage.Literals.TRG_PLACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrgTransitionToPlace> getIncomingArc() {
		if (incomingArc == null) {
			incomingArc = new EObjectWithInverseResolvingEList<TrgTransitionToPlace>(TrgTransitionToPlace.class, this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC, JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE__TO);
		}
		return incomingArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrgPlaceToTransition> getOutgoingArc() {
		if (outgoingArc == null) {
			outgoingArc = new EObjectWithInverseResolvingEList<TrgPlaceToTransition>(TrgPlaceToTransition.class, this, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC, JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION__FROM);
		}
		return outgoingArc;
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingArc()).basicAdd(otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOutgoingArc()).basicAdd(otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC:
				return ((InternalEList<?>)getIncomingArc()).basicRemove(otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC:
				return ((InternalEList<?>)getOutgoingArc()).basicRemove(otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC:
				return getIncomingArc();
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC:
				return getOutgoingArc();
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC:
				getIncomingArc().clear();
				getIncomingArc().addAll((Collection<? extends TrgTransitionToPlace>)newValue);
				return;
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC:
				getOutgoingArc().clear();
				getOutgoingArc().addAll((Collection<? extends TrgPlaceToTransition>)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC:
				getIncomingArc().clear();
				return;
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC:
				getOutgoingArc().clear();
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
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__INCOMING_ARC:
				return incomingArc != null && !incomingArc.isEmpty();
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE__OUTGOING_ARC:
				return outgoingArc != null && !outgoingArc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgPlaceImpl
