package testNGpckg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailablereport 
{
	@Test
	public void emailable_report_method()
	{
		Reporter.log("abc",true);
	}
	
	@Test
	public void printmsg()
	{
		System.out.println("msg printing");
	}
	
	

}
