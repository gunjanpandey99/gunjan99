package seeTestAutomation;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class vhielementclickcheck extends VhiBaseB {
	@Test
	public void Browsercheck() throws InterruptedException {
		
		driver.get("https://app.test.vhi.ie/myvhi/covercheck/procedure/start/7995292");
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,250)", "");
		driver.findElement(By.xpath("//*@resource-id='procedureCode-tooltip-button'")).click();
		Thread.sleep(2000);
		
		WebElement ele=driver.findElement(By.xpath("//*@resource-id='procedureCode-tooltip-button'"));
		Map<String,Object>params = new HashMap<>();
		params.put("element",((RemoteWebElement)ele).getId());
		//driver.executeScript("mobile:touchAndHold", params);
		params.put("duration", 5);
		driver.executeScript("mobile:touchAndHold", params);
		
		
		
		//driver.findElement(By.xpath("//*@resource-id='procedureCode-tooltip-button'")).click();
		
		
	}
	
	

}
