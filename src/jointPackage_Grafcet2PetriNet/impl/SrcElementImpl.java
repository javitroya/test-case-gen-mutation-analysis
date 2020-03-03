/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.SrcElement;
import jointPackage_Grafcet2PetriNet.SrcGrafcet;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.SrcElementImpl#getGrafcet <em>Grafcet</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class SrcElementImpl extends SrcNamedElementImpl implements SrcElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Grafcet2PetriNetPackage.Literals.SRC_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcGrafcet getGrafcet() {
		if (eContainerFeatureID() != JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET) return null;
		return (SrcGrafcet)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGrafcet(SrcGrafcet newGrafcet, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newGrafcet, JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGrafcet(SrcGrafcet newGrafcet) {
		if (newGrafcet != eInternalContainer() || (eContainerFeatureID() != JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET && newGrafcet != null)) {
			if (EcoreUtil.isAncestor(this, newGrafcet))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newGrafcet != null)
				msgs = ((InternalEObject)newGrafcet).eInverseAdd(this, JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS, SrcGrafcet.class, msgs);
			msgs = basicSetGrafcet(newGrafcet, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET, newGrafcet, newGrafcet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetGrafcet((SrcGrafcet)otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				return basicSetGrafcet(null, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				return eInternalContainer().eInverseRemove(this, JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS, SrcGrafcet.class, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				return getGrafcet();
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				setGrafcet((SrcGrafcet)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				setGrafcet((SrcGrafcet)null);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET:
				return getGrafcet() != null;
		}
		return super.eIsSet(featureID);
	}

} //SrcElementImpl
