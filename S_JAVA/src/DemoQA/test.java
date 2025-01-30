package DemoQA;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/register");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("test123");
		driver.findElement(By.xpath("//input[contains(@id,'last')]")).sendKeys("test1234");
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("testing123");
		driver.findElement(By.id("password")).sendKeys("123");
		driver.findElement(By.id("register")).click();
		
	
		
		
		
		
		
	}

}
