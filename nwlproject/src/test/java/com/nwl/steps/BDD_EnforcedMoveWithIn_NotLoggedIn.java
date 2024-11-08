package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.EnforcedMoveWithIn_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_EnforcedMoveWithIn_NotLoggedIn extends BasePage {
	
	EnforcedMoveWithIn_NotLoggedIn_Loc emwi;
	
	@Then("User clicks on Yes button and should navigate to Your new home page {string}")
	public void user_clicks_on_yes_button_and_should_navigate_to_your_new_home_page(String moveInDate) throws Exception {
		emwi=new EnforcedMoveWithIn_NotLoggedIn_Loc(driver);
		emwi.navigateToYourCurrentAddressScreen(moveInDate);
	}
	
	@And("User fills Your new address and remaining fields {string}")
	public void user_fills_your_new_address_and_remaining_fields(String miAddress) throws Exception {
	    emwi.fillsYourNewHomeAndRemainingFields(miAddress);
	}
	
	@When("User clicks on Next button and should navigate to Your bills screen {string},{string} & {string}")
	public void user_clicks_on_next_button_and_should_navigate_to_your_bills_screen(String miAccNo, String ccbUsername, String ccbPwd) throws Exception {
	    emwi.navigateToYourBillsScreen(miAccNo, ccbUsername, ccbPwd);
	}
	
	@And("User click on Next button and should redirected to Ready page {string}")
	public void user_click_on_next_button_and_should_redirected_to_ready_page(String email) throws Exception {
	    emwi.navigateToReadyPage(email);
	}
	
	@Then("User click on Done button and should redirected to Success screen")
	public void user_click_on_done_button_and_should_redirected_to_success_screen() throws Exception {
	    emwi.navigateToSuccessScreen();
	}
	
	@And("User verify details under Show me the details accordian")
	public void user_verify_details_under_show_me_the_details_accordian() throws Exception {
	    emwi.showMeTheDetailsAccordian();
	}
	
	@When("User open MI process exists section in CCB {string} & {string}")
	public void user_open_mi_process_exists_section_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    emwi.miProcessExistsInCCB(ccbUsername, ccbPwd);
	}

}
