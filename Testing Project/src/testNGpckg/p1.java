package testNGpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class p1 
{
	@Test
	public void fireFoxMethod()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}
	
	@Test
	public void tc1()
	{
		System.out.println("TC1--------- ");
	}
	

}
