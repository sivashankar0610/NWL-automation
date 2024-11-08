package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.HighWaterPressure_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_HighWaterPressure_LoggedIn extends BasePage {
	
	HighWaterPressure_LoggedIn_Loc hwp;
	
	@And("User clicks on High Pressure button")
	public void user_clicks_on_high_pressure_button() throws Exception {
		hwp=new HighWaterPressure_LoggedIn_Loc(driver);
	    hwp.clicksOnHighWaterPressure();
	}
	
	@Then("User click on No button for Is the pressure issue affecting the cold water supply at your kitchen tap? field")
	public void user_click_on_no_button_for_is_the_pressure_issue_affecting_the_cold_water_supply_at_your_kitchen_tap_field() throws Exception {
	    hwp.clickOnNoButton_AffectingCWS();
	}
	
	@And("User click on Yes button for Is the pressure issue affecting the cold water supply at your kitchen tap? field")
	public void user_click_on_yes_button_for_is_the_pressure_issue_affecting_the_cold_water_supply_at_your_kitchen_tap_field() throws Exception {
		hwp.clickOnYesButton_AffectingCWS();
	}
	
	@And("User selects an option for when the problem started {string}")
	public void user_selects_an_option_for_when_the_problem_started(String psName) throws Exception {
	    hwp.selectsAnOptionForWhenTheProblemStarted(psName);
	}
	
	@And("User enters text in the describe the issue text box")
	public void user_enters_text_in_the_describe_the_issue_text_box() throws Exception {
	    hwp.entersTextInTheDescribeTheIssueTextBox();
	}
	
	@And("User clicks on No button for Are your neighbours affected? field")
	public void user_clicks_on_no_button_for_are_your_neighbours_affected_field() throws Exception {
		hwp.clicksOnNoButton_NeighboursAffected();
	}
	
	@And("User clicks on Yes button for Are your neighbours affected? field")
	public void user_clicks_on_yes_button_for_are_your_neighbours_affected_field() throws Exception {
		hwp.clicksOnYesButton_NeighboursAffected();
	}
	
	@And("User clicks on No button for Have you recently carried out any plumbing work in your home? field")
	public void user_clicks_on_no_button_for_have_you_recently_carried_out_any_plumbing_work_in_your_home_field() throws Exception {
		hwp.clicksOnNoButton_PlumbingWorkInYourHome();
	}
	
	@And("User clicks on Yes button for Have you recently carried out any plumbing work in your home? field")
	public void user_clicks_on_yes_button_for_have_you_recently_carried_out_any_plumbing_work_in_your_home_field() throws Exception {
		hwp.clicksOnYesButton_PlumbingWorkInYourHome();
	}

}
