package com.wellness.qa.ExtentReportListners;

import com.aventstack.extentreports.ExtentReports;

import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentReportNG {
	static ExtentReports extent;
	
	public  static ExtentReports extentReportGenerator() {
	//String path= System.getProperty("user.dir")+"\\test-output\\screenshots\\index.html";
		String path= System.getProperty("user.dir")+ "/Reports/index.html";
	//	ExtentSparkReporter reporter=new ExtentSparkReporter(path);
	ExtentHtmlReporter reporter= new ExtentHtmlReporter(path);
		reporter.config().setReportName("Web Automation Results");
		reporter.config().setDocumentTitle("Test Results");
	 extent= new ExtentReports();
		extent.attachReporter(reporter);		
		return extent;
	}

}


