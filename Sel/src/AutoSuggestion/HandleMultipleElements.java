package AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class HandleMultipleElements {
    public static void main(String[] args) {
        // Set up WebDriver
        //System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the webpage
            driver.get("https://example.com");

            // Find multiple elements
            List<WebElement> elements = driver.findElements(By.tagName("a")); // Example: Find all links

            // Check if elements are found
            if (elements.isEmpty()) {
                System.out.println("No elements found.");
            } else {
                System.out.println("Total elements found: " + elements.size());

                // Iterate through the elements and perform actions
                for (WebElement element : elements) {
                    // Print each element's text
                    System.out.println("Element Text: " + element.getText());

                    // Example: Click a specific element based on text
                    if (element.getText().equalsIgnoreCase("Specific Link Text")) {
                        element.click();
                        break; // Stop the loop after clicking
                    }
                }
            }
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}