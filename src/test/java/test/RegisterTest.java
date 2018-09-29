package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actionlibrary.RegisterPageLib;
import commonutilities.DriverConfig;

public class RegisterTest {
	
	//DriverInfo driverinfo = new DriverInfo();
//	DriverConfig driverConfigObject = new DriverConfig();
	RegisterPageLib registerPageElement;
	
	@BeforeTest
	public void openBrowser()
	{
		
		DriverConfig.openBrowse("chrome");
		registerPageElement = new RegisterPageLib();
		DriverConfig.driver.get("http://demo.automationtesting.in/Register.html");
	}
	
	@BeforeMethod
	public void openURL()
	{
		
		
	}
	
	@Test
	public void enterRegisterPageValues()
	{
		registerPageElement.firstNameValue("Sudheer");
		registerPageElement.lastNameValue("Shet");
		registerPageElement.addressValue("Vitamap Jayanagar");
		registerPageElement.mailAddressValue("sudheer.shet@vitamap.com");
		registerPageElement.phoneValue("9449061878");
		registerPageElement.genderValue();
		registerPageElement.hobbiesValue();
		registerPageElement.hobbies2Value();
		registerPageElement.skillsValue("Analytics");
		registerPageElement.countryValue(3);
		registerPageElement.dobyearValue("1990");
		registerPageElement.dobmonthValue("December");
		registerPageElement.dobdayValue("19");
		registerPageElement.passwordValue("Abc@100");
		registerPageElement.confirmPassword("Abc@100");
		registerPageElement.photoUpload("C:/Users/Vishnu/Pictures/Saved Pictures/Aissgnment Interface.png");
		registerPageElement.clickLangaueBox();
		registerPageElement.multiselectLangauges();
		registerPageElement.clickselectcountrytab();
		registerPageElement.countrySelectValue();
		registerPageElement.signupclick();
		
	}
	
	@AfterSuite
	public void killChromeProcess() throws IOException
	{
		Runtime.getRuntime().exec("taskkill /IM Chromedriver.exe /f");
	}
	

}
