/********************************************************************************
* Copyright (c) 2020 Universidad de Sevilla.
* All rights reserved. This program and the accompanying materials
* are made available under the terms of the Eclipse Public License v1.0
* which accompanies this distribution, and is available at
* http://www.eclipse.org/legal/epl-v10.html
*
* Contributors:
* Javier Troya (Universidad de Sevilla, Spain) - implementation
*******************************************************************************/

package es.us.eii.mutation.analysis.main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.m2m.atl.core.ATLCoreException;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.impl.ConstraintImpl;
import org.eclipse.ocl.helper.OCLHelper;

import trace.TracePackage;
import ATL.ATLPackage;
import jointPackage_Grafcet2PetriNet.JointPackage_Grafcet2PetriNetPackage;
import jointPackage_UML2ER.JointPackage_UML2ERPackage;
import jointPackage_HSM2FSM.JointPackage_HSM2FSMPackage;
import jointPackage_PetriNet2PNML.JointPackage_PetriNet2PNMLPackage;


public class MutationAnalysis_Main {
	
	/*We assume that the transformation (.atl and .asm files), source metamodel and 
	 * target metamodel are in the folder of the transformation (executionsCanPath), and that Trace.ecore 
	 * is in the root path of the project. We also assume that in the transformation we have the trace 
	 * model as TM : TMM, and the input/output MMs as IN/OUT 
	 */	
	
	ResourceSet resSet = null;
	Resource inModel = null;

	/**Folders name containing all models and each model
	 * They are need for constructing paths**/
	final static String MODELS_FOLDER = "models";
	final static String INDIVIDUAL_MODEL_FOLDER = "model";
	
	/**************************************READ THIS BLOCK!!!!*************************************************************
	 * In order to activate the execution of the UML2ER case study, uncomment lines 92-142 (all the remaining lines
	 * in the block 92-310 need to be commented).	
	 * To do so, select all those lines and press Shit+Control+c (same action is to comment and uncomment). 
	 * Please note that some lines will keep commented even when you are uncommenting the whole block (leave them like that).
	 * Finally, lines 364-365 and 441 must be uncommented. In turn, lines 372 and 442-444 must be commented.
	 * 
	 * In order to activate the execution of the HSM2FSM case study, uncomment lines 146-198 (all the remaining lines
	 * in the block 92-310 need to be commented).	
	 * To do so, select all those lines and press Shit+Control+c (same action is to comment and uncomment). 
	 * Please note that some lines will keep commented even when you are uncommenting the whole block (leave them like that).
	 * Finally, lines 364-365 and 442 must be uncommented. In turn, lines 372, 441, 443 and 444 must be commented.
	 * 
	 * In order to activate the execution of the PetriNet2PNML case study, uncomment lines 202-254 (all the remaining lines
	 * in the block 92-310 need to be commented).	
	 * To do so, select all those lines and press Shit+Control+c (same action is to comment and uncomment). 
	 * Please note that some lines will keep commented even when you are uncommenting the whole block (leave them like that).
	 * Finally, lines 372 and 443 must be uncommented. In turn, lines 364-365, 441, 442 and 444 must be commented.
	 * 
	 * In order to activate the execution of the Grafcet2PetriNet case study, uncomment lines 258-310 (all the remaining lines
	 * in the block 92-310 need to be commented).	
	 * To do so, select all those lines and press Shit+Control+c (same action is to comment and uncomment). 
	 * Please note that some lines will keep commented even when you are uncommenting the whole block (leave them like that).
	 * Finally, lines 372 and 444 must be uncommented. In turn, lines 364-365 and 441-443 must be commented.
	**/
	
	
//	/**************************** PARAMETERS FOR THE UML2ER EXAMPLE ********************************/
	/**We need the canonical path in order to navigate the subfolders**/
	final static String executionsCanPath = "analysis_UML2ER";
	/**Constants with the number of source models generated and transformation mutants**/
	final static int NUM_MUTANTS = 18;
	final static int NUM_MODELS = 3;
	/**Name of the folder that contains the transformations**/
	final static String folderTransformations = "transformations";
	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
	final static String Joint_Model_Name = "JointModel";
	/**Name of the file with the transformation**/
	final static String Transformation_Name = "SimpleUml2ER";
	
