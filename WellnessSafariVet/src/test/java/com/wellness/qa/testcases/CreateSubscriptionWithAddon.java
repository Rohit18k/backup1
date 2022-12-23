package com.wellness.qa.testcases;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import com.wellness.qa.base.TestBase1;

public class CreateSubscriptionWithAddon extends TestBase1{


	public CreateSubscriptionWithAddon() {
	super();
	}
	
	@BeforeTest
	public void openBrowser() throws Exception {
		initialization1();
	}

	 @Test(priority=1)
     public void  createSubscriptionAddon() throws Exception {
        
 driver.findElement(By.xpath("df")).click();
 
 driver.findElement(RelativeLocator.withTagName("input").above(By.xpath("")));
		 Thread.sleep(5000);
    
         File src=new File("./src/main/java/com/wellness/qa/config/config.properties");
     	FileInputStream fis=new FileInputStream(src);
     	Properties pro=new  Properties();
     	pro=new Properties();
     	pro.load(fis);
         
         Actions actn= new Actions(driver);
       actn.moveToElement(driver.findElement(By.xpath("//*[@id=\"sidebarnav\"]/li[1]/a[3]/span"))).click().build().perform();
       
       Thread.sleep(5000);
		 

       Actions actn1= new Actions(driver);
       actn1.moveToElement(driver.findElement(By.xpath("//*[@id=\"plan_type\" or @name=\"plan_type\"]"))).click().build().perform();

       Thread.sleep(2000);
    Boolean wellneesslist=   driver.findElement(By.xpath("//*[@id=\"plan_type\"]")).isDisplayed();
    System.out.println(wellneesslist);
    
WebElement opt1=driver.findElement(By.id("plan_type"));

WebElement opt2=driver.findElement(By.id("plan_type"));

    	doSelectByVisbleValue(opt1,pro.getProperty("WellnessPlan2"));
    	
  
    Thread.sleep(5000);

    WebElement element11 =    driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[1]/div/div/div/div[4]/div[1]/div/div[2]/button"));
	  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element11);  
   
	  WebDriverWait wait = new WebDriverWait(driver, 5);
		 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(element11)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element);
		 
		 WebElement element2 =    driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[1]/div/div/div/div[7]/div[1]/div/div/div/div[2]/button"));
		 WebElement element1 = wait.until(ExpectedConditions.elementToBeClickable(element2)); 
		 ((JavascriptExecutor)driver).executeScript("arguments[0].click();", element1);
		 
	
		 
		 WebElement element3 =    driver.findElement(By.xpath("//input[@placeholder='Search user']"));
		  ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element3);  
	   
		  Thread.sleep(1000);
		  
		  element3.sendKeys(pro.getProperty("User3"));
	

	Thread.sleep(2000);

Actions act = new Actions(driver);
	act.sendKeys(Keys.DOWN).perform();
	act.sendKeys(Keys.ENTER).perform();

	
	 
	 
	 WebElement element21 =    driver.findElement(By.xpath("//*[@id=\"pet_selection\"]"));
	 ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element21);
	 
	 
	 Actions action1 = new Actions(driver);
        action1.moveToElement(element21).click().build().perform();
	 
    	WebElement opt3=driver.findElement(By.id("pet_selection"));
    	
    	Thread.sleep(4000);
    	
    	doSelectByVisibleText(opt3,pro.getProperty("Pet2"));
	 
	 
	 Actions action2 = new Actions(driver);
	 
	 action2.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Next')]"))).click().build().perform();
	 
	 
	 Thread.sleep(3000);
	 
		String actual=driver.getTitle();
		System.out.println(actual);
	String expected= "Subscribe Plan";
	Assert.assertEquals(actual, expected);

	 Thread.sleep(2000);
	 
String amount=	 driver.findElement(By.xpath("//h4/span")).getText();
System.out.println(amount);
Assert.assertEquals(amount,pro.getProperty("Amount9"));

Thread.sleep(2000);
     Actions action21 = new Actions(driver);
	 
	 action21.moveToElement(driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/app-create-subscription/div[2]/div/div/div/div/div[6]/address/button/span[1]"))).click().build().perform();
	 	
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
			   
			   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("Plan"));
			   
			   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
			   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("Subscriptionanme"));
		   
		   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
			   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("Customer"));
			   
		   driver.findElement(By.xpath("//span[@class=\"input-group-text fa fa-search cursor\"]")).click();
			   
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).clear();
		   
		   Thread.sleep(1000);
		   driver.findElement(By.xpath("//input[@name=\"search\"] ")).sendKeys(pro.getProperty("PetName"));
		   
		   
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
			
			if(el1.getText().equals(pro.getProperty("Plan"))) {
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
				
				if(el2.getText().equals(pro.getProperty("Planname1"))) {
					Boolean	status2=true;
						break;
					}	
				
				
			}
		   
		   
