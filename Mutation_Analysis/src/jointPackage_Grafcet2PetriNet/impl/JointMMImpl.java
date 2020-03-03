/**
 */
package jointPackage_Grafcet2PetriNet.impl;

import jointPackage_Grafcet2PetriNet.JointMM;
import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_Grafcet2PetriNet.SrcGrafcet;
import jointPackage_Grafcet2PetriNet.TrgPetriNet;

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
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.JointMMImpl#getSourceRoot <em>Source Root</em>}</li>
 *   <li>{@link jointPackage_Grafcet2PetriNet.impl.JointMMImpl#getTargetRoot <em>Target Root</em>}</li>
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
	protected SrcGrafcet sourceRoot;

	/**
	 * The cached value of the '{@link #getTargetRoot() <em>Target Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetRoot()
	 * @generated
	 * @ordered
	 */
	protected TrgPetriNet targetRoot;

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
		return JointPackage_Grafcet2PetriNetPackage.Literals.JOINT_MM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public SrcGrafcet getSourceRoot() {
		return sourceRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceRoot(SrcGrafcet newSourceRoot, NotificationChain msgs) {
		SrcGrafcet oldSourceRoot = sourceRoot;
		sourceRoot = newSourceRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT, oldSourceRoot, newSourceRoot);
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
	public void setSourceRoot(SrcGrafcet newSourceRoot) {
		if (newSourceRoot != sourceRoot) {
			NotificationChain msgs = null;
			if (sourceRoot != null)
				msgs = ((InternalEObject)sourceRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT, null, msgs);
			if (newSourceRoot != null)
				msgs = ((InternalEObject)newSourceRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT, null, msgs);
			msgs = basicSetSourceRoot(newSourceRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT, newSourceRoot, newSourceRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TrgPetriNet getTargetRoot() {
		return targetRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetRoot(TrgPetriNet newTargetRoot, NotificationChain msgs) {
		TrgPetriNet oldTargetRoot = targetRoot;
		targetRoot = newTargetRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT, oldTargetRoot, newTargetRoot);
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
	public void setTargetRoot(TrgPetriNet newTargetRoot) {
		if (newTargetRoot != targetRoot) {
			NotificationChain msgs = null;
			if (targetRoot != null)
				msgs = ((InternalEObject)targetRoot).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT, null, msgs);
			if (newTargetRoot != null)
				msgs = ((InternalEObject)newTargetRoot).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT, null, msgs);
			msgs = basicSetTargetRoot(newTargetRoot, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT, newTargetRoot, newTargetRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT:
				return basicSetSourceRoot(null, msgs);
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT:
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
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT:
				return getSourceRoot();
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT:
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
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT:
				setSourceRoot((SrcGrafcet)newValue);
				return;
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT:
				setTargetRoot((TrgPetriNet)newValue);
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
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT:
				setSourceRoot((SrcGrafcet)null);
				return;
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT:
				setTargetRoot((TrgPetriNet)null);
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
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__SOURCE_ROOT:
				return sourceRoot != null;
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM__TARGET_ROOT:
				return targetRoot != null;
		}
		return super.eIsSet(featureID);
	}

} //JointMMImpl
