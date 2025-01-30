package Listbox;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class getAllSelected_From_MultiSelectableListbox
{
public static void main(String[] args) throws InterruptedException 
{
	WebDriver driver=new ChromeDriver();
	driver.get("file:///C:/Users/hp/Documents/multi.html");
	Thread.sleep(2000);
	WebElement selectCountry = driver.findElement(By.xpath("//select[@id='1234']"));
	Select s=new Select(selectCountry);
	s.selectByVisibleText("Ind");
	s.selectByVisibleText("Aus");
	s.selectByVisibleText("Sri");
	List<WebElement> selectedOptions = s.getAllSelectedOptions();
	for(WebElement s1:selectedOptions)
	{
		System.out.println(s1.getText());
	}
}
}
