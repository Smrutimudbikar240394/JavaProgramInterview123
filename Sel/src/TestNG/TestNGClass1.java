package TestNG;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGClass1 
{
	@Test
	public void TC1()
	{
		System.out.println("TC1 running");
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC 2 Running", true);
	}

}
