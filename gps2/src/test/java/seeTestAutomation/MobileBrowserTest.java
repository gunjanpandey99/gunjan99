package seeTestAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

public class MobileBrowserTest extends BrowserBaseTest {
  
	@Test
	
	public void browserTest() throws InterruptedException {
		
		driver.get("http://google.com");
		System.out.println(driver.getTitle());
		driver.findElement(By.name("q")).sendKeys("digital.ai");
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		//driver.get("https://rahulshettyacademy.com/");
		//driver.findElement(By.xpath("//div[@class='nav-outer clearfix']//button[@type='button']"));
		
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,5000)","");
		
		
		//driver.findElement(By.cssSelector("//div[@class='nav-outer clearfix']//nav[@class='main-menu']//div[@class='navbar-collapse clearfix collapse in']//ul[@class='navigation clearfix']//li//a[@href='practice-project'][normalize-space()='Practice']"));
		
		
		
	}
	
}
