package seeTestAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxMjk4ODAsInhwLnAiOjEsInhwLm0iOjE2ODkwNTIwNTU0MTUsImV4cCI6MjAwNDY5MTI4MywiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.VNyYkDZxyxYRRVtSM_WPiOwhYc4I8j5VEjh7v4BfBTA";
	
	//second one for vhicloud
	public AndroidDriver driver;
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		//final String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo2NjI0LCJ4cC5wIjoxLCJ4cC5tIjoxNjgwNzc3MzUwNTgyLCJleHAiOjE5OTYxMzc1MjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zDUptF12Mznkc3mANyj-ld2plnQ-tt93vMJPP5T6Q7A";
		//options.setDeviceName("Samsung");
		//options.setCapability("UDID","RZ8TC0D6WEB");
		//options.setDeviceName("gunjansemulator");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//ApiDemos-debug.apk");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//General-Store.apk");
		//options.setCapability("browserName","Chrome");
		
		
		 
	//	driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		   // options.setCapability("testName", "Quick Start Android Native Demo");
	        options.setCapability("accessKey", accessKey);
	        options.setCapability("deviceQuery", "@serialNumber='RF8M73A9G4X'");
	                                                             
	        
	      //  options.setCapability(MobileCapabilityType.APP, "cloud:io.appium.android.apis/.ApiDemos");
	      // options.setCapability(MobileCapabilityType.APP, "device:com.am/.amlmobile.splash.SplashActivity");
	       //options.setCapability(MobileCapabilityType.APP, "cloud:com.androidsample.generalstore/.SplashActivity");

	    //   options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis/.ApiDemos");
	      // options.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
	    //   options.setCapability(MobileCapabilityType.APP, "com.am.amlmobile.splash.SplashActivity");
	        //options.setCapability("app","Cathay");
	    //  options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.am");
	      // options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "device:com.am.amlmobile.splash.SplashActivity");
	      //  options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
	     //   options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
	   //   options.setCapability("appiumVersion", "1.22.3");
	       //options.setCapability("appiumVersion", "2.0.0.beta.55");
	      //  options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
	        driver = new AndroidDriver(new URL("https://internal.experitest.com/wd/hub"), options);

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
