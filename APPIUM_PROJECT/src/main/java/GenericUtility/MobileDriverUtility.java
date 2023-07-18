package GenericUtility;

import io.appium.java_client.android.AndroidDriver;

public class MobileDriverUtility {

	/**
	 * This method is used to scroll to element
	 * @param driver
	 * @param attributeName
	 * @param attributeValue
	 */
	public static void scrollToElement(AndroidDriver driver,String attributeName,String attributeValue)
	{
		driver.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("+attributeName+"(\""+attributeValue+"\"))").click();
	}
	
	public void zoomByElement() {
	//	driver
	}
}
