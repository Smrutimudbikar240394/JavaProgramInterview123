package HandleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleTetxbox 
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/text-box.php");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Smruti");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'email')]")).sendKeys("abc@gmail.com");
		
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("Anand Nagar ,Tathagat Chowk,Latur");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("smruti@123");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
		
	}

}
