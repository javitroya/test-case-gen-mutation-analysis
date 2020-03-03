/**
 */
package jointPackage_PetriNet2PNML.impl;

import java.util.Collection;

import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;
import jointPackage_PetriNet2PNML.TrgNetElement;
import jointPackage_PetriNet2PNML.TrgPNMLDocument;
import jointPackage_PetriNet2PNML.TrgURI;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Trg PNML Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.TrgPNMLDocumentImpl#getXmlns <em>Xmlns</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.TrgPNMLDocumentImpl#getNets <em>Nets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgPNMLDocumentImpl extends TrgLocatedElementImpl implements TrgPNMLDocument {
	/**
	 * The cached value of the '{@link #getXmlns() <em>Xmlns</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmlns()
	 * @generated
	 * @ordered
	 */
	protected TrgURI xmlns;

	/**
	 * The cached value of the '{@link #getNets() <em>Nets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNets()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgNetElement> nets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgPNMLDocumentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_PetriNet2PNMLPackage.Literals.TRG_PNML_DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgURI getXmlns() {
		return xmlns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetXmlns(TrgURI newXmlns, NotificationChain msgs) {
		TrgURI oldXmlns = xmlns;
		xmlns = newXmlns;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS, oldXmlns, newXmlns);
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
	public void setXmlns(TrgURI newXmlns) {
		if (newXmlns != xmlns) {
			NotificationChain msgs = null;
			if (xmlns != null)
				msgs = ((InternalEObject)xmlns).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS, null, msgs);
			if (newXmlns != null)
				msgs = ((InternalEObject)newXmlns).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS, null, msgs);
			msgs = basicSetXmlns(newXmlns, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS, newXmlns, newXmlns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrgNetElement> getNets() {
		if (nets == null) {
			nets = new EObjectContainmentEList<TrgNetElement>(TrgNetElement.class, this, JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__NETS);
		}
		return nets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS:
				return basicSetXmlns(null, msgs);
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__NETS:
				return ((InternalEList<?>)getNets()).basicRemove(otherEnd, msgs);
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
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS:
				return getXmlns();
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__NETS:
				return getNets();
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
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS:
				setXmlns((TrgURI)newValue);
				return;
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__NETS:
				getNets().clear();
				getNets().addAll((Collection<? extends TrgNetElement>)newValue);
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
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS:
				setXmlns((TrgURI)null);
				return;
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__NETS:
				getNets().clear();
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
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__XMLNS:
				return xmlns != null;
			case JointPackage_PetriNet2PNMLPackage.TRG_PNML_DOCUMENT__NETS:
				return nets != null && !nets.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TrgPNMLDocumentImpl
