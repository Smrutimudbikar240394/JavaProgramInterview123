package DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Documents/abc.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("test");
		driver.findElement(By.xpath("//input[@placeholder='Enter Password']")).sendKeys("testing123");
		driver.findElement(By.xpath("//input[@placeholder='Repeat Password']")).sendKeys("testing123");
		driver.findElement(By.xpath("//input[@id='html']")).click();
		WebElement vehicle1=driver.findElement(By.xpath("//input[contains(@name,'vehicle1')]"));
		vehicle1.click();
		WebElement check1=driver.findElement(By.xpath("//input[@value='Boat']"));
		check1.click();
		if(check1.isEnabled())
		{
			System.out.println("checked already");
		}
		else
		{
			System.out.println("Not selected");
		}
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='registerbtn']")).click();
		
	}

}
