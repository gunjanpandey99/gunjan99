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



public class DragAndDrop extends BaseTest {
	@Test
	public void DragAndDropTest()throws MalformedURLException, InterruptedException{
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Drag and Drop")).click();
		WebElement source= driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
        
		((JavascriptExecutor) driver).executeScript("mobile: dragGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) source).getId(),
			    "endX", 828,
			    "endY", 723
			));
		
		Thread.sleep(3000);
		String reply= driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(reply, "Dropped!");
		
		//driver.findElement(By.id("android:id/checkbox")).click();
		//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
	}
	

}
