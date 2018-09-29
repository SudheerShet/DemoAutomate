package actionlibrary;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import commonutilities.DriverConfig;
import elementrepository.RegisterPage;

public class RegisterPageLib {
	
//	RegisterPage rp = new RegisterPage(); This way of creating object will though null pointer expection.There is not link between webelements and driver objects.
	
	RegisterPage rp = PageFactory.initElements(DriverConfig.driver, RegisterPage.class);

	public void firstNameValue(String firstName)
	{
		rp.getFirstName().sendKeys(firstName);
	}
	
	public void lastNameValue(String lastName)
	{
		rp.getLastName().sendKeys(lastName);
	}
	
	public void addressValue(String address)
	{
		rp.getAddress().sendKeys(address);
	}
	
	public void mailAddressValue(String mailAddress)
	{
		rp.getMailAdress().sendKeys(mailAddress);
	}

	public void phoneValue(String phone)
	{
		rp.getPhone().sendKeys(phone);
	}
	
	public void genderValue()
	{
		rp.getGender().click();
	}
	
	public void hobbiesValue()
	{
		rp.getHobbies().click();
	}
	
	public void hobbies2Value()
	{
		rp.getHobbies2().click();
	}
	
	public void skillsValue(String skills)
	{
		Select skillchoice = new Select(rp.getSkills());
		skillchoice.selectByVisibleText(skills);
	}
	
	public void countryValue(int country)
	{
		Select countrychoice = new Select(rp.getCountry());
		countrychoice.selectByIndex(country);
	}
	
	public void dobyearValue(String dobyear)
	{
		Select dobyearchoice = new Select(rp.getDobyear());
		dobyearchoice.selectByVisibleText(dobyear);
	}
	
	public void dobmonthValue(String dobmonth)
	{
		Select dobmonthchoice = new Select(rp.getDobmonth());
		dobmonthchoice.selectByValue(dobmonth);
	}
	
	public void dobdayValue(String dobday)
	{
		Select dobdaychoice = new Select(rp.getDobday());
		dobdaychoice.selectByVisibleText(dobday);
	}
	
	public void passwordValue(String password)
	{
		rp.getPasswd().sendKeys(password);
	}
	
	public void confirmPassword(String confirmPassword)
	{
		rp.getConfirmpasswd().sendKeys(confirmPassword);
	}
	
	public void photoUpload(String photouplaod)
	{
		rp.getPhotoupload().sendKeys(photouplaod);
	}
	
	public void clickLangaueBox()
	{
		rp.getLanguageBox().click();
	}
	
	public void multiselectLangauges()
	{
		for(WebElement selectlangauges:rp.getMultuselectedLanguages())
		{
			selectlangauges.click();
		}
	}
	
	public void clickselectcountrytab()
	{
		rp.getSelectcountrytab().click();
	}
	
	public void countrySelectValue()
	{
		rp.getCountrySelect().click();
	}
	
	public void signupclick()
	{
		rp.getSignup().click();
	}
}
