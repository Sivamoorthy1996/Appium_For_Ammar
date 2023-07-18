package AppMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ToastMessage {
	@Test
	public void toastmessage() throws MalformedURLException {
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage","com.androidsample.generalstore");
		dc.setCapability("appActivity",".SplashActivity");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement shopbtn = driver.findElement(By.id("com.androidsample.generalstore:id/btnLetsShop"));
		//driver.tap(1, shopbtn, 100);
		String message = driver.findElement(By.xpath("//android.widget.Toast[1]")).getAttribute("name");
		System.out.println(message);
	}

}
