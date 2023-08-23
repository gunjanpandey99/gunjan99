package seeTestAutomation;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSBasics extends IOSBaseTest {

	
	@Test
	public void IOSBasicsTest() {
		driver.findElement(By.xpath("//*[@label='Alerts']")).click();
		//driver.findElement(By.id("//XCUIElementTypeStaticText[@name=\'Text Entry\']")).click();
		driver.findElement(By.xpath("(//*[@type='XCUIElementTypeTable']/*/*[@label='Show Simple'])[1]")).click();
	//	driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeCell")).sendKeys("Hello World");
		//driver.findElement(By.id("OK")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("label == \'OK\'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("label == \"Confirm / Cancel\"")).click();
	//	String text= driver.findElement(AppiumBy.iOSNsPredicateString("name BEGINSWITH[c] 'A message'")).getText();
		//System.out.println(text);
		//driver.findElement(AppiumBy.iOSNsPredicateString("label == \'Confirm\'")).click();

		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value =='Confirm/Cancel'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value BEGINSWITH[c] 'Confirm'")).click();
		//driver.findElement(AppiumBy.iOSNsPredicateString("type == 'XCUIElementTypeStaticText' AND value ENDSWITH[c] 'Cancel'")).click();
		
		
		
		
	}
}
