package com.ups.testRunner;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.pageActions.UpsShippingPageActions;
import com.ups.drivers.UpsDrivers;

public class UpsShippingTestRunner extends UpsDrivers {
	WebDriver driver;
	UpsShippingPageActions shippingTest;

	@BeforeTest (alwaysRun = true)
	@Parameters(value = {"browser"})
	void beforeMethod() {
		this.driver = getChromeDriver();
		this.shippingTest = new UpsShippingPageActions(driver);
		driver.get("https://www.ups.com/lasso/shipping?");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	}

	@Test(groups = {"SanityTest"}, priority = 1)
	
	void shippingErrorMsgTest(){
		shippingTest.closeCookieBanner();
		shippingTest.setCountry("USA");
		shippingTest.setContactName("Nancy Smith");
		shippingTest.setAddress("20 main street, Yonkers, NY");
		shippingTest.setEmail("Nsmith@yahoo.com");
		shippingTest.setPhone("2012345677");
		shippingTest.clickCheckBoxBtn();
		shippingTest.setReturnAddress("20 main street, Yonkers, NY");
		shippingTest.clickContinueBtn();
		
		String errorMsg = shippingTest.shippingErrorMsg();
		
		if (errorMsg.contains("Unsuccessful")) {
			System.out.println("PASSED");
		} else {
			fail();
		}
	}

	@Test (groups = {"RegressionTest"}, priority =2)
	void canceShipmentLinkTest() {
		shippingTest.closeCookieBanner();
		shippingTest.clickCancelShippmentBtn();
		String expectedPageTitle = "Reset or Remove Shippment settings|ups - United States";
		String actualPageTitle = driver.getTitle();
		Assert.assertEquals(actualPageTitle, expectedPageTitle);
		
	}

	@AfterTest(alwaysRun = true)
	void afterMethod() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();

	}

}



