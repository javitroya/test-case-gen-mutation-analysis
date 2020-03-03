/**
 */
package jointPackage_PetriNet2PNML.impl;

import java.util.Collection;

import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;
import jointPackage_PetriNet2PNML.SrcArc;
import jointPackage_PetriNet2PNML.SrcElement;
import jointPackage_PetriNet2PNML.SrcPetriNet;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Petri Net</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.SrcPetriNetImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.SrcPetriNetImpl#getArcs <em>Arcs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcPetriNetImpl extends SrcNamedElementImpl implements SrcPetriNet {
	/**
	 * The cached value of the '{@link #getElements() <em>Elements</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getElements()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcElement> elements;

	/**
	 * The cached value of the '{@link #getArcs() <em>Arcs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArcs()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcArc> arcs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcPetriNetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_PetriNet2PNMLPackage.Literals.SRC_PETRI_NET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SrcElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<SrcElement>(SrcElement.class, this, JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS, JointPackage_PetriNet2PNMLPackage.SRC_ELEMENT__NET);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SrcArc> getArcs() {
		if (arcs == null) {
			arcs = new EObjectContainmentWithInverseEList<SrcArc>(SrcArc.class, this, JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS, JointPackage_PetriNet2PNMLPackage.SRC_ARC__NET);
		}
		return arcs;
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
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getArcs()).basicAdd(otherEnd, msgs);
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
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS:
				return ((InternalEList<?>)getArcs()).basicRemove(otherEnd, msgs);
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
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS:
				return getElements();
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS:
				return getArcs();
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
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SrcElement>)newValue);
				return;
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS:
				getArcs().clear();
				getArcs().addAll((Collection<? extends SrcArc>)newValue);
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
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS:
				getElements().clear();
				return;
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS:
				getArcs().clear();
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
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case JointPackage_PetriNet2PNMLPackage.SRC_PETRI_NET__ARCS:
				return arcs != null && !arcs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrcPetriNetImpl
