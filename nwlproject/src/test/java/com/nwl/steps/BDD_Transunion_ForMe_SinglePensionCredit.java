package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Transunion_ForMe_SinglePensionCredit_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_Transunion_ForMe_SinglePensionCredit extends BasePage {
	
	Transunion_ForMe_SinglePensionCredit_Loc spc;
	
	@And("User selects Pension Credit as Yes")
	public void user_selects_pension_credit_as_yes() throws Exception {
	    spc=new Transunion_ForMe_SinglePensionCredit_Loc(driver);
	    spc.selectsPensionCreditAsYes();
	}
	
	@And("User selects For me and Single Pension Credit buttons")
	public void user_selects_for_me_and_single_pension_credit_buttons() throws Exception {
	    spc.selectsForMeAndSinglePensionCreditButtons();
	}
	
	@And("User fills Your income and housing costs {string}, {string} & {string}")
	public void user_fills_your_income_and_housing_costs(String income, String rent, String frequency) throws Exception {
		spc=new Transunion_ForMe_SinglePensionCredit_Loc(driver);
	    spc.fillsYourIncomeAndHousingCosts(income, rent, frequency);
	}
	
	@Then("User clicks on Next button and should redirected to May be eligible for a discount on your bill page")
	public void user_clicks_on_next_button_and_should_redirected_to_may_be_eligible_for_a_discount_on_your_bill_page() throws Exception {
	    spc.redirectedToMayBeEligibleForADiscountOnYourBillPage();
	}
	
	@And("User clicks on Back to my account button and should redirected to Account dashboard")
	public void user_clicks_on_back_to_my_account_button_and_should_redirected_to_account_dashboard() throws Exception {
	    spc.redirectedToAccountDashboard();
	}
	
	@And("User verify Business process info section in CC&B {string} & {string}")
	public void user_verifies_business_process_info_in_cc_b(String ccbUsername, String ccbPwd) throws Exception {
	    spc.verifyBusinessProcessInfoInCCB(ccbUsername, ccbPwd);
	}

}
