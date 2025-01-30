package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByText 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//a[text()=\"Sign up for Facebook\"]")).click();
		
		driver.quit();
		
	}

}
