package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Transunion_HouseholdRagStatus_Red_Loc;
import io.cucumber.java.en.Then;

public class BDD_Transunion_HouseholdRagStatus_Red extends BasePage {
	
	Transunion_HouseholdRagStatus_Red_Loc red;
	
	@Then("User clicks on Submit my application button and should redirected to Red Status Confirmation screen")
	public void user_clicks_on_submit_my_application_button_and_should_redirected_to_confirmation_screen() throws Exception {
	    red=new Transunion_HouseholdRagStatus_Red_Loc(driver);
		red.navigateToConfirmationScreen();
	}
	
	@Then("User clicks on Back To My Account button and should redirected to Account dashboard tab")
	public void user_clicks_on_back_to_my_account_button_and_should_redirected_to_account_dashboard_tab() throws Exception {
	    red.navigateToAccountDashboardTab();
	}
	
	@Then("User verify Business process info in CC&B {string} & {string}")
	public void user_verify_business_process_info_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    red.verifyBusinessProcessInfoInCCB(ccbUsername, ccbPwd);
	}

}
