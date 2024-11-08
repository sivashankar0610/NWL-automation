package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.SwitchToSmartMeter_GMR_Yes_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_SwitchToSmartMeter_GMR_Yes extends BasePage {
	
	SwitchToSmartMeter_GMR_Yes_Loc stsm;
	
	@Then("User selects No option for give a meter reading field")
	public void user_selects_yes_option_for_give_a_meter_reading_field() throws Exception {
		stsm=new SwitchToSmartMeter_GMR_Yes_Loc(driver);
	    stsm.selectsNoOption();
	}

	@And("User changes from No to Yes option for give a meter reading field {string}")
	public void user_changes_from_yes_to_no_option_for_give_a_meter_reading_field(String occupancy) throws Exception {
	    stsm.changesFromNoToYesOption(occupancy);
	}

}
