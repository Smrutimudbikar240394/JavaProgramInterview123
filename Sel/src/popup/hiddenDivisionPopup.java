package popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com");
		
		driver.findElement(By.xpath("(//span[text()='Signup'])[1]")).click();
		
		//enter mobile number
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7558686124");
		
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//span[@class='mat-ripple mat-button-ripple mat-button-ripple-round']")).click();
		
	}

}
