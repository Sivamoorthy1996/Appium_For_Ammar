package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class GeneralStoreAssignment {
	@Test
	public void genralstore() throws MalformedURLException {
	
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.findElement(By.id("com.androidsample.generalstore:id/nameField")).sendKeys("siva");
	    driver.hideKeyboard();
	    WebElement shopbtn = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
	 //   driver.tap(1, shopbtn, 100);
	    driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();
	    driver.findElement(By.id("com.androidsample.generalstore:id/appbar_btn_cart")).click();
	    driver.findElement(By.xpath("//android.widget.TextView[@bound='[540,1794][1002,1828]']")).click();
//	   String ExpectedPrice = driver.findElement(By.id("com.androidsample.generalstore:id/productPrice")).getText();
//	   System.out.println(ExpectedPrice);
//	    String ActualPrice="";
//	   SoftAssert soft=new SoftAssert();
//	   soft.assertEquals(ActualPrice, ExpectedPrice);
//	   soft.assertAll();
//	   driver.findElement(By.id("com.androidsample.generalstore:id/btnProceed")).click();
	    
		
	
	}

}
