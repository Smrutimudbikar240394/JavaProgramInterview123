package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		//driver.get(null);
		 
		 //Get
		 driver.get("https://demoqa.com/automation-practice-form");
		 
		 
		 //GetTitle
		 String Title=driver.getTitle();
		 System.out.println("Title = "+Title);
		 
		 //getCurrentURL
		 String CurrentUrl=driver.getCurrentUrl();
		 System.out.println("CurrentURL=   "+CurrentUrl);
		 
		 //GetPageSource
		 String pageSource=driver.getPageSource();
		 System.out.println("PageSource=  "+pageSource);
		 
		 
		 //driver.findElement(By.id("New Browser Window")).;
		 
		 //close
		// driver.close();
		 
		 //quite
		// driver.quit();
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}

}
