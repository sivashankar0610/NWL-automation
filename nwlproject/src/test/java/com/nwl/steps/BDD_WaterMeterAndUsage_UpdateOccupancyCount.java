package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.WaterMeterAndUsage_UpdateOccupancyCount_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_WaterMeterAndUsage_UpdateOccupancyCount extends BasePage {
	
	WaterMeterAndUsage_UpdateOccupancyCount_Loc uoc;
	
	@And("User verifies Can you save money on a water meter page")
	public void user_verifies_can_you_save_money_on_a_water_meter_page() throws Exception {
	    uoc=new WaterMeterAndUsage_UpdateOccupancyCount_Loc(driver);
	    uoc.verifyCanYouSaveMoneyOnAWaterMeterPage();
	}
	
	@And("User enters Occupancy count {string}")
	public void user_enters_occupancy_count(String occupancyCount) throws Exception {
		uoc=new WaterMeterAndUsage_UpdateOccupancyCount_Loc(driver);
	    uoc.entersOccupancyCount(occupancyCount);
	}
	
	@Then("User clicks on Update details button and should display success popup")
	public void user_clicks_on_update_details_button_and_should_display_success_popup() throws Exception {
	    uoc.displaySuccessPopup();
	}
	
	@And("User clicks Ok button and should redirected to Water meter and usage tab")
	public void user_clicks_ok_button_and_should_redirected_to_water_meter_and_usage_tab() throws Exception {
	    uoc.redirectedToWaterMeterAndUsageTab();
	}
	
	@And("User clicks on My Profile tab then verify occupancy count")
	public void user_clicks_on_my_profile_tab_then_verify_occupancy_count() throws Exception {
	    uoc.verifyOccupancyCountUnderMyProfileTab();
	}
	
	@And("User verifies Occupancy count in CC&B {string},{string} & {string}")
	public void user_verifies_occupancy_count_in_cc_b(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    uoc.verifyOccupancyCountInCCB(accNo, ccbUsername, ccbPwd);
	}

}
