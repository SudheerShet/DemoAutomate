package actionlibrary;

import org.openqa.selenium.support.PageFactory;

import commonutilities.DriverConfig;
import elementrepository.LinkedInLoginPage;

public class LinkedInLoginPageLib {

	LinkedInLoginPage linkedInLoginPageObject = PageFactory.initElements(DriverConfig.driver, LinkedInLoginPage.class);
	
	public void mailValue(String mail)
	{
		linkedInLoginPageObject.getMail().sendKeys(mail);
	}
	
	public void passwordValue(String password)
	{
		linkedInLoginPageObject.getPassword().sendKeys(password);
	}
	
	public void clickSignIn()
	{
		linkedInLoginPageObject.getSignin().click();
	}
}
