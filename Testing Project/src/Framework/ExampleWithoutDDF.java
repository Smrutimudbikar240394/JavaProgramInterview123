package Framework;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWithoutDDF
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//UN
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("standard_user");
		
		
		//pwd
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("secret_sauce");
		
		//login btn
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		
		//get Title
		String actTitle=driver.getTitle();
		String expTitle="Swag Labs";
		
		if(actTitle.equals(expTitle))
		{
			System.out.println("TC Pass");
		}
		else
		{
			System.out.println("TC fail");
		}
	}

}
