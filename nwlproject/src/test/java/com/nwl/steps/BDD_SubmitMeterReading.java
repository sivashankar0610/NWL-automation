package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.SubmitMeterReading_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_SubmitMeterReading extends BasePage {
	
	SubmitMeterReading_Loc smr;
	
	@When("User clicks on Water meters & usage tab and should be redirected to Water meters & usage tab")
	public void user_clicks_on_water_meters_usage_tab_and_should_be_redirected_to_water_meters_usage_tab() throws Exception {
	    smr=new SubmitMeterReading_Loc(driver);
	    smr.navigateToWaterMeterAndUsageTab();
	}

	@Then("User clicks on Check my usage button and verify How much water have I used and Carrousel copy text")
	public void UserClicksOnCheckMyUsageButtonAndVerify_how_much_water_have_i_used_and_carrousel_copy_text() throws Exception {
	    smr.verifyHowMuchWaterHaveIUsedAndCarrouselCopytext();   
	}
	
	@When("User clicks on Your usage in more detail button and should redirected to Your usage information screen")
	public void user_clicks_on_your_usage_in_more_detail_button_and_should_redirected_to_your_usage_information_screen() {
	    smr.clicksOnViewUsageInMoreDetailButton();
	}

	@And("User clicks on Your meter readings button")
	public void user_clicks_on_your_meter_readings_button() throws Exception {
	    smr.clicksOnYourMeterReadingsButton();
	}

	@Then("User clicks on Go back button and should redirected to Water meters & Usage tab")
	public void user_clicks_on_go_back_button_and_should_redirected_to_water_meters_usage_tab() throws Exception {
	    smr.clicksOnGoBackButtonAndRedirectedToWaterMetersAndUsageTab();
	}
	
	@When("User clicks on Give a meter reading button")
	public void user_clicks_on_give_a_meter_reading_button() throws Exception {
		smr.clicksOnGiveAMeterReadingButton();
	}
	
	@Then("User selects I have card, letter radio button and should display meter reading alert popup")
	public void userSelectsIHaveCardLetterRadioButton() throws Exception {
		smr.userSelectsIHaveCardLetterRadioButton();
	}
	
	@When("User clicks on Continue button and should redirected to Give a meter reading screen")
	public void user_clicks_on_continue_button() throws Exception {
		smr.redirectedToGiveAMeterReadingScreen();
	}
	
	@Then("Verify My water meter details with CC&B {string},{string} & {string}")
	public void verifyMyWaterMeterDetailsWithCCB(String accNo, String username, String pwd) throws Exception {
		smr.verifyMyWaterMeterDetails(accNo, username, pwd);
	}

	@When("User clicks on Submit Meter Reading button without provide reading then Box should highlight in Red")
	public void user_clicks_on_submit_meter_reading_button_without_provide_reading_then_box_should_highlight_in_red() throws Exception {
		smr.clickOnSubmitReadingButtonWithoutProvideReading();
	}

	@Then("User enters invalid meter reading and should throw error message")
	public void user_enters_invalid_meter_reading_and_should_throw_error_message() throws Exception {
	    smr.provideInvalidMeterReading();
	}

	@When("User enters valid meter reading")
	public void user_enters_valid_meter_reading() throws Exception {
	    smr.enterValidMeterReading();
	}

	@Then("User clicks on Submit meter reading button and it should display success message")
	public void user_clicks_on_submit_meter_reading_button_and_it_should_display_success_message() throws Exception {
	    smr.clicksOnSubmitReadingButton();
	}
	
	@And("User clicks on my usage in more detail button and should redirected to Water meters & usage tab")
	public void user_clicks_on_my_usage_in_more_detail_button_and_should_redirected_to_water_meters_usage_tab() {
	    smr.clicksOnMyUsageInMoreDetailButton();
	}
	
	@When("Verify Read History details in CC&B")
	public void verify_read_history_details_in_cc_b() throws Exception {
	    smr.verifyReadHistoryInCCB();
	}
	
	@Then("User verifies Activity History section in CC&B {string}")
	public void userOpensActivityHistoryInCCB(String Acc) throws Exception {
		smr=new SubmitMeterReading_Loc(driver);
	    smr.opensActivityHistoryTabInCCB(Acc);
	}

}
