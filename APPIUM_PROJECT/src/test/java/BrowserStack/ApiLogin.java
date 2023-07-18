package BrowserStack;

import java.awt.List;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.sun.tools.javac.util.Assert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class ApiLogin {
	
	public static void main(String[] args) throws MalformedURLException, InterruptedException
	{
		
    	DesiredCapabilities caps = new DesiredCapabilities();
    	
    	// Set your access credentials
    	caps.setCapability("browserstack.user", "sivasubramaniamm_iF9ugM");
    	caps.setCapability("browserstack.key", "qrMTpk8ZS4KFCJ9JDsfP");
    	
    	// Set URL of the application under test
    	caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
    	
    	// Specify device and os_version for testing
    	  caps.setCapability("device", "Vivo Y50");
          caps.setCapability("os_version", "10.0");
         
    	// Set other BrowserStack capabilities
    	caps.setCapability("project", "First Java Project");
    	caps.setCapability("build", "browserstack-build-1");
    	caps.setCapability("name", "first_test");
    	caps.setCapability("appPackage", "com.androidsample.generalstore");
		caps.setCapability("appActivity", ".SplashActivity");
    	
    	
    	URL url=new URL("https://sivasubramaniamm_iF9ugM:qrMTpk8ZS4KFCJ9JDsfP@hub-cloud.browserstack.com/wd/hub");
       
    	
    AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url,caps);
    Thread.sleep(3000);
   driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("santhruptha");
   driver.findElement(By.id("com.androidsample.generalstore:id/radioMale")).click();
   driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 4 Retro']/following-sibling::android.widget.LinearLayout[@index='3']/child::android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@text='Air Jordan 1 Mid SE']/following-sibling::android.widget.LinearLayout[@index='3']/child::android.widget.TextView[@resource-id='com.androidsample.generalstore:id/productAddCart']")).click();
	driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	String actualTotalPrice = driver.findElement(By.id("com.androidsample.generalstore:id/totalAmountLbl")).getText();
	System.out.println(actualTotalPrice);
	String expectedTotalPrice="$ 280.97";
	org.testng.Assert.assertEquals(actualTotalPrice, expectedTotalPrice);

	driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
        
        
        // Invoke driver.quit() after the test is done to indicate that the test is completed.
        driver.quit();
		
	}
	
//			public static void main(String[] args) throws MalformedURLException, InterruptedException {
//				
//		    	DesiredCapabilities caps = new DesiredCapabilities();
//		    	
//		    	// Set your access credentials
//		    	caps.setCapability("browserstack.user", "sivasubramaniamm_iF9ugM");
//		    	caps.setCapability("browserstack.key", "qrMTpk8ZS4KFCJ9JDsfP");
//		    	
//		    	// Set URL of the application under test
//		    	caps.setCapability("app", "bs://c700ce60cf13ae8ed97705a55b8e022f13c5827c");
//		    	
//		    	// Specify device and os_version for testing
//		        caps.setCapability("device", "Xiaomi Redmi Note 8");
//		        caps.setCapability("os_version", "9.0");
//		        
//		    	// Set other BrowserStack capabilities
//		    	caps.setCapability("project", "First Java Project");
//		    	caps.setCapability("build", "browserstack-build-1");
//		    	caps.setCapability("name", "first_test");
//		       
		    	
//		    	// Initialise the remote Webdriver using BrowserStack remote URL
//		    	// and desired capabilities defined above
//		        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(
//		        		new URL("http://hub.browserstack.com/wd/hub"), caps);
//		        
//		        // Test case for the BrowserStack sample Android app. 
//		        // If you have uploaded your app, update the test case here. 
//		        AndroidElement searchElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//		            ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("Search Wikipedia")));
//		        searchElement.click();
//				AndroidElement insertTextElement = (AndroidElement) new WebDriverWait(driver, 30).until(
//		             ExpectedConditions.elementToBeClickable( MobileBy.id("org.wikipedia.alpha:id/search_src_text")));
//		        insertTextElement.sendKeys("BrowserStack");
//		        Thread.sleep(5000);
//		        List<AndroidElement> allProductsName = driver.findElementsByClassName(
//		        		"android.widget.TextView");
//		        assert(allProductsName.size() > 0);
//		        
//		        
//		        // Invoke driver.quit() after the test is done to indicate that the test is completed.
//		        driver.quit();
//				
		//	}
		
		
	}


