package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.DrainsAndCovers_Loc;
import io.cucumber.java.en.And;

public class BDD_DrainsAndCovers extends BasePage {
	
	DrainsAndCovers_Loc dac;
	
	@And("User clicks on Drains and Covers button")
	public void user_clicks_on_drains_and_covers_button() throws Exception {
	    dac=new DrainsAndCovers_Loc(driver);
	    dac.clicksOnDrainsAndCoversButton();
	}
	
	@And("User verifies Highway gully issues section")
	public void user_verifies_highway_gully_issues_section() throws Exception {
	    dac.verifiesHighwayGullyIssuesSection();
	}
	
	@And("User clicks on County council contacts button and should redirected to County council contacts page in new tab")
	public void user_clicks_on_county_council_contacts_button_and_should_redirected_to_county_council_contacts_page_in_new_tab() throws Exception {
		dac.redirectedToCountyCouncilContactsPage();
	}
	
	@And("User verifies Other drain cover issues section")
	public void user_verifies_other_drain_cover_issues_section() throws Exception {
		dac.verifiesOtherDrainCoverIssuesSection();
	}
	
	@And("User clicks on Tell us about a drain or cover issue button and should redirected to Broken pipes, drains and covers page in new tab")
	public void user_clicks_on_tell_us_about_a_drain_or_cover_issue_button_and_should_redirected_to_broken_pipes_drains_and_covers_page_in_new_tab() throws Exception {
		dac.redirectedToBrokenPipesDrainsAndCoversPage();
	}

}
