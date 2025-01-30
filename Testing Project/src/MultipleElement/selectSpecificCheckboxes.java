package MultipleElement;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class selectSpecificCheckboxes
{
	 public static void main(String[] args) throws IOException, InterruptedException
	 {
		 WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 
	 driver.get("file:///C:/Users/hp/Documents/10checkbox.html"); 
	 List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
	 
	 for(int i=4; i<=7; i++)
	 {
	 allCheckboxes.get(i).click();
	 Thread.sleep(500);
	 } 
	 }

}
