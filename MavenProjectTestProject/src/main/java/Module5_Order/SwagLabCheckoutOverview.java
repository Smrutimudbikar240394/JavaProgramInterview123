package Module5_Order;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabCheckoutOverview 
{
	@FindBy(xpath="//button[@id='finish']") private WebElement finishBtn;

	public SwagLabCheckoutOverview(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickSwagLabCheckOutOverviewFinishBtn()
	{
		finishBtn.click();
	}
	
	
}