	/**Name of the file with the OCL constraints**/
	final static String OCL_File_Name = "OCL_Constraints.txt";
	/**Name and extension of input MM**/
	public final static String IN_MM = "SimpleUML.ecore";
	/**Name as it is in the ATL transformation**/
	public final static String IN_MM_NAME = "SimpleUML";
	/**Name and extension of output MM**/
	public final static String OUT_MM = "ER.ecore";
	/**Name as it is in the ATL transformation**/
	public final static String OUT_MM_NAME = "ER";
	/**Name of the Trace metamodel and its name within the transformation**/
	public final static String Trace_MM = "Trace.ecore";
	public final static String Trace_MM_NAME = "TM";
	/**Name to be given to the trace models resulting from transformation execution**/
	public final static String Trace_OutModel_Name = "Trace_out";
	
	//For executing the transformation that joins the models, we also need some parameters
	//Next we specify the Joint Metamodel where both metamodels are merged
	public final static String Joint_MM = "JointMM_UML2ER.ecore";
	/* Provided we have the following transformation to merge input/output models
	 * module MergeModels;
	 * create OUT : JointModel from IN1 : SimpleUML, IN2 : ER;
	 * Then we have the following parameters:
	 */
	public final static String IN_MM_NAME_TRAFO1 = "SimpleUML";
	public final static String IN_MM_NAME_TRAFO2 = "ER";
	public final static String OUT_MM_NAME_TRAFO = "JointModel";
	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
////	
//	/**Take also into account the following to be touched within the code**/
	/**We have also added the following in the main method**/
	//JointPackage_UML2ERPackage.eINSTANCE.eClass();
	
	/**Finally, we also have to change the following line, which is in method writeMutationAnalysisCSV()
	 * We have to put the corresponding JointPackage**/
	//helper.setContext(JointMM_UML2ER.Literals.JOINT_MM);
	/**************************** END OF PARAMETERS FOR THE UML2ER EXAMPLE ********************************/
	
	/**************************** PARAMETERS FOR THE HSM2FSM EXAMPLE ********************************/
//	
//	/**We need the canonical path in order to navigate the subfolders**/
//	final static String executionsCanPath = "analysis_HSM2FSM";
//	/**Constants with the number of source models generated and transformation mutants**/
//	final static int NUM_MUTANTS = 23;
//	final static int NUM_MODELS = 4;
//	/**Name of the folder that contains the transformations**/
//	final static String folderTransformations = "transformations";
//	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
//	final static String Joint_Model_Name = "JointModel";
//	/**Name of the file with the transformation**/
//	final static String Transformation_Name = "HSM2FSM";
//	
//	/**Name of the file with the OCL constraints**/
//	final static String OCL_File_Name = "OCL_Constraints.txt";
//	
//	/**Name and extension of input MM**/
//	public final static String IN_MM = "HSM.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String IN_MM_NAME = "HSM";
//	/**Name and extension of output MM**/
//	public final static String OUT_MM = "FSM.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String OUT_MM_NAME = "FSM";
//	/**Name of the Trace metamodel and its name within the transformation**/
//	public final static String Trace_MM = "Trace.ecore";
//	public final static String Trace_MM_NAME = "TM";
//	/**Name to be given to the trace models resulting from transformation execution**/
//	public final static String Trace_OutModel_Name = "Trace_out";
//	
//	//For executing the transformation that joins the models, we also need some parameters
//	//Next we specify the Joint Metamodel where both metamodels are merged
//	public final static String Joint_MM = "JointMM_HSM2FSM.ecore";
//	/* Provided we have the following transformation to merge input/output models
//	 * module MergeModels;
//	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//	 * Then we have the following parameters:
//	 */
//	public final static String IN_MM_NAME_TRAFO1 = "HSM";
//	public final static String IN_MM_NAME_TRAFO2 = "FSM";
//	public final static String OUT_MM_NAME_TRAFO = "JointModel";
//	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//	
//	/**Take also into account the following to be touched within the code**/
//	/**We have also added the following in the main method**/
//	//JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
//	
//	/**Finally, we also have to change the following line, which is in method getListResultVector
//	 * We have to put the corresponding JointPackage**/
//	//helper.setContext(JointMM_HSM2FSM.Literals.JOINT_MM);
	/**************************** END OF PARAMETERS FOR THE HSM2FSM EXAMPLE ********************************/
	
