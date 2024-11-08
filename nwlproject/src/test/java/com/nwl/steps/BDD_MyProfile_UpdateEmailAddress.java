package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_UpdateEmailAddress_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MyProfile_UpdateEmailAddress extends BasePage {
	
	MyProfile_UpdateEmailAddress_Loc email;
	
	@And("User enters new email in email address field {string}")
	public void user_enters_new_email_in_email_address_field(String newEmail) throws Exception {
		email=new MyProfile_UpdateEmailAddress_Loc(driver);
		email.entersNewEmail(newEmail);
	}
	
	@Then("User clicks on Save Changes button without filling Re enter new email field")
	public void user_clicks_on_save_changes_button_without_filling_re_enter_new_email_field() throws Exception {
		email.clicksOnSaveChangesButtonWithOutFillingReEnterNewEmailField();
	}
	
	@When("User enters a new email address in Re enter new email field which does not match {string}")
	public void user_enters_a_new_email_address_in_re_enter_new_email_field_which_does_not_match(String inCorrectEmail) throws Exception {
		email.entersNewEmailInReEnterNewEmailField(inCorrectEmail);
	}
	
	@And("User enters the correct email address in Re-enter new email field")
	public void user_enters_the_correct_email_address_in_re_enter_new_email_field() throws Exception {
	    email.entersCorrectEmailAddress();
	}
	
	@Then("User clicks on Save changes button and should displayed Confirmation message popup")
	public void user_clicks_on_save_changes_button_and_should_displayed_confirmation_message_popup() throws Exception {
	    email.clicksOnSaveChangesButton();
	}
	
	@And("User clicks on Back to My Profile button and verify changed Email address is displayed")
	public void user_clicks_on_back_to_my_profile_button_and_verify_changed_email_address_is_displayed() throws Exception {
	    email.verifyChangedEmailAddressIsDisplayed();
	}
	
	@And("User verifies new address is displayed in CC&B {string},{string},{string} & {string}")
	public void UserVerifiesAccountInformationInCCB(String accNo, String username, String pwd, String newEmail) throws Exception {
	    email.verifyAccountInformationInCCB(accNo, username, pwd, newEmail);
	}
	
	@And("User go to Yopmail website with new email address and No verify account email link is present")
	public void userOpensYopMailWebsite() throws Exception {
		email.userOpensYopMailWebsite();
	}

}
