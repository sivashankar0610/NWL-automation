package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MakePayment_FullInstalment_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MakePayment_FullInstalment extends BasePage {
	
	MakePayment_FullInstalment_Loc fi;
	
	@When("User clicks on Make a payment button and should redirected to Pay a bill page")
	public void userClicksOnMakeAPaymentButtonAndShouldRedirectedToPayABillPage() throws Exception {
	    fi=new MakePayment_FullInstalment_Loc(driver);
	    fi.navigateToPayABillPage();
	}
	
	@And("User clicks on Login button and should redirected to Pay your bill page {string}, {string} & {string}")
	public void userClicksOnLoginButtonAndShouldRedirectedToPayYourBillPage(String accNo, String ccbUsername, String ccbPwd) throws Exception {
	    fi=new MakePayment_FullInstalment_Loc(driver);
	    fi.navigateToPayYourBillPage(accNo, ccbUsername, ccbPwd);
	}
	
	@When("User clicks on Proceed to card payment button and should navigate to Pop your details in page")
	public void userClicksOnProceedToCardPaymentButtonAndShouldNavigateToPopYourDetailsInPage() throws Exception {
		fi.navigateToPopYourDetailsInPage();
	}
	
	@Then("User enter card details {string}, {string} and {string}")
	public void userEnterCardDetails(String cardNo, String expiry, String securityCode) throws Exception {
		fi.enterCardDetails(cardNo, expiry, securityCode);
	}
	
	@When("User clicks on Pay now button and should navigate to confirmation page")
	public void userClicksOnPayNowButtonAndShouldNavigateToConfirmationPage() throws Exception {
		fi.navigateToConfirmationPage();
	}
	
	@Then("User clicks on Go back to My account button and should navigate to Account dashboard page")
	public void userClicksOnGoBackToMyAccountButtonAndShouldNavigateToAccountDashboardPage() throws Exception {
		fi.userRedirectedToAccountDashboard();
	}
	
	@When("User clicks on Logout button and user should be logged out")
	public void userClicksOnLogoutButtonAndUserShouldBeLoggedOut() throws Exception {
		fi.userClicksOnLogoutButton();
	}
	
	@Then("User open Activity History section in CC&B")
	public void userOpenActivityHistorySectionInCCB() throws Exception {
		fi.userOpenActivityHistorySectionInCCB();
	}
	
	@And("User verify Account financial history in CC&B")
	public void userVerifyAccountFinancialHistoryInCCB() throws Exception {
		fi.verifyAccountFinancialHistoryInCCB();
	}
	
	
	
	@Then("User verify account balance with CC&B {string},{string} & {string}")
	public void user_verify_account_balance_with_cc_b(String accNo, String username, String pwd) throws Exception {
		fi=new MakePayment_FullInstalment_Loc(driver);
		fi.verifyAccountBalanceWithCCB(accNo, username, pwd);
	}
	
	@And("User clicks on Pay now button and should navigate to Pay your bill page")
	public void user_clicks_on_pay_now_button_and_should_navigate_to_pay_your_bill_page() throws Exception {
		fi.navigateToPayYourBillPage();
	}

}
