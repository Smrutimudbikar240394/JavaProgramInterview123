package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class webDriverMethod 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		//driver.manage().window().maximize();
		
		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		
		
		//driver.close();
		//driver.quit();
		
		String title=driver.getTitle();
		System.out.println("title"+title);
		
		String url=driver.getCurrentUrl();
		System.out.println(url);
		
		
		
		Thread.sleep(2000);
		//driver.switchTo().newWindow(WindowType.TAB);
		driver.switchTo().newWindow(WindowType.WINDOW);
		
		Thread.sleep(3000);
		driver.quit();
		
		
		
	}

}
