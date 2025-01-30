package TestNG;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AnnotationTestNG 
{
	
	@BeforeClass
	public void openBrowser()
	{
		System.out.println("Browser Open");
	
	}
	@BeforeMethod
	public void loginToApp()
	{
		Reporter.log("Login to App",true);
	}
	@Test
	public void verifyLogo()
	{
		Reporter.log("Logo Verified", true);
	}
	@AfterMethod
	public void logoutToApp()
	{
		Reporter.log("Logout To App",true);
	}
	@AfterClass
	public void closeBrowser()
	{
		Reporter.log("Browser Close",true);
	}

}
