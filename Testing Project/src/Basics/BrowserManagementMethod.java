package Basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserManagementMethod
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		Thread.sleep(2000);
		
		String url1=driver.getCurrentUrl();
		System.out.println(url1);
		Thread.sleep(2000);
		
		String title1=driver.getTitle();
		System.out.println(title1);
		Thread.sleep(2000);
		
		String pagesource1=driver.getPageSource();
		System.out.println(pagesource1);
		Thread.sleep(2000);
		
		
		driver.quit();
		//driver.close();
		
		
		
		
	}

}
