package seeTestAutomation;

import org.openqa.selenium.*;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import java.net.URL;
import java.time.Duration;


public class ChromeWindows10 {

    private static final String ACCESS_KEY = "eyJhbGciOiJIUzI1NiJ9.eyJ4cC51Ijo2NjI0LCJ4cC5wIjoxLCJ4cC5tIjoxNjgwNzc3MzUwNTgyLCJleHAiOjE5OTYxMzc1MjMsImlzcyI6ImNvbS5leHBlcml0ZXN0In0.zDUptF12Mznkc3mANyj-ld2plnQ-tt93vMJPP5T6Q7A";
    private RemoteWebDriver driver;
    private URL url;
    private DesiredCapabilities dc = new DesiredCapabilities();

    @BeforeTest
    public void setUp() throws Exception {
        dc.setCapability("experitest:testName", "Windows10 Chrome BROWSER");
        dc.setCapability("experitest:accessKey", ACCESS_KEY);
        dc.setCapability(CapabilityType.BROWSER_NAME, "chrome");
        dc.setCapability("experitest:osName", "Windows 10");
        driver = new RemoteWebDriver(new URL("https://internal.experitest.com/wd/hub"), dc);
    }


    @Test
    public void browserTestGoogleSearch() {
        for (int i = 0; i < 7; i++) {
            driver.get("https://www.google.com");
           new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.presenceOfElementLocated(By.name("q")));
           
            WebElement searchBar = driver.findElement(By.name("q"));
            searchBar.click();
            searchBar.sendKeys("Experitest");
            searchBar.sendKeys(Keys.ENTER);
        }
    }
    

    @AfterTest
    public void tearDown() {
        System.out.println("Report URL: "+ driver.getCapabilities().getCapability("reportUrl"));
        driver.quit();
    }

}
