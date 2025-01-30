package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class  SwagLabLoginPage 
{
	@FindBy(xpath = "//input[@name='user-name']") private WebElement UN1;
	
	@FindBy(xpath="//input[@name='password']") private WebElement pwd1;
	
	
	//Step1: declaration
	@FindBy(xpath = "//input[@name='user-name']") private WebElement UN; 
	@FindBy(xpath = "//input[@id='password']") private WebElement PWD; 
	@FindBy(xpath = "//input[@name='login-button']") private WebElement loginBtn; 
	
	
	
	public SwagLabLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	//step3: usage
	public void inpSwagLabLoginPageUsername() 
	{
	UN.sendKeys("standard_user"); //late initialization
	}
	
	public void inpSwagLabLoginPagePassword()
	{
		PWD.sendKeys("secret_sauce");
	}
	
	public void clickSwagLabLoginPageLoginBtn()
	{
	loginBtn.click();
	}

}
