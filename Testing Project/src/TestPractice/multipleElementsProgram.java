package TestPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleElementsProgram 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/r.php");
		List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
		//size of links
		int size1=alllinks.size();
		System.out.println(size1);
		//get Text 
		for(WebElement al:alllinks)
		{
			System.out.println(al.getText());
			
		}
		
		
		
		
	}

}
