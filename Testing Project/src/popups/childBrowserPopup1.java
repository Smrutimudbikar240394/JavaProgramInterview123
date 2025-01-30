package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childBrowserPopup1 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		//get childWindowID
		Set<String> allids=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allids);
		String childwindowID=al.get(1);
		
		//SwitchToChildWindow
		driver.switchTo().window(childwindowID);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		driver.quit();
	}

}
