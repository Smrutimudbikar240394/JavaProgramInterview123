package AutoSuggestion;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class googleTest 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//textarea[@class='gLFyf']")).sendKeys("redmi");
		
		List<WebElement> autoSuggest = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
	
		for (WebElement a : autoSuggest)
        
		{
			System.out.println(a.getText());
		}

	}
}

