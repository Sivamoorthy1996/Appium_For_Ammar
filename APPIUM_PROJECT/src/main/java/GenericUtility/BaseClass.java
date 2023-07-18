package GenericUtility;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import pom_class.BigbasketChocolatePage;
import pom_class.BigbasketHomePage;

public class BaseClass {
	//AppiumDriverLocalService service;
	public AndroidDriver  driver;
	protected String URL;
	protected String PlatformName;
	protected String Platformversion;
	protected String Timeout;
	protected String UDID;
	protected String apppackage;
	protected String appactivity;
	//protected String noreset;
	protected long longTimeout;
	public BigbasketHomePage homepage;
	public BigbasketChocolatePage chocolatepage;


	@BeforeSuite
	public void database() {
		System.out.println("open database");
	}

	@BeforeClass
	public void startserver() throws MalformedURLException {
		// service=AppiumDriverLocalService.buildDefaultService();
		//	service.start();

		//creating object for the utility
		FileUtility fileutility=new FileUtility();
		JavaUtility javautility=new JavaUtility();


		//inialize the propertyfile
		fileutility.IntiallizePropertyFile(IPathContants.BIGBASKETPROPERTYFILEPATH);

		//fetching data from the property file
		URL = fileutility.getDataFromProperty("url");
		PlatformName = fileutility.getDataFromProperty("platformname");
		Platformversion = fileutility.getDataFromProperty("platformversion");
		Timeout = fileutility.getDataFromProperty("timeout");
		UDID = fileutility.getDataFromProperty("udid");
		apppackage = fileutility.getDataFromProperty("appPackage");
		appactivity = fileutility.getDataFromProperty("appActivity");
		// noreset = fileutility.getDataFromProperty("noreset");

		//converting string to long
		longTimeout = javautility.convertStringToLong(Timeout);


		DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(MobileCapabilityType.PLATFORM_NAME,PlatformName);
		dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,Platformversion);
		dc.setCapability(MobileCapabilityType.UDID, UDID);
		//dc.setCapability("noReset", noreset);
		//dc for android
		//dc.setCapability("appPackage",apppackage);
		//dc.setCapability("appActivity",appactivity);

		//appium server port number
		URL url=new URL(URL);
		driver=new AndroidDriver(url, dc);
		driver.manage().timeouts().implicitlyWait(longTimeout, TimeUnit.SECONDS);

		//Creating object for pom class
		homepage=new BigbasketHomePage(driver);
		chocolatepage=new BigbasketChocolatePage(driver);


	}

	@BeforeMethod
	public void openApp() {





	}

	@AfterMethod
	public void closeApp() {
		driver.closeApp();
	}

	@AfterClass
	public void stopserver() {

		//service.stop();;
	}

	@AfterSuite
	public void closedatabase() {
		System.out.println("close database");
	}

}
