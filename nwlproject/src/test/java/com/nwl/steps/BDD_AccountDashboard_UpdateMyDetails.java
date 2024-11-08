package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.AccountDashboard_UpdateMyDetails_Loc;
import io.cucumber.java.en.And;

public class BDD_AccountDashboard_UpdateMyDetails extends BasePage {
	
	AccountDashboard_UpdateMyDetails_Loc ad;
	
	@And("User verifies About Your Account section under Account dashboard {string}")
	public void user_verifies_about_your_account_section_under_account_dashboard(String accNo) throws Exception {
	    ad=new AccountDashboard_UpdateMyDetails_Loc(driver);
	    ad.verifyAboutYourAccountSection(accNo);
	}
	
	@And("User clicks on Update my details button and should be display Alert popup")
	public void user_clicks_on_update_my_details_button_and_should_be_display_alert_popup() throws Exception {
	   ad.displayAlertPopup();
	}

}
