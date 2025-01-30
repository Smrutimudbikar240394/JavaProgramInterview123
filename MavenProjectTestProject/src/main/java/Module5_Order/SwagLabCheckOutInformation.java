package Module5_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckOutInformation 
{
	@FindBy(xpath="//input[@placeholder='First Name']") private WebElement fname;
	@FindBy(xpath="//input[@id='last-name']") private WebElement lname;
	@FindBy(xpath="//input[@name='postalCode']") private WebElement postalcode;
	@FindBy(xpath="//input[@id='continue']") private WebElement continueBtn;
	
	public SwagLabCheckOutInformation(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void inpSwagLabCheckOutInfoFirstName(String firstName)
	{
		fname.sendKeys(firstName);
	}
	
	public void inpSwagLabCheckOutInfoLastName(String lastName)
	{
		lname.sendKeys(lastName);
	}
	
	public void inpSwagLabCheckOutInfoPostalCode(String postal)
	{
		postalcode.sendKeys(postal);
	}
	
	public void ClickSwagLabCheckOutInfoContinueBtn()
	{
		continueBtn.click();
	}
}
