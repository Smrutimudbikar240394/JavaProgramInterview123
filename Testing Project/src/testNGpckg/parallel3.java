package testNGpckg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class parallel3 
{
	@Test
	public void edgeMethod()
	{
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.flipkart.com");
	}

}
