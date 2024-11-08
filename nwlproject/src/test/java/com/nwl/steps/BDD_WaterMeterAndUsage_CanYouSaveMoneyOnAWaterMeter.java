package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter_Loc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter extends BasePage {
	
	WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter_Loc cysmowm;
	
	@And("User enter Occupancy count {string}")
	public void user_enter_occupancy_count(String occupancyCount) throws Exception {
		cysmowm=new WaterMeterAndUsage_CanYouSaveMoneyOnAWaterMeter_Loc(driver);
		cysmowm.enterOccupancyCount(occupancyCount);
	}
	
	@And("User fills your household fields")
	public void User_fills_your_household_fields(DataTable table) throws Exception {
		cysmowm.fillsYourHouseholdFields(table);
	}
	
	@Then("User clicks on Estimate my bill button and should display Your estimated usage section")
	public void user_clicks_on_estimate_my_bill_button_and_should_display_your_estimated_usage_section() throws Exception {
		cysmowm.displayYourEstimatedUsageSection();
	}
	
	@And("User clicks on Apply for a meter button and should redirected to Apply for a water meter page")
	public void user_clicks_on_apply_for_a_meter_button_and_should_redirected_to_apply_for_a_water_meter_page() throws Exception {
	    cysmowm.redirectedToApplyForWaterMeter();
	}

}
