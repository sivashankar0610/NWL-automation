package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.WaterSavingTips_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_WaterSavingTips extends BasePage {
	
	WaterSavingTips_Loc wst;
	
	@Then("verify user able to see the water saving tip link {string}")
	public void userAbleToSeeWaterSavingTipLink(String customerType) throws Exception {
	    wst=new WaterSavingTips_Loc(driver);
	    wst.verifyWaterSavingTipsLink(customerType);
	}

	@And("User clicks on Water saving tip link & it should navigate to Water saving tips website")
	public void navigateToWaterSavingTipsWebsite() throws Exception {
	    wst.navigateToWaterSavingTipsWebsite();
	}

}
