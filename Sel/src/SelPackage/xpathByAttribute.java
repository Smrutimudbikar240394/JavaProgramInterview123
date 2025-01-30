package SelPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute {
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("smrutimudbikar@gmail.com");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("smruti243");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
