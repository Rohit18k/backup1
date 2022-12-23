package com.wellness.qa.base;

import java.io.File;
import java.io.FileInputStream;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public static  WebDriver driver;
	
	public static WebDriver initializeDiver1() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Hema Sahoo\\eclipse-workspace\\Automation\\Driver\\chromedriver.exe"); 
		driver = new ChromeDriver();
		return driver;


	}

	public static String getScreenshotPath(String TestCaseName, WebDriver driver) throws Exception {
		 File source = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	   String despath=System.getProperty("user.dir")+"/Reports/"+TestCaseName+".png";
		   File file= new File(despath); 
		    FileUtils.copyFile(source,file);
		  byte[] imagebytes=  IOUtils.toByteArray(new FileInputStream(despath));
		 return Base64.getEncoder().encodeToString(imagebytes);
			
			
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}


