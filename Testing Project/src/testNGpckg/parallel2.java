package testNGpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel2 
{
	@Test
	public void fireFoxMethod()
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com");
	}

}
