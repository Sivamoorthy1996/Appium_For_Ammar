package appiumpractice;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class SwipAction {
	@Test
	public void swipaction() throws MalformedURLException {
		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"9 PKQ1.180904.001");
		dc.setCapability(MobileCapabilityType.UDID, "f5da163e");
		dc.setCapability("appPackage","jp.rallwell.siriuth.touchscreentest");
		dc.setCapability("appActivity",".TouchScreenTestActivity");
		URL url=new URL("http://localhost:4723/wd/hub");
		AndroidDriver driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//vertical
		//driver.swipe(354, 266, 354, 1052, 500);
		//horizondal
		//driver.swipe(106,797, 843,797, 500);
		
		Dimension value = driver.manage().window().getSize();
		int height = value.getHeight();
		int width = value.getWidth();
		//vertical
		//driver.swipe(width/2, height, width/2, height, 500);
		//horizontal
//		driver.swipe(width, height/2, width, height/2, 500);
//		
//		
//		//vertical swipe
//		driver.swipe(width/2,(int)(height*0.25), width/2, (int)(height*0.80), 1000);
//		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.1), (int)(height*0.8), 500);
//		driver.swipe((int)(width*0.5),(int)(height*0.2),(int)(width*0.5), (int)(height*0.8), 500);
//		driver.swipe((int)(width*0.9),(int)(height*0.2),(int)(width*0.9), (int)(height*0.8), 500);
//	
//		//horizontal swipe
//		driver.swipe((int)(width*0.25),height/2, (int)(width*0.80),height/2, 1000);
//		driver.swipe((int)(width*0.1),(int)(height*0.8),(int)(width*0.9), (int)(height*0.8), 500);
//		driver.swipe((int)(width*0.1),(int)(height*0.2),(int)(width*0.9), (int)(height*0.2), 500);
//		driver.swipe((int)(width*0.1),(int)(height*0.5),(int)(width*0.9), (int)(height*0.5), 500);
		
	}

}
