package seeTestAutomation;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileBrowserType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseforVhi {
	//private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo2NjI0LCJ4cC5wIjoxLCJ4cC5tIjoxNjgwNzc3MzUwNTgyLCJleHAiOjE5OTYxMzc1MjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zDUptF12Mznkc3mANyj-ld2plnQ-tt93vMJPP5T6Q7A";
	private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxNDQwNTIsInhwLnAiOjEsInhwLm0iOjE2ODkyMjM5OTQxNDgsImV4cCI6MjAwNDU4Mzk5NSwiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.itcTEpeRnwaRrV9nGlKFGZkEftmFgE7yNn8Vl6amrfY";
	//second one for vhicloud
	protected RemoteWebDriver driver;
	//public AndroidDriver driver;
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
	        //options.setCapability("deviceQuery", "@serialNumber='RF8M73A9G4X'");
	        options.setCapability("deviceQuery", "@serialNumber='988a1636313847494c'");
	        
	       // options.setCapability(MobileCapabilityType.APP, "cloud:io.appium.android.apis/.ApiDemos");
	       // options.setCapability(MobileCapabilityType.APP, "cloud:com.androidsample.generalstore/.SplashActivity");
	        //options.withBrowserName(MobileBrowserType.CHROME);
	    //   options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "io.appium.android.apis/.ApiDemos");
	      // options.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank/.LoginActivity");
	       // options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
	      //  options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
	      
	        options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
		    // options.setCapability(CapabilityType.BROWSER_VERSION, "114.0.5735.26");
	        
	        
	     options.setCapability("appiumVersion", "1.22.3");
	       //options.setCapability("appiumVersion", "2.0.0.beta.55");
	      //  options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
	       // driver = new AndroidDriver(new URL("https://internal.experitest.com/wd/hub"), options);
	        driver = new RemoteWebDriver(new URL("https://vhi.experitest.com/wd/hub"),options);

		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	
	
	
	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
