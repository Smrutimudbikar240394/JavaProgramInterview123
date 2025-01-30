package Sel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigateionMethod 
{
	public static void main(String[] args) 
	{
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.youtube.com/watch?app=desktop&v=cj7XthqRLR0");
			//driver.navigate().to("");
			
			driver.navigate().forward();
			driver.navigate().back();
			driver.navigate().refresh();
			driver.get("https://demoqa.com/automation-practice-form");
			
	
	}
}
