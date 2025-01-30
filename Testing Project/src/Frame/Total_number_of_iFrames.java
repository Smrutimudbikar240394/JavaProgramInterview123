package Frame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Total_number_of_iFrames 
{
	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
		int iframeCount = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Total number of iFrames: " + iframeCount);

	}

}
