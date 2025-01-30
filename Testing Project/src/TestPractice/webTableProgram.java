package TestPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTableProgram 
{
	public static void main(String[] args) 
	{
		
				WebDriver driver=new ChromeDriver();
				driver.get("E:\\All Automation V Rec\\Selenium Vel\\webTable.html");
				
				String text=driver.findElement(By.xpath("//table[@id='1234']//tr[4]/td[2]")).getText();
				System.out.println(text);
				
				
				String text1=driver.findElement(By.xpath("//table[@id='1234']//tr[2]/td[2]")).getText();
				System.out.println(text1);
				
				int size1=driver.findElements(By.xpath("//table[@id='1234']//tr")).size();
				
				
			

		
		
	}

}
