package seeTestAutomation;

import java.net.MalformedURLException;
import java.net.URL;


import org.openqa.selenium.By;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.IOSMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;

public class checkperformancetransaction {

	protected IOSDriver driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();
    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxMjk4ODAsInhwLnAiOjEyOTg4NCwieHAubSI6MTY4OTA1MjA1NTQxNSwiZXhwIjoyMDA0NDE4NDQ0LCJpc3MiOiJjb20uZXhwZXJpdGVzdCJ9.oZEQwdkj8fnw9lBHiNOMcA0gDUeIDibrtxwTQMjJLqM";

    @BeforeClass
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start iOS Native Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='ios' and @category='PHONE'");
        dc.setCapability(MobileCapabilityType.APP, "cloud:com.experitest.ExperiBank");
        dc.setCapability(IOSMobileCapabilityType.BUNDLE_ID, "com.experitest.ExperiBank");
        driver = new IOSDriver(new URL("https://internal.experitest.com/wd/hub"), dc);
    }

    @Test
    public void quickStartiOSNativeDemo() {
        driver.rotate(ScreenOrientation.PORTRAIT);
        driver.executeScript("seetest:client.startPerformanceTransaction(\"Monitor\")");
        driver.findElement(By.xpath("//*[@name='usernameTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@name='passwordTextField']")).sendKeys("company");
        driver.findElement(By.xpath("//*[@name='loginButton']")).click();
        int status = 1; 
        try { 
       // new WebDriverWait(driver, WAIT_TIMEOUT).until(ExpectedConditions.alertIsPresent()); 
        } catch (Exception e) { 
        // TODO: handle exception 
        status = 0; 
        } 

        if (status == 1) { 
        driver.executeScript("seetest:client.setReportStatus('Passed', 'Passing in order to wait until alert is present')", null); 
        }
        Object o = driver.executeScript("seetest:client.endPerformanceTransaction(\"Transaction2407\")");
        System.out.println(o.toString());
        
    }

    @AfterClass
    public void tearDown() {
        System.out.println("Report URL: " + driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }
}
