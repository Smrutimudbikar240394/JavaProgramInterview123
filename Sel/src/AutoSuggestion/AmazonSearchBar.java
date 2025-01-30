package AutoSuggestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AmazonSearchBar {
    public static void main(String[] args) {
        // Set up WebDriver
       // System.setProperty("webdriver.chrome.driver", "path_to_chromedriver");
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to Amazon's homepage
            driver.get("https://www.amazon.com");

            // Locate the search bar
            WebElement searchBar = driver.findElement(By.id("twotabsearchtextbox"));

            // Type a query to trigger autosuggestions
            searchBar.sendKeys("laptop");

            // Wait for the suggestions to load (optional: add WebDriverWait)
            Thread.sleep(2000); // Replace with explicit wait in real scenarios

            // Capture the list of suggestions
            List<WebElement> suggestions = driver.findElements(By.cssSelector(".s-suggestion"));

            // Print the number of suggestions
            System.out.println("Total suggestions found: " + suggestions.size());

            // Iterate through the suggestions and print their text
            for (WebElement suggestion : suggestions) {
                System.out.println("Suggestion: " + suggestion.getText());
            }

            // Example: Click on a specific suggestion
            for (WebElement suggestion : suggestions) {
                if (suggestion.getText().equalsIgnoreCase("laptop stand")) {
                    suggestion.click();
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
