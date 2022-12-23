package com.wellness.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.wellness.qa.base.TestBase1;

public class CreateSubscriptionWithAddedUserPetAndCard extends TestBase1{


	public CreateSubscriptionWithAddedUserPetAndCard() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}


	 @Test(priority=1)
     public void  createSubscriptionioWithAddedUserPetAndCard() throws Exception {
		 Thread.sleep(5000);
         
		  
         File src=new File("./src/main/java/com/wellness/qa/config/config.properties");
     	FileInputStream fis=new FileInputStream(src);
     	Properties pro=new  Properties();
     	pro=new Properties();
     	pro.load(fis);

         
         Actions actn= new Actions(driver);
       actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[1]/a[3]/span"))).click().build().perform();
       
       Thread.sleep(3000);
		 
       
       Actions actn11= new Actions(driver);
       actn11.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
       
       
       String actual= "Plan selection is required";
		String expected=driver.findElement(By.xpath("//span[contains(text(),'Plan selection is required')]")).getText();
		System.out.println(expected);
		Assert.assertEquals(actual, expected);
		
   
       
       Actions actn1= new Actions(driver);
       actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"plan_type\" or @name=\"plan_type\"]"))).click().build().perform();

       Thread.sleep(2000);
    Boolean wellneesslist=   driver.findElement(By.xpath("//*[@id=\"plan_type\"]")).isDisplayed();
    System.out.println(wellneesslist);
	

WebElement opt1=driver.findElement(By.id("plan_type"));
	
	WebElement opt2=driver.findElement(By.id("plan_type"));
	
	    	doSelectByVisbleValue(opt1,pro.getProperty("WellnessPlan3"));
	    	
	    	
  
	  
    Thread.sleep(5000);

    WebElement element11 =    driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[1]/div/div/div/div[4]/div[1]/div/div[2]/button"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element11);  
   
	  WebDriverWait wait = new WebDriverWait(driver, 5);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element11)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	
		 
		 
		 
		 WebElement element2 =    driver.findElement(By.xpath("//button[contains(text(),'Next')]"));
		 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element2)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		 
	 
		 
		 String actual2= "User selection is required";
			String expected2=driver.findElement(By.xpath("//span[@class='error custom-error-margin ng-star-inserted']")).getText();
			System.out.println(expected2);
			Assert.assertEquals(actual2, expected2);
		 
		 
		 
		 
		 Thread.sleep(2000);
		 
		 WebElement element211 =    driver.findElement(By.xpath("//button[contains(text(),'Add New User')]"));
		 WebElement element123 = wait.until(ExpectedConditions.elementToBeClickable(element211)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element123);
		 
		 

		 
	       Thread.sleep(2000);
	       
		 
	       Actions actn41= new Actions(driver);
	       actn41.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Submit']"))).click().build().perform();

	       
	       Thread.sleep(2000);
	       
	       String actual21= "First Name is required";
			String expected21=driver.findElement(By.xpath("//span[normalize-space()='First Name is required']")).getText();
			System.out.println(expected21);
			Assert.assertEquals(actual21, expected21);
	       
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).click();

			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("!!!!@#@@");
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys("7856235");
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).clear();
			
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys(pro.getProperty("First"));
			
		 
			 String actual31= "Last Name is required";
				String expected31=driver.findElement(By.xpath("//span[normalize-space()='Last Name is required']")).getText();
				System.out.println(expected31);
				Assert.assertEquals(actual31, expected31);
		       
			
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).click();

				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("!!!@#@@!");
			
			
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).clear();
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys("7856235");
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).clear();
				
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys(pro.getProperty("Last"));
			
			
				 String actual41= "Email Address is required";
					String expected41=driver.findElement(By.xpath("//span[normalize-space()='Email Address is required']")).getText();
					System.out.println(expected41);
					Assert.assertEquals(actual41, expected41);
				
				
				
					driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).click();

					driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys("mark@gmail.com@gmail.com");
					
					
					 String actual51= "Please Fill Proper Email Address";
						String expected51=driver.findElement(By.xpath("//span[normalize-space()='Please Fill Proper Email Address']")).getText();
						System.out.println(expected51);
						Assert.assertEquals(actual51, expected51);
					
				
				
						driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).clear();
					
						driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys(pro.getProperty("Email"));
					
						Thread.sleep(2000);
					
				
						driver.findElement(By.xpath("//label[@for='generate_email']")).click();
						
						Thread.sleep(1000);
						
						
						 String actual61= "Mobile Number is required";
							String expected61=driver.findElement(By.xpath("//span[normalize-space()='Mobile Number is required']")).getText();
							System.out.println(expected61);
							Assert.assertEquals(actual61, expected61);
						
						
							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).click();

							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("!ASqwe^");
							
						
							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
			
							driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("00");
		 
							 String actual71= "Minimum 6 digits required";
								String expected71=driver.findElement(By.xpath("//span[normalize-space()='Minimum 6 digits required']")).getText();
								System.out.println(expected71);
								Assert.assertEquals(actual71, expected71);
							
								driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
								driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("0000000000000000");
								
								
								 String actual81= "Maximum 15 digits allowed";
									String expected81=driver.findElement(By.xpath("//span[normalize-space()='Maximum 15 digits allowed']")).getText();
									System.out.println(expected81);
									Assert.assertEquals(actual81, expected81);
								
								
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys("ASWE!@");
									
									
									 String actual811= "Please enter numerals only (no-dashes)";
										String expected811=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
										System.out.println(expected811);
										Assert.assertEquals(actual811, expected811);
									
									
									
										driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).clear();
																		
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(pro.getProperty("Number"));
									
									Thread.sleep(2000);
									
									driver.findElement(By.xpath("//input[@placeholder='Enter State']")).click();
	
									driver.findElement(By.xpath("//input[@placeholder='Enter State']")).clear();
									
									
