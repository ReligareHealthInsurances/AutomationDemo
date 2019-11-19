package com.example;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebBrowser {

	static WebDriver driver = null;
	
	
	public static WebDriver getDriver() {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rhicluat.religarehealthinsurance.com/hp/atulsingh");
		
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 return driver;
		 
	}

	public static void closeBrowser() {
		driver.quit();
	}
}
