package Basics;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserSettingAndConfigurationMethods 
{
	public static void main(String[] args) throws Exception
	{
		
		WebDriver driver=new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2000));
		
		driver.navigate().to("https://www.nykaa.com");
		Thread.sleep(2000);
		
		
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		driver.manage().window().minimize();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		
		
		driver.get("https://www.flipkart.com");
		Thread.sleep(2000);
		
		driver.manage().window().fullscreen();
		Thread.sleep(2000);
		
		driver.manage().deleteAllCookies();
		
		
		driver.close();
		
	}

}