	/**************************** PARAMETERS FOR THE PETRINEt2PNML EXAMPLE ********************************/
//	
//	/**We need the canonical path in order to navigate the subfolders**/
//	final static String executionsCanPath = "analysis_PetriNet2PNML";
//	/**Constants with the number of source models generated and transformation mutants**/
//	final static int NUM_MUTANTS = 24;
//	final static int NUM_MODELS = 4;
//	/**Name of the folder that contains the transformations**/
//	final static String folderTransformations = "transformations";
//	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
//	final static String Joint_Model_Name = "JointModel";
//	/**Name of the file with the transformation**/
//	final static String Transformation_Name = "PetriNet2PNML";
//	
//	/**Name of the file with the OCL constraints**/
//	final static String OCL_File_Name = "OCL_Constraints.txt";
//	
//	/**Name and extension of input MM**/
//	public final static String IN_MM = "PetriNet.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String IN_MM_NAME = "PetriNet";
//	/**Name and extension of output MM**/
//	public final static String OUT_MM = "PNML_simplified.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String OUT_MM_NAME = "PNML";
//	/**Name of the Trace metamodel and its name within the transformation**/
//	public final static String Trace_MM = "Trace.ecore";
//	public final static String Trace_MM_NAME = "TM";
//	/**Name to be given to the trace models resulting from transformation execution**/
//	public final static String Trace_OutModel_Name = "Trace_out";
//	
//	//For executing the transformation that joins the models, we also need some parameters
//	//Next we specify the Joint Metamodel where both metamodels are merged
//	public final static String Joint_MM = "JointMM_PetriNet2PNML.ecore";
//	/* Provided we have the following transformation to merge input/output models
//	 * module MergeModels;
//	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//	 * Then we have the following parameters:
//	 */
//	public final static String IN_MM_NAME_TRAFO1 = "PetriNet";
//	public final static String IN_MM_NAME_TRAFO2 = "PNML";
//	public final static String OUT_MM_NAME_TRAFO = "JointModel";
//	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//	
//	/**Take also into account the following to be touched within the code**/
//	/**We have also added the following in the main method**/
//	//JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
//	
//	/**Finally, we also have to change the following line, which is in method getListResultVector
//	 * We have to put the corresponding JointPackage**/
//	//helper.setContext(JointMM_PetriNet2PNML.Literals.JOINT_MM);
	/**************************** END OF PARAMETERS FOR THE PETRINET2PNML EXAMPLE ********************************/
	
