package pom_class;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.MobileDriverUtility;
import io.appium.java_client.android.AndroidDriver;

public class BigbasketChocolatePage {
	
	
	@FindBy(xpath ="(//android.widget.ImageView[@content-desc=\"Product Image\"])[1]")
	private WebElement chocolateImg;

	@FindBy(xpath ="//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtProductDesc']")
	private  List<WebElement> chocolatename;
	
	@FindBy(xpath="//android.widget.TextView[@resource-id='com.bigbasket.mobileapp:id/txtSalePrice']")
	private  List<WebElement> chocolateprice;
	




	public List<WebElement> getChocolatename() {
		return chocolatename;
	}

	public List<WebElement> getChocolateprice() {
		return chocolateprice;
	}

	/**
	 * this method is used to click on the chocolate image
	 */
	public void clickOnChocolate()
	{
		chocolateImg.click();
	}
	
	
	public BigbasketChocolatePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
