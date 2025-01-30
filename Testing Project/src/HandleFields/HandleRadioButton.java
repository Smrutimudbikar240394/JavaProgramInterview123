package HandleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton 
{
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/radio-button.php");
		Thread.sleep(2000);
		
		WebElement yes=driver.findElement(By.xpath("//input[contains(@value,'igottwo')]"));
		
		yes.click();
		if(yes.isDisplayed())
		{
			System.out.println("yes button checked");
		}
		else
		{
			System.out.println("yes not checked");
		}
		
		
		WebElement disable1=driver.findElement(By.xpath("//input[contains(@value,'option3')]"));
		if(disable1.isEnabled())
		{
			System.out.println("enabled");
		}
		else
		{
			System.out.println("disabled");
		}
		
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
