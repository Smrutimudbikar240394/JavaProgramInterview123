package SeleniumBasicProgram;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FlipkartTresting {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.flipkart.com");
		WebElement search=driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']"));
		String text=search.getAttribute("placeholder");
		System.out.println(text);
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		File dest=new File(".\\target\\test2.png");
		
		FileHandler.copy(src,dest);
	

	}

}
