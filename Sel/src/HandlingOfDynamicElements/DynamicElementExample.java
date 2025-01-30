package HandlingOfDynamicElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DynamicElementExample {
    public static void main(String[] args) {
        // Set up WebDriver
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the dynamic element page
            driver.get("https://example.com");

            // Wait for the dynamic button to be visible
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement dynamicButton = wait.until(
                ExpectedConditions.elementToBeClickable(By.xpath("//*[contains(@id, 'dynamic-button')]"))
            );

            // Click the dynamic button
            dynamicButton.click();

            System.out.println("Dynamic button clicked successfully.");
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
