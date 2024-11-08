package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Pollution_Loc;
import io.cucumber.java.en.And;

public class BDD_Pollution extends BasePage {
	
	Pollution_Loc p;
	
	@And("User clicks on Pollution button")
	public void user_clicks_on_pollution_button() throws Exception {
	    p=new Pollution_Loc(driver);
	    p.clicksOnPollutionButton();
	}
	
	@And("User verifies What we need to know about pollution incidents section")
	public void user_verifies_what_we_need_to_know_about_pollution_incidents_section() throws Exception {
	    p.verifiesWhatWeNeedToKnowAboutPIS();
	}
	
	@And("User verifies when we are responsible for pollution incidents section")
	public void user_verifies_when_we_are_responsible_for_pollution_incidents_section() throws Exception {
		p.verifiesWhenWeAreResponsibleForPIS();
	}

}
