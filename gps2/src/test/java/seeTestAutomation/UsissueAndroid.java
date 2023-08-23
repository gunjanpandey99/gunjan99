package seeTestAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class UsissueAndroid extends BrowserBaseTest{
	
	@Test
	public void demo() throws InterruptedException {
		driver.get("https://www.usbank.com/bank-accounts/savings-accounts/certificate-of-deposit/cd-specials.html");
		//driver.findElement(By.xpath("//div[@id='QSIFeedbackButton-target-container']")).click();
		driver.findElement(By.cssSelector("#zipcodes_edit")).click();
        driver.findElement(By.xpath("//input[@id='zipcode_entry']")).sendKeys("100001");
		Thread.sleep(10000);
		
	}
	

}
