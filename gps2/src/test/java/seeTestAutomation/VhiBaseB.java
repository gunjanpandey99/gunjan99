package seeTestAutomation;
import org.openqa.selenium.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class VhiBaseB {
	
	//public AndroidDriver driver;
	//private static final String ACCESS_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo2NjI0LCJ4cC5wIjoxLCJ4cC5tIjoxNjgwNzc3MzUwNTgyLCJleHAiOjE5OTYxMzc1MjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zDUptF12Mznkc3mANyj-ld2plnQ-tt93vMJPP5T6Q7A";
	private static final String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxNDQwNTIsInhwLnAiOjEsInhwLm0iOjE2ODkyMjM5OTQxNDgsImV4cCI6MjAwNDU4Mzk5NSwiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.itcTEpeRnwaRrV9nGlKFGZkEftmFgE7yNn8Vl6amrfY";
	protected RemoteWebDriver driver;
    private URL url;
   // private DesiredCapabilities dc = new DesiredCapabilities();
    //private DesiredCapabilities options = new DesiredCapabilities();

	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		//options.setDeviceName("Samsung");
		//options.setCapability("UDID","RZ8TC0D6WEB");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//ApiDemos-debug.apk");
		//options.setChromedriverExecutable("//Users/gunjanpandey//Downloads//chromedriver_mac64");
		// options.setCapability("deviceQuery", "@serialNumber='RF8M73A9G4X'");
		 options.setCapability("deviceQuery", "@serialNumber='988a1636313847494c'");
		 options.setCapability("accessKey", accessKey);
		 //options.setCapability("browserName","Chrome");
		// options.setCapability("experitest:testName", "Quick Start Chrome Browser Demo");
		// options.setCapability("experitest:testName", "Windows10 Chrome BROWSER");
	   //  options.setCapability("experitest:accessKey", ACCESS_KEY);
	    // options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	     options.setCapability(CapabilityType.BROWSER_VERSION, "114.0.5735.26");
	   //  options.setCapability("experitest:osName", "Windows 10");
	   //  options.setCapability("appiumVersion", "1.22.3");
	     driver = new RemoteWebDriver(new URL("https://vhi.experitest.com/wd/hub"),options);
		
		// driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	

	
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

	

}
