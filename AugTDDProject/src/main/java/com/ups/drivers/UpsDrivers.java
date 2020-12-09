package com.ups.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class UpsDrivers {
		public WebDriver getChromeDriver() {
			
			WebDriverManager.chromedriver().browserPath("87.0.4280.88").setup();
			System.setProperty("webdriver.chrome.driver","/absolute/path/to/binary/chromedriver");
			WebDriver driver = new ChromeDriver();
			return driver; 
		}

		public WebDriver getFirefoxDriver() {

			WebDriverManager.firefoxdriver().browserPath("83").setup();
			System.setProperty("webdriver.gecko.driver","/absolute/path/to/binary/geckodriver");
			WebDriver driver = new FirefoxDriver();
			return driver;
		}


	}

	
	


