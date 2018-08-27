package com.config;

public class Constants {
	
	public static final String URL0 = "https://monclubfacile.preprod.opunmaif.fr/";
	public static final String URL1 = "https://monclubfacilebackoffice.preprod.opunmaif.fr/";
	public static final String Path_TestData = "C://Users//rpoton//eclipse-workspace//MonClubFacile//src//test//java//dataEngine//DataEngine0.xlsx";
	public static final String Path_TestData1 = "C://Users//rpoton//eclipse-workspace//MonClubFacile//src//test//java//dataEngine//DataEngine1.xlsx";
	public static final String Path_OR = "C://Users//rpoton//eclipse-workspace//MonClubFacile//src//test//java//com//config//OR";
	public static final String File_TestData0 = "DataEngine0.xlsx";
	public static final String File_TestData1 = "DataEngine1.xlsx";
	
	//List of Data Sheet Column Numbers
		public static final int Col_TestCaseID = 0;	
		public static final int Col_TestScenarioID =1 ;
		//This is the new column for 'Page Object'
		public static final int Col_PageObject =3 ;
		//This column is shifted from 3 to 4
		public static final int Col_ActionKeyword =4;
		//New entry in Constant variable
		public static final int Col_RunMode =2 ;
		
		//New entry for results column from both the sheets
		public static final int Col_Result =3 ;
		public static final int Col_DataSet =5 ;
		public static final int Col_TestStepResult =6 ;

		//List of Data Engine Excel sheets
		public static final String Sheet_TestSteps = "Test Steps";
		//New entry in Constant variable
		public static final String Sheet_TestCases = "Test Cases";
		
		//Create two new Constants variables for the Pass results & Fail result
		public static final String KEYWORD_FAIL = "FAIL";
		public static final String KEYWORD_PASS = "PASS";
		
	
		// List of Test Data
			public static final String UserName = "romaric.poton@yopmail.com";
			public static final String Password = "Rom@ric2014";
			
			public static final String UserName1 = "romaric9.poton@yopmail.com";
			public static final String Password1 = "Rom@ric2014";

}
