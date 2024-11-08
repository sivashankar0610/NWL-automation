package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.PS_RegisteringForMe_ViaMyProfile_LoggedIn_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_PS_RegisteringForMe_ViaMyProfile_LoggedIn extends BasePage {
	
	PS_RegisteringForMe_ViaMyProfile_LoggedIn_Loc psr;
	
	@Then("User verifies Priority Services section having Register button under My Profile tab")
	public void user_verifies_priority_services_section_having_register_button_under_my_profile_tab() throws Exception {
	    psr=new PS_RegisteringForMe_ViaMyProfile_LoggedIn_Loc(driver);
	    psr.verifyPriorityServicesSection();
	}
	
	@When("User clicks on Register for Priority Services button and should navigate to Priority Services page")
	public void user_clicks_on_register_for_priority_services_button_and_should_navigate_to_priority_services_page() throws Exception {
	    psr.navigateToPriorityServicesPage();
	}

}
