package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 
{

	public static void main(String[] args) {
		
		System.out.println("Hiiiiiiiiiiiiiiiiiii");
		//System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		//driver.get(null);
		driver.get("https://www.sql-practice.com");
		//driver.findElement(By.id("First Name"));
		
		
	}
}
