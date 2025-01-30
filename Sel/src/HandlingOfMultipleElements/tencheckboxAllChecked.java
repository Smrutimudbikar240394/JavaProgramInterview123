package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class tencheckboxAllChecked 
{
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Documents/10checkbox.html");
		List<WebElement> allcheckbox=driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(WebElement checkbox:allcheckbox)
		{
			checkbox.click();
			Thread.sleep(2000);
		}
		
		
		int sizecheckbox=allcheckbox.size();
		for(int i=sizecheckbox-1;i>=0;i--)
		{
			allcheckbox.get(i).click();
			Thread.sleep(3000);
		}
		
		
		for(int i=7;i<=8;i++)
		{
			allcheckbox.get(i).click();
			Thread.sleep(3000);
		}
	}

}
