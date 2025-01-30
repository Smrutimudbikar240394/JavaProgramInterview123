package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hiddenDivisionPopup
{
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.mobikwik.com");
		
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Login'])[1]")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='userId']")).sendKeys("75586861245");
		
		Thread.sleep(2000);
		driver.quit();
		
	}

}
