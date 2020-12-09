package com.ups.loginPage;

import static org.testng.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.pageActions.UpsLoginPageActions;
import com.ups.drivers.UpsDrivers;

public class UpsTestRunner extends UpsDrivers {
	
	WebDriver driver;
		UpsLoginPageActions loginTest;

		@BeforeMethod (alwaysRun = true)
		void beforeMethod() {
			this.driver = getChromeDriver();
			this.loginTest = new UpsLoginPageActions(driver);
			driver.get("https://www.ups.com/lasso/login?");
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		}

		@Test(groups = {"SanityTest"}, priority = 1)
		
		void loginErrorMsgTest(){
			loginTest.closeCookieBanner();
			loginTest.setUserId("nancysmith");
			loginTest.setPassword("12345");
			loginTest.clickSubmitBtn();
			String errorMsg = loginTest.loginErrorMsg();
			
			if (errorMsg.contains("Unsuccessful")) {
				System.out.println("PASSED");
			} else {
				fail();
			}
		}

		@Test (groups = {"RegressionTest"}, priority =2)
		void forgotLinkTest() {
			loginTest.closeCookieBanner();
			loginTest.clickLoginForgot();
			String expectedPageTitle = "Reset or Remove Login settings|ups - United States";
			String actualPageTitle = driver.getTitle();
			Assert.assertEquals(actualPageTitle, expectedPageTitle);
			
		}

		@AfterMethod(alwaysRun = true)
		void afterMethod() throws InterruptedException {
			Thread.sleep(2000);
			driver.close();

		}

	}
