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

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;



public class SwipeonCathay2 extends BaseTest {
	@Test
	public void ScrollDemoTest()throws MalformedURLException, InterruptedException{
		
		
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Preference\"]")).click();
		//driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
		//driver.findElement(By.id("com.am:id/ctaSignIn")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("com.am:id/cxbtn_navigation_membership")).click();
		//Thread.sleep(2000);
		//driver.findElement(By.id("com.am:id/cetLrpTextField")).sendKeys("1774607378");
	//	Thread.sleep(2000);
		//driver.findElement(By.id("com.am:id/cxtf_password")).sendKeys("Best123!");
	//	Thread.sleep(2000);
	//	driver.findElement(By.id("com.am:id/btn_background")).click();
		//Thread.sleep(2000);
	
		
		//driver.findElement(By.xpath("(//*[@resource-id='com.am:id/bt_miles']/*[@class='android.widget.ImageView'])[2]")).click();
		//driver.findElement(AppiumBy.androidUIAutomator("new UIScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"));"));
		Thread.sleep(2000);
		boolean canScrollMore;
		do {
		canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", "up",
			    "percent", 20.0
			));
		}while(canScrollMore);
		Thread.sleep(2000);
		

		
		
		//driver.findElement(By.id("android:id/checkbox")).click();
		//driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		
	}
	

}
