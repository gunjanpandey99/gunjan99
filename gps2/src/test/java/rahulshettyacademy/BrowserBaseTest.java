package rahulshettyacademy;

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

public class BrowserBaseTest {
	//private static final String ACCESS_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo2NjI0LCJ4cC5wIjoxLCJ4cC5tIjoxNjgwNzc3MzUwNTgyLCJleHAiOjE5OTYxMzc1MjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zDUptF12Mznkc3mANyj-ld2plnQ-tt93vMJPP5T6Q7A";
    //private RemoteWebDriver driver;
   // private URL url;
    //private DesiredCapabilities dc = new DesiredCapabilities();
	public AndroidDriver driver;
	@BeforeClass
	    public void ConfigureAppium() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Samsung");
		options.setCapability("UDID","RZ8TC0D6WEB");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//ApiDemos-debug.apk");
		//options.setChromedriverExecutable("//Users/gunjanpandey//Downloads//chromedriver_mac64");
		//options.setCapability("browserName","Chrome");
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 //options.setCapability("testName", "Quick Start Chrome Browser Demo");
	     //options.setCapability("accessKey", ACCESS_KEY);
	     //options.setCapability(CapabilityType.BROWSER_NAME, "chrome");
	     //options.setCapability(CapabilityType.BROWSER_VERSION, "114.0.5735.26");
	     //options.setCapability("experitest:osName", "Mac OS Ventura");
	   //  driver = new RemoteWebDriver(new URL("https://internal.experitest.com/wd/hub"), dc);
		 
		 
		 
		 
		 
		 
		
	}
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

	

}
