package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaseTest {
	
	public AndroidDriver driver;
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		UiAutomator2Options options = new UiAutomator2Options();
		options.setDeviceName("Samsung");
		options.setCapability("UDID","RZ8TC0D6WEB");
		//options.setDeviceName("gunjansemulator");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//ApiDemos-debug.apk");
		//options.setApp("//Users//gunjanpandey//eclipse-workspace//gps2//src//test//java//resources//General-Store.apk");
		  // options.setCapability(MobileCapabilityType.APP, "com.am.amlmobile.splash.SplashActivity");
	       // options.setCapability("app","Cathay");
	   //  options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.am");
	   //   options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, "com.am.amlmobile.splash.SplashActivity");
	      //  options.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, "com.experitest.ExperiBank");
	     //   options.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, ".LoginActivity");
	     // options.
		
		
		
		//options.setCapability("browserName","Chrome");
		
		
		 driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
