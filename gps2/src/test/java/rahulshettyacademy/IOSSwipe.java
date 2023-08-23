package rahulshettyacademy;
import java.util.Map;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSSwipe extends IOSBaseTest {

	
	@Test
	public void IOSSwipeTest() {
		Map<String,String> params = new HashMap<String,String>();
		params.put("bundleId", "com.apple.mobileslideshow");
		driver.executeScript("mobile:launchApp", params);
		//driver.findElement(AppiumBy.iOSNsPredicateString("label == 'All Photos'")).click();
		//List<WebElement> allPhotos = driver.findElements(AppiumBy.iOSClassChain("**/XCUIElementTypeCell"));
		//System.out.println(allPhotos.size());
		driver.findElement(By.xpath("///XCUIElementTypeImage[@name=\"Photo, March 13, 2011, 5:47 AM\"]"));
		for(int i =0;i<6;i++) {
		System.out.println(driver.findElement(By.xpath("//XCUIElementTypeNavigationBar")).getAttribute("name"));	
		//driver.findElement(By.xpath("//XCUIElementTypeCell[1]"));
		Map<String,Object> params1 = new HashMap<String,Object>();
		params1.put("direction","left");
		driver.executeScript("mobile:swipe",params1);
		
		}
		
		driver.navigate().back();
		driver.findElement(AppiumBy.accessibilityId("Albums")).click();
		

		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value =='Confirm/Cancel'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Confirm'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ENDSWITH[c] 'Cancel'")).click();
		
		
		
		
	}
}
