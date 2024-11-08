package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.EnforcedMoveWithIn_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_EnforcedMoveWithIn_LoggedIn extends BasePage {
	
	EnforcedMoveWithIn_LoggedIn_Loc emw;
	
	@When("User clicks on Next button and should redirected to Your bills screen")
	public void user_clicks_on_next_button_and_should_redirected_to_your_bills_screen() throws Exception {
	    emw=new EnforcedMoveWithIn_LoggedIn_Loc(driver);
	    emw.navigateToYourBillsScreen();
	}
	
	@And("User click on Next button and should navigate to Ready page {string} & {string}")
	public void user_click_on_next_button_and_should_navigate_to_ready_page(String email, String moveInDate) throws Exception {
	    emw.navigateToReadyPage(email, moveInDate);
	}
	
	@Then("User click on Done button and should navigate to Confirmation page")
	public void user_click_on_done_button_and_should_navigate_to_confirmation_page() throws Exception {
	    emw.navigateToConfirmationPage();
	}
	
	@And("User verify details under Show me details section")
	public void user_verify_details_under_show_me_details_section() throws Exception {
	    emw.verifyShowMeDetails();
	}
	
	@And("User opens MOMI process exists section in CC&B {string} & {string}")
	public void user_opens_momi_process_exists_section_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    emw.opensMOMIProcessExists(ccbUsername, ccbPwd);
	}
	
}
