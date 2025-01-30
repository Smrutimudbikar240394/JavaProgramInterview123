package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsLoginPage 
{
	@FindBy(xpath="//input[@placeholder='Username']") private WebElement Username;
	@FindBy(xpath="//input[@type='password']") private WebElement Password;
	@FindBy(xpath="//input[@id='login-button']") private WebElement loginBtn;
	
	public SwagLabsLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpSwagLabLoginPageUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public void inpSwagLabsLoginPagePassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickSwagLabsLoginPageLoginButton()
	{
		loginBtn.click();
	}
	
	
	

}
