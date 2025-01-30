package POM_DDF_TestNG;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SwagLabsTest 
{
	 WebDriver driver;
	 SwagLabsLoginPage login;
	 SwagLabsHomePage homepage;
	 FileInputStream file;
	 Sheet sh;
	 SwagLabsLogoutPage logout;
 
	
	
@BeforeClass
	public void openBrowser() throws EncryptedDocumentException, IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		file=new FileInputStream("E:\\Selenium Vel\\ExcelTest.xlsx");
		sh=WorkbookFactory.create(file).getSheet("DDF");
		
		login=new SwagLabsLoginPage(driver);
		homepage=new SwagLabsHomePage(driver);
		
		logout=new SwagLabsLogoutPage(driver);
		
		
	}

@BeforeMethod
public void loginToApp() throws InterruptedException
{
	login.inpSwagLabLoginPageUsername(sh.getRow(0).getCell(0).getStringCellValue());
	login.inpSwagLabsLoginPagePassword(sh.getRow(0).getCell(1).getStringCellValue());
	login.clickSwagLabsLoginPageLoginButton();
	Thread.sleep(2000);
}

@Test
public void VerifyLogoTest() throws InterruptedException
{
	//homepage.verifySwagLabHomePageLogo();
	
	String act=homepage.getSwagLabsHomePagelogoText();
	String exp=sh.getRow(0).getCell(2).getStringCellValue();
	
	Assert.assertEquals(act,exp,"Failure-both result are different");
	
	homepage.clickSwagLabHomePageOpenMenu();
	Thread.sleep(3000);
}

@AfterMethod
public void logoutToApp() throws InterruptedException
{
	logout.logoutApp();
	Thread.sleep(3000);
	
}

@AfterClass
public void closeBrowser()
{
	driver.quit();
}























/*{
	public static void main(String[] args) 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		SwagLabsLoginPage login =new SwagLabsLoginPage(driver);
		login.inpSwagLabLoginPageUsername();
		login.inpSwagLabsLoginPagePassword();
		login.clickSwagLabsLoginPageLoginButton();
		
		
	}
*/


}
