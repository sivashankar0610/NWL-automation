package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Registration_NotYourEmail_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Registration_NotYourEmail extends BasePage{

	Registration_NotYourEmail_Loc regnotemail;
	
	@When("User clicks on Not your email address? button")
	public void User_clicks_on_Not_your_email_address_button() throws Exception {
		regnotemail = new Registration_NotYourEmail_Loc(driver);
		regnotemail.notYourEmail();
	}
	
	@Then("User should change the email address and Click Create account button")
	public void User_should_change_the_email_address() {
		regnotemail.changeEmailAddress();
	}
	
	@Then("System should display the success screen popup with new email address")
	public void System_should_display_the_success_screen_popup_with_new_email_address() throws Exception {
		regnotemail.successScreen();
	}
	
	@When("User opens {string} and enters email address")
	public void User_opens_Yopmail(String website) throws Exception {
		regnotemail.opensYopmail(website);
	}
	
	@Then("User verify the email in CC&B")
	public void Verify_details_in_CCB() throws Exception {
		regnotemail.verifyEmailinCCB();
	}
	
}
