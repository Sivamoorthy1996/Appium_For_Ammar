package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class BrowserStackPractices {

	@Test
	public void browserStackPractices() throws InterruptedException, MalformedURLException {
	
				
		    	DesiredCapabilities caps = new DesiredCapabilities();
		    	
		    	// Set your access credentials
		    	caps.setCapability("browserstack.user", "sivasubramaniamm_iF9ugM");
		    	caps.setCapability("browserstack.key", "qrMTpk8ZS4KFCJ9JDsfP");
		    	
		    	// Set URL of the application under test
		    	caps.setCapability("app", "bs://e1586bd2141e2836774983baf1841bb935f60033");
		    	
		    	// Specify device and os_version for testing
		        caps.setCapability("device", "Vivo Y50");
		        caps.setCapability("os_version", "10.0");
		        
		    	// Set other BrowserStack capabilities
		    	caps.setCapability("project", "First Java Project");
		    	caps.setCapability("build", "browserstack-build-1");
		    	caps.setCapability("name", "first_test");
		       
		    	
		    	// Initialise the remote Webdriver using BrowserStack remote URL
		    	// and desired capabilities defined above
		        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
		        		new URL("http://hub.browserstack.com/wd/hub"), caps);
		        
		        // Test case for the BrowserStack sample Android app. 
		        // If you have uploaded your app, update the test case here. 
		        driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
				driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
				driver.findElement(By.id("android:id/button1")).click();
				driver.findElementByAccessibilityId("Views").click();
				driver.findElementByAccessibilityId("Controls").click();
				driver.findElementByAccessibilityId("1. Light Theme").click();
				driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("siva");
				driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
				driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
				driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
				driver.findElement(By.id("io.appium.android.apis:id/star")).click();
				driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
				driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
				driver.hideKeyboard();
				driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
				driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']")).click();
				//driver.findElement(By.id("io.appium.android.apis:id/button")).click();
				driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
				  java.util.List<AndroidElement> values = driver.findElements(By.className("android.widget.CheckedTextView"));
				 for(WebElement v:values) {
					 System.out.println(v.getText());
				 }
		        
		        
		        // Invoke driver.quit() after the test is done to indicate that the test is completed.
		        driver.quit();
				
			}
		
	
}
