package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;



public class TestNGKeywords 
{
	
	@Test(invocationCount = 5)
	public void verifyLogo()
	{
		Reporter.log("----Logo Verified-----",true);
	}
	
	@Test(priority = 2)
	public void verifyLogoMessage()
	{
		Reporter.log("----Logo  Message Verified-----",true);
	}
	@Test(priority = 1)
	public void TC1()
	{
		Reporter.log("---Running TC1---",true);
	}
	@Test(enabled = false)
	public void TC2()
	{
		Reporter.log("----Running TC2--",true);
	}
	@Test
	public void TC3()
	{
		Reporter.log("-----Running TC3---",true);
	}
	@Test(timeOut = 2000)
	public void TC4() throws InterruptedException
	{
		Thread.sleep(2000);
		Reporter.log("-----Running TC4---",true);
	}
	
	@Test()
	public void TC5()
	{
		Reporter.log("-----Running TC5---",true);
	}
	@Test(dependsOnMethods = {"TC5"})
	public void TC6()
	{
		Reporter.log("-----Running TC6---",true);
	}
	

}
