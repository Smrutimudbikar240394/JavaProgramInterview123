package HandleFields;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleListbox 
{
	public static void main(String[] args) {
        // Set the path for your browser driver
        System.setProperty("webdriver.chrome.driver", "path_to_your_chromedriver");

        // Initialize WebDriver
     WebDriver driver=new ChromeDriver();

        try {
            // Navigate to the web page with the list boxes
            driver.get("https://example.com"); // Replace with your test page URL

            // Maximize browser window
            driver.manage().window().maximize();

            // Single-select list box
            WebElement singleSelectBox = driver.findElement(By.id("singleSelectListBoxId")); // Replace with actual ID
            Select singleSelect = new Select(singleSelectBox);
            
            // Select by visible text
            singleSelect.selectByVisibleText("Option1"); 
            System.out.println("Selected option: " + singleSelect.getFirstSelectedOption().getText());

            // Multi-select list box
            WebElement multiSelectBox = driver.findElement(By.id("multiSelectListBoxId")); // Replace with actual ID
            Select multiSelect = new Select(multiSelectBox);

            if (multiSelect.isMultiple()) {
                // Select multiple options
                multiSelect.selectByVisibleText("Option1");
                multiSelect.selectByValue("option2Value"); // Replace with actual value
                multiSelect.selectByIndex(3); // Replace with appropriate index

                // Print all selected options
                System.out.println("Selected options:");
                for (WebElement option : multiSelect.getAllSelectedOptions()) {
                    System.out.println(option.getText());
                }

                // Deselect an option
                multiSelect.deselectByVisibleText("Option1");
                System.out.println("After deselecting Option1:");

                // Print remaining selected options
                for (WebElement option : multiSelect.getAllSelectedOptions()) {
                    System.out.println(option.getText());
                }

                // Deselect all
                multiSelect.deselectAll();
                System.out.println("All options deselected.");
            } else {
                System.out.println("This is not a multi-select list box.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }

}
