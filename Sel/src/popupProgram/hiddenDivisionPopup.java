package popupProgram;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivisionPopup 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mobikwik.com/");
		
		driver.findElement(By.xpath("//span[text()='Login'][1]")).click();
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("12345678");
		
	}

}
