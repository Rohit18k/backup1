package com.wellness.qa.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wellness.qa.base.TestBase1;


public class Dashboard extends TestBase1{


	public Dashboard() {
		super();
		}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}
	
	 @Test(priority=1)
	public void selectState() throws Exception {
	    Thread.sleep(5000);
	     driver.get("https://test.wazecapital.com/applications/initiate");
	     Thread.sleep(5000);
	     driver.findElement(By.xpath("//span[contains(text(),'Select State')]")).click();
	     Thread.sleep(1000);
	     driver.findElement(By.xpath("//span//ul/li[contains(text(),\"California\")]")).click();
		
	}
	
	
	
	
	
	
}
