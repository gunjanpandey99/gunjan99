package rahulshettyacademy;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.options.XCUITestOptions;

public class IOSBaseTest {
	
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
		//options.setCapability("browserName","Chrome");
		options.setPlatformVersion("16.4");
		options.setWdaLaunchTimeout(Duration.ofSeconds(20));
		
		
		
		 driver = new IOSDriver(new URL("http://127.0.0.1:4723"), options);
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		
	}

}
