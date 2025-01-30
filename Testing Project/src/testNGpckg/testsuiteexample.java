package testNGpckg;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testsuiteexample 
{
	@Test()
	public void testMethod1()
	{
		System.out.println("test 1 running");
	}
	
	
	@Test()
	public void testMethod2()
	{
		System.out.println("test 2 running");
	}
	
	@Test
	public void testMethod3()
	{
		Reporter.log("test 3 running");
	}
	

	@Test
	public void testMethod4()
	{
		System.out.println("test 4 running");
	}
	

}
