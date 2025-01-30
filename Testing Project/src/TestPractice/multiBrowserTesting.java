package TestPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class multiBrowserTesting 
{
	
	@Parameters("browserName")
	@Test
	public void multibrowserMethod(String browserName)
	  {
		WebDriver driver=null;
		if(browserName.equals("chrome"))
		{
			driver=new ChromeDriver();
			//driver.get("https://www.saucedemo.com");
		}
		
		else if(browserName.equals("firefox"))
		{
			driver=new FirefoxDriver();
			//driver.get("https://www.amazon.in");
		}
		
		else if(browserName.equals("edge"))
		{
			driver=new EdgeDriver();
			//driver.get("https://www.flipkart.com");
		}
		
		driver.get("https://www.flipkart.com");
		  
	  }
		
	

}
