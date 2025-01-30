package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingOfDropdown 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		WebElement loginbtn=driver.findElement(By.xpath("//span[text()='Login']"));
		
		Actions act=new Actions(driver);
		
		act.moveToElement(loginbtn).perform();
		
		driver.findElement(By.xpath("(//div[@class='_3pKU-e'])[6]")).click();
		
		
		driver.close();
		
	}

}
