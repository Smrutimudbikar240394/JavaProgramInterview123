package testNGpckg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AllTestSuiteVerification 
{
	@BeforeClass
	public void BeforeClassMethod()
	{
		System.out.println("Before class method running");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("Before Method Running", true);
	}
	
	@Test()
	public void testmethod1()
	{
		System.out.println("test1 running");
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
	
	

	@Test()
	public void testMethod5() throws Exception
	{
		Thread.sleep(8000);
		System.out.println("test 5 running");
	}
	
	

	@Test()
	public void testMethod6()
	{
		System.out.println("test 6 running");
	}
	
	

	@Test()
	public void testMethod7()
	{
		System.out.println("test 7 running");
	}
	
	

	@Test()
	public void testMethod8()
	{
		System.out.println("test 8 running");
	}
	

	@Test()
	public void testMethod9()
	{
		System.out.println("test 9 running");
	}
	

	@Test()
	public void testMethod10()
	{
		System.out.println("test 10 running");
	}
	
	
	
	@Test(dependsOnMethods = {"register"})
	public void login()
	{
		System.out.println("Login page");
	}
	
	@Test
	public void register()
	{
		Assert.fail("fail testcase");
		Reporter.log("register msg",false);
		//System.out.println("register page");
	}
	
	
	@AfterMethod
	public void aftermethod()
	{
		System.out.println("After method running");
	}
	
	@AfterClass
	public void afterclassmethod()
	{
		System.out.println("after class method running");
		
	}
	

}
