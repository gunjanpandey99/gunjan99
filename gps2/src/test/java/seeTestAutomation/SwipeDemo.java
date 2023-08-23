package seeTestAutomation;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class SwipeDemo extends BaseTest {
	@Test
	public void SwipeDemoTest()throws MalformedURLException, InterruptedException{
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.xpath("//android.widget.TextView[@content-desc=\"1. Photos\"]")).click();
		WebElement firstImage = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		
	    Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"true");
	    
	    
	    ((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
	    	    "elementId", ((RemoteWebElement)firstImage).getId(),
	    	    "direction", "left",
	    	    "percent", 0.75
	    	));
		
		
	    Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[1]")).getAttribute("focusable"),"false");

		
		
		//driver.findElement(By.id("android:id/checkbox")).click();
		//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
	}
	

}
