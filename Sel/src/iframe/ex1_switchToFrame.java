package iframe;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1_switchToFrame 
{
	public static void main(String[] args) 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//driver.switchTo().frame("iframeResult");
		//driver.switchTo().frame("iframeResult");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']")));
		 
		driver.findElement(By.xpath("//button[contains(text(),'display Date and Time')]")).click();
		
		
	}

}
