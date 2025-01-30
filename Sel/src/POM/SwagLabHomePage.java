package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	@FindBy(xpath ="//div[@class='app_logo']") private WebElement logo1;
	@FindBy(xpath ="//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void verifySwagLabHomePageLogo()
	
	{
		String expLogoText="Swag Labs";
		String actLogoText=logo1.getText();
		
		if(actLogoText.equals(expLogoText))
		{
			System.out.println("Pass");
		} 
		else 
		{
			System.out.println("Fail");
		}
		
	}
	
	public void clickSwagLabHomePageOpenMenu() 
	{
	openMenu.click();
	}

}
