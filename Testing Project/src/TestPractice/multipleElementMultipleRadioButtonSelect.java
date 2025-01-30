package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElementMultipleRadioButtonSelect 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/All%20Automation%20V%20Rec/Selenium%20Vel/multipleRadioButton.html");
		List<WebElement> allradio = driver.findElements(By.xpath("//input[@type='radio']"));
		
		
		for(WebElement allselect:allradio)
		{
			allselect.click();
			Thread.sleep(3000);
		}
		Thread.sleep(2000);
		
		for(WebElement alldeselect:allradio)
		{
			alldeselect.click();
			Thread.sleep(3000);
		}
		
		for(WebElement allRadioButton:allradio)
		{
			if(allRadioButton.getAttribute("value").equals("5"))
			{
				Thread.sleep(2000);
				allRadioButton.click();
				
			}
		}
		
	}

}
