package Framework;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExampleWithDDF 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\selenium Notes\\sauceDemoTestData.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("DDF");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		
		String UN=sh.getRow(0).getCell(0).getStringCellValue();
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(UN);
		
		String pwd=sh.getRow(0).getCell(1).getStringCellValue();
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(pwd);
		
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
		
		//get Title
				String actTitle=driver.getTitle();
				String expTitle="Swag Labs";
				
				if(actTitle.equals(expTitle))
				{
					System.out.println("TC Pass");
				}
				else
				{
					System.out.println("TC fail");
				}
		
		
		
		
		
	}

}
