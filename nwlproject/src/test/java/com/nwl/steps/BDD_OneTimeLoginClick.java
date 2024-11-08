package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.OneTimeLoginClick_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_OneTimeLoginClick extends BasePage {
	
	OneTimeLoginClick_Loc one;

	@Then("User clicks on Email me a link to log in")
	public void user_clicks_on_email_me_a_link_to_log_in() throws Exception {
		one = new OneTimeLoginClick_Loc(driver);
		one.clicksOnEmailMeALink();
	}

	@And("User enters an Email {string}")
	public void user_enters_an_email(String email) throws Exception {
		one.userEntersAnEmail(email);
	}

	@Then("User clicks on Send button")
	public void user_clicks_on_send_button() throws Exception {
		one.clicksOnSendButton();
	}

	@And("User clicks on Ok button")
	public void user_clicks_on_ok_button() {
		one.clicksOkButton();
	}

	@When("User opens yopmail website and enter required email address")
	public void useropensyopmailwebsiteandenterrequiredemailaddress() throws Exception {
		one.opensYopMail();
	}

	@And("User clicks on one time login mail")
	public void Userclicksononetimeloginmail() throws Exception {
		one.clicksOnOneTimeLoginmail();
	}

	@Then("User clicks on One click sign-in button and should redirect to Account Dashboard")
	public void UserClicksOnOneClickSigninButtonAndShouldRedirectToAccountDashboard() throws Exception {
		one.clickOneClickSigninButton();
	}

}
