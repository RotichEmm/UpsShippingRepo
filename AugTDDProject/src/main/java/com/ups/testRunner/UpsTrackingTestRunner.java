package com.ups.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pageActions.UpsTrackingPageActions;
import com.ups.drivers.UpsDrivers;

public class UpsTrackingTestRunner extends UpsDrivers {
	WebDriver driver;
	UpsTrackingPageActions trackingTest;

	@BeforeMethod (alwaysRun = true)
	@Parameters(value = {"browser"})
	void beforeMethod() {
		this.driver = getChromeDriver();
		this.trackingTest = new UpsTrackingPageActions(driver);
		driver.get("https://www.ups.com/lasso/tracking?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test(groups = {"SanityTest"}, priority = 1)
	
	void trackingErrorMsgTest(){
		trackingTest.closeCookieBanner();
		trackingTest.setTrackId("2345678");
		trackingTest.clickTrackBtn();
		String errorMsg = trackingTest.trackingErrorMsg();
		
		if (errorMsg.contains("Unsuccessful")) {
			System.out.println("PASSED");
		} else {
			fail();
		}
	}

	@Test (groups = {"RegressionTest"}, priority =2)
	void trackBtnLinkTest() {
		trackingTest.closeCookieBanner();
		trackingTest.clickTrackBtn();
		String expectedPageTitle = "Reset or Remove Tracking settings|ups - United States";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		
	}

	@AfterMethod(alwaysRun = true)
	void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();

	}

}

	
	
	


