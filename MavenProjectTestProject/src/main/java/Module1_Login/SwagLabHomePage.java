package Module1_Login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabHomePage 
{
	//step1: declaration
	@FindBy(xpath = "//div[@class='app_logo']")  private WebElement logo;
	@FindBy(xpath = "//button[@id='react-burger-menu-btn']") private WebElement openMenu;
	@FindBy(xpath="//a[@id='item_2_title_link']") private WebElement onesieProduct;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]") private WebElement backPackaddToCart;
	@FindBy(xpath="//a[@class='shopping_cart_link']") private WebElement cartLink;
	
	
	//step2: initialization
	public SwagLabHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//step3:
//	public void verifySwagLabHomePageLogo(String expLogoText) 
//	{
//		String actLogoText = logo.getText();
//		if (actLogoText.equals(expLogoText))
//		{
//			System.out.println("Pass");
//		} 
//		else 
//		{
//			System.out.println("Fail");
//		}
//	}
	
	
	public String getSwagLabHomePageLogoText() 
	{
		String LogoText = logo.getText();
		return LogoText;
	}
	
	public void clickSwagLabHomePageOpenMenu() 
	{
		openMenu.click();
	}
	
	public String getSwagLabHomePageProductList()
	{
		String productName=onesieProduct.getText();
		return productName;
	}
	
	
	
	
	
	public void clickSwagLabBackPackAddToCart()
	{
		backPackaddToCart.click();
	}
	
	public void clickSwagLabCartLink()
	{
		cartLink.click();
	}

}

