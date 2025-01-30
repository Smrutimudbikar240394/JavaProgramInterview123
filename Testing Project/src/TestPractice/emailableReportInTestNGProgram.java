package TestPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class emailableReportInTestNGProgram 
{
	
	@Test
	public void TC1() throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com");
		
		
		Thread.sleep(3000);
		driver.close();
	}
	@Test
	public void TC2()
	{
		Reporter.log("TC2 Running");
		
	}
	@Test
	public void TC3()
	{
		Reporter.log("TC3 running",false);
	}
	
	@Test
	public void TC4()
	{
		Reporter.log("TC 4 Running",true);
	}
	
	
	@Test
	public void TC5()
	{
		System.out.println("TC 5 running");
	}
	
	

}
