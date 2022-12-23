package com.wellness.qa.ExtentReportListners;




import java.io.IOException;



import java.util.Properties;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.relevantcodes.extentreports.LogStatus;
import com.wellness.qa.base.TestBase1;


public class Listeners extends TestBase1 implements ITestListener{
 //WebDriver driver;
	ExtentReports	extent=ExtentReportNG.extentReportGenerator();
	ExtentTest test;
	private static ThreadLocal<ExtentTest> extenttest= new ThreadLocal<ExtentTest>();

	public void onTestStart(ITestResult result) {
   test= extent.createTest(result.getMethod().getMethodName());
   extenttest.set(test);

	}

	public void onTestSuccess(ITestResult result) {
		test.log(Status.PASS,"Successful");
	}


	public void onTestFailure(ITestResult result) {
		WebDriver driver =null;
		extenttest.get().fail(result.getThrowable());
		Object testobject=result.getInstance();
	Class clazz=result.getTestClass().getRealClass();
	try {
		driver=(WebDriver)clazz.getDeclaredField("driver").get(testobject);
	} catch (Exception e1) {
		
		
	} 
		try {
		//test.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotPath(result.getMethod().getMethodName())).build());
			test.fail("Test Failed",MediaEntityBuilder.createScreenCaptureFromBase64String(getScreenshotPath(result.getMethod().getMethodName(),driver)).build());
			extenttest.get().fail(result.getThrowable());
			//extenttest.get().addScreenCaptureFromPath(getScreenshotPath(result.getMethod().getMethodName(),driver),result.getMethod().getMethodName());
		} catch (Exception e) {			
			e.printStackTrace();
		} 
	}

	public void onFinish(ITestContext context) {
		extent.flush();
	
	}
	/*
@AfterSuite
	public void email(ITestResult result) {
		
		System.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
		// Create object of Property file
		Properties props = new Properties();
 
		// this will set host of server- you can change based on your requirement 
		props.put("mail.smtp.host", "smtp.gmail.com");
 
		// set the port of socket factory 
		props.put("mail.smtp.socketFactory.port", "465");
 
		// set socket factory
		props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
 
		// set the authentication to true
		props.put("mail.smtp.auth", "true");
 
		// set the port of SMTP server
		props.put("mail.smtp.port", "465");
 
		// This will handle the complete authentication
		Session session = Session.getDefaultInstance(props,
 
				new javax.mail.Authenticator() {
 
					protected PasswordAuthentication getPasswordAuthentication() {
 
					return new PasswordAuthentication("hemasahoo123@gmail.com", "Mohini@12345678");
 
					}
 
				});
 
		try {
 
			// Create object of MimeMessage class
			Message message = new MimeMessage(session);
 
			// Set the from address
			message.setFrom(new InternetAddress("hemasahoo123@gmail.com"));
 
			// Set the recipient address
			message.setRecipients(Message.RecipientType.TO,InternetAddress.parse("hemasahoo123@gmail.com"));
            
                        // Add the subject link
			message.setSubject("Automation Report");
 
			// Create object to add multimedia type content
			BodyPart messageBodyPart1 = new MimeBodyPart();
 
			// Set the body of email
			messageBodyPart1.setText("Please find report attached link");
 
			// Create another object to add another content
			MimeBodyPart messageBodyPart2 = new MimeBodyPart();
 
			// Mention the file which you want to send
			String filename = System.getProperty("user.dir")+ "/Reports/index.html";
 
			// Create data source and pass the filename
			DataSource source = new FileDataSource(filename);
 
			// set the handler
			messageBodyPart2.setDataHandler(new DataHandler(source));
 
			// set the file
			messageBodyPart2.setFileName(filename);
 
			// Create object of MimeMultipart class
			Multipart multipart = new MimeMultipart();
 
			// add body part 1
			multipart.addBodyPart(messageBodyPart2);
 
			// add body part 2
			multipart.addBodyPart(messageBodyPart1);
 
			// set the content
			message.setContent(multipart);
 
			// finally send the email
			Transport.send(message);
 
			System.out.println("=====Email Sent=====");
 
		} catch (MessagingException e) {
 
			throw new RuntimeException(e);
 
		}
	}
	

*/

}
