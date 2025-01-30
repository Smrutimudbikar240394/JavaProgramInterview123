package HandleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox 
{
	public static void main(String[] args) throws Exception {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.tutorialspoint.com/selenium/practice/check-box.php");
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='plus'])[1]")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[@class='plus'])[2]")).click();
		Thread.sleep(2000);
		
		
		driver.findElement(By.xpath("//input[@id='c_io_5']")).click();
		
		
		
		WebElement level8 = driver.findElement(By.xpath("//input[@id='c_io_8']"));
		level8.click();
		
		if(level8.isSelected())
		{
			System.out.println("Level 8 is selected");
		}
		else
		{
			System.out.println("level 8 not Selected");
		}
		
		
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}

}
