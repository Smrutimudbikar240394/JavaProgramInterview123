package Basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute 
{
	public static void main(String[] args) {
		
	
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.tutorialspoint.com/selenium/practice/login.php");
	//driver.manage().window().fullscreen();
	
	// xpath by Attribute :  //tagname[@attributeName='value']
	WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
	email.sendKeys("abc@gmail.com");
	
	WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
	pass.sendKeys("abc@123");
	
	WebElement click1=driver.findElement(By.xpath("//input[@value='Login']"));
	click1.click();
	
	
	}
}