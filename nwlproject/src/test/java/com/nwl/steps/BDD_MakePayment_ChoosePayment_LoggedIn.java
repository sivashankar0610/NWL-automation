package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MakePayment_ChoosePayment_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MakePayment_ChoosePayment_LoggedIn extends BasePage {
	
	MakePayment_ChoosePayment_LoggedIn_Loc mp;
	
	@When("User clicks on My bills and payments tab and should redirected to My bills and payments page")
	public void userClicksOnMyBillsAndPaymentsTabAndShouldRedirectedToMyBillsAndPaymentsPage() throws Exception {
	    mp=new MakePayment_ChoosePayment_LoggedIn_Loc(driver);
	    mp.navigateToMyBillsAndPaymentsPage();
	}
	
	@Then("User verifies account balance with CC&B {string},{string} & {string}")
	public void UserVerifiesAccountBalanceWithCCB(String accNo, String username, String pwd) throws Exception {
		mp=new MakePayment_ChoosePayment_LoggedIn_Loc(driver);
	    mp.verifyAccountBalanceWithCCB(accNo, username, pwd);
	}
	
	@When("User clicks on Pay now button and should redirected to Pay your bill page")
	public void userClicksOnPayNowButtonAndShouldRedirectedToPayYourBillPage() throws Exception {
	    mp.navigateToPayYourBillPage();
	}
	
	@Then("User selects choose amount radio button and provided amount to pay {string}")
	public void userSelectsChooseAmountRadioButtonAndProvidedAmounttoPay(String amount) throws Exception {
	    mp.userSelectsChooseAmountRadioButton(amount);
	}
	
	@When("User clicks on Proceed to card payment button and should redirected to Pop your details in page")
	public void userClicksOnProceedToCardPaymentButtonAndShouldRedirectedToPopYourDetailsInPage() throws Exception {
	    mp.navigateToPopYourDetailsInPage();
	}
	
	@Then("User enters card details {string}, {string} and {string}")
	public void userEntersCardDetails(String cardNo, String expiry, String securityCode) throws Exception {
	    mp.entersCardDetails(cardNo, expiry, securityCode);
	}
	
	@When("User clicks on Pay now button and should redirected to confirmation page")
	public void userClicksOnPayNowButtonAndShouldRedirectedToConfirmationPage() throws Exception {
	    mp.navigateToConfirmationPage();
	}
	
	@Then("User clicks on Go back to My account button and should redirected to Account dashboard page")
	public void userClicksOnGoBackToMyAccountButtonAndShouldRedirectedToAccountDashboardPage() throws Exception {
	    mp.userRedirectedToAccountDashboard();
	}
	
	@When("User clicks on Logout button and should be logged out")
	public void userClicksOnLogoutButtonAndShouldBeLoggedOut() throws Exception {
	    mp.userClicksOnLogoutButton();
	}
	
	@Then("User opens Activity History section in CC&B")
	public void userOpensActivityHistorySectionInCCB() throws Exception {
		mp.userOpensActivityHistorySectionInCCB();
	}
	
	@And("User verifies Account financial history in CC&B")
	public void userVerifiesAccountFinancialHistoryInCCB() throws Exception {
		mp.verifyAccountFinancialHistoryInCCB();
	}
	
}
