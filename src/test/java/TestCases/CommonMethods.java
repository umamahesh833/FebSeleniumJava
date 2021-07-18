package TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class CommonMethods {
	
	WebDriver driver;
	
	Report reportLog = new Report();

	
	
	public void fnLaunchApplication(String sUrl) {		
		
	    System.setProperty("webdriver.chrome.driver","C:\\FebSoftware\\BrowserDrivers\\chromedriver.exe");		
	    driver = new ChromeDriver();	
	    reportLog.ReportDone("Browser Launched", "Browser was launched successfully");
		//Adding implicit wait to driver
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		
		//maximizing the browser
		driver.manage().window().maximize();	
		reportLog.ReportDone("Browser maximized", "Browser was Maximized successfully");
		
		
		//Navigating to url
		driver.navigate().to(sUrl);	
		reportLog.ReportPass("Navigated to URL", "Browser navigated to URL "+sUrl);
		
		//Add page load time
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
	}
	
	
	public void fnSelectBranch(String sBranch) {
		
		
	WebElement BranchDrop = 	driver.findElement(By.xpath("//select[@name='drlist']"));
	
	Select sel = new Select(BranchDrop);
	
	sel.selectByValue(sBranch);	
	reportLog.ReportDone("Selecting Branch", "successfully selected branch - "+sBranch);
		
	}
	
	
	public void fnLoginApp(String sUserNme, String sPassword) {
		//Enter user name
		driver.findElement(By.xpath("//input[@name='txtuId']")).sendKeys(sUserNme);
		reportLog.ReportDone("Entering user name", "successfully entred - "+sUserNme);
		
		//Enter password
		driver.findElement(By.xpath("//input[@name='txtPword']")).sendKeys(sPassword);
		reportLog.ReportDone("Entering password", "successfully entred - "+sPassword);
		
		//Click on Login buttom
		driver.findElement(By.xpath("//input[@name='login']")).click();
		reportLog.ReportPass("Login button click", "successfully Logged into the application");
	}
	
	
	
	public void ClickUsers() {
		//Click on Users buttom
		driver.findElement(By.xpath("//a[@href='userdetails.aspx']")).click();
	}
	
	public void ClickNewUsers() {
		//Click on NewUsers buttom
		driver.findElement(By.xpath("//input[@name='Btnuser']")).click();
		
	}
	
	public void AddUser(String sRole, String sBranch, String sCustomerID) {
		WebElement Role = driver.findElement(By.xpath("//select[@name='lst_Roles']"));
		Select ObjRole = new Select(Role);		
		ObjRole.selectByValue(sRole);	
		reportLog.ReportDone("Selecting Role", "successfully selected role - "+sRole);
		
		//Selecting Branch
		WebElement Branch = driver.findElement(By.xpath("//select[@name='lst_Branch']"));
		Select ObjBranch = new Select(Branch);		
		ObjBranch.selectByValue(sBranch);	
		reportLog.ReportDone("Selecting Branch", "successfully selected Branch - "+Branch);
		
		//Selecting CustomerID
		WebElement CustomerID = driver.findElement(By.xpath("//select[@name='DrCName']"));
		Select ObjCustomerID = new Select(CustomerID);		
		ObjCustomerID.selectByValue(sCustomerID);	
		reportLog.ReportDone("Selecting CustomerID", "successfully selected CustomerID - "+sCustomerID);
		
		
		//driver.findElement(By.xpath("//input[@name='Lbc_name']")).sendKeys("Testingone");
		
		driver.findElement(By.xpath("//input[@name='txtUname']")).sendKeys("Testingone");
		
		driver.findElement(By.xpath("//input[@name='txtLpwd']")).sendKeys("Testingone");
		
		driver.findElement(By.xpath("//input[@name='txtTpwd']")).sendKeys("Testingone");
		
		driver.findElement(By.xpath("//input[@name='BtnSubmit']")).click();		
		
	}
	
	public void VerifyConfirmationMessage() {
		
		String opt = driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();		
		System.out.println(opt);
		
		if(opt.contains("added Sucessfully")) {
			reportLog.ReportPass("Verify test case status", "successfully user created success message");
		}else {
			reportLog.ReportFail("Verify test case status", "user created success message is not displaying");
		}
		

	}
	
	
	
	
	
	
	

}
