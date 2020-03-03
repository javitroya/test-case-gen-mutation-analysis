/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import java.util.Collection;

import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.SrcConnection;
import jointPackage_Grafcet2PetriNet.SrcElement;
import jointPackage_Grafcet2PetriNet.SrcGrafcet;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Src Grafcet</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.SrcGrafcetImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.SrcGrafcetImpl#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SrcGrafcetImpl extends SrcNamedElementImpl implements SrcGrafcet {
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
	 * The cached value of the '{@link #getConnections() <em>Connections</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnections()
	 * @generated
	 * @ordered
	 */
	protected EList<SrcConnection> connections;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SrcGrafcetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_Grafcet2PetriNetPackage.Literals.SRC_GRAFCET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SrcElement> getElements() {
		if (elements == null) {
			elements = new EObjectContainmentWithInverseEList<SrcElement>(SrcElement.class, this, JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS, JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT__GRAFCET);
		}
		return elements;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<SrcConnection> getConnections() {
		if (connections == null) {
			connections = new EObjectContainmentWithInverseEList<SrcConnection>(SrcConnection.class, this, JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS, JointPackage_Grafcet2PetriNetPackage.SRC_CONNECTION__GRAFCET);
		}
		return connections;
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getElements()).basicAdd(otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getConnections()).basicAdd(otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS:
				return ((InternalEList<?>)getElements()).basicRemove(otherEnd, msgs);
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS:
				return ((InternalEList<?>)getConnections()).basicRemove(otherEnd, msgs);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS:
				return getElements();
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS:
				return getConnections();
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS:
				getElements().clear();
				getElements().addAll((Collection<? extends SrcElement>)newValue);
				return;
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS:
				getConnections().clear();
				getConnections().addAll((Collection<? extends SrcConnection>)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS:
				getElements().clear();
				return;
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS:
				getConnections().clear();
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
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__ELEMENTS:
				return elements != null && !elements.isEmpty();
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET__CONNECTIONS:
				return connections != null && !connections.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SrcGrafcetImpl
