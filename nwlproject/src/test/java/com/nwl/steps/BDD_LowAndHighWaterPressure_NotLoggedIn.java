package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.LowAndHighWaterPressure_NotLoggedIn_Loc;
import io.cucumber.java.en.When;

public class BDD_LowAndHighWaterPressure_NotLoggedIn extends BasePage {
	
	LowAndHighWaterPressure_NotLoggedIn_Loc lwp;
	
	@When("User enters Your contact details as per CC&B {string}, {string}, {string} & {string}")
	public void user_enters_your_contact_details_as_per_cc_b(String ccbUserName, String ccbPwd, String accNo, String email) throws Exception {
	    lwp=new LowAndHighWaterPressure_NotLoggedIn_Loc(driver);
	    lwp.entersYourContactDetailsAsPerCCB(ccbUserName, ccbPwd, accNo, email);
	}

}
