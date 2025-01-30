package webTable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getAllDataFromTable 
{
	public static void main(String[] args)
	{
		WebDriver driver=new ChromeDriver();
		driver.get("E:\\All Automation V Rec\\Selenium Vel\\webTable.html");
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(i==1)
				{
					String text=driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/th["+j+"]")).getText();
					System.out.print(text);
					
				}
				else
				{
					String text=driver.findElement(By.xpath("//table[@id='1234']//tr["+i+"]/td["+j+"]")).getText();
					System.out.print(text);
				}
				
			}
			System.out.println();
		}
		
		
	}

}
