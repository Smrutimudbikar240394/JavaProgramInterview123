package ScreenShots;

//import ru.yandex.qatools.ashot.AShot;
//import ru.yandex.qatools.ashot.Screenshot;
//import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

import javax.imageio.ImageIO;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;

public class AShotExample {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://example.com");

        // Using AShot to take a full-page screenshot
      // Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver);

        // Save the screenshot
      //  ImageIO.write(screenshot.getImage(), "PNG", new File("fullPageScreenshot.png"));

        driver.quit();
    }
}