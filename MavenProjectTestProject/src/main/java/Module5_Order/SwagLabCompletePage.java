package Module5_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCompletePage 
{
	@FindBy(xpath="//div[@class='complete-text']") private WebElement textmsg;
	
	public SwagLabCompletePage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public String getSwagLabCompletePageDispatchMsg()
	{
		return textmsg.getText();
		
	}
	
	

}
