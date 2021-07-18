package TestCases;

public class Report {

	
	
	
	public void ReportPass(String sStep, String sDescription) {
		
		System.out.println("Pass - "+sStep+ "-----" + sDescription);

		
	}
	
	public void ReportFail(String sStep, String sDescription) {
		
		System.out.println("Fail - "+sStep+ "-----" + sDescription);

		
	}
	
	public void ReportDone(String sStep, String sDescription) {
		
		System.out.println("StepReport - "+sStep+ "-----" + sDescription);

	}

}
