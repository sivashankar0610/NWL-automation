package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_UpdateMarketingPreferences_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MyProfile_UpdateMarketingPreferences extends BasePage {
	
	MyProfile_UpdateMarketingPreferences_Loc ump;
	
	@Then("User clicks on Update marketing preferences button and should redirected to Marketing & Communications preferences page")
	public void user_clicks_on_update_marketing_preferences_button_and_should_redirected_to_marketing_communications_preferences_page() throws Exception {
	    ump=new MyProfile_UpdateMarketingPreferences_Loc(driver);
	    ump.redirectedToMarketingAndCommunicationsPreferencesPage();
	}
	
	@When("User clicks on Cancel button and should be redirected to My Profile tab")
	public void user_clicks_on_cancel_button_and_should_be_redirected_to_my_profile_tab() throws Exception {
	    ump.redirectedToMyProfileTab();
	}
	
	@When("User sets all Marketing Preferences toggles to On")
	public void user_sets_all_marketing_preferences_toggles_to_on() throws Exception {
	    ump.SetsAllTogglesToOn();
	}
	
	@Then("User clicks on Save changes button and should be displayed successs message popup")
	public void user_clicks_on_save_changes_button_and_should_be_displayed_successs_message_popup() throws Exception {
	    ump.displaySuccessMsgPopup();
	}
	
	@And("User clicks on Back to My Profile button and should be redirected to My Profile tab")
	public void user_clicks_on_back_to_my_profile_button_and_should_be_redirected_to_my_profile_tab() throws Exception {
	    ump.navigatedToMyProfile();
	}
	
	@And("User verifies My Marketing Preferences section under My Profile")
	public void user_verifies_my_marketing_preferences_section_under_my_profile() throws Exception {
	    ump.verifyMyMarketingPreferencesSection();
	}
	
	@And("User verifies Marketing Preferences toggles are set to On in CC&B {string},{string} & {string}")
	public void user_verifies_marketing_preferences_toggles_are_set_to_on_in_cc_b(String accNo, String userName, String pwd) throws Exception {
	    ump.verifyMarketingPreferencesSectionInCCB(accNo, userName, pwd);
	}
	
	@When("User back to My Profile tab from CC&B Screen")
	public void user_back_to_My_Profile_tab_from_cc_b_screen() throws Exception {
	    ump.backToMyProfileTab();
	}
	
	@When("User sets all Marketing Preferences toggles from On to Off")
	public void user_sets_all_marketing_preferences_toggles_from_on_to_off() throws Exception {
	    ump.SetsAllTogglesFromOnToOff();
	}
	
	@And("User verifies Marketing Preferences toggles are set to Off in CC&B")
	public void user_verifies_marketing_preferences_toggles_are_set_to_off_in_cc_b() throws Exception {
	    ump.verifyMarketingPreferencesSectionInCCB();
	}

}
