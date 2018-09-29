package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonutilities.DriverConfig;
import commonutilities.Reports;
import elementrepository.CTLoginPage;


public class CTLoginPageLib {
	
CTLoginPage loginPageObject = PageFactory.initElements(DriverConfig.driver, CTLoginPage.class);
	
	
	public void userNameValue(String userName)
	{
		try{
		loginPageObject.getUsername().sendKeys(userName);
		Reports.PassCase("Username Entered", "Username");
		}	
		catch(Exception e)
		{
			Reports.FailCase("Username Enetered", "Username");
		}
	}
	
	public void passwordValue(String password)
	{
		try{
		loginPageObject.getPassword().sendKeys(password);
		Reports.PassCase("Password Enetering", "Password");
		}
		catch(Exception e)
		{
			Reports.FailCase("Password Entering", "Password");
		}
	}
	
	public void clickSecureLogin()
	{
		try{
		loginPageObject.getSecureLogin().click();
		Reports.PassCase("Submit button click", "Submit");
		}
		catch(Exception e)
		{
			Reports.FailCase("Submit button Click", "Submit");
		}
	}
	
	public void clickCopyrightVitamapLink()
	{
		loginPageObject.getCopyrightVitamapLink().click();
	}
	
	public void clickRequestDemoLink()
	{
		loginPageObject.getRequestDemoLink().click();
	}
	
	public void clickVitamapImageClick()
	{
		loginPageObject.getVitamapImageClick().click();
	}


}
