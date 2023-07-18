package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPageSeleniumMethod {

	@FindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private WebElement countrynamedropdown;

	@FindBy(id="com.androidsample.generalstore:id/nameField")
	private  WebElement nametextfeild;

	@FindBy(id="com.androidsample.generalstore:id/radioMale")
	private  WebElement malegender;

	@FindBy(id="com.androidsample.generalstore:id/radioFemale")
	private  WebElement femalegender;

	@FindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private  WebElement letshopbox;

	public  WebElement getCountrynamedropdown() {
		return countrynamedropdown;
	}

	public  WebElement getNametextfeild() {
		return nametextfeild;
	}

	public  WebElement getMalegender() {
		return malegender;
	}

	public  WebElement getFemalegender() {
		return femalegender;
	}

	public  WebElement getLetshopbox() {
		return letshopbox;
	}


//	public LoginPageSeleniumMethod(AndroidDriver driver) {
//		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
//		
//	}
	public LoginPageSeleniumMethod(AndroidDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	public void loginpage(String name) {
		nametextfeild.sendKeys(name);
		femalegender.click();
		letshopbox.click();
	}


}
