package seeTestAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class IOSBaseTest {
	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo2NjI0LCJ4cC5wIjoxLCJ4cC5tIjoxNjgwNzc3MzUwNTgyLCJleHAiOjE5OTYxMzc1MjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zDUptF12Mznkc3mANyj-ld2plnQ-tt93vMJPP5T6Q7A";
	public IOSDriver driver;
	
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		XCUITestOptions options = new XCUITestOptions();
		
		//UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("iPhone 14");
		//options.setCapability("UDID","RZ8TC0D6WEB");
		//options.setDeviceName("gunjansemulator");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//UIKitCatalog.app");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//TestApp 3.app");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//General-Store.apk");
		 options.setCapability("testName", "Quick Start iOS Native Demo");
	     options.setCapability("accessKey", accessKey);
	    // options.setCapability("deviceQuery", "@os='ios' and @version='14.5.1' and @category='PHONE'");
	     options.setCapability("deviceQuery", "@serialNumber='00008030-0012710E1AA2802E'");
	      //  dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
	     options.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.UICatalog");
	  //   options.setCapability("deviceQuery", "@serialNumber='00008030-0012710E1AA2802E'");
	       // dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
	        options.setCapability("appiumVersion", "1.22.3");
	        driver = new IOSDriver(new URL("https://internal.experitest.com/wd/hub"), options);
		
		
		
		
		
		//options.setCapability("browserName","Chrome");
		//options.setPlatformVersion("16.4");
		//options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		
		
		
		// driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	@Test
	public void Demo() throws InterruptedException {
		Thread.sleep(2000);
	}
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
