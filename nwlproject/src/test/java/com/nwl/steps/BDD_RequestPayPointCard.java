package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.RequestPayPointCard_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_RequestPayPointCard extends BasePage {
	
	RequestPayPointCard_Loc rppc;
	
	@And("User verifies PayPoint section under My Bills and Payments tab {string}, {string} & {string}")
	public void user_verifies_pay_point_section_under_my_bills_and_payments_tab(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    rppc=new RequestPayPointCard_Loc(driver);
	    rppc.verifyPayPointSection(accNo, ccbUsername, ccbPwd);
	}
	
	@Then("User clicks on Get a plastic PayPoint card button and should display Success alert popup")
	public void user_clicks_on_get_a_plastic_pay_point_card_button_and_should_display_success_alert_popup() throws Exception {
	    rppc.displaySuccessAlertPopup();
	}
	
	@And("User clicks on close link and verify Get a plastic PayPoint card button should be greyed out")
	public void user_clicks_on_close_link_and_verify_get_plastic_pay_point_card_button_should_be_greyed_out() throws Exception {
		rppc.verifyGetAPlasticPayPointCardButton_GreyedOut();
	}
	
	@And("User verifies customer account characteristics in CC&B")
	public void user_verifies_customer_account_characteristics_in_cc_b() throws Exception {
	    rppc.verifyAccountCharacteristicsInCCB();
	}

}