//									 String actual913= "State is required";
//										String expected913=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
//										System.out.println(expected913);
//										Assert.assertEquals(actual913, expected913);
//										
//										
										
										
										driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys("1234!!!!");
										
										driver.findElement(By.xpath("//input[@placeholder='Enter State']")).clear();
										
										driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys(pro.getProperty("State"));
										
										
										
										
										 String actual12= "City is required";
											String expected12=driver.findElement(By.xpath("//span[normalize-space()='City is required']")).getText();
											System.out.println(expected12);
											Assert.assertEquals(actual12, expected12);
											
										
										
										
											driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys("1234!!!!");
										
										
											driver.findElement(By.xpath("//input[@placeholder='Enter City']")).clear();
										
										
											driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys(pro.getProperty("City"));
										
										
											String actual13= "Zipcode is required";
											String expected13=driver.findElement(By.xpath("//span[normalize-space()='Zipcode is required']")).getText();
											System.out.println(expected13);
											Assert.assertEquals(actual13, expected13);
											
											
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("Asder!@#");
											
											
											
											
											String actual113= "Zipcode should be a number";
											String expected113=driver.findElement(By.xpath("//span[normalize-space()='Zipcode should be a number']")).getText();
											System.out.println(expected113);
											Assert.assertEquals(actual113, expected113);
											
											
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).clear();
								
							
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("00");
											
											
											
											String actual23= "Minimum 5 digits required";
											String expected23=driver.findElement(By.xpath("//span[normalize-space()='Minimum 5 digits required']")).getText();
											System.out.println(expected23);
											Assert.assertEquals(actual23, expected23);
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).clear();
											
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys("0000000000");
											
											
											

											String actual33= "Maximum 9 digits required";
											String expected33=driver.findElement(By.xpath("//span[normalize-space()='Maximum 9 digits required']")).getText();
											System.out.println(expected33);
											Assert.assertEquals(actual33, expected33);
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).clear();

											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys(pro.getProperty("Zipcode"));
											
											
											String actual43= "Address is required";
											String expected43=driver.findElement(By.xpath("//span[normalize-space()='Address is required']")).getText();
											System.out.println(expected43);
											Assert.assertEquals(actual43, expected43);
											
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys(pro.getProperty("Address"));
											
											
											
											 Thread.sleep(2000);
										       
										       Actions actn412= new Actions(driver);
										       actn412.moveToElement(driver.findElement(By.xpath("//span[normalize-space()='Submit']"))).click().build().perform();
										     
										       try {
										       Thread.sleep(5000);
										       
										   	String actual431= "User registered successfully";
											String expected431=driver.findElement(By.xpath("//span[contains(text(),'User registered successfully')]")).getText();
											System.out.println(expected431);
											Assert.assertEquals(actual431, expected431);}
										       catch(Exception e) {
										    	   e.printStackTrace();
										       }
					       
										       Thread.sleep(2000);
										       
										       Actions actn12= new Actions(driver);
										       actn12.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
										       
										       try {
											       Thread.sleep(2000);
										   	String actual4311= "Pet selection is required";
											String expected4311=driver.findElement(By.xpath("//span[contains(text(),'Pet selection is required')]")).getText();
											System.out.println(expected4311);
											Assert.assertEquals(actual4311, expected4311);}
										       catch(Exception e) {
										    	   e.printStackTrace();
										       }
											
										       
											   Thread.sleep(2000);
										       
										       
											   Actions actn112= new Actions(driver);
										       actn112.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Add New Pet')]"))).click().build().perform();
										       
										       Thread.sleep(2000);
										       
								       Actions actn212= new Actions(driver);
								       actn212.moveToElement(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]/span[1]"))).click().build().perform();
										       
								       
								   	String actual91= "Name is required";
									String expected91=driver.findElement(By.xpath("//span[normalize-space()='Name is required']")).getText();
									System.out.println(expected91);
									Assert.assertEquals(actual91, expected91);
									
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("122");
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys("===!@#$");
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).clear();
											
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(pro.getProperty("Petname"));
									
																	
									
									String actual01= "Sex selection is required";
									String expected01=driver.findElement(By.xpath("//span[normalize-space()='Sex selection is required']")).getText();
									System.out.println(expected01);
									Assert.assertEquals(actual01, expected01);
									
									
									WebElement sex= driver.findElement(By.xpath("//select[@name='sex']"));
									
									  Actions actn32= new Actions(driver);
									  actn32.moveToElement(sex).click().build().perform();
										    
									  Thread.sleep(2000);
									  
										List<WebElement> sexoption= driver.findElements(By.xpath("//*[@id=\"addPetForm\"]/div/div/div/div[2]/div/select/option"));
										sexoption.get(1).click();
									  
									  
									
										String actual451= "Color is required";
										String expected451=driver.findElement(By.xpath("//span[normalize-space()='Color is required']")).getText();
										System.out.println(expected451);
										Assert.assertEquals(actual451, expected451);
									
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys("122");
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).clear();
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys("===!@#$");
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).clear();
												
										
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys(pro.getProperty("Petcolor"));
										
										
										String actual481= "Age is required";
										String expected481=driver.findElement(By.xpath("//span[normalize-space()='Age is required']")).getText();
										System.out.println(expected481);
										Assert.assertEquals(actual481, expected481);
									
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("ASER");
										
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).clear();
										
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys("===!@#$");
                                        
                                        
                                        String actual781= "Age should be valid numeric value";
										String expected781=driver.findElement(By.xpath("//span[normalize-space()='Age should be valid numeric value']")).getText();
										System.out.println(expected781);
										Assert.assertEquals(actual781, expected781);
                                        
										
                                        driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).clear();
												
                                    driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys(pro.getProperty("Petage"));
										
										Thread.sleep(2000);
										
										
										String actual85= "Weight is required";
										String expected85=driver.findElement(By.xpath("//span[normalize-space()='Weight is required']")).getText();
										System.out.println(expected85);
										Assert.assertEquals(actual85, expected85);
                                        
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys("ASER");
										
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).clear();
										  
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys("===!@#$");
										  
										  String actual95= "Weight should be valid numeric value";
											String expected95=driver.findElement(By.xpath("//span[normalize-space()='Weight should be valid numeric value']")).getText();
											System.out.println(expected95);
											Assert.assertEquals(actual95, expected95);
										  
								  
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).clear();
										  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys(pro.getProperty("Petweight"));
										
										  String actual65= "Breed is required";
											String expected65=driver.findElement(By.xpath("//span[normalize-space()='Breed is required']")).getText();
											System.out.println(expected65);
											Assert.assertEquals(actual65, expected65);
										
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys("122");
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).clear();
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys("===!@#$");
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).clear();
													
											
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys(pro.getProperty("Breed"));
											
											Thread.sleep(2000);
											
											 Actions actn72= new Actions(driver);
											 actn72.moveToElement(driver.findElement(By.xpath("/html/body/ngb-modal-window/div/div/div[3]/button[2]/span[1]"))).click().build().perform();
									
											   try {
											       Thread.sleep(5000);
											  String actual6115= "Pet created successfully";
												String expected6115=driver.findElement(By.xpath("//span[normalize-space()='Pet created successfully']")).getText();
												System.out.println(expected6115);
												Assert.assertEquals(actual6115, expected6115);}
										       catch(Exception e) {
										    	   e.printStackTrace();
										       }
												Thread.sleep(2000);
											 
												 Actions actn712= new Actions(driver);
												 actn712.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
													
											 
												 Thread.sleep(2000);
											 
											 
												 Actions actn742= new Actions(driver);
												 actn742.moveToElement(driver.findElement(By.xpath("//*[@id=\"addCreditCardFormInputs\"]/div[4]/div/button/span[1]"))).click().build().perform();
												
												 Thread.sleep(2000);
											 
											 
											 
												  String actual615= "Card Holder Name is required";
													String expected615=driver.findElement(By.xpath("//span[normalize-space()='Card Holder Name is required']")).getText();
													System.out.println(expected615);
													Assert.assertEquals(actual615, expected615);
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys("123.322");
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).clear();
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys("!!@@&^^");
											 
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).clear();
													
													driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys(pro.getProperty("Cardholdername"));
													
													
													  String actual15= "Card Number is required";
														String expected15=driver.findElement(By.xpath("//span[normalize-space()='Card Number is required']")).getText();
														Assert.assertEquals(actual15, expected15);
												 
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("123.322");
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).clear();
													
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("!!@@&^^");
													
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).clear();
														
														
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys("122333333");
														
														  String actual135= "Please Enter Valid Card Number";
															String expected135=driver.findElement(By.xpath("//span[normalize-space()='Please Enter Valid Card Number']")).getText();
															Assert.assertEquals(actual135, expected135);
													 
														
															driver.findElement(By.xpath("//input[@placeholder='Card Number']")).clear();
													
														driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys(pro.getProperty("Cardnumber"));
														
										
														  String actual915= "Card Expiry Month is required";
															String expected915=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
															Assert.assertEquals(actual915, expected915);
													 
														
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys("00 / 00");
														
														
															 String actual92= "Please enter valid Expiry";
																String expected92=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
																Assert.assertEquals(actual92, expected92);
															
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).clear();
														
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys(pro.getProperty("Cardexpiry"));
														
														
															driver.findElement(By.xpath("//input[@formcontrolname='card_cvv' or @name='card_cvv']")).sendKeys("0");
															
															
															 String actual921= "Minimum 3 digits required";
																String expected921=driver.findElement(By.xpath("//span[@class='error ng-star-inserted']")).getText();
																Assert.assertEquals(actual921, expected921);
															
																driver.findElement(By.xpath("//input[@formcontrolname='card_cvv' or @name='card_cvv']")).clear();
															
															driver.findElement(By.xpath("//input[@formcontrolname='card_cvv' or @name='card_cvv']")).sendKeys(pro.getProperty("Cvv"));
														
															 Thread.sleep(3000);
															 
															 Actions actn7412= new Actions(driver);
															 actn7412.moveToElement(driver.findElement(By.xpath("//*[@id=\"addCreditCardFormInputs\"]/div[4]/div/button/span[1]"))).click().build().perform();
															
															 try {
															       Thread.sleep(5000);
															  String actual625= "Credit card saved successfully";
																String expected625=driver.findElement(By.xpath("//span[normalize-space()='Credit card saved successfully']")).getText();
																System.out.println(expected625);
																Assert.assertEquals(actual625, expected625);}
														       catch(Exception e) {
														    	   e.printStackTrace();
														       }
														 
															 Thread.sleep(5000);
															 
																WebElement paybutton=	 driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[2]/div/div/div/div/div[5]/address/button"));
																							
															
																							 Actions actn732= new Actions(driver);
																							 actn732.moveToElement(paybutton).click().build().perform();
															 
															 try {
															       Thread.sleep(5000);

															  String actual951= "Congratulations! order placed successfully";
																String expected951=driver.findElement(By.xpath("//span[normalize-space()='Congratulations! order placed successfully']")).getText();
																System.out.println(expected951);
																Assert.assertEquals(actual951, expected951);;}
														       catch(Exception e) {
														    	   e.printStackTrace();
														       }
																											
	 }
	 
	 
	  @Test(priority=2)
	     public void subscriptionDetails() throws Exception {
	         Thread.sleep(5000);

	         File src=new File("./src/main/java/com/wellness/qa/config/config.properties");
		     	FileInputStream fis=new FileInputStream(src);
		     	Properties pro=new  Properties();
		     	pro=new Properties();
		     	pro.load(fis);
		     	
			 driver.navigate().to("http://wellness.projectdemo.us/admin/dashboard");
			 
			   Thread.sleep(2000);
			 
		WebElement subs= driver.findElement(By.xpath("//span[normalize-space()='Subscription']"));
			   
			 Actions actn=new Actions(driver);
			 actn.moveToElement(subs).click().build().perform();
			 
			   Thread.sleep(2000);
			   
			   String title=driver.getTitle();
			   System.out.println(title);
			   Assert.assertEquals(title,"Subscription");
			   
			   Thread.sleep(2000);
			   
			   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("Plan2"));
			   
			   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
			   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("Subscriptionanme2"));
		   
		   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
			   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("Customer2"));
			   
		   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
			   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("PetName2"));
		   
		   
		   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
		   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   
		   Thread.sleep(1000);
		   
		   
		  WebElement status= driver.findElement(By.xpath("//select[@name=\"filter\"]"));
		  
		  status.click();
		   
		  Select slt=new Select(status);
		    slt.selectByVisibleText(pro.getProperty("Status1"));
		    
		    Thread.sleep(1000);
		    status.click();
			   
			  Select slt1=new Select(status);
			    slt1.selectByVisibleText(pro.getProperty("Status2"));
			    
			    Thread.sleep(1000);
			    status.click();
				   
				  Select slt2=new Select(status);
				    slt2.selectByVisibleText(pro.getProperty("Status3"));

				    
				    Thread.sleep(1000);
				    
				    
		List<WebElement>	lst= driver.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/thead"));
		for(WebElement el: lst) {
			System.out.println(el.getText());
			}
		
	
		   Thread.sleep(2000);
		
		List<WebElement>	row= driver.findElements(By.xpath("//*[@id=\"DataTables_Table_0\"]/tbody/tr[1]"));
		for(WebElement el1: row) {
			System.out.println(el1.getText());
			
			if(el1.getText().equals(pro.getProperty("Plan2"))) {
			Boolean	status7=true;
				break;
			}
		}
	
		 Thread.sleep(2000);
		
		driver.findElement(By.xpath("//tbody/tr[1]/td[7]/a[1]")).click();
		
		
		 Thread.sleep(2000);
		 
		 String title1=driver.getTitle();
		   System.out.println(title1);
		   Assert.assertEquals(title1,"Subscription Details");
		   
		   
		   List<WebElement>	PlanLevelDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[1]/div/div[2]/div/div"));
		   
		   for(WebElement el2: PlanLevelDetails) {
				System.out.println(el2.getText());
				
				if(el2.getText().equals(pro.getProperty("Planname3"))) {
					Boolean	status2=true;
						break;
					}	
				
				
			}
		   
		   
