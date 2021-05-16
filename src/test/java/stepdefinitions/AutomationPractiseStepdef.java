package stepdefinitions;

import cucumber.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageobjects.LoginPage;

public class AutomationPractiseStepdef {
	
	TestContext testContext;
	LoginPage loginPage;
	
	public AutomationPractiseStepdef(TestContext context) {
		testContext = context;
		loginPage = testContext.getPageObjectManager().getLoginPage();
	}

	@Given("^I am on automation prictise login page$")
	public void i_am_on_automation_prictise_login_page() throws Throwable {
		loginPage.navigateToLoginPage();
	}

	@Then("^click on Sign in$")
	public void click_on_Sign_in() throws Throwable {

	}

	@Then("^navigated to Authenticationpage$")
	public void navigated_to_Authenticationpage() throws Throwable {

	}

	@Then("^provided userName \"([^\"]*)\"$")
	public void provided_userName(String arg1) throws Throwable {

	}

	@Then("^Provided password \"([^\"]*)\"$")
	public void provided_password(String arg1) throws Throwable {

	}

	@Then("^clicked on Sign in button$")
	public void clicked_on_Sign_in_button() throws Throwable {

	}

	@Then("^navidagated to home page$")
	public void navidagated_to_home_page() throws Throwable {
		loginPage.getWebDriver().quit();
	}
	
}
