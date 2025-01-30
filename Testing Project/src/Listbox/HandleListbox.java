package Listbox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListbox 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		//click on create new account link
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		Thread.sleep(3000);
		
		//step1:identify list box which need to handled and store in reference variable
		WebElement month=driver.findElement(By.xpath("//select[@title='Month']"));
		
		//Step 2: create object object select class
		Select s=new Select(month);
		Thread.sleep(2000);
		//step 3:use select class method to select option
		//s.selectByIndex(3);
		//s.selectByValue("4");
		s.selectByVisibleText("Apr");
		
		Thread.sleep(2000);
		driver.quit();
		
		
	}

}
