package com.example;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String args[]) throws Exception {
		
		/*
		 * String opt = getDataExcel(2, 4); String value =getData(opt);
		 * System.out.println(value); String data= "Shaikh Arif Ullah"; String newData =
		 * RemoveSpaces(data); //System.out.println(newData); String finalData =
		 * capitalize(newData); System.out.println(finalData);
		 */
		
		
		
		System.out.println(getData("Username"));

	}
	
	
 public static String getData(String ps) throws Exception {
	 File myfile  = new File("Element.properties");
    FileInputStream fs = new FileInputStream(myfile);
	 Properties prop = new Properties();
	 prop.load(fs);
	 String value = prop.getProperty(ps);
	
	 return value;
	 
	 
	 
	}
 
 public static String getDataExcel(int row, int column) {
		
	 
	 
	 return "";
	 
	}
 
 
 public static String RemoveSpaces(String Str1) {
	 return Str1.replaceAll(" ", "_");
 }
 
 public static String capitalize(String Str1) {
 
	 return Str1.toUpperCase();
 
}
}
