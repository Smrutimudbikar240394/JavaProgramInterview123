package HandleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown 
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.tutorialspoint.com/selenium/practice/select-menu.php");
		
		WebElement selectOne = driver.findElement(By.xpath("//select[@id='inputGroupSelect03']"));
		//selectOne.click();
		
		Select s1=new Select(selectOne);
		
		String str=s1.getFirstSelectedOption().getText();
		System.out.println(str);
		
		
		
		//s1.selectByValue("Mrs.");
		
		//s1.selectByIndex(2);
		
		s1.selectByVisibleText("Mr.");
		
		
		
		
		
		
		
		
		
		
	}

}
