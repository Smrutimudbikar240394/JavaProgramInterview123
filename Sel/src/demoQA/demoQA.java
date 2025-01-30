package demoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQA
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("test123");
		//driver.findElement(By.xpath("//input[contains(@id,'last')]")).sendKeys("test1234");
		//driver.findElement(By.xpath("//input[@class='mr-sm-2 form-control']")).sendKeys("abc@gmail.com");
		//driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("7558686124");
		//driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Pune maharashtra");
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.quit();
		
		
		
	}

}