List<WebElement>	PetDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[2]/div/div[2]/div/div"));
		   
		   for(WebElement el3: PetDetails) {
				System.out.println(el3.getText());
				
				if(el3.getText().equals(pro.getProperty("Petname1"))) {
					Boolean	status3=true;
						break;
					}	
			
			}
		   
List<WebElement> SubscriberDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[3]/div/div[2]/div/div"));
		   
		   for(WebElement el4: SubscriberDetails) {
				System.out.println(el4.getText());
				if(el4.getText().equals(pro.getProperty("Subscriber1"))) {
					Boolean	status4=true;
						break;
					}	
				
			}
		   		   
		   
List<WebElement> AddonsDetails=driver.findElements(By.xpath("//*[@id=\"PlanDetails\"]/div[2]/div[5]/div/div[2]/div/div "));
		   
		   for(WebElement el5: AddonsDetails) {
				System.out.println(el5.getText());
				if(el5.getText().equals(pro.getProperty("Addon1"))) {
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
	if(el7.getText().equals(pro.getProperty("Amount9"))) {
		Boolean	status6=true;
			break;
		}	
	
}	   
	  }


	
@Test(priority=3)
public void upgradeSubscription() throws Exception {
 
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

action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[contains(text(),'Upgrade Plan')]"))).click().build().perform();
    


List<WebElement>	currentplandetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[1]"));
for(WebElement el1: currentplandetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("Amount3"))) {
	Boolean	status7=true;
		break;
	}
}


WebElement upgradeplan= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/div/div/select[@name='plan']"));


Actions action5= new Actions(driver);

action5.moveToElement(upgradeplan).click().build().perform();

upgradeplan.sendKeys(Keys.ARROW_DOWN);

upgradeplan.sendKeys(Keys.ENTER);

Thread.sleep(2000);

List<WebElement>	upgradeplandetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[2]"));
for(WebElement el1: upgradeplandetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("Amount4"))) {
	Boolean	status7=true;
		break;
	}
}

Thread.sleep(1000);

WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div[2]/textarea"));

Actions action7= new Actions(driver);

action7.moveToElement(textarea).click().build().perform();


textarea.sendKeys(pro.getProperty("Features"));


Thread.sleep(1000);

WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[1]/select"));


Actions action8 = new Actions(driver);

action8.moveToElement(paymentmode).click().build().perform();

Select slt212=new Select(paymentmode);
slt212.selectByVisibleText(pro.getProperty("PaymentType"));


WebElement paymenttype = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[2]/select"));


Actions action9= new Actions(driver);

action9.moveToElement(paymenttype).click().build().perform();


paymenttype.sendKeys(Keys.ARROW_DOWN);
paymenttype.sendKeys(Keys.ENTER);


Thread.sleep(1000);


JavascriptExecutor js = (JavascriptExecutor) driver;  

WebElement inpElement = driver.findElement(By.xpath("//input[@type=\"text\"  and @name=\"extra_charge_amount\"]"));
String actualtext = (String) js.executeScript("return arguments[0].value", inpElement);;

System.out.println(actualtext);

String expectedtext= pro.getProperty("Extracharge");

Assert.assertEquals(actualtext, expectedtext);


WebElement paynow= driver.findElement(By.xpath("//button[1]/span[contains(text(),'Pay Now')]"));
paynow.click();


try {
	Thread.sleep(5000);
String text61=driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div[1]/div[1]")).getText();
System.out.println(text61);
String exp61="Plan Upgraded successfully";
Assert.assertEquals(text61,exp61);
}
catch(Exception e) {
	e.printStackTrace();
}
}

	
@Test(priority=4)
public void upgradeDetails() throws Exception {

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

action4.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Payment History')]"))).click().build().perform();



List<WebElement>	PaymentHistory= driver.findElements(By.xpath("//*[@id=\"first-table\"]/thead"));
for(WebElement el6: PaymentHistory) {
	System.out.println(el6.getText());
}
	
	
List<WebElement>	rowdata= driver.findElements(By.xpath("//*[@id=\"first-table\"]/tbody/tr[1]"));
for(WebElement el7: rowdata) {
	System.out.println(el7.getText());
	if(el7.getText().equals(pro.getProperty("TransactionType"))) {
		Boolean	status6=true;
			break;
		}	
	
}	   

	  }


