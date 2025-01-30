package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getColSizeInRow 
{
	public static void main(String[] args) 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\All Automation V Rec\\Selenium Vel\\webTable.html");
		
		int colsize=driver.findElements(By.xpath("//table[@id='1234']//tr[2]/td")).size();
		System.out.println(colsize);
		
		
		//header
		int colsize12=driver.findElements(By.xpath("//table[@id='1234']//tr[1][th]")).size();
		System.out.println(colsize12);
		
	}

}
