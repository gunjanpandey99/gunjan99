package seeTestAutomation;
import java.util.Map;
import java.util.HashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class IOSSlider extends IOSBaseTest {

	
	@Test
	public void IOSlideTest() throws InterruptedException {
		
		WebElement slider = driver.findElement(AppiumBy.iOSClassChain("**/XCUIElementTypeSlider[`label == \'AppElem\'`]"));
		slider.sendKeys("0%");
		System.out.println(slider.getAttribute("value"));
		slider.sendKeys("1%");
		Thread.sleep(3000);
		System.out.println(slider.getAttribute("value"));
		
		
		
		
	}
}
