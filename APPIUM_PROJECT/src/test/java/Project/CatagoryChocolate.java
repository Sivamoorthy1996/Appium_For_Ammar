package Project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.MobileDriverUtility;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import pom_class.BigbasketChocolatePage;
import pom_class.BigbasketHomePage;

public class CatagoryChocolate extends BaseClass{
	@Test
	public void chocolate() throws MalformedURLException, InterruptedException{
		MobileDriverUtility mobiledriver = new MobileDriverUtility();
		
		
		homepage.clickOnMenu();
		homepage.HometochocolatePage(mobiledriver, driver, "text", "Chocolates & Candies");
		Thread.sleep(2000);
	    chocolatepage.clickOnChocolate();
	    List<WebElement> chocolate = chocolatepage.getChocolatename();
	    List<WebElement> price = chocolatepage.getChocolateprice();
		for(int i=0;i<price.size();i++)
		{
			String[] chocolateprice = splitString(price.get(i).getText(),"₹");
			double newprice = Double.parseDouble(chocolateprice[1]);
			if(newprice>=100) {
				System.out.println(chocolate.get(i).getText()+" ===> "+newprice);
				//System.out.println(newprice);
			}
			  driver.swipe(517, 1582, 517, 844, 500);
		}
		
		
	}
	public String[] splitString(String value ,String strategy) {
		return value.split(strategy);
	}
	
//	public static void scrollToElement(AndroidDriver driver,String an,String av) {
//		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+an+"(\""+av+"\"))").click();
//	}

}
