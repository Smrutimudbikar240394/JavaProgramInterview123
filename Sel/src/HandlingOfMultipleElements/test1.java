package HandlingOfMultipleElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test1 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		
		System.out.println(alllinks.size());
		
		for(WebElement a:alllinks)
		{
			System.out.println(a.getText());
		}
	}

}
