package testNGpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class parallel1
{
	@Test
	public void chromeMethod()
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
	}
	
	
	
	

	

}
