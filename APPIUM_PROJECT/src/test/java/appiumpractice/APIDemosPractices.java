package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;

public class APIDemosPractices {
	@Test
	public void apidemospracties() throws MalformedURLException {
		//Starting server through test script(default services)
		AppiumDriverLocalService service=AppiumDriverLocalService.buildDefaultService();
		service.start();
		//service.stop();
		
		//
		
		
		
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("noReset", true);
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver<WebElement> driver=new AndroidDriver<WebElement>(url, dc);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		driver.findElement(By.id("com.android.permissioncontroller:id/continue_button")).click();
//		driver.findElement(By.id("android:id/button1")).click();
		driver.findElementByAccessibilityId("Views").click();
//		driver.findElementByAccessibilityId("Controls").click();
//		driver.findElementByAccessibilityId("1. Light Theme").click();
//		driver.findElement(By.id("io.appium.android.apis:id/edit")).sendKeys("siva");
//		driver.findElement(By.id("io.appium.android.apis:id/check1")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/check2")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/radio1")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/star")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/toggle1")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/toggle2")).click();
//		driver.hideKeyboard();
//		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
//		driver.findElement(By.xpath("//android.widget.CheckedTextView[@text='Jupiter']")).click();
//		//driver.findElement(By.id("io.appium.android.apis:id/button")).click();
//		driver.findElement(By.id("io.appium.android.apis:id/spinner1")).click();
//		 List<WebElement> values = driver.findElements(By.className("android.widget.CheckedTextView"));
//		 for(WebElement v:values) {
//			 System.out.println(v.getText());
//		 }
	}

}
