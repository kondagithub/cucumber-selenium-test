package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	private WebDriver webDriver;
	
	public HomePage(WebDriver webDriver) {
		 PageFactory.initElements(webDriver, this);
		 this.webDriver = webDriver;
	}
}