@Test(priority=5)
public void upgradeReport() throws Exception {
 
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
slt.selectByVisibleText(pro.getProperty("Action1"));


Thread.sleep(2000);

WebElement transactionmode= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[3]/select"));

transactionmode.click();

Select slt1=new Select(transactionmode);
slt1.selectByVisibleText(pro.getProperty("TransactionMode1"));


Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[4]/button[2]")).click();


((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

} 

@Test(priority=6)
public void downgradeSubscription() throws Exception {
 
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

action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[contains(text(),'Downgrade Plan')]"))).click().build().perform();



List<WebElement>	activeplandetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[1]"));
for(WebElement el1: activeplandetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("Amount5"))) {
	Boolean	status7=true;
		break;
	}
}


WebElement downgradeplan= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/div/div/select[@name='plan']"));


Actions action5= new Actions(driver);

action5.moveToElement(downgradeplan).click().build().perform();

downgradeplan.sendKeys(Keys.ARROW_DOWN);

downgradeplan.sendKeys(Keys.ENTER);

Thread.sleep(2000);

List<WebElement>	downgradeplandetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[2]"));
for(WebElement el1: downgradeplandetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("Amount6"))) {
	Boolean	status7=true;
		break;
	}
}


Thread.sleep(1000);

WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div/textarea"));

Actions action7= new Actions(driver);

action7.moveToElement(textarea).click().build().perform();


textarea.sendKeys(pro.getProperty("Features1"));


Thread.sleep(1000);

WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div[1]/select"));

Actions action8 = new Actions(driver);

action8.moveToElement(paymentmode).click().build().perform();

Select slt212=new Select(paymentmode);
slt212.selectByVisibleText(pro.getProperty("PaymentType1"));

Thread.sleep(1000);


JavascriptExecutor js = (JavascriptExecutor) driver;  

WebElement inpElement = driver.findElement(By.xpath("//input[@type=\"text\"  and @name=\"extra_charge_amount\"]"));
String actualtext = (String) js.executeScript("return arguments[0].value", inpElement);;

System.out.println(actualtext);

String expectedtext= pro.getProperty("Extracharge1");

Assert.assertEquals(actualtext, expectedtext);

WebElement paynow= driver.findElement(By.xpath("//button[1]/span[contains(text(),'Pay Now')]"));
paynow.click();


try {
	Thread.sleep(5000);
String text61=driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div[1]/div[1]")).getText();
System.out.println(text61);
String exp61="Plan Downgraded successfully";
Assert.assertEquals(text61,exp61);
}
catch(Exception e) {
	e.printStackTrace();
}
}


@Test(priority=7)
public void downgradeReport() throws Exception {
 
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
slt.selectByVisibleText(pro.getProperty("Action2"));


Thread.sleep(2000);

WebElement transactionmode= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[3]/select"));

transactionmode.click();

Select slt1=new Select(transactionmode);
slt1.selectByVisibleText(pro.getProperty("TransactionMode2"));


Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/div/div/div/div/div[1]/div[4]/button[2]")).click();


((JavascriptExecutor) driver).executeScript("window.scrollBy(0,500)");

} 
	
@Test(priority=8)
public void changeSubscription() throws Exception {
 
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

action4.moveToElement(driver.findElement(By.xpath("//*[@id=\"PlanDetails\"]/div[1]/div/a[contains(text(),'Change Plan')]"))).click().build().perform();
    
Thread.sleep(2000);

List<WebElement>	currentplandetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[1]"));
for(WebElement el1: currentplandetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("Amount7"))) {
	Boolean	status7=true;
		break;
	}
}


WebElement changeplan= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/div/div/select[@name='plan']"));


Actions action5= new Actions(driver);

action5.moveToElement(changeplan).click().build().perform();

changeplan.sendKeys(Keys.ARROW_DOWN);

changeplan.sendKeys(Keys.ENTER);

Thread.sleep(2000);

List<WebElement>	changeplandetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[2]"));
for(WebElement el1: changeplandetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("Amount8"))) {
	Boolean	status8=true;
		break;
	}
}

List<WebElement>	currentsubscriptiondetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div/div/div/div[1]"));

