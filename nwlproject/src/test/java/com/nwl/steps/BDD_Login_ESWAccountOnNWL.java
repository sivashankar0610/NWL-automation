package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Login_ESWAccountOnNWL_Loc;
import io.cucumber.java.en.Then;

public class BDD_Login_ESWAccountOnNWL extends BasePage {

	Login_ESWAccountOnNWL_Loc l;

	@Then("User clicks on login button and system should display the ESW website error message popup")
	public void System_should_display_the_ESW_website_error_message_popup() throws Exception {
		l = new Login_ESWAccountOnNWL_Loc(driver);
		l.errorMessagePopup();
		Thread.sleep(2000);
	}

}
