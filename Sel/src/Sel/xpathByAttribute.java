package Sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpathByAttribute 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().fullscreen();
		
		// xpath by Attribute :  //tagname[@attributeName='value']
		WebElement fullName=driver.findElement(By.xpath("//input[@id='userName']"));
		fullName.sendKeys("test");
		
		WebElement email=driver.findElement(By.xpath("//input[[@type='email']"));
		email.sendKeys("abc@gmail.com");
		
	}

}
