package testNGpckg;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class softAssert 
{
	@Test()
	public void testMethod2()
	{
		SoftAssert sa1=new SoftAssert();
		
		
		String a1="abc 1";
		String a2="abc 1";
		
		//sa1.assertAll();
		sa1.assertNotEquals(a1, a2,"both are equal");
		
		
		
		System.out.println("test 2 running");
	}

}
