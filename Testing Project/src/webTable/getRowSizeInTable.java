package webTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getRowSizeInTable 
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\All Automation V Rec\\Selenium Vel\\webTable.html");
		
		List<WebElement> allrow = driver.findElements(By.xpath("//table[@id='1234']//tr"));
		int rowsize=allrow.size();
		System.out.println(rowsize);
		
		
		
	}

}
