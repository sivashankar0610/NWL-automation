package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Payment_DoNotHaveOnlineAccount_Loc;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Payment_DoNotHaveOnlineAccount extends BasePage{
	
	Payment_DoNotHaveOnlineAccount_Loc p;
	
	@When("User click on Make a Payment button and should redirected to Pay a bill page")
	public void User_click_on_Make_a_Payment_button_from_homepage() throws Exception {
		p=new Payment_DoNotHaveOnlineAccount_Loc(driver);
		p.userClickMakeAPaymentButton();
	}
	
	@And("User click on I dont have an online account button and should redirected to Make a payment page")
	public void User_click_on_I_dont_have_an_online_account_button() throws Exception {
		p.userClicksIDontHaveOnlineAccount();
	}
	
	@Then("System gets the required information from CC&B for the account of {string} using {string} and {string}")
	public void System_gets_required_info_from_CCB(String AccountID, String CCBEmail, String CCBPw) throws Exception {
		p.getCCBdetails(AccountID,CCBEmail,CCBPw);
	}
	
	@When("User enters valid user details and email {string}")
	public void User_enters_valid_user_details(String email) throws Exception {
		p.userDetails(email);
	}
	
	@Then("User clicks on Next button and should redirected to Quick security questions page")
	public void userClicksOnNextButtonAndShouldRedirectedToQuickSecurityQuestionsPage() throws Exception {
		p.redirectedToQuickSecurityQuestionsPage();
	}
	
	@When("User enters valid personal details")
	public void User_enter_valid_personal_details() throws Exception {
		p.userPersonalDetails();
	}
	
	@Then("User clicks on Next button and should redirected to Pay your bill page")
	public void userClicksOnNextButtonAndShouldRedirectedToPayYourBillPage() throws Exception {
		p.redirectedToPayYourBillPage();
	}
	
	@When("User enters the amount to be paid as £{string}")
	public void User_enters_the_amount_to_be_paid(String amount) {
		p.amountToBePaid(amount);
	}
	
	@Then("User click on Proceed to card payment button and should redirected to Pop your details page")
	public void userClickOnProceedToCardPaymentButtonAndShouldRedirectedToPopYourDetailsPage() throws Exception {
		p.redirectedToPopYourDetailsPage();
	}
	
	@And("User enters card details on the Pop your details in page")
	public void User_enters_card_details_on_the_pop_your_details_page(DataTable table) throws Exception {
		p.userEntersCardDetails(table);
	}
	
	@When("User click on pay now button and should redirected to confirmation screen")
	public void userClickOnPayNowButtonAndShouldRedirectedToConfirmationScreen() throws Exception {
		p.redirectedToConfirmationScreen();
	}
	
	@Then("User clicks on Back to HomePage button then it should be redirected to homepage")
	public void userClickOnBackToHomePageButtonAndShouldRedirectedToHomepage() throws Exception {
		p.redirectedToHomepage();
	}
	
	@And("User opens the Activity History section in CC&B")
	public void User_opens_the_Activity_History_section_in_CCB() throws Exception {
		p.userOpensActivityHistorySectionInCCB();
	}
	
    @And("User verifies the Account financial history in CC&B")
    public void User_verifies_the_Account_financial_history_in_CCB() throws Exception {
    	p.verifyAccountFinancialHistoryInCCB();
    }

}
