package SeleniumBasicProgram;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrowserProg1
{
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.youtube.com/watch?v=Ns4LoG56SZ4&list=PLUDwpEzHYYLtgkXK6YaZ4I2XcsjMqIaEa&index=7");
	}

}
