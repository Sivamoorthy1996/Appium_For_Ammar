package AppMethod;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class AppMethod {
	@Test
	public void appmethod() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage","io.appium.android.apis");
		dc.setCapability("appActivity",".ApiDemos");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		//Activates the given app if it is installed, but not running or if it is running in the background.
		//driver.activateApp("com.androidsample.generalstore");(7th version it is present)
		
		//Terminate the paricular application if it is running
		//driver.terminateApp("io.appium.android.apis);
		
		//Queries the state of an application 
		//Not installed ,not _Running,running in background suspended,
		//Running in background ,running in foreground
		//ApplicationState be=driver.queryAppState("com.androidsample.generalstore");
		//System.out.println(be);
		//driver.installApp("apk path");
		
		//Resets the currently running app together with the session
		//driver.resetApp();
		//driver.closeApp();
		//driver.launchApp();
		
		//checks if an app is installed on the devices
	//	boolean ban=driver.isAppInstalled("io.appium.android.apis");
		//System.out.println(ban);
		
		
	}

}
