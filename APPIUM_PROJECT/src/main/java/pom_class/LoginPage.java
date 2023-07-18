package pom_class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class LoginPage {

	@AndroidFindBy(id="com.androidsample.generalstore:id/spinnerCountry")
	private MobileElement countrynamedropdown;

	@AndroidFindBy(id="com.androidsample.generalstore:id/nameField")
	private MobileElement nametextfeild;

	@AndroidFindBy(id="com.androidsample.generalstore:id/radioMale")
	private MobileElement malegender;

	@AndroidFindBy(id="com.androidsample.generalstore:id/radioFemale")
	private MobileElement femalegender;

	@AndroidFindBy(id="com.androidsample.generalstore:id/btnLetsShop")
	private MobileElement letshopbox;

	public MobileElement getCountrynamedropdown() {
		return countrynamedropdown;
	}

	public MobileElement getNametextfeild() {
		return nametextfeild;
	}

	public MobileElement getMalegender() {
		return malegender;
	}

	public MobileElement getFemalegender() {
		return femalegender;
	}

	public MobileElement getLetshopbox() {
		return letshopbox;
	}


	public LoginPage(AndroidDriver driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
		
	}
//	public LoginPage(AndroidDriver driver) {
//		PageFactory.initElements(driver, this);
//		
//	}
	
	public void loginpage(String name,int Finger_count,int duration) {
		nametextfeild.sendKeys(name);
		femalegender.tap(Finger_count,duration);
		letshopbox.tap(Finger_count, duration);
	}


}
