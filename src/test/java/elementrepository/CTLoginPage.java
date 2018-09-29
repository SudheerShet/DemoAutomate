package elementrepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CTLoginPage {
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement password;
	
	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSecureLogin() {
		return secureLogin;
	}

	public WebElement getCopyrightVitamapLink() {
		return copyrightVitamapLink;
	}

	public WebElement getRequestDemoLink() {
		return requestDemoLink;
	}

	public WebElement getVitamapImageClick() {
		return vitamapImageClick;
	}

	@FindBy(xpath="//button[@id='loginSubmit']")
	private WebElement secureLogin;
	
	@FindBy(linkText="Vitamap")
	private WebElement copyrightVitamapLink;
	
	@FindBy(partialLinkText="Request")
	private WebElement requestDemoLink;
	
	@FindBy(xpath="//img[contains(@src,'images/vitamap-logo.png')]")
	private WebElement vitamapImageClick;

}
