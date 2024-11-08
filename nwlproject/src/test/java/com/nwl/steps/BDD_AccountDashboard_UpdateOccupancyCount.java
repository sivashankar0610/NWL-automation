package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.AccountDashboard_UpdateOccupancyCount_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.When;

public class BDD_AccountDashboard_UpdateOccupancyCount extends BasePage {
	
	AccountDashboard_UpdateOccupancyCount_Loc uoc;
	
	@And("User verifies Can I save money on a meter button under My water meter section")
	public void user_verifies_can_i_save_money_on_a_meter_button_under_my_water_meter_section() throws Exception {
	    uoc=new AccountDashboard_UpdateOccupancyCount_Loc(driver);
	    uoc.verifyCanISaveMoneyOnAMeterButton();
	}
	
	@When("User clicks on Can I save money on a meter button and should be redirected to Can you save money on a water meter page")
	public void user_clicks_on_can_i_save_money_on_a_meter_button_and_should_be_redirected_to_can_you_save_money_on_a_water_meter_page() throws Exception {
	    uoc.redirectedToCanYouSaveMoneyOnAWaterMeterPage();
	}

}
