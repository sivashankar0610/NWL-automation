package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_UpdateName_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_MyProfile_UpdateName extends BasePage {
	
	MyProfile_UpdateName_Loc uName;
	
	@And("User updates first name field")
	public void user_updates_first_name_field() throws Exception {
	    uName=new MyProfile_UpdateName_Loc(driver);
	    uName.updatesFirstNameField();
	}
	
	@And("User remove the change")
	public void user_remove_the_change() throws Exception {
	    uName.removeTheChange();
	}
	
	@And("User updates surname field")
	public void user_updates_surname_field() throws Exception {
	    uName.updatesSurnameField();
	}
	
	@And("User selects Spelling mistake option for Reason for name change field")
	public void user_selects_spelling_mistake_option() throws Exception {
	    uName.selectsSpellingMistakeOption();
	}
	
	@And("User selects Marriage or divorce option for Reason for name change field")
	public void user_selects_marriage_or_divorce_option() throws Exception {
	    uName.selectsMarriageOrDivorceOption();
	}
	
	@And("User selects Other e.g. Deed Poll option and fill Please enter details for Other reason field")
	public void user_selects_other_option() throws Exception {
	    uName.selectsOtherOption();
	}
	
	@Then("User clicks on Save changes button and should be displayed Confirmation message popup")
	public void user_clicks_on_save_changes_button_and_should_be_displayed_confirmation_message_popup() throws Exception {
		uName.clicksOnSaveChangesButton();
	}
	
	@And("User clicks on Back to My Profile button and should navigate to My Profile tab")
	public void user_clicks_on_back_to_my_profile_button_and_should_navigate_to_my_profile_tab() throws Exception {
	    uName.clicksOnBackToMyProfileButton();
	}
	
	@And("User verifies Open Pass To process link under Activity History in CC&B {string},{string} & {string}")
	public void user_verifies_open_pass_to_process_link_under_activity_history_in_cc_b(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    uName.verifiesOpenPassToProcessLink(accNo, ccbUsername, ccbPwd);
	}
	
	@And("User clicks on Open Pass To process link and Name change & reason displayed in the Pass To Details - Work Instruction")
	public void user_clicks_on_open_pass_to_process_link() throws Exception {
		uName.clicksOnOpenPassToProcessLink();
	}

}
