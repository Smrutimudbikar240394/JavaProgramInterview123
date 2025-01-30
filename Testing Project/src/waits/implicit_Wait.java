package waits;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_Wait 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(20));
		
		driver.quit();
		
	}

}
