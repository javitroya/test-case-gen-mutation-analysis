/**
 */
package jointPackage_Grafcet2PetriNet.util;

import jointPackage_Grafcet2PetriNet.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage
 * @generated
 */
public class JointPackage_Grafcet2PetriNetSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static JointPackage_Grafcet2PetriNetPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JointPackage_Grafcet2PetriNetSwitch() {
		if (modelPackage == null) {
			modelPackage = JointPackage_Grafcet2PetriNetPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case JointPackage_Grafcet2PetriNetPackage.JOINT_MM: {
				JointMM jointMM = (JointMM)theEObject;
				T result = caseJointMM(jointMM);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_LOCATED_ELEMENT: {
				SrcLocatedElement srcLocatedElement = (SrcLocatedElement)theEObject;
				T result = caseSrcLocatedElement(srcLocatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_NAMED_ELEMENT: {
				SrcNamedElement srcNamedElement = (SrcNamedElement)theEObject;
				T result = caseSrcNamedElement(srcNamedElement);
				if (result == null) result = caseSrcLocatedElement(srcNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_GRAFCET: {
				SrcGrafcet srcGrafcet = (SrcGrafcet)theEObject;
				T result = caseSrcGrafcet(srcGrafcet);
				if (result == null) result = caseSrcNamedElement(srcGrafcet);
				if (result == null) result = caseSrcLocatedElement(srcGrafcet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_ELEMENT: {
				SrcElement srcElement = (SrcElement)theEObject;
				T result = caseSrcElement(srcElement);
				if (result == null) result = caseSrcNamedElement(srcElement);
				if (result == null) result = caseSrcLocatedElement(srcElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_STEP: {
				SrcStep srcStep = (SrcStep)theEObject;
				T result = caseSrcStep(srcStep);
				if (result == null) result = caseSrcElement(srcStep);
				if (result == null) result = caseSrcNamedElement(srcStep);
				if (result == null) result = caseSrcLocatedElement(srcStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION: {
				SrcTransition srcTransition = (SrcTransition)theEObject;
				T result = caseSrcTransition(srcTransition);
				if (result == null) result = caseSrcElement(srcTransition);
				if (result == null) result = caseSrcNamedElement(srcTransition);
				if (result == null) result = caseSrcLocatedElement(srcTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_CONNECTION: {
				SrcConnection srcConnection = (SrcConnection)theEObject;
				T result = caseSrcConnection(srcConnection);
				if (result == null) result = caseSrcNamedElement(srcConnection);
				if (result == null) result = caseSrcLocatedElement(srcConnection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_STEP_TO_TRANSITION: {
				SrcStepToTransition srcStepToTransition = (SrcStepToTransition)theEObject;
				T result = caseSrcStepToTransition(srcStepToTransition);
				if (result == null) result = caseSrcConnection(srcStepToTransition);
				if (result == null) result = caseSrcNamedElement(srcStepToTransition);
				if (result == null) result = caseSrcLocatedElement(srcStepToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.SRC_TRANSITION_TO_STEP: {
				SrcTransitionToStep srcTransitionToStep = (SrcTransitionToStep)theEObject;
				T result = caseSrcTransitionToStep(srcTransitionToStep);
				if (result == null) result = caseSrcConnection(srcTransitionToStep);
				if (result == null) result = caseSrcNamedElement(srcTransitionToStep);
				if (result == null) result = caseSrcLocatedElement(srcTransitionToStep);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_LOCATED_ELEMENT: {
				TrgLocatedElement trgLocatedElement = (TrgLocatedElement)theEObject;
				T result = caseTrgLocatedElement(trgLocatedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_NAMED_ELEMENT: {
				TrgNamedElement trgNamedElement = (TrgNamedElement)theEObject;
				T result = caseTrgNamedElement(trgNamedElement);
				if (result == null) result = caseTrgLocatedElement(trgNamedElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_PETRI_NET: {
				TrgPetriNet trgPetriNet = (TrgPetriNet)theEObject;
				T result = caseTrgPetriNet(trgPetriNet);
				if (result == null) result = caseTrgNamedElement(trgPetriNet);
				if (result == null) result = caseTrgLocatedElement(trgPetriNet);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_ELEMENT: {
				TrgElement trgElement = (TrgElement)theEObject;
				T result = caseTrgElement(trgElement);
				if (result == null) result = caseTrgNamedElement(trgElement);
				if (result == null) result = caseTrgLocatedElement(trgElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE: {
				TrgPlace trgPlace = (TrgPlace)theEObject;
				T result = caseTrgPlace(trgPlace);
				if (result == null) result = caseTrgElement(trgPlace);
				if (result == null) result = caseTrgNamedElement(trgPlace);
				if (result == null) result = caseTrgLocatedElement(trgPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION: {
				TrgTransition trgTransition = (TrgTransition)theEObject;
				T result = caseTrgTransition(trgTransition);
				if (result == null) result = caseTrgElement(trgTransition);
				if (result == null) result = caseTrgNamedElement(trgTransition);
				if (result == null) result = caseTrgLocatedElement(trgTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_ARC: {
				TrgArc trgArc = (TrgArc)theEObject;
				T result = caseTrgArc(trgArc);
				if (result == null) result = caseTrgNamedElement(trgArc);
				if (result == null) result = caseTrgLocatedElement(trgArc);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_PLACE_TO_TRANSITION: {
				TrgPlaceToTransition trgPlaceToTransition = (TrgPlaceToTransition)theEObject;
				T result = caseTrgPlaceToTransition(trgPlaceToTransition);
				if (result == null) result = caseTrgArc(trgPlaceToTransition);
				if (result == null) result = caseTrgNamedElement(trgPlaceToTransition);
				if (result == null) result = caseTrgLocatedElement(trgPlaceToTransition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case JointPackage_Grafcet2PetriNetPackage.TRG_TRANSITION_TO_PLACE: {
				TrgTransitionToPlace trgTransitionToPlace = (TrgTransitionToPlace)theEObject;
				T result = caseTrgTransitionToPlace(trgTransitionToPlace);
				if (result == null) result = caseTrgArc(trgTransitionToPlace);
				if (result == null) result = caseTrgNamedElement(trgTransitionToPlace);
				if (result == null) result = caseTrgLocatedElement(trgTransitionToPlace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Joint MM</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJointMM(JointMM object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcLocatedElement(SrcLocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcNamedElement(SrcNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Grafcet</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcGrafcet(SrcGrafcet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcElement(SrcElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcStep(SrcStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcTransition(SrcTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcConnection(SrcConnection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Step To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Step To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcStepToTransition(SrcStepToTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Src Transition To Step</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Src Transition To Step</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSrcTransitionToStep(SrcTransitionToStep object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Located Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Located Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgLocatedElement(TrgLocatedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgNamedElement(TrgNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Petri Net</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPetriNet(TrgPetriNet object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgElement(TrgElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPlace(TrgPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTransition(TrgTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Arc</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Arc</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgArc(TrgArc object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Place To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Place To Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgPlaceToTransition(TrgPlaceToTransition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Trg Transition To Place</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Trg Transition To Place</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTrgTransitionToPlace(TrgTransitionToPlace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //JointPackage_Grafcet2PetriNetSwitch
