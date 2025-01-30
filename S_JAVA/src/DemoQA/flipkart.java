package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkart 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/account/login?ret=");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']")).sendKeys("7558686124");
		driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']")).click();
		
	}

}
