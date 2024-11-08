package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.LandlordAccounts_Loc;
import io.cucumber.java.en.Then;

public class BDD_LandlordAccounts extends BasePage {
	
	LandlordAccounts_Loc la;
	
	@Then("User verifies Daily consumption graph should be disabled as expected")
	public void userVerifiesDailyConsumptionGraphShouldBeDisabled() throws Exception {
		la=new LandlordAccounts_Loc(driver);
		la.verifyDailyConsumptionGraphShouldBeDisabled();
	}

}
