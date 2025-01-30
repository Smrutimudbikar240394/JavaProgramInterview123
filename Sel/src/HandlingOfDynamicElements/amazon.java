package HandlingOfDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
		driver.findElement(By.xpath("//input[@placeholder='Search Amazon.in']")).sendKeys("redmi mobile 5g");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		
		
	}

}