	/**************************** PARAMETERS FOR THE GRAFCET2PETRINET EXAMPLE ********************************/
//	
//	/**We need the canonical path in order to navigate the subfolders**/
//	final static String executionsCanPath = "analysis_Grafcet2PetriNet";
//	/**Constants with the number of source models generated and transformation mutants**/
//	final static int NUM_MUTANTS = 17;
//	final static int NUM_MODELS = 4;
//	/**Name of the folder that contains the transformations**/
//	final static String folderTransformations = "transformations";
//	/**This is the name given to the model resulting from joining the source and target models of a transformation**/
//	final static String Joint_Model_Name = "JointModel";
//	/**Name of the file with the transformation**/
//	final static String Transformation_Name = "Grafcet2PetriNet";
//	
//	/**Name of the file with the OCL constraints**/
//	final static String OCL_File_Name = "OCL_Constraints.txt";
//	
//	/**Name and extension of input MM**/
//	public final static String IN_MM = "Grafcet.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String IN_MM_NAME = "Grafcet";
//	/**Name and extension of output MM**/
//	public final static String OUT_MM = "PetriNet.ecore";
//	/**Name as it is in the ATL transformation**/
//	public final static String OUT_MM_NAME = "PetriNet";
//	/**Name of the Trace metamodel and its name within the transformation**/
//	public final static String Trace_MM = "Trace.ecore";
//	public final static String Trace_MM_NAME = "TM";
//	/**Name to be given to the trace models resulting from transformation execution**/
//	public final static String Trace_OutModel_Name = "Trace_out";
//	
//	//For executing the transformation that joins the models, we also need some parameters
//	//Next we specify the Joint Metamodel where both metamodels are merged
//	public final static String Joint_MM = "JointMM_Grafcet2PetriNet.ecore";
//	/* Provided we have the following transformation to merge input/output models
//	 * module MergeModels;
//	 * create OUT : JointModel from IN1 : BibTexModel, IN2 : DocBookModel;
//	 * Then we have the following parameters:
//	 */
//	public final static String IN_MM_NAME_TRAFO1 = "Grafcet";
//	public final static String IN_MM_NAME_TRAFO2 = "PetriNet";
//	public final static String OUT_MM_NAME_TRAFO = "JointModel";
//	public final static String IN_MODEL_NAME_TRAFO1 = "IN1";
//	public final static String IN_MODEL_NAME_TRAFO2 = "IN2";
//	public final static String OUT_MODEL_NAME_TRAFO = "OUT";
//	public final static String TRANSFO_MODULE_MERGE = "MergeModels"; //Name of the transformation file
//	
//	/**Take also into account the following to be touched within the code**/
//	/**We have also added the following in the main method**/
//	//JointPackage_BibTeX2DocBookPackage.eINSTANCE.eClass();
//	
//	/**Finally, we also have to change the following line, which is in method getListResultVector
//	 * We have to put the corresponding JointPackage**/
//	//helper.setContext(JointMM_Grafcet2PetriNet.Literals.JOINT_MM);
	/**************************** END OF PARAMETERS FOR THE GRAFCET2PETRINET EXAMPLE ********************************/	
	
	static Random randomGenerator = new Random();
	

