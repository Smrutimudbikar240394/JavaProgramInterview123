package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deselect1_OptionFrom_Multiselect
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/hp/Documents/multi.html");
		
		Thread.sleep(2000);
		WebElement selectCountry = driver.findElement(By.id("1234"));
		Select s=new Select(selectCountry);
		// s.selectByVisibleText("Ind");
		// s.selectByVisibleText("Aus");
		// s.selectByVisibleText("Sri");
		s.selectByVisibleText("Ind");
		s.selectByVisibleText("Sri");
		s.selectByIndex(3); 
		
		
		Thread.sleep(2000);
		s.deselectByIndex(3);
		
		Thread.sleep(2000);
		driver.close();
		
	}

}

