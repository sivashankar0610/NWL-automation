package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_ResetPassword_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MyProfile_ResetPassword extends BasePage {
	
	MyProfile_ResetPassword_Loc rp;
	
	@When("User clicks on My Profile tab and should redirected to My Profile tab")
	public void user_clicks_on_my_profile_tab_and_should_redirected_to_my_profile_tab() throws Exception {
	    rp=new MyProfile_ResetPassword_Loc(driver);
	    rp.redirectedToMyProfileTab();
	}
	
	@Then("User clicks on Change my password button and should redirected to Reset password screen")
	public void user_clicks_on_change_my_password_button_and_should_redirected_to_reset_password_screen() throws Exception {
	    rp.redirectedToResetPasswordScreen();
	}
	
	@When("User clicks on Cancel button and should redirected to My Profile tab")
	public void user_clicks_on_cancel_button_and_should_redirected_to_my_profile_tab() throws Exception {
	    rp.navigateToMyProfileTab();
	}
	
	@When("User enters old password {string} and new password {string}")
	public void user_enters_old_password_and_new_password(String oldPwd, String NewPwd) throws Exception {
	    rp.entersPasswords(oldPwd, NewPwd);
	}
	
	@Then("User clicks on Save changes button and should display successs message popup")
	public void user_clicks_on_save_changes_button_and_should_display_successs_message_popup() throws Exception {
	    rp.displaySuccessMsgPopup();
	}
	
	@And("User clicks on Ok button and should redirected to My Profile tab")
	public void user_clicks_on_ok_button_and_should_redirected_to_my_profile_tab() throws Exception {
	    rp.redirectToMyProfileTab();
	}

}
