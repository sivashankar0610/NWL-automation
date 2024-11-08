package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.LowWaterPressure_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_LowWaterPressure_LoggedIn extends BasePage {
	
	LowWaterPressure_LoggedIn_Loc lwp;
	
	@When("User clicks on Water Pressure button")
	public void userClicksOnWaterPressureButton() throws Exception {
		lwp=new LowWaterPressure_LoggedIn_Loc(driver);
		lwp.userClicksOnWaterPressureButton();
	}
	
	@And("User clicks on Low Pressure button")
	public void user_clicks_on_low_pressure_button() throws Exception {
	    lwp.clicksOnLowPressureButton();
	}
	
	@Then("User clicks on No button for Is the pressure issue affecting the cold water supply at your kitchen tap? field")
	public void user_clicks_on_no_button_for_is_the_pressure_issue_affecting_the_cold_water_supply_at_your_kitchen_tap_field() throws Exception {
	    lwp.clicksOnNoButton_AffectingCWS();
	}
	
	@And("User clicks on Yes button for Is the pressure issue affecting the cold water supply at your kitchen tap? field")
	public void user_clicks_on_yes_button_for_is_the_pressure_issue_affecting_the_cold_water_supply_at_your_kitchen_tap_field() throws Exception {
		lwp.clicksOnYesButton_AffectingCWS();
	}
	
	@And("User click on Yes button for Did this fix the problem? field")
	public void user_click_on_yes_button_for_did_this_fix_the_problem_field() throws Exception {
		lwp.clickOnYesButton_FTP();
	}
	
	@And("User click on No button for Did this fix the problem? field")
	public void user_click_on_no_button_for_did_this_fix_the_problem_field() throws Exception {
		lwp.clickOnNoButton_FTP();
	}
	
	@And("User selects Its intermittent radio button for when did the problem start? field")
	public void user_selects_its_intermittent_radio_button_for_when_did_the_problem_start_field() throws Exception {
		lwp.selectsItsIntermittentRadioButton();
	}
	
	@And("User selects Its only just started radio button for when did the problem start? field")
	public void user_selects_its_only_just_started_radio_button_for_when_did_the_problem_start_field() throws Exception {
	    lwp.selectsItsOnlyJustStartedRadioButton();
	}
	
	@And("User selects Today radio button for when did the problem start? field")
	public void user_selects_today_radio_button_for_when_did_the_problem_start_field() throws Exception {
		lwp.selectsTodayRadioButton();
	}
	
	@And("User selects Yesterday radio button for when did the problem start? field")
	public void user_selects_yesterday_radio_button_for_when_did_the_problem_start_field() throws Exception {
		lwp.selectsYesterdayRadioButton();
	}
	
	@And("User selects A week ago radio button for when did the problem start? field")
	public void user_selects_a_week_ago_radio_button_for_when_did_the_problem_start_field() throws Exception {
		lwp.selectsAWeekAgoRadioButton();
	}
	
	@And("User selects More than a week ago radio button for when did the problem start? field")
	public void user_selects_more_than_a_week_ago_radio_button_for_when_did_the_problem_start_field() throws Exception {
		lwp.selectsMoreThanAWeekAgoRadioButton();
	}
	
	@When("User verifies Your contact details with CC&B {string}, {string}, {string} & {string}")
	public void user_verifies_your_contact_details_with_cc_b(String ccbUsername, String ccbPwd, String accNo, String email) throws Exception {
		lwp=new LowWaterPressure_LoggedIn_Loc(driver);
		lwp.verifyYourContactDetailsWithCCB(ccbUsername, ccbPwd, accNo, email);
	}
	
	@Then("User clicks on Submit button and should redirected to WP Confirmation screen")
	public void user_clicks_on_submit_button_and_should_redirected_to_wp_confirmation_screen() throws Exception {
		lwp=new LowWaterPressure_LoggedIn_Loc(driver);
	    lwp.redirectedToWPConfirmationScreen();
	}
	
	@And("User clicks on Close button and should redirected to Report a problem page")
	public void user_clicks_on_close_button_and_should_redirected_to_report_a_problem_page() throws Exception {
	    lwp.clicksOnCloseButton();
	}
	
	@And("User verifies Main Process Details section in CC&B")
	public void user_verifies_main_process_details_section_in_cc_b() throws Exception {
	    lwp.verifiesMainProcessDetailsSectionInCCB();
	}
	
	@And("User verifies Water Pressure Customer Journey section in CC&B")
	public void user_verifies_water_pressure_customer_journey_section_in_cc_b() throws Exception {
	    lwp.opensNoWaterAndLowPressureCustomerJourneyInCCB();
	}
	
	@And("User verifies Activity History Section in CCB")
	public void user_verifies_activity_history_section_in_ccb() throws Exception {
	    lwp.verifiesActivityHistorySectionInCCB();
	}

}
