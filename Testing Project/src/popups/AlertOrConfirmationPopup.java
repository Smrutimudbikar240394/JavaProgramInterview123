package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert;





public class AlertOrConfirmationPopup 
{
	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		
		String popuptext=driver.switchTo().alert().getText();
		String expText="Do you really want to delete this Customer?";
		System.out.println("popup text is:     "+popuptext );
		
		Thread.sleep(2000);
		
		
		
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		
		
		
		
		//driver.switchTo().alert().accept();
		driver.quit();
	}

}
