package com.pageActions;

import org.openqa.selenium.WebDriver;

import com.ups.pageElements.UpsTrackingPageElements;

public class UpsTrackingPageActions {

		UpsTrackingPageElements trackingPage = null;

		public UpsTrackingPageActions(WebDriver driver) {

			this.trackingPage = new UpsTrackingPageElements(driver);

		}

		public void closeCookieBanner() {
			trackingPage.upsPageCloseCookieBanner().click();
		}

		public void setTrackId(String trackId) {
			trackingPage.trackBtn().sendKeys(trackId);
		}

		public void clickTrackBtn() {
			trackingPage.trackBtn().click();
		}

		public String trackingErrorMsg() {
			String msg = null;

			try {

				msg = trackingPage.upsTrackingErrorMsg().getText();

			} catch (Exception e) {
				System.out.println("Error message not displayed!");
			}

			return msg;
		
	}


}
