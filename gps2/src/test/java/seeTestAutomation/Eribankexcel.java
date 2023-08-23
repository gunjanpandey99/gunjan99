package seeTestAutomation;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Eribankexcel  extends BaseTest {
	
	
	
	@Test(priority=0)
	public  void general_1() throws InterruptedException {
	
		    driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys("company");
	        driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys("company");
	        driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.id("com.experitest.ExperiBank:id/makePaymentButton")).click();
	        driver.findElement(By.id("com.experitest.ExperiBank:id/cancelButton")).click();
	        Thread.sleep(2000);
	        
	        driver.findElement(By.id("com.experitest.ExperiBank:id/mortageRequestButton")).click();
	        driver.findElement(By.id("com.experitest.ExperiBank:id/cancelButton")).click();
	        
	       
	        driver.findElement(By.id("com.experitest.ExperiBank:id/logoutButton")).click();
	        Thread.sleep(2000);
	      
	}
	
	@Test(dataProvider = "LoginDetails_xlsx")
	public void general_2(String username , String password)throws InterruptedException {
		    driver.findElement(By.id("com.experitest.ExperiBank:id/usernameTextField")).sendKeys(username);
	        driver.findElement(By.id("com.experitest.ExperiBank:id/passwordTextField")).sendKeys(password);
	        driver.findElement(By.id("com.experitest.ExperiBank:id/loginButton")).click();
	        Thread.sleep(2000);
	        
	        
	        if(driver.findElements(By.id("com.experitest.ExperiBank:id/logoutButton")).size()!=0){
	        	Assert.assertTrue(true);
	        	 }
	        else {
	        	driver.findElement(By.xpath("//*[@text='Close']")).click();
	  	        }
	        driver.findElement(By.id("com.experitest.ExperiBank:id/makePaymentButton")).click();
	        driver.findElement(By.id("com.experitest.ExperiBank:id/phoneTextField")).sendKeys("0501234567");
	        driver.findElement(By.id("com.experitest.ExperiBank:id/nameTextField")).sendKeys("GPS");
	        driver.findElement(By.id("com.experitest.ExperiBank:id/amountTextField")).sendKeys("5");
	        driver.findElement(By.id("com.experitest.ExperiBank:id/countryTextField")).sendKeys("'India");
	        driver.findElement(By.id("com.experitest.ExperiBank:id/sendPaymentButton")).click();
	        driver.findElement(By.id("android:id/button1")).click();
	        // String text=  driver.findElement(By.className("android.widget.TextView")).getText();
	         String text=  driver.findElement(By.xpath("//*[@text='Your balance is: 95.00$']")).getText();
	         Assert.assertEquals(text,"Your balance is: 95.00$","Balance is not Matching");
	         
	         driver.findElement(By.id("com.experitest.ExperiBank:id/expenseReportButton")).click();
	         driver.findElement(By.id("com.experitest.ExperiBank:id/backButton")).click();
	         driver.findElement(By.id("com.experitest.ExperiBank:id/logoutButton")).click();
			}
	
	
	@DataProvider(name="LoginDetails_xlsx")
	public Object[][] dpMethod(){
		return new Object[][] {
			{"company","company"},
			{"One","company"},
			{"company","one"},
			{" ","One"},
			{"One"," "},
			{"One","One"},
			{"Company","Company"},
			{"","Company"}};
		}
	}
	
		
	
	
	
	




