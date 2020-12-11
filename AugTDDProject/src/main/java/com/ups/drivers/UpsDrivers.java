package com.ups.drivers;

import org.openqa.selenium.WebDriver;


import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;


public class UpsDrivers {
		public WebDriver getChromeDriver() {
			
			WebDriverManager.chromedriver().browserPath("87.0.4280.88").setup();
			System.setProperty("webdriver.chrome.driver","chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			return driver; 
		}

			}

	
	

