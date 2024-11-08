package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.FinancialSupportEligibilityChecker_EligibleResult_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_FinancialSupportEligibilityChecker_EligibleResult extends BasePage {
	
	FinancialSupportEligibilityChecker_EligibleResult_Loc fsec;
	
	@When("User clicks on Ribbon Services > Extra Support > Financial Support and should redirected to Financial Support page")
	public void user_redirected_to_financial_support_page() throws Exception {
	    fsec=new FinancialSupportEligibilityChecker_EligibleResult_Loc(driver);
	    fsec.redirectedToFinancialSupportPage();
	}
	
	@And("User clicks on Eligiblity Checker button and should redirected to Financial Support Eligibility Checker page")
	public void user_redirected_to_financial_support_eligibility_checker_page() throws Exception {
	    fsec.redirectedToFinancialSupportEligibilityCheckerPage();
	}
	
	@Then("User clicks on Check my eligibility button without selecting any option and should throws Yes & No button Boxes highlighted red")
	public void user_clicks_on_check_my_eligibility_button_without_selecting_any_option() {
	    fsec.clicksOnCheckMyEligibilityButtonWithoutSelectingAnyOption();
	}
	
	@When("User selects I have three or more children living with you at the property & I have a water meter options for Your household field")
	public void user_selects_customer_selects_or_more_children_living_with_you_at_the_property_i_have_a_water_meter_options_for_your_household_field() throws Exception {
	    fsec.selectsOptionsForYourHouseholdField();
	}
	
	@And("User selects Pension Credit option for Benefits & financial support field")
	public void user_selects_pension_credit_option_for_benefits_financial_support_field() throws Exception {
	    fsec.selectsOptionsForBenefitsFinancialSupportField();
	}
	
	@And("User selects Yes option for Are you £50 or more behind with your water bill payments? field")
	public void user_selects_yes_option_for_are_you_£50_or_more_behind_with_your_water_bill_payments_field() throws Exception {
		fsec=new FinancialSupportEligibilityChecker_EligibleResult_Loc(driver);
		fsec.selectsOptionsForWaterBillPaymentsField();
	}
	
	@Then("User clicks on Check my eligibility button and should redirected to Eligible Results screen")
	public void user_clicks_on_check_my_eligibility_button_and_should_redirected_to_eligible_results_screen() throws Exception {
	    fsec.redirectedToEligibleResultsScreen();
	}
	
	@And("User verifies Low income discount and WaterSure sections")
	public void user_verifies_low_income_discount_and_water_sure_sections() throws Exception {
	    fsec.verifyLowIncomeDiscountAndWaterSureSections();
	}
	
	@And("User verifies Water Direct and Water saving tips sections")
	public void user_verifies_water_direct_and_water_saving_tips_sections() throws Exception {
	    fsec.verifyWaterDirectAndWaterSavingTipsSections();
	}
	
	@When("User clicks on Apply Online button for Low income discount and should redirected to Low income discount page in new tab")
	public void user_should_redirected_to_low_income_discount_page_in_new_tab() throws Exception {
	    fsec.redirectedToLowIncomeDiscountPage();
	}
	
	@Then("User clicks on Find out more button for Water Sure and should redirected to Bill cap scheme - Water Sure page in new tab")
	public void user_should_redirected_to_bill_cap_scheme_water_sure_page_in_new_tab() throws Exception {
		fsec.redirectedToBillCapScheme_WaterSurePage();
	}
	
	@When("User clicks on Find out more button for Water Direct and should redirected to Water Direct page in new tab")
	public void user_should_redirected_to_water_direct_page_in_new_tab() throws Exception {
		fsec.redirectedToWaterDirectPage();
	}
	
	@Then("User clicks on Read our water saving tips button and should redirected to Save water page in new tab")
	public void user_should_redirected_to_save_water_page_in_new_tab() throws Exception {
		fsec=new FinancialSupportEligibilityChecker_EligibleResult_Loc(driver);
		fsec.redirectedToSaveWaterPage();
	}
	
	@And("User clicks on Back to Financial support button and should redirected to Financial Support eligibility checker page")
	public void user_should_redirected_to_financial_support_eligibility_checker_page() throws Exception {
		fsec=new FinancialSupportEligibilityChecker_EligibleResult_Loc(driver);
		fsec.redirectedToFSECheckerPage();
	}

}
