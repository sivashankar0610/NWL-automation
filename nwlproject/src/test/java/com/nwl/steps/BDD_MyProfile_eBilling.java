package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MyProfile_eBilling_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MyProfile_eBilling extends BasePage {
	
	MyProfile_eBilling_Loc eb;
	
	@And("User verifies eBilling toggle is set to On")
	public void user_verifies_e_billing_toggle_is_set_to_on() throws Exception {
	    eb=new MyProfile_eBilling_Loc(driver);
	    eb.verifiesEBillingToggleIsSetToOn();
	}
	
	@And("User changes eBilling toggle from On to Off")
	public void user_changes_e_billing_toggle_from_on_to_off() throws Exception {
		eb.changesEBillingToggleFromOnToOff();
	}
	
	@When("User clicks on Back to My Profile button and verify eBilling is Off")
	public void user_clicks_on_back_to_my_profile_button_and_verify_ebilling_is_off() throws Exception {
		eb=new MyProfile_eBilling_Loc(driver);
		eb.clicksOnBackToMyProfileTab();
	}
	
	@Then("User clicks on Account dashboard and should display Want to switch to ebilling section")
	public void user_clicks_on_account_dashboard_and_should_display_want_to_switch_to_ebilling_section() throws Exception {
		eb.clicksOnAccountDashboard();
	}
	
	@And("User verifies Bill route is now HH-POST in CC&B {string},{string} & {string}")
	public void user_verifies_bill_route_is_now_hh_post_in_cc_b(String accNo, String userName, String pwd) throws Exception {
	    eb.verifiesBillRouteInCCB(accNo, userName, pwd);
	}
	
	@And("User verifies Activity History contains EBILL_DE-REGISTER message sent")
	public void user_verifies_activity_history_contains_ebill_de_register_message_sent() throws Exception {
	    eb.verifyActivityHistorySection1();
	}
	
	@And("User go back to Account dashboard and Toggle on eBilling")
	public void user_go_back_to_account_dashboard_and_toggle_on_e_billing() throws Exception {
	    eb.switchOneBillingToggleUnderAD();
	}
	
	@When("User clicks on Ok button and Switch to eBilling section is removed from Account dashboard")
	public void user_clicks_on_ok_button_and_switch_to_e_billing_section_is_removed_from_account_dashboard() throws Exception {
	    eb.clicksOnOkButton();
	}
	
	@Then("User clicks My Profile tab and verify eBilling is On")
	public void user_clicks_my_profile_tab_and_verify_e_billing_is_on() throws Exception {
	    eb.verifyeBillingIsOnUnderMyProfile();
	}
	
	@And("User verifies Bill route is now Email in CC&B")
	public void user_verifies_bill_route_is_now_email_in_cc_b() throws Exception {
		eb.verifiesBillRouteInCCB();
	}
	
	@And("User verifies Activity History contains UPDATE_ACCOUNT_DETAILS_EBILL message sent")
	public void user_verifies_activity_history_contains_update_account_details_ebill_message_sent() throws Exception {
		eb.verifyActivityHistorySection2();
	}

}
