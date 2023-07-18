package pom_class;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.MobileDriverUtility;
import io.appium.java_client.android.AndroidDriver;

public class BigbasketHomePage {
	
	
	@FindBy(id="com.bigbasket.mobileapp:id/iv_drawer")
	private WebElement menu;

	@FindBy(xpath ="//android.widget.TextView[@text='Shop By Category']")
	private  WebElement categoryDropDown;
	
	@FindBy(xpath="//android.widget.TextView[@text='Snacks & Branded Foods']")
	private  WebElement snacksandfoodDropDown;
	
	@FindBy(xpath="//android.widget.TextView[@text='Snacks & Branded Foods']")
	private  WebElement chocolateandcandiesBtn;

	public WebElement getMenu() {
		return menu;
	}

	public WebElement getCategoryDropDown() {
		return categoryDropDown;
	}

	public WebElement getSnacksandfoodDropDown() {
		return snacksandfoodDropDown;
	}

	public WebElement getChocolateandcandiesBtn() {
		return chocolateandcandiesBtn;
	}
	
	/**
	 * this method is used to click on the menu
	 */
	public void clickOnMenu() {
		menu.click();
	}
	
	/**
	 * This method is used to move from home page to chocolate page
	 * @throws InterruptedException 
	 */
	public void  HometochocolatePage(MobileDriverUtility mobiledriver,AndroidDriver driver,String attributeName,String attributeValue) {
		categoryDropDown.click();
		snacksandfoodDropDown.click();
		mobiledriver.scrollToElement(driver, attributeName, attributeValue);
		chocolateandcandiesBtn.click();
		
	}
	public BigbasketHomePage(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
	

}
