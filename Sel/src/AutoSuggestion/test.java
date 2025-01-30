package AutoSuggestion;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("redmi mobile 5g");
		String expstring="redmi mobile 5g 12";
		List<WebElement> alloptions= driver.findElements(By.xpath(""));
		
		for(WebElement s1:alloptions)
		{
			System.out.println(s1.getText());
		}
		
		
	}

}
