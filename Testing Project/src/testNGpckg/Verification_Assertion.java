package testNGpckg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Verification_Assertion 
{

	@Test()
	public void testMethod1()
	{
		String abc="abc 1";
		String pqr="pqr 1";
		
		Assert.assertEquals(abc,pqr);
		System.out.println("test 1 running");
		
	}
	
	
	@Test()
	public void testMethod2()
	{
		String a1="abc 1";
		String a2="abc 1";
		Assert.assertNotEquals(a1, a2,"A1 and a2 are equals");
		
		System.out.println("test 2 running");
	}
	
	@Test
	public void testMethod3()
	{
		Assert.fail();
		Reporter.log("test 3 running");
	}
	

	@Test
	public void testMethod4()
	{
		System.out.println("test 4 running");
	}
	
}
