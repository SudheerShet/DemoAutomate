package elementrepository;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@ng-model='LastName']")
	private WebElement lastName;

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	@FindBy(xpath="//textarea[@ng-model='Adress']")
	private WebElement address;
	
	public WebElement getAddress() {
		return address;
	}

	public WebElement getMailAdress() {
		return mailAdress;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getGender() {
		return gender;
	}

	public WebElement getHobbies() {
		return hobbies;
	}

	public WebElement getHobbies2() {
		return hobbies2;
	}

	public WebElement getSkills() {
		return skills;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getDobyear() {
		return dobyear;
	}

	public WebElement getDobmonth() {
		return dobmonth;
	}

	public WebElement getDobday() {
		return dobday;
	}

	public WebElement getLanguageBox() {
		return clicklangaugebox;
	}

	public List<WebElement> getMultuselectedLanguages() {
		return multiselectlangaues;
	}

	public WebElement getSelectcountrytab() {
		return selectcountrytab;
	}

	public WebElement getCountrySelect() {
		return countrySelect;
	}

	public WebElement getPasswd() {
		return passwd;
	}

	public WebElement getConfirmpasswd() {
		return confirmpasswd;
	}

	public WebElement getPhotoupload() {
		return photoupload;
	}

	public WebElement getSignup() {
		return signup;
	}

	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	private WebElement mailAdress;
	
	@FindBy(xpath="//input[@ng-model='Phone']")
	private WebElement phone;
	
	@FindBy(xpath="//input[@value='Male']")
	private WebElement gender;
	
	@FindBy(xpath="//input[@value='Cricket']")
	private WebElement hobbies;
	
	@FindBy(xpath="//input[@value='Movies']")
	private WebElement hobbies2; 
	
	@FindBy(xpath="//select[@ng-model='Skill']")
	private WebElement skills;
	
	@FindBy(xpath="//select[@ng-model='country']")
	private WebElement country;

	@FindBy(xpath="//select[@ng-model='yearbox']")
	private WebElement dobyear;
	
	@FindBy(xpath="//select[@ng-model='monthbox']")
	private WebElement dobmonth;
	
	@FindBy(xpath="//select[@ng-model='daybox']")
	private WebElement dobday;
	
	@FindBy(xpath="//div[@id='msdd']")
	private WebElement clicklangaugebox;
	
	@FindBy(xpath="//div[@id='msdd']/following-sibling::div/ul/li/a")
	private List<WebElement> multiselectlangaues;
	
	@FindBy(xpath="//span[@role='combobox']")
	private WebElement selectcountrytab;
	
	@FindBy(xpath="//li[contains(text(),'India')]")
	private WebElement countrySelect;
	
	@FindBy(xpath="//input[@ng-model='Password']")
	private WebElement passwd;
	
	@FindBy(xpath="//input[@ng-model='CPassword']")
	private WebElement confirmpasswd;
	
	@FindBy(xpath="//input[@onchange='uploadimg()']")
	private WebElement photoupload;
	
	@FindBy(xpath="//button[@name='signup']")
	private WebElement signup;
}
