package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ResendVerificationMail_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ResendVerificationMail extends BasePage{

	ResendVerificationMail_Loc rvm;
	
	@When("User clicks on Resend mail option from the popup")
	public void User_clicks_on_Resend_mail_option_from_the_popup() throws Exception {
		rvm = new ResendVerificationMail_Loc(driver);
		rvm.clicksResendMail();
	}
	
	@Then("System should display mail sent success screen popup")
	public void System_should_display_success_screen_popup() throws Exception {
		rvm.displaySuccessScreen();
	}
}
