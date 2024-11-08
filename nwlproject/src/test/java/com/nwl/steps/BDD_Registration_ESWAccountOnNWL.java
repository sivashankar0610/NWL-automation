package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Registration_ESWAccountOnNWL_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Registration_ESWAccountOnNWL extends BasePage{

	Registration_ESWAccountOnNWL_Loc ren;
	
	@Then("System should display the website error message popup")
	public void System_should_display_the_website_error_message_popup() throws Exception {
		ren = new Registration_ESWAccountOnNWL_Loc(driver);
		ren.errorMessage();	
	}
	
	@When("User clicks on OK button then user should be redirected to Help Centre page")
	public void User_clicks_on_OK_button_then_user_should_be_redirected_to_Help_Centre_page() throws Exception {
		ren.redirectsToHelpCentre();
	}

}
