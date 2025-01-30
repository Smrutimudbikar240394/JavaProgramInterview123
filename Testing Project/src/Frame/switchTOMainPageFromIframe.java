package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class switchTOMainPageFromIframe
{
	public static void main(String[] args) throws Exception 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		//switch to frame
		driver.switchTo().frame("iframeResult");
		//click on button date and time
		driver.findElement(By.xpath("//button[contains(text(),'Date and Time')]")).click();
		Thread.sleep(2000);
		
		//Switch to main page from frame
		driver.switchTo().defaultContent();     //any child to main page
		driver.switchTo().parentFrame();        //child to immediate parent fram
		driver.findElement(By.xpath("//a[@id='menuButton']")).click();
	}

}
