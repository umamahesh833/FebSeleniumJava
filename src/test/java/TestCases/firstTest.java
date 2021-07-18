package TestCases;

import org.testng.annotations.Test;



public class firstTest {
	CommonMethods ObjComm = new CommonMethods();
	Report Logreport = new Report();
	
	@Test
	public void AddUser() {	
		

		ObjComm.fnLaunchApplication("http://primusbank.qedgetech.com/");
		//Logreport.ReportPass("Application Launching", "Application was successfully launched");
		
		ObjComm.fnSelectBranch("ATS123");
		//Logreport.ReportPass("Selecting a Branch", "Selecting a branch was successfully");
		
		
		ObjComm.fnLoginApp("Admin", "Admin");
		//Logreport.ReportPass("Login to the application", "Application login was successfully");
		
//		ObjComm.ClickUsers();		
//		ObjComm.ClickNewUsers();		
//		ObjComm.AddUser("icustomer", "ATS123", "1");		
//		ObjComm.VerifyConfirmationMessage();		

		
	}
	
	@Test 
	public void CreateInternationlBankAccount() {	
			ObjComm.fnLaunchApplication("http://primusbank.qedgetech.com/");
			//Logreport.ReportPass("Application Launching", "Application was successfully launched");
			
			ObjComm.fnSelectBranch("asdf");
			//Logreport.ReportPass("Selecting a Branch", "Selecting a branch was successfully");
			
			
			ObjComm.fnLoginApp("Admin", "Admin");
			//Logreport.ReportPass("Login to the application", "Application login was successfully");
			
			ObjComm.ClickUsers();
			
			ObjComm.ClickNewUsers();
			
			ObjComm.AddUser("icustomer", "ATS123", "1");
			
			ObjComm.VerifyConfirmationMessage();

	}

}
