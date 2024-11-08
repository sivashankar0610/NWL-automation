package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ChangePaymentPlan_Date_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ChangePaymentPlan_Date extends BasePage {
	
	ChangePaymentPlan_Date_Loc pp;
	
	@And("User selects payment date under next payment section {string}")
	public void userSelectsPaymentDateUnderNextPaymentSection(String date) throws Exception {
		pp=new ChangePaymentPlan_Date_Loc(driver);
	    pp.userSelectsPaymentPlan(date);
	}
	
	@Then("User clicks on continue button and should redirected to confirmation screen")
	public void userClicksOnContinueButtonAndShouldRedirectedToConfirmationScreen() throws Exception {
	    pp.navigateToConfirmationScreen();
	}
	
	@When("User clicks on close link and should redirected to My bills and payments page")
	public void userClicksOnCloseLinkAndShouldRedirectedToMyBillsAndPaymentsPage() throws Exception {
	    pp.navigateToMyBillsAndPaymentsScreen();
	}
	
	@Then("User clicks on account dashboard tab and should redirected to account dashboard page")
	public void userClicksOnAccountDashboardTabAndShouldRedirectedToAccountDashboardPage() throws Exception {
	    pp.navigateToAccountDashboardScreen();
	}
	
	@Then("User verify Activity History section in CC&B {string}, {string} & {string}")
	public void userVerifiesActivityHistorySectionInCCB(String accNo, String username, String pwd) throws Exception {
		pp=new ChangePaymentPlan_Date_Loc(driver);
		pp.userOpensActivityHistorySectionInCCB(accNo, username, pwd);
	}
	
	@And("User verifies Account characterstics tab in CC&B")
	public void userVerifiesAccountCharactersticsTabInCCB() throws Exception {
	    pp.userVerifiesAccountCharactersticsTabInCCB();
	}

}
