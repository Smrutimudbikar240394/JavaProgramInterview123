package SeleniumBasicProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class SpecificScreenshot 
{
	
	public static void main(String[] args) throws IOException 
	{
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		WebElement mobiles=driver.findElement(By.xpath("//div[@class='_3MlEpv']"));
		File src=mobiles.getScreenshotAs(OutputType.FILE);
		
		File dest=new File(".\\target\\mobiles.png");
		
		FileHandler.copy(src,dest);
	}
	

}
