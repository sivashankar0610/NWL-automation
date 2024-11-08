package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Notifications_UpdateTelephoneNo_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_Notifications_UpdateTelephoneNo extends BasePage {
	
	Notifications_UpdateTelephoneNo_Loc utn;
	
	@Then("User verifies we need your phone number section")
	public void user_verifies_we_need_your_phone_number_section() throws Exception {
	    utn=new Notifications_UpdateTelephoneNo_Loc(driver);
	    utn.verifyPhoneNoSection();
	}
	
	@And("User clicks on Update button and should throws error msg")
	public void user_clicks_on_update_button_and_should_throws_error_msg() throws Exception {
	    utn.clicksOnUpdateButton();
	}
	
	@And("User provides phone number {string}")
	public void user_provides_phone_number(String phoneNo) throws Exception {
	    utn.providesPhoneNo(phoneNo);
	}
	
	@And("User clicks on Update button and should not display phone number section")
	public void user_clicks_on_update_button_and_should_not_display_phone_number_section() throws Exception {
	    utn.shouldNotdisplayPhoneNoSection();
	}
	
	@And("User clicks on My Profile tab then verify phone number")
	public void user_clicks_on_my_profile_tab_then_verify_phone_number() throws Exception {
	    utn.verifyPhoneNoUnderMyProfileTab();
	}
	
	@And("User verifies Phone number in CC&B {string},{string},{string} & {string}")
	public void user_verifies_phone_number_in_cc_b(String accNo, String ccbUsername, String ccbPwd, String phoneNo) throws Exception {
	    utn.verifyPhoneNoInCCB(accNo, ccbUsername, ccbPwd, phoneNo);
	}

}
