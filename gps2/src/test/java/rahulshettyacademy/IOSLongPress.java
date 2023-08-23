package rahulshettyacademy;
import java.util.Map;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSLongPress extends IOSBaseTest {

	
	@Test
	public void IOSLongPressTest() {
		driver.findElement(AppiumBy.accessibilityId("Steppers")).click();
		
		WebElement ele=driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeButton[`label == \"Increment\"`][3]"));
		Map<String,Object>params = new HashMap<>();
		params.put("element",((RemoteWebElement)ele).getId());
		//driver.executeScript("mobile:touchAndHold", params);
		params.put("duration", 5);
		driver.executeScript("mobile:touchAndHold", params);
		

		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value =='Confirm/Cancel'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Confirm'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ENDSWITH[c] 'Cancel'")).click();
		
		
		
		
	}
}
