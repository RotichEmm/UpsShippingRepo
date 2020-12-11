package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsTrackingPageElements {
	WebDriver driver = null;

	public UpsTrackingPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement upsPageCloseCookieBanner() {

		WebElement closeCookieBanner = driver
				.findElement(By.xpath("//*[@id='__tealiumImplicitmodal']/div/button/span[1]"));
		return closeCookieBanner;
	}

	public WebElement trackPage() {
		WebElement trackPage = driver.findElement(By.cssSelector("#ups-menuLinks1"));
		return trackPage;

}
	public WebElement trackPackage() {
		WebElement trackPackage = driver.findElement(By.cssSelector(" #ups-menuPanel1"));
		return trackPackage;
	}
	
	public WebElement trackingNumber() {
		WebElement trackingNumber = driver.findElement(By.id("stApp_trackingNumber"));
		return trackingNumber;
	}
	
	public WebElement trackBtn() {
		WebElement trackBtn = driver.findElement(By.id("stApp_btnTrack"));
		return trackBtn;
}
	public WebElement upsTrackingErrorMsg() {
		WebElement errorMsg = driver.findElement(By.xpath("//*[@id=stApp_error_alert_list1]"));
		return errorMsg;
}
}
