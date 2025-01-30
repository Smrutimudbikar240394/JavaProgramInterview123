package SelPackage;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotSpecific 
{
	public static void main(String[] args) throws IOException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		
	  File src1=driver.findElement(By.xpath("//img[@src='/images/Toolsqa.jpg']")).getScreenshotAs(OutputType.FILE);
	  File dest=new File("E:\\Selenium Vel\\abcdef.png");
	  FileHandler.copy(src1, dest);
	}

}
