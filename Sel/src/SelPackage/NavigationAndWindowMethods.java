package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAndWindowMethods 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.sql-practice.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		driver.switchTo().newWindow(WindowType.WINDOW);
		driver.switchTo().newWindow(WindowType.TAB);
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		driver.manage().window().fullscreen();
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		
		driver.close();

		
	}

}
