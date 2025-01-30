package TestNG;



import org.testng.Reporter;
import org.testng.annotations.Test;



public class Sample2
{
	
	@Test()
	public void verifyLogo1()
	{
		Reporter.log("----Logo Verified1-----",true);
	}
	
	@Test()
	public void verifyLogoMessage1()
	{
		Reporter.log("----Logo  Message Verified1-----",true);
	}
	@Test()
	public void TC11()
	{
		Reporter.log("---Running TC11---",true);
	}
	@Test()
	public void TC22()
	{
		Reporter.log("----Running TC22--",true);
	}
	@Test
	public void TC33()
	{
		Reporter.log("-----Running TC33---",true);
	}
	@Test()
	public void TC44() 
	{
		
		Reporter.log("-----Running TC44---",true);
	}
	
	@Test()
	public void TC55()
	{
		Reporter.log("-----Running TC55---",true);
	}
	@Test()
	public void TC66()
	{
		Reporter.log("-----Running TC66---",true);
	}
	

}




