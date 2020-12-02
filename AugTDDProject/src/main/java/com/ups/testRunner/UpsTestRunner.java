package com.ups.testRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsTestRunner {

	public static void main(String[] args) {
		
		WebDriver  driver = new ChromeDriver();
 System.setProperty("webdriver.Chrome.driver", "chromedriver.exe");
	driver.get("https://www.ups.com/lasso/login?");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

}
