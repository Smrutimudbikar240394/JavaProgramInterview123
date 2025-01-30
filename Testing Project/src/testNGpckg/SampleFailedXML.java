package testNGpckg;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SampleFailedXML
{
	
		@BeforeClass
		public void BeforeClassMethod()
		{
			System.out.println("-----Before class method running");
		}
		
		@BeforeMethod
		public void beforeMethod()
		{
			Reporter.log("-----------Before Method Running", true);
		}
		
		@Test()
		public void testmethod21()
		{
			System.out.println("---------test1 running");
		}
		
		@Test()
		public void testMethod22()
		{
			System.out.println("-------------test 2 running");
		}
		
		@Test
		public void testMethod23()
		{
			Reporter.log("-----------test 3 running");
		}
		

		@Test
		public void testMethod24()
		{
			
			
			String abc1="abc1";
			String pqr1="pqr1";
			SoftAssert soft=new SoftAssert();
			soft.assertEquals(abc1,pqr1,"both are not same");
		
			soft.fail();
			
			System.out.println("----------test 4 running");
		}
		
		

		@Test(timeOut = 2000)
		public void testMethod25() throws Exception
		{
			Thread.sleep(8000);
			System.out.println("----test 5 running");
		}
		
		

		
		@AfterMethod
		public void aftermethod()
		{
			System.out.println("-----After method running");
		}
		
		@AfterClass
		public void afterclassmethod()
		{
			System.out.println("--------after class method running");
			
		}
		

	


}
