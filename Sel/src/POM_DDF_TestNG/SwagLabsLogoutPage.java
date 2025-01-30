package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLogoutPage
{
	@FindBy(xpath="//a[text()='Logout']") private WebElement logout;
	
	public SwagLabsLogoutPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void logoutApp()
	{
		logout.click();
	}
	
	

}
