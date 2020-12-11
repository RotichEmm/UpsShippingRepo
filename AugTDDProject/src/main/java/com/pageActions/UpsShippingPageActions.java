package com.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsLoginPageElements;
import com.ups.pageElements.UpsShippingPageElements;

public class UpsShippingPageActions {

		UpsShippingPageElements shippingPage = null;

		public UpsShippingPageActions(WebDriver driver) {

			this.shippingPage = new UpsShippingPageElements(driver);

		}

		public void closeCookieBanner() {
			shippingPage.upsPageCloseCookieBanner().click();
		}

		public void setCountry(String country) {
			shippingPage.country().sendKeys(country);
		}
		
		public void setContactName(String contact) {
			shippingPage.contactName().sendKeys(contact);
		}
		public void setAddress(String address) {
			shippingPage.address().sendKeys(address);
		}

		public void setEditAddress(String address) {
			shippingPage.editAddress().sendKeys(address);
}
		
		public void setEmail(String email) {
			shippingPage.email().sendKeys(email);
}

		public void setPhone(String phone) {
			shippingPage.phone().sendKeys(phone);
}

		public void setExtension(String extension) {
			shippingPage.extension().sendKeys(extension);
}	

		public void clickCheckBoxBtn() {
			shippingPage.checkBoxBtn().click();
}	

		public void setReturnAddress(String address) {
			shippingPage.returnAddress().sendKeys(address);
}
		public void clickContinueBtn() {
			shippingPage.continueBtn().click();
			
}
		public String shippingErrorMsg() {
			String msg = null;

			try {

				msg = shippingPage.upsShippingErrorMsg().getText();

			} catch (Exception e) {
				System.out.println("Error message not displayed!");
			}

			return msg;
		
	}
		public void clickCancelShippmentBtn() {
			shippingPage.upscancelShippmentBtn().click();
		}

		}
		
	
