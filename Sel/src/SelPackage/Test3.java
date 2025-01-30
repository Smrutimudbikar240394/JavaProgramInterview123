package SelPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[] args) {
		System.out.println("HI");
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://meet.google.com/ryv-vqdn-wvm?authuser=0");
	}

}
