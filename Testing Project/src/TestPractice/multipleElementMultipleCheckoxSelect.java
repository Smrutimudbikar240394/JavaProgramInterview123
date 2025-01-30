package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElementMultipleCheckoxSelect
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/All%20Automation%20V%20Rec/Selenium%20Vel/multipleCheckbox.html");
		List<WebElement> Allcheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement acb1:Allcheckboxes)
		{
			acb1.click();
			Thread.sleep(2000);
		}
		
		for(int i=Allcheckboxes.size()-1;i>=0;i--)
		{
			Allcheckboxes.get(i).click();
			Thread.sleep(2000);
		}
		
		
	}

}
