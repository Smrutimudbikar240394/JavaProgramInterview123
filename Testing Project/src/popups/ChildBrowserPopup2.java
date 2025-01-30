package popups;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowserPopup2
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://skpatro.github.io/demo/links/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//input[@value='New Tab']")).click();
		
		Set<String> allids=driver.getWindowHandles();
		ArrayList<String> al=new ArrayList<String>(allids);
		
		driver.switchTo().window(al.get(1));
		
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
		
		driver.switchTo().window(al.get(0));
		
		driver.findElement(By.xpath("//input[@value='New Window']")).click();
		
		Set<String> allids2=driver.getWindowHandles();
		ArrayList<String> al2=new ArrayList<String>(allids2);
		driver.switchTo().window(al2.get(2));
		
		driver.manage().window().maximize();
		
	}

}
