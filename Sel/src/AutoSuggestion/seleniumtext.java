package AutoSuggestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumtext 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("selenium");
		List<WebElement> alloption = driver.findElements(By.xpath("//ul[@class='G43f7e']/li"));
		
		for(WebElement a:alloption)
		{
			System.out.println(a.getText());
		}
	}

}
