package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.AccountDashboard_CanYouSaveMoneyOnAWaterMeter_Loc;
import io.cucumber.java.en.When;

public class BDD_AccountDashboard_CanYouSaveMoneyOnAWaterMeter extends BasePage {
	
	AccountDashboard_CanYouSaveMoneyOnAWaterMeter_Loc cysmowm;
	
	@When("User clicks on How can I use less water link and should redirected to Saving water page")
	public void user_clicks_on_how_can_i_use_less_water_link_and_should_be_redirected_to_save_water_page() throws Exception {
		cysmowm = new AccountDashboard_CanYouSaveMoneyOnAWaterMeter_Loc(driver);
		cysmowm.redirectedToSavingMeterPage();
	}

}
