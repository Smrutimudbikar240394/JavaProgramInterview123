package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoQA 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException 
	{
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().fullscreen();
		
		FileInputStream file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		Sheet sh=WorkbookFactory.create(file).getSheet("Sheet4");
		int rowCount=sh.getLastRowNum()-sh.getFirstRowNum();
		
		
		WebElement firstName=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		WebElement lastName=driver.findElement(By.xpath("//input[contains(@id,'last')]"));
		WebElement email=driver.findElement(By.xpath("//input[contains(@placeholder,'name@example')]"));
		
		WebElement mobile=driver.findElement(By.xpath("//input[@id='userNumber']"));
		WebElement address=driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
		
		for(int i=0;i<=rowCount;i++)
		{
			firstName.sendKeys(sh.getRow(i).getCell(0).getStringCellValue());
			lastName.sendKeys(sh.getRow(i).getCell(1).getStringCellValue());
			email.sendKeys(sh.getRow(i).getCell(2).getStringCellValue());
			//mobile.sendKeys(sh.getRow(i).getCell(3).getNumericCellValue());
			address.sendKeys(sh.getRow(i).getCell(4).getStringCellValue());
			
			
		
		
		submit.click();
		
		}
		
		Thread.sleep(5000);
		driver.quit();
		
		
	}

}
