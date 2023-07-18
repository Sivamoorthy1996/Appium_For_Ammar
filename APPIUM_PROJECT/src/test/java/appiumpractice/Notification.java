package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Notification {
	
	@Test
	public void notification() throws MalformedURLException, InterruptedException {
	
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("noReset", true);
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.findElement(By.id("App")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Notification\"]")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"IncomingMessage\"]")).click();
		driver.findElement(By.id("io.appium.android.apis:id/notify_app")).click();
		Thread.sleep(2000);
		//open notification
		driver.openNotifications();
		driver.findElement(By.xpath("//android.widget.FrameLayout[@resource-id='com.android.systemui:id/fake_shadow']")).click();
		//driver.findElement(By.xpath("//android.widget.FrameLayout[@text='Joe']")).click();
		
		
		
	}

}
