package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class InstallApp {
	@Test
	public void installapp() throws MalformedURLException {
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11");
		dc.setCapability(MobileCapabilityType.UDID, "ca090b810121");
		//dc.setCapability(MobileCapabilityType.APP,"D:\\bigbasket-7-5-6.apk");
		URL ur=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.installApp("D:\\bigbasket-7-5-6.apk");
	//	driver.launchApp();
		//boolean value = driver.isAppInstalled("io.appium.android.apis");
		//System.out.println(value);
		
	}

}
