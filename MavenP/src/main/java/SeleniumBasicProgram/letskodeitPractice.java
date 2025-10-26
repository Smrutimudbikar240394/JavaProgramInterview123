package SeleniumBasicProgram;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class letskodeitPractice
{
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.letskodeit.com/practice");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		
		/* ================== 1. TEXTBOX ================== */
		WebElement textbox1=driver.findElement(By.xpath("//input[@name='enter-name']"));
		textbox1.sendKeys("Smruti");
		
		Thread.sleep(200);
		
		
		
		
		 /* ================== 2. RADIO BUTTON ================== */
		WebElement bmwRadio = driver.findElement(By.id("bmwradio"));
        if (!bmwRadio.isSelected()) { // check before clicking
            bmwRadio.click();
        }
        Thread.sleep(1000);
        
        
        /* ================== 3. SINGLE CHECKBOX ================== */
        WebElement benzCheckbox = driver.findElement(By.id("benzcheck"));
        if (!benzCheckbox.isSelected()) {
            benzCheckbox.click();
        }
        Thread.sleep(1000);

        /* ================== 4. MULTIPLE CHECKBOXES ================== */
        List<WebElement> checkboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        for (WebElement cb : checkboxes) {
            if (!cb.isSelected()) {
                cb.click();  // Select all checkboxes
            }
        }
        Thread.sleep(1000);

        /* ================== 5. DROPDOWN (SELECT TAG) ================== */
        WebElement carDropdown = driver.findElement(By.id("carselect"));
        Select carSelect = new Select(carDropdown);
        carSelect.selectByVisibleText("Honda");  // Select option
        Thread.sleep(1000);

        /* ================== 6. LISTBOX (MULTI-SELECT) ================== */
        WebElement listbox = driver.findElement(By.id("multiple-select-example"));
        Select multiSelect = new Select(listbox);
        if (multiSelect.isMultiple()) {
            multiSelect.selectByVisibleText("Apple");
            multiSelect.selectByVisibleText("Peach");
            Thread.sleep(1000);
            multiSelect.deselectByVisibleText("Apple"); // Deselect one
        }

        // Close Browser
        driver.quit();
		
		
		
		
		
	}

}
