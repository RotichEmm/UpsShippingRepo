package com.ups.testRunner;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsTestRunner {

	public static void main(String[] args) {
		
		WebDriver  driver = new ChromeDriver();
 System.setProperty("webdriver.Chrome.driver", "chromedriver.exe");
	driver.get("https://www.ups.com/lasso/login?");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	// identify all the webElement
	WebElement closeCookieBanner;
	WebElement userId;
	WebElement password;
	WebElement logInBtn;
	WebElement errorMsg;
	
    closeCookieBanner = driver.findElement(By.xpath("//*[@id='_tealiumImplicitmodal']/div/button/span[1]"));
	userId = driver.findElement(By.id("email"));
	password = driver. findElement(By.name("password"));
	logInBtn = driver.findElement(By.xpath("//*[@id='submitBtn']"));
	
	closeCookieBanner.click();
	userId.sendKeys("username");
	password.sendKeys("password");
	logInBtn.click();

	errorMsg = driver.findElement(By.xpath("//*[@id='errorMessages']"));
	
	String msg = errorMsg.getText();
	return;

	
	}

}
