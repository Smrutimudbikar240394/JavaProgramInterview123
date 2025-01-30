package testNGpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class p2 
{
	@Test
	public void fireFoxMethod()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void tc1()
	{
		System.out.println("-----------TC1      ");
	}

}
