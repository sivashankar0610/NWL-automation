package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.PS_ChangeOptionsFromMyProfile_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_PS_ChangeOptionsFromMyProfile_LoggedIn extends BasePage {
	
	PS_ChangeOptionsFromMyProfile_LoggedIn_Loc cps;
	
	@Then("User verifies Priority Services section having Change and Remove buttons under My Profile tab")
	public void user_verifies_priority_services_section_having_change_and_remove_buttons_under_my_profile_tab() throws Exception {
	    cps=new PS_ChangeOptionsFromMyProfile_LoggedIn_Loc(driver);
		cps.verifyPriorityServicesSection();
	}
	
	@When("User clicks on Change Priority Services options button and should navigate to Your Priority Services options page")
	public void user_clicks_on_change_priority_services_options_button_and_should_navigate_to_your_priority_services_options_page() throws Exception {
	    cps.navigateToYourPriorityServicesOptionsPage();
	}
	
	@And("User unselects Blind option and selects Deaf option for Registered person affected by any of the following?")
	public void user_unselects_blind_option_and_selects_deaf_option_for_registered_person_affected_by_any_of_the_following() throws Exception {
	    cps.userUnselectsBlindOptionAndSelectsDeafOptionForRegisteredPersonAffectedBy();
	}
	
	@And("User changes from Yes to No option for Registered person with bottled water and verify support registered person section")
	public void user_changes_from_yes_to_no_option_for_registered_person_with_bottled_water_and_verify_support_registered_person_section() throws Exception {
		cps=new PS_ChangeOptionsFromMyProfile_LoggedIn_Loc(driver);
		cps.userChangesFromYesToNoOptionForRegisteredPersonWithBottledWater();
	}
	
	@And("User selects I consent for NWG check box")
	public void user_selects_i_consent_for_nwg_check_box() throws Exception {
		cps=new PS_ChangeOptionsFromMyProfile_LoggedIn_Loc(driver);
		cps.userSelectsIConsentForNWGCheckBox();
	}
	
	@Then("User clicks on Next button and should redirected to PSR update confirmation screen")
	public void user_clicks_on_next_button_and_should_redirected_to_psr_update_confirmation_screen() throws Exception {
	    cps.navigateToPSRUpdateConfirmationScreen();
	}
	
	@And("User clicks on Back to My Profile button and should redirected to My Profile page")
	public void user_clicks_on_back_to_my_profile_button_and_should_redirected_to_my_profile_page() throws Exception {
	    cps.navigateToMyProfile();
	}
	
	@And("User verifies Priority Services section having Change and Remove buttons")
	public void user_verifies_priority_services_section_having_change_and_remove_buttons() throws Exception {
		cps.verifyPriorityServicesSection();
	}
	
	@When("User verify Customer contact characteristics in CC&B {string} & {string}")
	public void user_verify_customer_contact_characteristics_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    cps.userVerifyCustomerContactCharacteristicsInCCB(ccbUsername, ccbPwd);
	}

}
