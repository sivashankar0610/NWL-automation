package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.SwitchToAnotherAccount_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_SwitchToAnotherAccount extends BasePage {
	
	SwitchToAnotherAccount_Loc aa;	
	
	@Then("User clicks on Login button and select a property from account selection dropdown {string}")
	public void clicksOnLoginButton(String accNo) throws Exception {
		aa=new SwitchToAnotherAccount_Loc(driver);
		aa.userclicksOnLoginButtonAndSelectAccount(accNo);
	}

	@When("User clicks on Continue button and is able to see the Switch to Another Account button")
	public void clicksOnContinueButton() throws Exception {
		aa.userClicksOnContinueButton();
	}
	
	@Then("Verify user account details under Account dashboard tab")
	public void verifyUserAccountDetails() {
	    aa.verifyAccountDetails();
	}

	@And("User clicks on Switch to another account button and select another property from account selection dropdown")
	public void clicksOnSwitchToAnotherAccountButton() throws Exception {
	    aa.clicksOnSwitchToAnotherAccountButtonAndSelectAnotherProperty();
	}

}
