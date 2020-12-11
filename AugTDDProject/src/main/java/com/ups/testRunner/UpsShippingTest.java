package com.ups.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsShippingTest {
		
		WebDriver driver = null;

		public UpsShippingTest(WebDriver driver) {
			this.driver = driver;
		}

		public String upsShippingErrorTest() {

			WebElement closeCookieBanner;
			WebElement countryName;
			WebElement name;
			WebElement contactName;
			WebElement address;
			WebElement editAddress;
			WebElement email;
			WebElement phone;
			WebElement extension;
			WebElement checkBoxBtn;
			WebElement returnAddress;
			WebElement continueBtn;
			WebElement errorMsg;
			String msg = null;
			WebElement cancelShippment;

			closeCookieBanner = driver.findElement(By.xpath("//*[@id='__tealiumImplicitmodal']/div/button/span[1]"));
			countryName = driver.findElement(By.id("//*[@id='origin-cac_country']"));
			name = driver.findElement(By.name("cac_companyOrName"));
			contactName = driver.findElement(By.name("cac_contactName"));
			address = driver.findElement(By.id("origin_cac_singleLineAddress"));
			editAddress= driver.findElement(By.cssSelector("#ups-main"));
			email = driver.findElement(By.id("origin-cac_email"));
			phone= driver.findElement(By.id("origin-cac_phone"));
			extension = driver.findElement(By.name("cac_extension"));
			checkBoxBtn = driver.findElement(By.cssSelector("#ups-mainBtn"));
			returnAddress = driver.findElement(By.cssSelector("#returnAddressForm_label"));
			continueBtn = driver.findElement(By.id("nbsBackForwardNavigationContinueButton"));
			errorMsg = driver.findElement(By.cssSelector("#nbsInfoBanner"));
			cancelShippment = driver.findElement(By.id("nbsBackForwardNavigationCancelshipmentButton"));
		
			
			closeCookieBanner.click();
			countryName.sendKeys("U.S.A");
			name.sendKeys("usa");
			contactName.sendKeys("Nancy Smith");
			address.sendKeys("20 main street, Yonkers, NY");
			editAddress.sendKeys("skip");
			email.sendKeys("Nsmith@yahoo.com");
			phone.sendKeys("2012345677");
			extension.sendKeys("none");
			checkBoxBtn.click();
			returnAddress.sendKeys("20 main street, Yonkers, NY");
			continueBtn.click();
			cancelShippment.click();
		
			errorMsg = driver.findElement(By.cssSelector("#nbsInfoBanner"));
			msg = errorMsg.getText();
			return msg;
			

		}
	}

	
	


