package rahulshettyacademy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileBrowserType;
import org.testng.annotations.*;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class Vhitest {

    private String accessKey = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51IjoxNDQwNTIsInhwLnAiOjEsInhwLm0iOjE2ODkyMjM5OTQxNDgsImV4cCI6MjAwNDU4Mzk5NSwiaXNzIjoiY29tLmV4cGVyaXRlc3QifQ.itcTEpeRnwaRrV9nGlKFGZkEftmFgE7yNn8Vl6amrfY";
    protected AndroidDriver  driver = null;
    DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeTest
    public void setUp() throws MalformedURLException {
        dc.setCapability("testName", "Quick Start Android Browser Demo");
        dc.setCapability("accessKey", accessKey);
        dc.setCapability("deviceQuery", "@os='android' and @category='PHONE'");
        dc.setBrowserName(MobileBrowserType.CHROME);
        dc.setCapability("appiumVersion", "1.22.0");
        driver = new AndroidDriver(new URL("https://vhi.experitest.com/wd/hub"), dc);
    }

    @Test
    public void quickStartAndroidBrowserDemo() throws InterruptedException {
        driver.rotate(ScreenOrientation.PORTRAIT);
       // driver.get("https://www.google.com");
    	driver.get("https://app.test.vhi.ie/myvhi/covercheck/procedure/start/7995292");
		Thread.sleep(3000);
		driver.findElement(By.id("accept-recommended-btn-handler"));
		//driver.findElement(By.xpath("//*[@resource-id='accept-recommended-btn-handler']")).click();
		//driver.findElement(By.xpath("//*[@resource-id='close-pc-btn-handler']")).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)", "");
		driver.findElement(By.xpath("//*@resource-id='procedureCode-tooltip-button'")).click();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//*@resource-id='procedureCode-tooltip-button'"));
		Map<String,Object>params = new HashMap<>();
		params.put("element",((RemoteWebElement)ele).getId());
		//driver.executeScript("mobile:touchAndHold", params);
		params.put("duration", 5);
		driver.executeScript("mobile:touchAndHold", params);
      //  WebElement searchBar = new WebDriverWait(driver, 10).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
       // searchBar.sendKeys("Digital.ai");
        driver.pressKey(new KeyEvent(AndroidKey.ENTER));
    }

    @AfterTest
    public void tearDown() {
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }
}
