package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.NoWater_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_NoWater extends BasePage {
	
	NoWater_Loc nw;
	
	@When("User clicks on No Water button")
	public void userClicksOnNoWaterButton() throws Exception {
		nw=new NoWater_Loc(driver);
		nw.userClicksOnNoWaterButton();
	}
	
	@And("User clicks on Yes, there is a trickle of water button")
	public void user_clicks_on_yes_there_is_a_trickle_of_water_button() throws Exception {
	    nw.clicksOnYesTrickleOfWaterButton();
	}
	
	@And("User clicks on No, I have no water button")
	public void user_clicks_on_no_i_have_no_water_button() throws Exception {
		nw.clicksOnNoIHaveNoWaterButton();
	}
	
	@Then("User clicks on No button for Is this problem affecting your cold water supply? field")
	public void user_clicks_on_no_button_for_is_this_problem_affecting_your_cold_water_supply_field() throws Exception {
	    nw.clicksOnNoButton_CWS();
	}
	
	@And("User clicks on Yes button for Is this problem affecting your cold water supply? field")
	public void user_clicks_on_yes_button_for_is_this_problem_affecting_your_cold_water_supply_field() throws Exception {
		nw.clicksOnYesButton_CWS();
	}
	
	@And("User clicks on Yes button for Did this fix the problem? field")
	public void user_clicks_on_yes_button_for_did_this_fix_the_problem_field() throws Exception {
		nw.clicksOnYesButton_FTP();
	}
	
	@And("User clicks on No button for Did this fix the problem? field")
	public void user_clicks_on_no_button_for_did_this_fix_the_problem_field() throws Exception {
		nw.clicksOnNoButton_FTP();
	}

}
