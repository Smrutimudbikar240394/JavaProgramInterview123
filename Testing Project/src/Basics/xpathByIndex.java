package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByIndex 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[1]")).sendKeys("smruti");
		
		driver.findElement(By.xpath("(//input[@type=\"text\"])[2]")).sendKeys("MMMM");
		
		
		//Thread.sleep(2000);
		
		
		
		driver.quit();
		
		
	}

}
