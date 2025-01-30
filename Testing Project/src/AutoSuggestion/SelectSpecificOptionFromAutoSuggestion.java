package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectSpecificOptionFromAutoSuggestion 
{
	
	
		public static void main(String[] args) throws InterruptedException 
		{
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.google.com");
			
			//enter input
			driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("Redmi");
			
			Thread.sleep(2000);
			
			String expText="redmi note 14";
			
			List<WebElement> allOptions = driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]/li//div[@class='wM6W7d']"));
			
			for(WebElement option:allOptions)
			{
				System.out.println(option.getText());
				
				String actText=option.getText();
				if(actText.equals(expText))
				{
					option.click();
					break;
				}
				
			}
			
			
		}

	

}
