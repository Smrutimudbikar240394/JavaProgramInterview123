package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewWindowMethod 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com");
		
		Thread.sleep(2000);
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.flipkart.com");
		
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.get("https://www.amazon.in");
		
		driver.quit();
		
		
		
		
	}

}