	public static void main(String[] args) throws ParserException, IOException, ATLCoreException, InterruptedException  {
		long startTime = System.nanoTime();
		
		//These two lines must always go there, and the respective packages have to be in 'src'		
		ATLPackage.eINSTANCE.eClass();
		TracePackage.eINSTANCE.eClass();
		
		Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
				
		/**In this method, several transformations, both in EMF and EMFTVM execution models are automatically launched.
		 * We have generalized the executions of the latter so that any number of source models can be taken as input and any number
		 * of target models can be produced as output. For this reason, we create lists with the names/paths of
		 * source/target models and metamodels**/
		//The following list keeps the paths of all the input metamodels, the path from the executionsCanPath
		List<String> IN_MM_PATHS = new ArrayList<String>();
		//The following list keeps the paths of all the output metamodels, the path from the executionsCanPath
		List<String> OUT_MM_PATHS = new ArrayList<String>();
		//The following list keeps the names of all the input metamodels in the transformation
		List<String> IN_MM_NAMES_TRAFO = new ArrayList<String>();
		//The following list keeps the names of all the output metamodels in the transformation
		List<String> OUT_MM_NAMES_TRAFO = new ArrayList<String>();	
		//The following list keeps the names of all the input models in the transformation (the typical "IN")
		List<String> IN_MODEL_NAMES_TRAFO = new ArrayList<String>();
		//The following list keeps the names of all the output models in the transformation (the typical "OUT")
		List<String> OUT_MODEL_NAMES_TRAFO = new ArrayList<String>();
		
		/**We call the corresponding method to execute all the transformations**/
		ATL_EMF_Launcher.executeATLTransformation(executionsCanPath, folderTransformations, IN_MM, OUT_MM, Joint_MM, 
				IN_MM_NAME, OUT_MM_NAME, Trace_MM_NAME,	Trace_OutModel_Name, Transformation_Name, NUM_MODELS, NUM_MUTANTS);
		
		/**Now we call the corresponding method to execute the transformations to join in one model the source and target models of the 
		 * transformations executed in the previous step. 
		 * In most cases, the following EMFTVM model transformation is used.
		 * For generalization purposes, we have prepared this transformation to admit several source and target models/metamodels. For this reason, we first create lists.
		*/
		IN_MM_PATHS.add(IN_MM);
		IN_MM_PATHS.add(OUT_MM);
		OUT_MM_PATHS.add(Joint_MM);
		IN_MM_NAMES_TRAFO.add(IN_MM_NAME_TRAFO1);
		IN_MM_NAMES_TRAFO.add(IN_MM_NAME_TRAFO2);
		OUT_MM_NAMES_TRAFO.add(OUT_MM_NAME_TRAFO);
		IN_MODEL_NAMES_TRAFO.add(IN_MODEL_NAME_TRAFO1);
		IN_MODEL_NAMES_TRAFO.add(IN_MODEL_NAME_TRAFO2);
		OUT_MODEL_NAMES_TRAFO.add(OUT_MODEL_NAME_TRAFO);
		
		 /** Select the following transformation for the
		 * UML2ER case study
		 * HSM2FSM case study**/
		ATL_EMFTVM_Launcher.executeATLTransformationSeveralTimes(executionsCanPath, IN_MM_PATHS, OUT_MM_PATHS, IN_MM_NAMES_TRAFO, OUT_MM_NAMES_TRAFO, IN_MODEL_NAMES_TRAFO,OUT_MODEL_NAMES_TRAFO,
														null, null,	executionsCanPath + "/", TRANSFO_MODULE_MERGE,	NUM_MODELS, NUM_MUTANTS);	
		
		/**In some other cases, we need an EMF model transformation, since the previous one does not work as desired
		 * Select the following transformation for the
		 * PetriNet2PNML case study
		 * Grafcet2PetriNet case study
		 */
//		ATL_EMF_Launcher.executeATLTransformation2(executionsCanPath, folderTransformations, IN_MM, OUT_MM, Joint_MM, IN_MM_NAME, OUT_MM_NAME, OUT_MM_NAME_TRAFO, TRANSFO_MODULE_MERGE, NUM_MODELS, NUM_MUTANTS);	

		//The following line produces an error, but then it continues and it is executed properly
		System.out.println("If the error \"java.lang.ClassCastException: org.eclipse.emf.ecore.impl.EFactoryImpl cannot be cast to jointPackage.JointPackageFactory\" comes next, simply ignore it.");
		JointPackage_UML2ERPackage.eINSTANCE.eClass();
		JointPackage_HSM2FSMPackage.eINSTANCE.eClass();
		JointPackage_PetriNet2PNMLPackage.eINSTANCE.eClass();
		JointPackage_Grafcet2PetriNetPackage.eINSTANCE.eClass();
				
		//We call the following method that creates the CSV file with output
		writeMutationAnalysisCSV();
		
		long totalTime = System.nanoTime() - startTime;
		System.out.println("\n The whole execution has taken " + TimeUnit.NANOSECONDS.toMillis(totalTime) + " miliseconds.");
	}

	
	/**
	 * 
	 * @param numScenarios is the number of scenarios that have been executed for the MT. Therefore, in the path we 
	 * must have a folder called scenarioX for each of the scenarios
	 * @return For each OCL constraint that we have in our file given by the global vble oclFileName, we store an array where, for each scenario, we 
	 * write 1 if the constraint fails and 0 if it does not fail. Therefore, it returns a list of arrays. The size of the arrays is given by
	 * the number of scenarios
	 * @throws IOException
	 * @throws ParserException
	 */
	public static File writeMutationAnalysisCSV() throws IOException, ParserException{
		System.out.println("\nTHE OCL CONTRACTS THAT ARE NOT SATISFIED FOR EACH MUTANT AND SOURCE MODEL ARE:\n");
		File result = new File(executionsCanPath + "/results/" + Transformation_Name + "--" + "MutationAnalysis.csv");
		if (result.exists()) result.delete();
		result.createNewFile();
		FileWriter fw = new FileWriter(result.getAbsoluteFile());
		BufferedWriter bw = new BufferedWriter(fw);
		
		//Let's write the header with source models names
		bw.write(";");
		for (int i=1; i<=NUM_MODELS; i++) {
			bw.write("Model"+i + ";");
		}
		bw.write("\n");
		
		//For the transformation output with each mutant, we check OCL constraints
		for (int i=1; i<=NUM_MUTANTS; i++) {
			bw.write("Mutant"+i + ";");
			/**Each OCL constraint has to be tested for each model**/
			for (int j=1; j<=NUM_MODELS; j++){
				
				//Let's read file with OCL constraints
				FileReader reader = new FileReader(executionsCanPath + "/" + OCL_File_Name);
				BufferedReader br = new BufferedReader(reader);
				String line = br.readLine(); //For reading the file with the OCL expressions
				int oclNumber = 1;
				while (line != null){
					if (!line.equals("") && !line.substring(0,1).equals(" ") && !line.substring(0, 2).equals("--") ) { //If it is, then it is a comment or an empty line
						//System.out.println("***OCL" + oclNumber + " constraint processed***");	
						//System.out.println(line);
						
						//The following code is for loading the JointModel with the input and output models of the jth mdoel and ith mutant 
						ResourceSet resourceSet = new ResourceSetImpl();
						resourceSet.getResource(URI.createFileURI(executionsCanPath + "/" + MODELS_FOLDER + "/" + INDIVIDUAL_MODEL_FOLDER + j + "/" + Joint_Model_Name + j + "_Mutant" + i + ".xmi"), true);				
						Resource resource = resourceSet.getResources().get(0);
						EObject rootClass = EcoreUtil.getRootContainer(resource.getContents().get(0));
						
						//System.out.println("Root class of model in scenario " + j + ": " + rootClass);
		
						//The following code is for checking the OCL constraint and storing the result in the resultVector
						OCL ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
						OCLHelper helper = ocl.createOCLHelper();
						helper.setContext(JointPackage_UML2ERPackage.Literals.JOINT_MM);
//						helper.setContext(JointPackage_HSM2FSMPackage.Literals.JOINT_MM);
//						helper.setContext(JointPackage_PetriNet2PNMLPackage.Literals.JOINT_MM);
//						helper.setContext(JointPackage_Grafcet2PetriNetPackage.Literals.JOINT_MM);
	
						ConstraintImpl constraint = (ConstraintImpl) helper.createInvariant(line);
						Query constraintEval = (Query) ocl.createQuery(constraint);
						int failure = constraintEval.check(rootClass) ? 0 : 1; //1 if there is failure, 0 otherwise
						if (failure==1) {
							bw.write("OCL"+oclNumber + " ");
							System.out.println("IN MUTANT " + i + ",  OCL " + oclNumber + " FAILED FOR SOURCE MODEL " + j);
						}
						oclNumber++;
					}
					line = br.readLine();
				}
				bw.write(";");
				br.close();
			}
			bw.write("\n");	
			}
		bw.close();
		
		System.out.println("\n\nTHE CSV FILE WITH THE MUTATION ANALYSISRESULTS IS AVAILABLE AT:");
		System.out.println(executionsCanPath + "/results/" + Transformation_Name + "--MutationAnalysis.csv\n");
		return result;
	}
	
}
