package seeTestAutomation;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class biogenIosdriverissue {

    protected IOSDriver driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjozNDE4NzYsInhwLnAiOjg0NTc0LCJ4cC5tIjoxNjg2MjE0MjEzOTgxLCJleHAiOjIwMDI2MTA4OTYsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.Xz82O-5YC0V4xyD18PHobKCndIbtzD8fCYWUv0EvIGs";

    @BeforeTest
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start iOS Native Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @version='15.4.1' and @category='PHONE'");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
        dc.setCapability("appiumVersion", "2.0.0.beta.23");
        dc.setCapability("automationName", "XCUITest");
        driver = new IOSDriver(new URL("https://biogen.experitest.com/wd/hub"), dc);
    }

    @Test
    public void quickStartiOSNativeDemo() {
       endtoend();
    }

    private void endtoend() {
		// TODO Auto-generated method stub
    	 driver.rotate(ScreenOrientation.PORTRAIT);
         driver.findElement(By.xpath("//*[@name='usernameTextField']")).sendKeys("company");
         driver.findElement(By.xpath("//*[@name='passwordTextField']")).sendKeys("company");
         driver.findElement(By.xpath("//*[@name='loginButton']")).click();
         driver.findElement(By.xpath("//*[@name='makePaymentButton']")).click();
         driver.findElement(By.xpath("//*[@name='phoneTextField']")).sendKeys("0501234567");
         driver.findElement(By.xpath("//*[@name='nameTextField']")).sendKeys("John Snow");
         driver.findElement(By.xpath("//*[@name='amountTextField']")).sendKeys("50");
         driver.findElement(By.xpath("//*[@name='countryButton']")).click();
         driver.findElement(By.xpath("//*[@name='Switzerland']")).click();
         driver.findElement(By.xpath("//*[@name='sendPaymentButton']")).click();
         driver.findElement(By.xpath("//*[@name='Yes']")).click();
		
	}

	@AfterTest
    public void tearDown() {
        System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }
}