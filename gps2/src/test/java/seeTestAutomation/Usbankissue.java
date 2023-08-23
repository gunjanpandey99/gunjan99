package seeTestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.TapOptions;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.JavascriptExecutor;
public class Usbankissue extends BrowserBaseTestforIOS {

	@Test
	
	public void Checkissue() throws InterruptedException{
		driver.get("https://www.usbank.com/bank-accounts/savings-accounts/certificate-of-deposit/cd-specials.html");
		//driver.findElement(By.xpath("//div[@id='QSIFeedbackButton-target-container']")).click();
		//WebElement ele =driver.findElement(By.cssSelector("#zipcodes_edit"));
		WebElement ele =driver.findElement(By.xpath("//*[@id='zipcodes_edit']"));
	//	JavascriptExecutor js = (JavascriptExecutor)driver; 
		 // js.executeScript("arguments[0].click();", ele);
		    
		    //new TouchAction(driver).tap(element).perform();
		   // Actions actions = new Actions(driver);  
		    //actions.click((RemoteWebElement)ele).perform();
		   TouchAction touchAction = new TouchAction((PerformsTouchActions) driver);
		   touchAction.tap((TapOptions) ele).perform();
		  //  actions.moveToElement(driver.findElement(By.xpath("//*[@id='zipcodes_edit']")).click();
       // driver.findElement(By.xpath("//input[@id='zipcode_entry']")).sendKeys("100001");
		Thread.sleep(10000);
		

	}
}
