package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NykaApplication

{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/register.php");
		
		driver.findElement(By.id("firstname")).sendKeys("Smruti");
		
		driver.findElement(By.id("lastname")).sendKeys("Mudbikar");
		
		driver.findElement(By.id("username")).sendKeys("smruti123");
		
		driver.findElement(By.id("password")).sendKeys("smruti123");
		
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
		Thread.sleep(2000);
		driver.close();
		
		
	}

}
