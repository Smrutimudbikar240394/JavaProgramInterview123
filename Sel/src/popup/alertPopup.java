package popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Sel.webDriverMethod;

public class alertPopup 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete_customer.php");
		driver.findElement(By.xpath("//input[@name='cusid']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//input[@value='Submit']")).click();
		
		//String text=driver.switchTo().alert().getText();
		//System.out.println(text);
		Alert alt=driver.switchTo().alert();
		//alt.accept();
		Thread.sleep(3000);
		alt.dismiss();
		//alt.accept();
		driver.findElement(By.xpath("//input[@value='Reset']")).click();
		
		
	}

}
