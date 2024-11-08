package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.EnforcedMoveOut_NotLoggedIn_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_EnforcedMoveOut_NotLoggedIn extends BasePage {
	
	EnforcedMoveOut_NotLoggedIn_Loc emo;
	
	@Then("User clicks on No button and should navigate to Your current address screen")
	public void user_clicks_on_no_button_and_should_navigate_to_your_current_address_screen() throws Exception {
		emo=new EnforcedMoveOut_NotLoggedIn_Loc(driver);
		emo.navigateToYourCurrentAddressPage();  
	}
	
	@When("User fills The Date you moved out field {string}")
	public void user_fills_the_date_you_moved_out_field(String moveOutDate) throws Exception {
	    emo.fillsTheDateYouMovedOutField(moveOutDate);
	}
	
	@Then("User clicks on Next button and should redirected to Your last bill from us page")
	public void user_clicks_on_no_button_and_should_redirected_to_your_last_bill_from_us_screen() throws Exception {
		emo.redirectedToYourLastBillFromUsPage();  
	}
	
	@When("User verifies Move in Move Out process exists in CC&B {string} & {string}")
	public void user_verifies_move_in_move_out_process_exists_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    emo.verifiesMIMOProcessExists(ccbUsername, ccbPwd);
	}

}
