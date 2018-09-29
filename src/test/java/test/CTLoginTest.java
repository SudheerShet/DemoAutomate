package test;

import java.io.IOException;
import java.lang.reflect.Method;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import actionlibrary.CTLoginPageLib;
import commonutilities.DriverConfig;
import commonutilities.Reports;

public class CTLoginTest {
	
	CTLoginPageLib loginPageLibObject;
	
	@BeforeTest
	public void openBrowser()
	{
		
		DriverConfig.openBrowse("chrome");
		loginPageLibObject = new CTLoginPageLib();
		DriverConfig.driver.get("https://cloudtrac.vita-apps.com/Login.php");
	}
	
	@BeforeMethod
	public void testName(Method m)
	{
		Reports.report.startTest(m.getName());
		
	}	

	@Test
	public void enterLoginPageValues()
	{
		loginPageLibObject.userNameValue("Admin_CT_mEdge");
		loginPageLibObject.passwordValue("Admin_CT_mEdge*Admin_CT_mEdge");
		//loginPageLibObject.clickCopyrightVitamapLink();
		//loginPageLibObject.clickRequestDemoLink();
		//loginPageLibObject.clickVitamapImageClick();
		loginPageLibObject.clickSecureLogin();
		//Runtime.getRuntime().exec("taskkill /IM Chromedriver.exe /f");
	}
	
	@AfterClass
	public void openReport()
	{
		Reports.logger.log(LogStatus.INFO, "TEST END");
		Reports.report.endTest(Reports.logger);
		Reports.report.flush(); // Flush method commits the report and logger object things to the file
		DriverConfig.driver.get(Reports.ReportLocation);
	}
	
	@AfterSuite
	public void killChromeProcess() throws IOException
	{
		Runtime.getRuntime().exec("taskkill /IM Chromedriver.exe /f");
	}

}
