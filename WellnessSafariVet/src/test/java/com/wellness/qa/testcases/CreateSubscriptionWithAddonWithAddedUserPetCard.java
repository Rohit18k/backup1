package com.wellness.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.wellness.qa.base.TestBase1;

public class CreateSubscriptionWithAddonWithAddedUserPetCard extends TestBase1{


	public CreateSubscriptionWithAddonWithAddedUserPetCard() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}
	
	 @Test(priority=1)
     public void  createSubscriptionWithAddonWithAddedUserPetCard() throws Exception {
		 Thread.sleep(5000);
         
		  
         File src=new File("./src/main/java/com/wellness/qa/config/config.properties");
     	FileInputStream fis=new FileInputStream(src);
     	Properties pro=new  Properties();
     	pro=new Properties();
     	pro.load(fis);

         
         Actions actn= new Actions(driver);
       actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[1]/a[3]/span"))).click().build().perform();
       
       Thread.sleep(3000);
		 
       
       Actions actn1= new Actions(driver);
       actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"plan_type\" or @name=\"plan_type\"]"))).click().build().perform();

       Thread.sleep(2000);
    Boolean wellneesslist=   driver.findElement(By.xpath("//*[@id=\"plan_type\"]")).isDisplayed();
    System.out.println(wellneesslist);
	

WebElement opt1=driver.findElement(By.id("plan_type"));
	
	WebElement opt2=driver.findElement(By.id("plan_type"));
	
	    	doSelectByVisbleValue(opt1,pro.getProperty("WellnessPlan4"));
	    	
	    	
  
	    	  Thread.sleep(2000);

	    	    WebElement element11 =    driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[1]/div/div/div/div[4]/div[1]/div/div[2]/button"));
	    		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element11);  
	    	   
	    		  WebDriverWait wait = new WebDriverWait(driver, 5);
	    			 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element11)); 
	    			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
	    			 
	    			 WebElement element2 =    driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[1]/div/div/div/div[7]/div[1]/div/div/div/div[2]/button"));
	    			 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element2)); 
	    			 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
	    			 
		 
		 
		 Thread.sleep(2000);
		 
		 WebElement element211 =    driver.findElement(By.xpath("//button[contains(text(),'Add New User')]"));
		 WebElement element123 = wait.until(ExpectedConditions.elementToBeClickable(element211)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element123);
		 
	
			driver.findElement(By.xpath("//input[@placeholder='Enter First Name']")).sendKeys(pro.getProperty("First1"));
			
	
				driver.findElement(By.xpath("//input[@placeholder='Enter Last Name']")).sendKeys(pro.getProperty("Last1"));
			
		
						driver.findElement(By.xpath("//input[@placeholder='Enter Email Address']")).sendKeys(pro.getProperty("Email1"));
					
						
				
						driver.findElement(By.xpath("//label[@for='generate_email']")).click();
					
									driver.findElement(By.xpath("//input[@placeholder='Enter Mobile Number']")).sendKeys(pro.getProperty("Number1"));
									
									Thread.sleep(2000);
									
									driver.findElement(By.xpath("//input[@placeholder='Enter State']")).click();
	
									driver.findElement(By.xpath("//input[@placeholder='Enter State']")).clear();
									
									driver.findElement(By.xpath("//input[@placeholder='Enter State']")).sendKeys(pro.getProperty("State1"));
										
	              					driver.findElement(By.xpath("//input[@placeholder='Enter City']")).sendKeys(pro.getProperty("City1"));
										
							
											driver.findElement(By.xpath("//input[@placeholder='Enter Zipcode']")).sendKeys(pro.getProperty("Zipcode1"));
											
										driver.findElement(By.xpath("//input[@placeholder='Enter Address']")).sendKeys(pro.getProperty("Address1"));
											
										       
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
										       
										       
											   Actions actn112= new Actions(driver);
										       actn112.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Add New Pet')]"))).click().build().perform();
										       
								
									
									driver.findElement(By.xpath("//input[@placeholder='Enter Name']")).sendKeys(pro.getProperty("Petname1"));
									
							
									WebElement sex= driver.findElement(By.xpath("//select[@name='sex']"));
									
									  Actions actn32= new Actions(driver);
									  actn32.moveToElement(sex).click().build().perform();
									  
										List<WebElement> sexoption= driver.findElements(By.xpath("//*[@id=\"addPetForm\"]/div/div/div/div[2]/div/select/option"));
										sexoption.get(1).click();
									  							
										driver.findElement(By.xpath("//input[@placeholder='Enter Color']")).sendKeys(pro.getProperty("Petcolor1"));
																	
                                    driver.findElement(By.xpath("//input[@placeholder='Enter Age']")).sendKeys(pro.getProperty("Petage1"));
                                    
						  driver.findElement(By.xpath("//input[@placeholder='Enter Weight']")).sendKeys(pro.getProperty("Petweight1"));
										
					
											driver.findElement(By.xpath("//input[@placeholder='Enter Breed']")).sendKeys(pro.getProperty("Breed1"));
										
											
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
											   
											   driver.findElement(By.xpath("//button[contains(text(),'Next')]")).click();
											   
											Thread.sleep(2000);
											 
							 
												 Actions actn742= new Actions(driver);
												 actn742.moveToElement(driver.findElement(By.xpath("//*[@id=\"addCreditCardFormInputs\"]/div[4]/div/button/span[1]"))).click().build().perform();
												
										driver.findElement(By.xpath("//input[@placeholder='Card Holder Name']")).sendKeys(pro.getProperty("Cardholdername1"));
													
											
													driver.findElement(By.xpath("//input[@placeholder='Card Number']")).sendKeys(pro.getProperty("Cardnumber1"));
											
															driver.findElement(By.xpath("//input[@placeholder='MM/YY']")).sendKeys(pro.getProperty("Cardexpiry1"));
														
													
															driver.findElement(By.xpath("//input[@formcontrolname='card_cvv' or @name='card_cvv']")).sendKeys(pro.getProperty("Cvv1"));
														
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
														 
															 Thread.sleep(2000);
															 
																WebElement paybutton=	 driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[2]/div/div/div/div/div[6]/address/button/span[1]"));
																							
															
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
	 
	 
	//note: need to update details of 2 & 3 method
		
		@Test(priority=4)
		public void report() throws Exception {
		 
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
