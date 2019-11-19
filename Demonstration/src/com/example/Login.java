package com.example;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class Login {
	
	static WebDriver driver=null;

	@Test
	public void test() {

	System.out.println("Main");
		 
	}
	
	@Test
	public void test2() {

	System.out.println("Test2");
		 
	}
	
	@Before
	public void before() {
		System.out.println("before");	
	}

	
	@After
	public void after() {
		System.out.println("after");
		}
	
	
	
	
	@AfterClass
	public static void  closure() {
		System.out.println("closure");
		}
	
	}

