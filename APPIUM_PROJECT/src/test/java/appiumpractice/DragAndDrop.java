package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class DragAndDrop {
	
	@Test
	public void draganddrop() throws MalformedURLException {
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.manage().logs().get("logcat");
		//driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
	//	driver.findElement(By.id("android:id/button1")).click();
		driver.findElementByAccessibilityId("Views").click();
		driver.findElementByAccessibilityId("Drag and Drop").click();	
		WebElement src = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		WebElement dest = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_2"));
		TouchAction ac=new TouchAction(driver);
		
		//ac.longPress(src).waitAction().moveTo(dest).release().perform();
		
		
	}

}
