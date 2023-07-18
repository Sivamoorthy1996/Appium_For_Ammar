package AppMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ParallelExecution {
	@Parameters({"deviceID","port"})
	@Test
	public void parallelexecution(String deviceId,String port) throws MalformedURLException 
	{
		DesiredCapabilities dc =new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, deviceId);
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL ur=new URL("http://localhost:"+port+"/wd/hub");
		AndroidDriver driver=new AndroidDriver(ur, dc);
		driver.launchApp();
		
		
	}

}
