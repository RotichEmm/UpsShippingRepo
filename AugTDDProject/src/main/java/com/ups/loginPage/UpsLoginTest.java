package com.ups.loginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsLoginTest {
	
	WebDriver driver = null;
	public UpsLoginTest(WebDriver driver){
		this.driver = driver;
	}

	public String upsLoginErrorTest(){
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
	return msg;

	
	}

}
