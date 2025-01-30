package Module5_OrderTest;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Libraries.BaseClass;
import Libraries.UtilityClass;
import Module1_Login.SwagLabHomePage;
import Module1_Login.SwagLabLoginPage;
import Module1_Login.SwagLabOpenMenuPage;
import Module5_Order.SwagLabCheckOutInformation;
import Module5_Order.SwagLabCheckoutOverview;
import Module5_Order.SwagLabCompletePage;
import Module5_Order.SwagLabYourCartPage;

public class SwagLabOrderTest extends BaseClass
	{
		SwagLabLoginPage login;
		SwagLabHomePage home;
		SwagLabOpenMenuPage menu;
		SwagLabYourCartPage cart;
		SwagLabCheckOutInformation info;
		SwagLabCheckoutOverview checkOverview;
		SwagLabCompletePage completePage;
		int TCID;
		
		@BeforeClass
		public void openBrowser() throws EncryptedDocumentException, IOException
		{
			initializeBrowser();
			
			login=new SwagLabLoginPage(driver);  
			home=new SwagLabHomePage(driver);
			menu=new SwagLabOpenMenuPage(driver);
			cart=new SwagLabYourCartPage(driver);
			info=new SwagLabCheckOutInformation(driver);
			checkOverview=new SwagLabCheckoutOverview(driver);
			completePage=new SwagLabCompletePage(driver);
		}
		
		@BeforeMethod
		public void loginToApp() throws InterruptedException, EncryptedDocumentException, IOException
		{
			login.inpSwagLabLoginPageUsername(UtilityClass.getPFData("UN"));
			login.inpSwagLabLoginPagePassword(UtilityClass.getPFData("PWD"));
			login.clickSwagLabLoginPageLoginBtn();
			Thread.sleep(2000);
		}
			
		@Test
		public void PurchaseAnyProduct() throws EncryptedDocumentException, IOException, InterruptedException 
		{
			TCID=106;
			home.clickSwagLabBackPackAddToCart();
			home.clickSwagLabCartLink();
			Thread.sleep(2000);
			cart.clickCheckOutBtn();
			info.inpSwagLabCheckOutInfoFirstName(UtilityClass.getTD(2,0));
			info.inpSwagLabCheckOutInfoLastName(UtilityClass.getTD(2,1));
			info.inpSwagLabCheckOutInfoPostalCode(UtilityClass.getTD(2,2));
			Thread.sleep(2000);
			info.ClickSwagLabCheckOutInfoContinueBtn();
			checkOverview.clickSwagLabCheckOutOverviewFinishBtn();
			Thread.sleep(2000);
			
			String actMsg=completePage.getSwagLabCompletePageDispatchMsg();
			String expMsg=UtilityClass.getTD(3,0);
			Assert.assertEquals(actMsg,expMsg,"Failed -Msg");
			
			Thread.sleep(2000);
			
		}
		
		
		
		@AfterMethod
		public void logoutFromApp(ITestResult s1) throws InterruptedException, IOException
		{
			if (s1.getStatus()==ITestResult.FAILURE) 
			{
				UtilityClass.captureSS(driver, TCID);
			}
			
			home.clickSwagLabHomePageOpenMenu();
			Thread.sleep(2000);
			menu.clickSwagLabOpenMenuPageLogoutBtn();
			Thread.sleep(2000);
		}
			
		@AfterClass
		public void closeBrowser()
		{
			driver.quit();
		}
	}




