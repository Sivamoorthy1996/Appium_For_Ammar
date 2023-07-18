package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallAppTouchScreen {
	@Test
	public void installapptouchscreen() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		//dc.setCapability(MobileCapabilityType.APP,"C:\\Users\\Dinesh.M\\Downloads\\TouchScreenTest_v1.7.14_apkpure.com.apk‪");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.installApp("‪C:\\Users\\Dinesh.M\\Downloads\\TouchScreenTest_v1.7.14_apkpure.com.apk");
//		boolean value = driver.isAppInstalled("");
//		System.out.println(value);	
		
	}

}