for(WebElement el1: currentsubscriptiondetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("CurrentAmount"))) {
	Boolean	status9=true;
		break;
	}
}


List<WebElement>	newsubscriptiondetails= driver.findElements(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[4]/div/div/div/div[2]"));

for(WebElement el1: newsubscriptiondetails) {
	System.out.println(el1.getText());
	
	if(el1.getText().equals(pro.getProperty("NewAmount"))) {
	Boolean	status10=true;
		break;
	}
}

Thread.sleep(2000);

driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[5]/div/div/div/div[1]/div/div/div/div[2]/button")).click();


Thread.sleep(1000);

WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[6]/div/textarea"));

Actions action7= new Actions(driver);

action7.moveToElement(textarea).click().build().perform();


textarea.sendKeys(pro.getProperty("Features2"));


Thread.sleep(1000);

WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[7]/div[1]/select"));


Actions action8 = new Actions(driver);

action8.moveToElement(paymentmode).click().build().perform();

Select slt212=new Select(paymentmode);
slt212.selectByVisibleText(pro.getProperty("PaymentType"));


WebElement paymenttype = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[7]/div[2]/select"));


Actions action9= new Actions(driver);

action9.moveToElement(paymenttype).click().build().perform();


paymenttype.sendKeys(Keys.ARROW_DOWN);
paymenttype.sendKeys(Keys.ENTER);


Thread.sleep(1000);


JavascriptExecutor js = (JavascriptExecutor) driver;  

WebElement extrachargeamount = driver.findElement(By.xpath("//input[@type=\"text\"  and @name=\"extra_charge_amount\"]"));
String actualtext = (String) js.executeScript("return arguments[0].value", extrachargeamount);;

System.out.println(actualtext);

String expectedtext= pro.getProperty("CancellationAmount");

Assert.assertEquals(actualtext, expectedtext);


String actualtext1=driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[8]")).getText();

System.out.println(actualtext1);

String expectedtext1= pro.getProperty("TotalChargeAmount");

Assert.assertEquals(actualtext1, expectedtext1);

WebElement paynow= driver.findElement(By.xpath("//button[1]/span[contains(text(),'Pay Now')]"));

paynow.click();


try {
	Thread.sleep(5000);
String text61=driver.findElement(By.xpath("//*[@id=\"toast-container\"]/div/div[1]/div[1]")).getText();
System.out.println(text61);
String exp61="Plan Changed successfully";
Assert.assertEquals(text61,exp61);
}
catch(Exception e) {
	e.printStackTrace();
}
}

	
@Test(priority=9)
public void changePlanDetails() throws Exception {

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

action4.moveToElement(driver.findElement(By.xpath("//button[contains(text(),'Payment History')]"))).click().build().perform();



List<WebElement>	PaymentHistory= driver.findElements(By.xpath("//*[@id=\"first-table\"]/thead"));
for(WebElement el6: PaymentHistory) {
	System.out.println(el6.getText());
}
	
	
List<WebElement>	rowdata= driver.findElements(By.xpath("//*[@id=\"first-table\"]/tbody/tr[1]"));
for(WebElement el7: rowdata) {
	System.out.println(el7.getText());
//	if(el7.getText().equals(pro.getProperty("TransactionType1"))) {
//		Boolean	status6=true;
//			break;
//		}	
	
}	   

	  }

	
@Test(priority=10)
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


Thread.sleep(1000);

WebElement textarea= driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[2]/div/textarea"));

Actions action7= new Actions(driver);

action7.moveToElement(textarea).click().build().perform();


textarea.sendKeys(pro.getProperty("Features3"));

Thread.sleep(1000);

WebElement paymentmode = driver.findElement(By.xpath("//*[@id=\"main-wrapper\"]/div/div/ng-component/p-sidebar[2]/div/div/div/div[3]/div[1]/select"));

Actions action8 = new Actions(driver);

action8.moveToElement(paymentmode).click().build().perform();

Select slt212=new Select(paymentmode);
slt212.selectByVisibleText(pro.getProperty("PaymentType2"));

Thread.sleep(1000);


JavascriptExecutor js = (JavascriptExecutor) driver;  

WebElement inpElement = driver.findElement(By.xpath("//input[@type=\"text\"  and @name=\"extra_charge_amount\"]"));
String actualtext = (String) js.executeScript("return arguments[0].value", inpElement);;

System.out.println(actualtext);

String expectedtext= pro.getProperty("CancelAmount");

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



@Test(priority=11)
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