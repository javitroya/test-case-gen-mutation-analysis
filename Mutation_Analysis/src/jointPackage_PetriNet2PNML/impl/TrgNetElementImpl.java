/**
 */
package jointPackage_PetriNet2PNML.impl;

import java.util.Collection;

import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;
import jointPackage_PetriNet2PNML.TrgName;
import jointPackage_PetriNet2PNML.TrgNetContent;
import jointPackage_PetriNet2PNML.TrgNetElement;
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
 * An implementation of the model object '<em><b>Trg Net Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.TrgNetElementImpl#getType <em>Type</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.TrgNetElementImpl#getContents <em>Contents</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.TrgNetElementImpl#getName <em>Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TrgNetElementImpl extends TrgIdedElementImpl implements TrgNetElement {
	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected TrgURI type;

	/**
	 * The cached value of the '{@link #getContents() <em>Contents</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContents()
	 * @generated
	 * @ordered
	 */
	protected EList<TrgNetContent> contents;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected TrgName name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TrgNetElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_PetriNet2PNMLPackage.Literals.TRG_NET_ELEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgURI getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetType(TrgURI newType, NotificationChain msgs) {
		TrgURI oldType = type;
		type = newType;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE, oldType, newType);
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
	public void setType(TrgURI newType) {
		if (newType != type) {
			NotificationChain msgs = null;
			if (type != null)
				msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE, null, msgs);
			if (newType != null)
				msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE, null, msgs);
			msgs = basicSetType(newType, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE, newType, newType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TrgNetContent> getContents() {
		if (contents == null) {
			contents = new EObjectContainmentEList<TrgNetContent>(TrgNetContent.class, this, JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__CONTENTS);
		}
		return contents;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgName getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetName(TrgName newName, NotificationChain msgs) {
		TrgName oldName = name;
		name = newName;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME, oldName, newName);
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
	public void setName(TrgName newName) {
		if (newName != name) {
			NotificationChain msgs = null;
			if (name != null)
				msgs = ((InternalEObject)name).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME, null, msgs);
			if (newName != null)
				msgs = ((InternalEObject)newName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME, null, msgs);
			msgs = basicSetName(newName, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME, newName, newName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE:
				return basicSetType(null, msgs);
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__CONTENTS:
				return ((InternalEList<?>)getContents()).basicRemove(otherEnd, msgs);
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME:
				return basicSetName(null, msgs);
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
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE:
				return getType();
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__CONTENTS:
				return getContents();
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME:
				return getName();
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
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE:
				setType((TrgURI)newValue);
				return;
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__CONTENTS:
				getContents().clear();
				getContents().addAll((Collection<? extends TrgNetContent>)newValue);
				return;
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME:
				setName((TrgName)newValue);
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
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE:
				setType((TrgURI)null);
				return;
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__CONTENTS:
				getContents().clear();
				return;
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME:
				setName((TrgName)null);
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
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__TYPE:
				return type != null;
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__CONTENTS:
				return contents != null && !contents.isEmpty();
			case JointPackage_PetriNet2PNMLPackage.TRG_NET_ELEMENT__NAME:
				return name != null;
		}
		return super.eIsSet(featureID);
	}

} //TrgNetElementImpl
