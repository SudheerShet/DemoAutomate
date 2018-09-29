package test;

import java.io.IOException;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import actionlibrary.LinkedInLoginPageLib;
import commonutilities.DriverConfig;

public class LinkedInLoginTest {
	
	//DriverConfig driverConfigObject = new DriverConfig();
	LinkedInLoginPageLib linkedInLoginPageLibObject;
	
	@BeforeTest
	public void openBrowser()
	{
		
		DriverConfig.openBrowse("chrome");
		linkedInLoginPageLibObject = new LinkedInLoginPageLib();
		DriverConfig.driver.get("https://www.linkedin.com/");
	}
	
	@BeforeMethod
	public void openURL()
	{
		
		
	}	

	@Test
	public void enterLoginPageValues()
	{
		linkedInLoginPageLibObject.mailValue("sudheer.s.shet@gmail.com");
		linkedInLoginPageLibObject.passwordValue("Mutta@90");
		linkedInLoginPageLibObject.clickSignIn();
	//	Runtime.getRuntime().exec("taskkill /IM Chromedriver.exe /f");
	}
	
	@AfterSuite
	public void killChromeProcess() throws IOException
	{
		Runtime.getRuntime().exec("taskkill /IM Chromedriver.exe /f");
	}

}
