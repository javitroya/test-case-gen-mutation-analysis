/**
 */
package jointPackage_PetriNet2PNML.impl;

import java.util.Collection;

import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;
import jointPackage_PetriNet2PNML.SrcPlaceToTransition;
import jointPackage_PetriNet2PNML.SrcTransition;
import jointPackage_PetriNet2PNML.SrcTransitionToPlace;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.SrcTransitionImpl#getIncomingArc <em>Incoming Arc</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.SrcTransitionImpl#getOutgoingArc <em>Outgoing Arc</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcTransitionImpl extends SrcElementImpl implements SrcTransition {
	/**
	 * The cached value of the '{@link #getIncomingArc() <em>Incoming Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncomingArc()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcPlaceToTransition> incomingArc;

	/**
	 * The cached value of the '{@link #getOutgoingArc() <em>Outgoing Arc</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOutgoingArc()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcTransitionToPlace> outgoingArc;

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
		return JointPackage_PetriNet2PNMLPackage.Literals.SRC_TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SrcPlaceToTransition> getIncomingArc() {
		if (incomingArc == null) {
			incomingArc = new EObjectWithInverseResolvingEList<SrcPlaceToTransition>(SrcPlaceToTransition.class, this, JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC, JointPackage_PetriNet2PNMLPackage.SRC_PLACE_TO_TRANSITION__TO);
		}
		return incomingArc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SrcTransitionToPlace> getOutgoingArc() {
		if (outgoingArc == null) {
			outgoingArc = new EObjectWithInverseResolvingEList<SrcTransitionToPlace>(SrcTransitionToPlace.class, this, JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC, JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION_TO_PLACE__FROM);
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
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getIncomingArc()).basicAdd(otherEnd, msgs);
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC:
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
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC:
				return ((InternalEList<?>)getIncomingArc()).basicRemove(otherEnd, msgs);
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC:
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
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC:
				return getIncomingArc();
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC:
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
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC:
				getIncomingArc().clear();
				getIncomingArc().addAll((Collection<? extends SrcPlaceToTransition>)newValue);
				return;
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC:
				getOutgoingArc().clear();
				getOutgoingArc().addAll((Collection<? extends SrcTransitionToPlace>)newValue);
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
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC:
				getIncomingArc().clear();
				return;
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC:
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
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__INCOMING_ARC:
				return incomingArc != null && !incomingArc.isEmpty();
			case JointPackage_PetriNet2PNMLPackage.SRC_TRANSITION__OUTGOING_ARC:
				return outgoingArc != null && !outgoingArc.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrcTransitionImpl
