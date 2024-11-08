package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Registration_AccountNumberUnknown_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Registration_AccountNumberUnknown extends BasePage {

	Registration_AccountNumberUnknown_Loc ran;
	
	@When("User clicks on I dont know my account number link")
	public void User_clicks_on_I_dont_know_my_account_number_link() throws Exception {
		ran = new Registration_AccountNumberUnknown_Loc(driver);
		ran.clickOnAccountNumberUnknownLink();
	}
	
	@Then("User selects the bill payment option and click on Next button")
	public void User_selects_the_bill_payment_option_and_click_on_Next_button() throws Exception {
		ran.billPaymentOption();
	}
	
	@And("User selects the Move in date and click on Next Button")
	public void User_selects_the_Move_in_date_and_click_on_Next_Button() throws Exception {
		ran.moveInDateOption();
	}
	
	@And("User updates his market preferences and click on the Next button")
	public void User_updates_market_preferences() throws Exception {
		ran.updateMarketingPreferences();
	}
}
