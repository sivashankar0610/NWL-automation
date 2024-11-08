package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Registration_UnmeasuredAccountViaHomepage_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Registration_UnmeasuredAccountViaHomepage extends BasePage {

	Registration_UnmeasuredAccountViaHomepage_Loc r;
	
	@And("User click on Log into your online Account CTA button in the homepage")
	public void User_click_on_CTAButton_in_the_homepage() throws Exception {
		r=new Registration_UnmeasuredAccountViaHomepage_Loc(driver);
		r.clickLoginCTAButton();
	}
	
	@Then("System gets the required information from CC&B for the account {string} using {string} and {string}")
	public void System_gets_required_info_from_CCB(String AccountID, String CCBEmail, String CCBPw) throws Exception {
		r=new Registration_UnmeasuredAccountViaHomepage_Loc(driver);
		r.getCCBdetails(AccountID,CCBEmail,CCBPw);
	}
	
	@When("User enters the account details on the Create an account screen {string}")
	public void User_enters_the_personal_details(String password) throws Exception {
		r.userDetailsReg(password);
	}

	@Then("User clicks on  Create account button and System should display the success screen popup to verify the user account")
	public void System_should_display_the_success_screen_popup() throws Exception {
		r.successScreen();
	}
	
	@When("User opens {string} and enters the email address")
	public void User_opens_Yopmail(String website) throws Exception {
		r.opensYopmail(website);
	}
	
	@And("User clicks on the activation mail to activate the account")
	public void User_clicks_on_the_activation_mail() throws Exception {
		r.activationMail();
	}
	
	@Then("User should be redirected to NWL Website to enter personal details")
	public void User_should_be_redirected_to_NWL() throws Exception {
		r.enterRegistrationDetails();
	}
	
	@And("User enters his personal details and click on Next button")
	public void User_enters_his_personal_details() throws Exception {
		r.enterPersonalDetails();
	}
	
	@And("User updates his market preferences and click on Next button")
	public void User_updates_his_market_preferences() throws Exception {
		r.updateMarketingPreferences();
	}

	@When("User is redirected to Dashboard then account should be activated")
	public void User_is_redirected_to_Dashboard() throws Exception {
		r.dashboardDisplayed();
	}
	
	@Then("Verify the email in CC&B")
	public void Verify_details_in_CCB() throws Exception {
		r.verifyEmailinCCB();
	}
	
	@And("Verify the Web Self Service Registration in CC&B")
	public void Verify_the_Web_Self_Service_Registration_in_CCB(){
		r.verifySelfServiceRegistration();	
	}
}

	