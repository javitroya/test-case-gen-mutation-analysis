/**
 */
package jointPackage_PetriNet2PNML;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Trg Labeled Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link jointPackage_PetriNet2PNML.TrgLabeledElement#getLabels <em>Labels</em>}</li>
 * </ul>
 *
 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgLabeledElement()
 * @model abstract="true"
 * @generated
 */
public interface TrgLabeledElement extends TrgLocatedElement {
	/**
	 * Returns the value of the '<em><b>Labels</b></em>' containment reference list.
	 * The list contents are of type {@link jointPackage_PetriNet2PNML.TrgLabel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Labels</em>' containment reference list.
	 * @see jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage#getTrgLabeledElement_Labels()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<TrgLabel> getLabels();

} // TrgLabeledElement
