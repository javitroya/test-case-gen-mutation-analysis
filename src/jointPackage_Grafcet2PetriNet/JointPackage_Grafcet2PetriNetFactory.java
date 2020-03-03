/**
 */
package jointPackage_Grafcet2PetriNet;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage
 * @generated
 */
public interface JointPackage_Grafcet2PetriNetFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_Grafcet2PetriNetFactory eINSTANCE = jointPackage_Grafcet2PetriNet.impl.JointPackage_Grafcet2PetriNetFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint MM</em>'.
	 * @generated
	 */
	JointMM createJointMM();

	/**
	 * Returns a new object of class '<em>Src Grafcet</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Grafcet</em>'.
	 * @generated
	 */
	SrcGrafcet createSrcGrafcet();

	/**
	 * Returns a new object of class '<em>Src Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Step</em>'.
	 * @generated
	 */
	SrcStep createSrcStep();

	/**
	 * Returns a new object of class '<em>Src Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Transition</em>'.
	 * @generated
	 */
	SrcTransition createSrcTransition();

	/**
	 * Returns a new object of class '<em>Src Step To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Step To Transition</em>'.
	 * @generated
	 */
	SrcStepToTransition createSrcStepToTransition();

	/**
	 * Returns a new object of class '<em>Src Transition To Step</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Transition To Step</em>'.
	 * @generated
	 */
	SrcTransitionToStep createSrcTransitionToStep();

	/**
	 * Returns a new object of class '<em>Trg Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Petri Net</em>'.
	 * @generated
	 */
	TrgPetriNet createTrgPetriNet();

	/**
	 * Returns a new object of class '<em>Trg Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Place</em>'.
	 * @generated
	 */
	TrgPlace createTrgPlace();

	/**
	 * Returns a new object of class '<em>Trg Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Transition</em>'.
	 * @generated
	 */
	TrgTransition createTrgTransition();

	/**
	 * Returns a new object of class '<em>Trg Place To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Place To Transition</em>'.
	 * @generated
	 */
	TrgPlaceToTransition createTrgPlaceToTransition();

	/**
	 * Returns a new object of class '<em>Trg Transition To Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Transition To Place</em>'.
	 * @generated
	 */
	TrgTransitionToPlace createTrgTransitionToPlace();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JointPackage_Grafcet2PetriNetPackage getJointPackage_Grafcet2PetriNetPackage();

} //JointPackage_Grafcet2PetriNetFactory
