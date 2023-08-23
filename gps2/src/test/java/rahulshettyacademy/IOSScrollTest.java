package rahulshettyacademy;
import java.util.Map;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSScrollTest extends IOSBaseTest {

	
	@Test
	public void IOScrollTest2() throws InterruptedException {
		//driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
		WebElement ele=driver.findElement(AppiumBy.accessibilityId("Web View"));
		Map<String,Object> params =new HashMap<>();
		params.put("element",((RemoteWebElement)ele).getId());
		params.put("direction","down");
         driver.executeScript("mobile:scroll", params);
         driver.findElement(AppiumBy.accessibilityId("Web View")).click();
         Thread.sleep(2000);
		driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'UIKitCatalog\']")).click();
		
        driver.findElement(AppiumBy.accessibilityId("Picker View")).click();
        Thread.sleep(5000);
        //driver.findElement(By.xpath("//XCUIElementTypeButton[@name=\'UIKitCatalog\']")).click();
        driver.findElement(AppiumBy.accessibilityId("Red color component value")).sendKeys("80");
        driver.findElement(AppiumBy.accessibilityId("Green color component value")).sendKeys("220");
        driver.findElement(AppiumBy.accessibilityId("Blue color component value")).sendKeys("105");
        String response= driver.findElement(AppiumBy.accessibilityId("Red color component value")).getText();
        Assert.assertEquals(response, "80");
        
        
        
        
        
        
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value =='Confirm/Cancel'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Confirm'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ENDSWITH[c] 'Cancel'")).click();
		
		
		
		
	}
}
