package testNGpckg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class aa 
{
	@Test
	public void TC3()         //test case  or test method
	{
		Reporter.log("--running TC3--",true);   //className.methodName("msg", true);
	}
	
	@Test
	public void TC1()         //test case  or test method
	{
		Reporter.log("--running TC1--",true); 
	}
	
	@Test
	public void TC2()         //test case  or test method
	{
		Reporter.log("--running TC2--",true); 
	}

}
