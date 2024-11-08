package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.SwitchToSmartMeter_GMR_No_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_SwitchToSmartMeter_GMR_No extends BasePage {
	
	SwitchToSmartMeter_GMR_No_Loc stsm;
	
	@Then("User verifies Switch to metered bills section available or not")
	public void userVerifiesSwitchToMeteredBillsSection() throws Exception {
		stsm = new SwitchToSmartMeter_GMR_No_Loc(driver);
	    stsm.userVerifiesSwitchToMeteredBillsSection();
	}
	
	@When("User clicks on Switch to metered bills button and should redirected to Switch to metered bills page")
	public void user_clicks_on_switch_to_metered_bills_button_and_should_redirected_to_switch_to_metered_bills_page() throws Exception {
	    stsm.redirectedToSwitchToMeteredBillsPage();
	}
	
	@Then("User verifies customer personal details with CC&B {string},{string},{string} & {string}")
	public void user_verifies_customer_personal_details_with_cc_b(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    stsm.verifiesPersonalDetailsWithCCB(email, accNo, ccbUsername, ccbPwd);
	}
	
	@When("User clicks on Next button and should redirected to Switch to metered bills page")
	public void user_clicks_on_next_button_and_should_redirected_to_switch_to_metered_bills_page() throws Exception {
	    stsm.navigateToSwitchToMeteredBillsPage();
	}
	
	@Then("User selects Yes option for give a meter reading field")
	public void user_selects_yes_option_for_give_a_meter_reading_field() throws Exception {
	    stsm.selectsYesOption();
	}
	
	@And("User changes from Yes to No option for give a meter reading field {string}")
	public void user_changes_from_yes_to_no_option_for_give_a_meter_reading_field(String occupancy) throws Exception {
	    stsm.changesFromYesToNoOption(occupancy);
	}
	
	@And("User clicks on Done button and should redirected to We have got your request to switch page")
	public void user_clicks_on_done_button_and_should_redirected_to_we_have_got_your_request_to_switch_page() throws Exception {
		stsm = new SwitchToSmartMeter_GMR_No_Loc(driver);
		stsm.navigateToWeHaveGotYourRequestToSwitchPage();
	}
	
	@And("User verifies Whole area metering section in CC&B")
	public void user_verifies_whole_area_metering_section_in_cc_b() throws Exception {
	    stsm.verifyWholeAreaMeteringSectionInCCB();
	}
	
	@And("User verifies Terms and Conditions section in CC&B")
	public void user_verifies_terms_and_conditions_section_in_cc_b() throws Exception {
	    stsm.verifyTermsAndConditionsSectionInCCB();
	}

}