List<WebElement>	PetDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[2]/div/div[2]/div/div"));
		   
		   for(WebElement el3: PetDetails) {
				System.out.println(el3.getText());
				
				if(el3.getText().equals(pro.getProperty("Petname3"))) {
					Boolean	status3=true;
						break;
					}	
			
			}
		   
List<WebElement> SubscriberDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[3]/div/div[2]/div/div"));
		   
		   for(WebElement el4: SubscriberDetails) {
				System.out.println(el4.getText());
				if(el4.getText().equals(pro.getProperty("Subscriber3"))) {
					Boolean	status4=true;
						break;
					}	
				
			}
		   		   
		   
List<WebElement> AddonsDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[5]/div/div[2]/div/div "));
		   
		   for(WebElement el5: AddonsDetails) {
				System.out.println(el5.getText());
				if(el5.getText().equals(pro.getProperty("Addon"))) {
					Boolean	status5=true;
						break;
					}	
				
			}
		
	Thread.sleep(2000);
	
	Actions actn1=new Actions(driver);
	actn1.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Payment History')]"))).click().build().perform();
	
	


List<WebElement>	PaymentHistory= driver.findElements(By.xpath("//*[@id=\"first-table\"]/thead"));
for(WebElement el6: PaymentHistory) {
	System.out.println(el6.getText());
}
	
	
List<WebElement>	rowdata= driver.findElements(By.xpath("//*[@id=\"first-table\"]/tbody/tr[1]"));
for(WebElement el7: rowdata) {
	System.out.println(el7.getText());
	if(el7.getText().equals(pro.getProperty("Amount10"))) {
		Boolean	status6=true;
			break;
		}	
	
}	   
	  }
	 

	  
	@Test(priority=3)
	public void cancelSubscription() throws Exception {
	 
	 	   Thread.sleep(5000);
	 	   
	       File src=new File("./src/main/java/com/wellness/qa/config/config.properties");
		     	FileInputStream fis=new FileInputStream(src);
		     	Properties pro=new  Properties();
		     	pro=new Properties();
		     	pro.load(fis);
		     	
		 driver.navigate().to("http://wellness.projectdemo.us/admin/dashboard");
		 
		 Thread.sleep(5000);
		 
	Actions action3= new Actions(driver);
		 
	action3.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[6]/a"))).click().build().perform();

	Thread.sleep(5000);


	driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[7]/a[1]")).click();

	Thread.sleep(5000);

	Actions action4= new Actions(driver);

	action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[contains(text(),'Cancel Subscription')]"))).click().build().perform();


	Thread.sleep(2000);

	WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/textarea"));

	Actions action7= new Actions(driver);

	action7.moveToElement(textarea).click().build().perform();


	textarea.sendKeys(pro.getProperty("Features3"));

	Thread.sleep(2000);

	WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[1]/select"));

	Actions action8 = new Actions(driver);

	action8.moveToElement(paymentmode).click().build().perform();

	Select slt212=new Select(paymentmode);
	slt212.selectByVisibleText(pro.getProperty("PaymentType2"));

	Thread.sleep(2000);


	JavascriptExecutor js = (JavascriptExecutor) driver;  

	WebElement inpElement = driver.findElement(By.xpath("//input[@type=\"text\"  and @name=\"extra_charge_amount\"]"));
	String actualtext = (String) js.executeScript("return arguments[0].value", inpElement);;

	System.out.println(actualtext);

	String expectedtext= pro.getProperty("CancelAmount1");

	Assert.assertEquals(actualtext, expectedtext);

	WebElement paynow= driver.findElement(By.xpath("//button[1]/span[contains(text(),'Pay Now')]"));

	paynow.click();


	try {
		Thread.sleep(5000);
	String text61=driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div[1]/div[1]")).getText();
	System.out.println(text61);
	String exp61="Plan canceled successfully";
	Assert.assertEquals(text61,exp61);
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	} 


	
	@Test(priority=4)
	public void cancelledReport() throws Exception {
	 
	 	   Thread.sleep(5000);
	 	   
	       File src=new File("./src/main/java/com/wellness/qa/config/config.properties");
		     	FileInputStream fis=new FileInputStream(src);
		     	Properties pro=new  Properties();
		     	pro=new Properties();
		     	pro.load(fis);
		     	
		 driver.navigate().to("http://wellness.projectdemo.us/admin/dashboard");
		 
		 Thread.sleep(5000);
		 
		 WebElement element = driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[30]/a/span[contains(text(),'Reports')]"));
		 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
		 
		 element.click();
		 
	
	Thread.sleep(2000);


	driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[30]/ul/li[1]/a/span[contains(text(),'Payment Report')]")).click();

	Thread.sleep(5000);
	
	

	Actions action4= new Actions(driver);

	action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[1]/div/input"))).click().build().perform();


	Thread.sleep(2000);
	
List<WebElement> lst=	driver.findElements(By.xpath("//div[@class=\"md-drppicker drops-down-right ltr shown double show-ranges\"]/div/ul/li"));
	
	for(WebElement el: lst) {
		Thread.sleep(2000);
		lst.get(3).click();
		break;
	}
		
	Thread.sleep(2000);
	
	WebElement action= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[2]/div/select"));

	action.click();
	
	Select slt=new Select(action);
	slt.selectByVisibleText(pro.getProperty("Action"));
	

	Thread.sleep(2000);

	WebElement transactionmode= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[3]/select"));

	transactionmode.click();
	
	Select slt1=new Select(transactionmode);
	slt1.selectByVisibleText(pro.getProperty("TransactionMode"));
	

	Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[4]/button[2]")).click();


((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

	} 
}