/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage
 * @generated
 */
public interface JointPackage_PetriNet2PNMLFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	JointPackage_PetriNet2PNMLFactory eINSTANCE = jointPackage_PetriNet2PNML.impl.JointPackage_PetriNet2PNMLFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Joint MM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Joint MM</em>'.
	 * @generated
	 */
	JointMM createJointMM();

	/**
	 * Returns a new object of class '<em>Src Petri Net</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Petri Net</em>'.
	 * @generated
	 */
	SrcPetriNet createSrcPetriNet();

	/**
	 * Returns a new object of class '<em>Src Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Place</em>'.
	 * @generated
	 */
	SrcPlace createSrcPlace();

	/**
	 * Returns a new object of class '<em>Src Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Transition</em>'.
	 * @generated
	 */
	SrcTransition createSrcTransition();

	/**
	 * Returns a new object of class '<em>Src Place To Transition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Place To Transition</em>'.
	 * @generated
	 */
	SrcPlaceToTransition createSrcPlaceToTransition();

	/**
	 * Returns a new object of class '<em>Src Transition To Place</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Src Transition To Place</em>'.
	 * @generated
	 */
	SrcTransitionToPlace createSrcTransitionToPlace();

	/**
	 * Returns a new object of class '<em>Trg PNML Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg PNML Document</em>'.
	 * @generated
	 */
	TrgPNMLDocument createTrgPNMLDocument();

	/**
	 * Returns a new object of class '<em>Trg URI</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg URI</em>'.
	 * @generated
	 */
	TrgURI createTrgURI();

	/**
	 * Returns a new object of class '<em>Trg Net Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Net Element</em>'.
	 * @generated
	 */
	TrgNetElement createTrgNetElement();

	/**
	 * Returns a new object of class '<em>Trg Label</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Label</em>'.
	 * @generated
	 */
	TrgLabel createTrgLabel();

	/**
	 * Returns a new object of class '<em>Trg Name</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Name</em>'.
	 * @generated
	 */
	TrgName createTrgName();

	/**
	 * Returns a new object of class '<em>Trg Arc</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Trg Arc</em>'.
	 * @generated
	 */
	TrgArc createTrgArc();

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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	JointPackage_PetriNet2PNMLPackage getJointPackage_PetriNet2PNMLPackage();

} //JointPackage_PetriNet2PNMLFactory
