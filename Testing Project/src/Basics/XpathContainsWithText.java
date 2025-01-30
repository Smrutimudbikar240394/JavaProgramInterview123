package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathContainsWithText 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//a[contains(text(),'Already')]")).click();
		
		driver.findElement(By.xpath("//button[contains(@name,\"login\")]")).click();
		
		
		
	}

}
