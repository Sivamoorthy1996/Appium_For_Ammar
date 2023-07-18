package version7practices;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TapActionPractices {
	@Test
	public void calculatorpractices() throws MalformedURLException, InterruptedException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage", "com.mini.calculator");
		dc.setCapability("appActivity", ".cal.DefaultCalculatorActivity");
	    URL url =new URL("http://localhost:4723/wd/hub");
	    AndroidDriver driver=new AndroidDriver(url, dc);
	    Thread.sleep(1000);
	 
	    
	}
}
