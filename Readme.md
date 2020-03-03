# Mutation Analysis for the Multi-Objective Approach for Test Case Generation
Implementation of the Mutation Analysis for the Multi-Objective Approach for Test Case Generation

This project supports and verifies the mutation analysis performed in [1]. It has been developed with Eclipse Modeling Tools, version IDE 2019-12 R. ATL plugin is needed. 
There is a project named Mutation_Analysis.

**Mutation_Analysis**

This project contains the mutation analysis performed on four case studies [1].
Folders “analysis_caseStudyName” contain all the artifacts regarding each of the case studies. For instance, there is a file named "OCL_Constraints.txt" with the OCL contracts that serve as Oracle. The model transformation mutants are available in folder "transformations", and the models generated automatically by our multi-objective approach are located in folder "model" ("AutomaticModel_CaseStudyName[modelNumber].xmi").
  
The executable Java file is available at src->es.us.eii.mutation.analysis.main-> MutationAnalysis_Main.

In order to execute it with the different case studies and the different mutants, some lines of code must be commented and uncommented. After doing so, the class can be executed by right-clicking and selecting Run As -> Java Application. The code in this Java class contains explanations for executing each case study:
-	UML2ER. An explanation can be found in lines 65-69.
-	HSM2FSM. An explanation can be found in lines 71-75.
-	PetriNet2PNML. An explanation can be found in lines 77-81.
-	Grafcet2PetriNet. An explanation can be found in lines 83-87.

After executing the program, some information will be displayed in the console. At the end, it indicates the file with the result of the mutation analysis. This is a CSV file that is placed in the results folder of the corresponding analysis_caseStudyName folder.

[1] Meysam Karimi, Shekoufeh Kolahdouz-Rahimi, Javier Troya. "Test case generation for model transformation testing: a multi-objective approach". Submitted, 2020
