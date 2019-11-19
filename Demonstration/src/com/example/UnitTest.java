package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UnitTest {
	
	static WebDriver driver=null;

	@Test
    public void test() {
    driver.findElement(By.xpath("(//div[@class='home_banner']/div/div/div/div/div/a)[1]")).click();
    assertEquals("Atul Singh", driver.getTitle());
           
    }
    
    @Test
    public void test2() {
    assertEquals("Atul", driver.getTitle());

		 
	}
	
	@Before
	public void before() {
		driver = WebBrowser.getDriver();
			
	}

	
	@After
	public void after() {
		WebBrowser.closeBrowser();
		
		}
	
	}

