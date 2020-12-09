package com.ups.drivers;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;

public class UpsDrivers {
		public WebDriver getChromeDriver() {
			
			WebDriverManager.chromedriver().browserVersion("87.0.4280.88").setup();
			WebDriver driver = new ChromeDriver();
			return driver; 
		}

		public WebDriver getFirefoxDriver() {

			WebDriverManager.firefoxdriver().browserVersion("83").setup();
			WebDriver driver = new FirefoxDriver();
			return driver;
		}


	}

	
	


