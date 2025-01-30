package HandlingOfDynamicElements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class flipkartAppReviewAndRating {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("redmi 13c 5g");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		String ratingAndReview=driver.findElement(By.xpath("(//span[@class='Wphh3N'])[1]")).getText();
		System.out.println(ratingAndReview);
	}
}
