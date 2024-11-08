package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.PS_RemoveFromMyProfile_LoggedIn_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_PS_RemoveFromMyProfile_LoggedIn extends BasePage {
	
	PS_RemoveFromMyProfile_LoggedIn_Loc rps;
	
	@When("User clicks on Remove Priority Services options button and should display Are you sure? popup")
	public void user_clicks_on_remove_priority_services_options_button_and_should_display_are_you_sure_popup() throws Exception {
	    rps=new PS_RemoveFromMyProfile_LoggedIn_Loc(driver);
	    rps.displayAreYouSurePopup();
	}
	
	@Then("User clicks on Go back button and should display Priority Services section under My Profile")
	public void user_clicks_on_go_back_button_and_should_display_priority_services_section_under_my_profile() throws Exception {
	    rps.clicksOnGoBackButton();
	}
	
	@Then("User clicks on Confirm button and should display Removal confirmed popup")
	public void user_clicks_on_confirm_button_and_should_display_removal_confirmed_popup() throws Exception {
	    rps.displayRemovalConfirmedPopup();
	}
	
	@When("User clicks on Back to My Profile button and should display Priority Services section having Register button under My Profile")
	public void user_clicks_on_back_to_my_profile_button_and_should_display_priority_services_section_having_register_button_under_my_profile() throws Exception {
		rps.clicksOnBackToMyProfileButton();
	}
	
	@Then("User verifies Account information in CC&B {string}, {string} & {string}")
	public void user_verifies_account_information_in_cc_b(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    rps.verifiesAccountInformationInCCB(accNo, ccbUsername, ccbPwd);
	}

}
