package rahulshettyacademy;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class LongPress extends BaseTest {
	@Test
	public void LongPressGesture()throws MalformedURLException, InterruptedException{
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Expandable Lists\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
		WebElement ele= driver.findElement(By.xpath("//android.widget.TextView[@text='People Names']"));
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
		Thread.sleep(2000);
		
		String menuText = driver.findElement(By.id("android:id/title")).getText();
		Assert.assertEquals(menuText, "Sample menu");
		Assert.assertTrue(driver.findElement(By.id("android:id/title")).isDisplayed());
		
		
		
		//driver.findElement(By.id("android:id/checkbox")).click();
		//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
	}
	

}
