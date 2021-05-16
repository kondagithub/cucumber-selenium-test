package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	private WebDriver webDriver;
	
	public LoginPage(WebDriver webDriver) {
		 PageFactory.initElements(webDriver, this);
		 this.webDriver = webDriver;
	}
	
	@FindBy(how = How.ID, using = "signInLink")
	private WebElement signInLink;
	
	@FindBy(how = How.ID, using = "emailAddress")
	private WebElement emailAddress;
	
	@FindBy(how = How.ID, using = "password")
	private WebElement password;
	
	@FindBy(how = How.ID, using = "signInButton")
	private WebElement signInButton;
	
	public void  clickSignInLink() {
		signInLink.click();
	}
	
	public void enterEmailAddress(String emailAddress) {
		this.emailAddress.sendKeys(emailAddress);
	}
	
	public void enterPassword(String password) {
		this.password.sendKeys(password);
	}
	
	public void clickSignInButton() {
		signInButton.click();
	}
	
	public void navigateToLoginPage() {
		webDriver.get("http://automationpractice.com/index.php");
	}
	
	public WebDriver getWebDriver() {
		return webDriver;
	}
}
