package POM;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwagLabTest 
{
	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		SwagLabLoginPage sllp1=new SwagLabLoginPage(driver);
		sllp1.inpSwagLabLoginPageUsername();
		sllp1.inpSwagLabLoginPagePassword();
		sllp1.clickSwagLabLoginPageLoginBtn();
		
		SwagLabHomePage sllb=new SwagLabHomePage(driver);
		sllb.verifySwagLabHomePageLogo();
		sllb.clickSwagLabHomePageOpenMenu();
		
	}

}
