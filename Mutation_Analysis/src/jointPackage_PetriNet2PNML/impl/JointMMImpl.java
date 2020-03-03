/**
 */
package jointPackage_PetriNet2PNML.impl;

import jointPackage_PetriNet2PNML.JointMM;
import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;
import jointPackage_PetriNet2PNML.SrcPetriNet;
import jointPackage_PetriNet2PNML.TrgPNMLDocument;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Joint MM</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.JointMMImpl#getSourceRoot <em>Source Root</em>}</li>
 *   <li>{@link jointPackage_PetriNet2PNML.impl.JointMMImpl#getTargetRoot <em>Target Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class JointMMImpl extends MinimalEObjectImpl.Container implements JointMM {
	/**
	 * The cached value of the '{@link #getSourceRoot() <em>Source Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceRoot()
	 * @generated
	 * @ordered
	 */
	protected SrcPetriNet sourceRoot;

	/**
	 * The cached value of the '{@link #getTargetRoot() <em>Target Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoot()
	 * @generated
	 * @ordered
	 */
	protected TrgPNMLDocument targetRoot;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JointMMImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return JointPackage_PetriNet2PNMLPackage.Literals.JOINT_MM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcPetriNet getSourceRoot() {
		return sourceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRoot(SrcPetriNet newSourceRoot, NotificationChain msgs) {
		SrcPetriNet oldSourceRoot = sourceRoot;
		sourceRoot = newSourceRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT, oldSourceRoot, newSourceRoot);
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
	public void setSourceRoot(SrcPetriNet newSourceRoot) {
		if (newSourceRoot != sourceRoot) {
			NotificationChain msgs = null;
			if (sourceRoot != null)
				msgs = ((InternalEObject)sourceRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT, null, msgs);
			if (newSourceRoot != null)
				msgs = ((InternalEObject)newSourceRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT, null, msgs);
			msgs = basicSetSourceRoot(newSourceRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT, newSourceRoot, newSourceRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPNMLDocument getTargetRoot() {
		return targetRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRoot(TrgPNMLDocument newTargetRoot, NotificationChain msgs) {
		TrgPNMLDocument oldTargetRoot = targetRoot;
		targetRoot = newTargetRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT, oldTargetRoot, newTargetRoot);
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
	public void setTargetRoot(TrgPNMLDocument newTargetRoot) {
		if (newTargetRoot != targetRoot) {
			NotificationChain msgs = null;
			if (targetRoot != null)
				msgs = ((InternalEObject)targetRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT, null, msgs);
			if (newTargetRoot != null)
				msgs = ((InternalEObject)newTargetRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT, null, msgs);
			msgs = basicSetTargetRoot(newTargetRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT, newTargetRoot, newTargetRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT:
				return basicSetSourceRoot(null, msgs);
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT:
				return basicSetTargetRoot(null, msgs);
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
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT:
				return getSourceRoot();
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT:
				return getTargetRoot();
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
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT:
				setSourceRoot((SrcPetriNet)newValue);
				return;
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT:
				setTargetRoot((TrgPNMLDocument)newValue);
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
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT:
				setSourceRoot((SrcPetriNet)null);
				return;
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT:
				setTargetRoot((TrgPNMLDocument)null);
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
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__SOURCE_ROOT:
				return sourceRoot != null;
			case JointPackage_PetriNet2PNMLPackage.JOINT_MM__TARGET_ROOT:
				return targetRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //JointMMImpl
