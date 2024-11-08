package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Notifications_UpdateOccupancyCount_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Notifications_UpdateOccupancyCount extends BasePage {
	
	Notifications_UpdateOccupancyCount_Loc uoc;
	
	@When("User clicks on Notifications tab and should be redirected to Notifications tab")
	public void user_clicks_on_notifications_tab_and_should_be_redirected_to_notifications_tab() throws Exception {
	    uoc=new Notifications_UpdateOccupancyCount_Loc(driver);
	    uoc.redirectedToNotificationsTab();
	}
	
	@Then("User verifies Update your Occupancy section")
	public void user_verifies_update_your_occupancy_section() throws Exception {
		uoc=new Notifications_UpdateOccupancyCount_Loc(driver);
	    uoc.verifyUpdateYourOccupancySection();
	}
	
	@And("User clicks on Update button then occupancy text field should be highlighted in Red")
	public void user_clicks_on_update_button_then_occupancy_text_field_should_be_highlighted_in_red() throws Exception {
	    uoc.clicksOnUpdateButton();
	}
	
	@And("User provides occupancy count {string}")
	public void user_provides_occupancy_count(String occupancy) throws Exception {
	    uoc.providesOccupancyCount(occupancy);
	}
	
	@And("User clicks on Update button and should not display occupancy section")
	public void user_clicks_on_update_button_and_should_not_display_occupancy_section() throws Exception {
	    uoc.shouldNotdisplayOccupancySection();
	}
	
	@And("User clicks on My Profile tab then verify occupancy")
	public void user_clicks_on_my_profile_tab_then_verify_occupancy() throws Exception {
	    uoc.verifyOccupancyCountUnderMyProfileTab();
	}
	
	@And("User verifies Occupancy count in CC&B {string},{string},{string} & {string}")
	public void user_verifies_occupancy_count_in_cc_b(String accNo, String ccbUsername, String ccbPwd, String occupancy) throws Exception {
	    uoc.verifyOccupancyCountInCCB(accNo, ccbUsername, ccbPwd, occupancy);
	}

}
