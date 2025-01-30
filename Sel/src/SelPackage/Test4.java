package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		String s =driver.getCurrentUrl();
		System.out.println("current url"+s);
		
		String title=driver.getTitle();
		System.out.println("Title"+title);
		
		
		
	}

}
