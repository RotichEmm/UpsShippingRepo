package com.ups.pageElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class UpsShippingPageElements {
	
	WebDriver driver = null;

	public UpsShippingPageElements(WebDriver driver) {
		this.driver = driver;
	}

	public WebElement upsPageCloseCookieBanner() {

		WebElement closeCookieBanner = driver
				.findElement(By.xpath("//*[@id='__tealiumImplicitmodal']/div/button/span[1]"));
		return closeCookieBanner;
	}

	public WebElement country() {
		WebElement country = driver.findElement(By.name("cac_country"));
		return country;
	}

	public WebElement Name() {
		WebElement Name = driver.findElement(By.name("cac_companyOrName"));
		return Name;
	}
	public WebElement contactName() {
		WebElement contactName = driver.findElement(By.name("origin - cac_contactName"));
		return contactName;
	}

	public WebElement address() {
		WebElement shippingAddress = driver.findElement(By.id("cac_singleLineAddress"));
		return shippingAddress;
	}

	public WebElement editAddress() {
		WebElement editAddress = driver.findElement(By.cssSelector("#ups-main]"));
		return editAddress;

	}
	
	public WebElement email() {
		WebElement email = driver.findElement(By.id("origin-cac_email"));
		return email;
		
	}
	
	public WebElement phone() {
		WebElement phone = driver.findElement(By.id("origin-cac_phone"));
		return phone;
		
}

	public WebElement extension() {
		WebElement extension = driver.findElement(By.name("cac_extension"));
		return extension;
	}

	public WebElement checkBoxBtn() {
		WebElement checkBox = driver.findElement(By.cssSelector("#ups-main "));
		return checkBox;
	}
	public WebElement returnAddress() {
		WebElement returnAddress = driver.findElement(By.cssSelector("#returnAddressForm_label"));
		return returnAddress;
	}
	public WebElement continueBtn() {
		WebElement continueBtn = driver.findElement(By.id("nbsBackForwardNavigationContinueButton]"));
		return continueBtn;
}
	public WebElement upsShippingErrorMsg() {
	WebElement errorMsg = driver.findElement(By.cssSelector("#nbsInfoBanner"));
	return errorMsg;
}
	public WebElement upscancelShippmentBtn() {
		WebElement upsCancelShippmentBtn = driver.findElement(By.cssSelector("#nbsBackForwardNavigationCancelShipmentButton"));
		return upsCancelShippmentBtn;
	
}
}
	