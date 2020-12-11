package com.ups.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsTrackingTest {

		WebDriver driver = null;

		public UpsTrackingTest(WebDriver driver) {
			this.driver = driver;
		}

		public String upsTrackingErrorTest() {

			WebElement closeCookieBanner;
			WebElement trackingPage;
			WebElement trackPackage;
			WebElement trackingNumber;
			WebElement trackBtn;
			WebElement errorMsg;
			String Msg = null;
			
			closeCookieBanner = driver.findElement(By.xpath("//*[@id='__tealiumImplicitmodal']/div/button/span[1]"));
			trackingPage = driver.findElement(By.cssSelector("#ups-menuLinks1"));
			trackPackage = driver.findElement(By.cssSelector("#ups-menuPanel1"));
			trackingNumber = driver.findElement(By.id("stApp_trackingNumber"));
			trackBtn = driver.findElement(By.id("stApp_btnTrack"));
			errorMsg = driver.findElement(By.cssSelector("#stApp_error_alert_list2"));
			
			closeCookieBanner.click();
			trackingPage.click();
			trackPackage.click();
			trackingNumber.sendKeys("34567890234");
			trackBtn.click();
			
			errorMsg = driver.findElement(By.cssSelector("#stApp_error_alert_list2"));
			Msg = errorMsg.getText();
			return Msg;
			
		}
	}

	
	


