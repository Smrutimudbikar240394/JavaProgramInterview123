package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByLinkText 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php");
		
		driver.findElement(By.linkText("Already have an account?")).click();
		
		
		driver.findElement(By.partialLinkText("Forgotten ")).click();
	}

}
