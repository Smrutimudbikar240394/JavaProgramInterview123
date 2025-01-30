package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchToFrame 
{
	public static void main(String[] args) throws Exception
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		
		//switch to frame
		//driver.switchTo().frame(0);
		
		driver.switchTo().frame("iframeResult");//name
		driver.switchTo().frame("iframeResult");    //id
		
		
		//click on button date and time
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
