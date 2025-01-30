package POM_DDF_TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabsHomePage 
{
	@FindBy(xpath="//div[@class='app_logo']") private WebElement logotxt;
	@FindBy(xpath="//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	
	public SwagLabsHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
    /*public void verifySwagLabHomePageLogo()
	
	{
		String expLogoText="Swag Labs";
		String actLogoText=logotxt.getText();
		
		if(actLogoText.equals(expLogoText))
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
		
	}*/
	
	public String getSwagLabsHomePagelogoText()
	{
		String text=logotxt.getText();
		return text;
	}

	public void clickSwagLabHomePageOpenMenu() 
	{
	openMenu.click();
	}
	
}
