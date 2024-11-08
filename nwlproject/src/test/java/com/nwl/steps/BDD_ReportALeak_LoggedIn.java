package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ReportALeak_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ReportALeak_LoggedIn extends BasePage {
	
    ReportALeak_LoggedIn_Loc ral;
	
	@When("User clicks on My Local Area link from Ribbon and should navigate to Check my area tab")
	public void userClicksOnMyLocalAreaLinkAndShouldNavigateToCheckMyAreaTab() throws Exception {
		ral=new ReportALeak_LoggedIn_Loc(driver);
		ral.navigateToCheckMyAreaTab();
	}
	
	@Then("User clicks on Report a problem tab and should navigate to Report a problem tab")
	public void userClicksOnReportAProblemTabAndShouldNavigateToReportAProblemTab() throws Exception {
		ral=new ReportALeak_LoggedIn_Loc(driver);
		ral.navigateToReportAProblemTab();
	}
	
	@When("User clicks on Leaks button")
	public void userClicksOnLeaksButton() throws Exception {
		ral.userClicksOnLeaksButton();
	}
	
	@Then("User enters required address and verify No leaks found in this area message {string}")
	public void userEntersRequiredAddressAndVerifyWaterDisruptionSection(String address) throws Exception {
	    ral.userEntersRequiredAddress(address);
	}
	
	@When("User clicks on Continue to report a leak button and should opens Where is the leak section")
	public void userClicksOnContinueToReportALeakButtonAndShouldOpensWhereIsTheLeakSection() throws Exception {
	    ral.userClicksOnContinueToReportALeakButton();
	}
	
	@Then("User clicks on In the road, lane or footpath button")
	public void userClicksOnInTheRoadLaneOrFootPathButton() throws Exception {
	    ral.userClicksOnInTheRoadLaneOrFootPathButton();
	}
	
	@And("User selects Steady flow from How bad is the leak section")
	public void UserSelectsSteadyFlowFromHowBadIsTheLeakSection() throws Exception {
	    ral.UserSelectsSteadyFlowFromHowBadIsTheLeakSection();
	}
	
	@When("User verifies Contact details {string}")
	public void userVerifiesContactDetails(String email) throws Exception {
	    ral.userVerifiesContactDetails(email);
	}
	
	@Then("User clicks on Finish reporting this leak button and should redirected to confirmation screen")
	public void userClicksOnFinishReportingThisLeakButtonAndShouldRedirectedToConfirmationScreen() throws Exception {
	    ral.navigateToConfirmationScreen();
	}
	
	@When("User clicks on How we fix leaks button and should redirected to fixing leaks page")
	public void userClicksOnHowWeFixLeaksButtonAndShouldRedirectedToFixingLeaksScreen() throws Exception {
	    ral.navigateToFixingLeaksPage1();
	}
	
	@Then("User clicks on How long it takes to fix leaks button and should redirected to fixing leaks page")
	public void userClicksOnHowLongItTakesToFixLeaksButtonAndShouldRedirectedToFixingLeaksScreen() throws Exception {
	    ral.navigateToFixingLeaksPage2();
	}
	
	@When("User verifies Customer contact characteristics tab in CC&B {string} & {string}")
	public void userVerifiesCustomerContactMainTabInCCB(String username, String pwd) throws Exception {
		ral.userVerifiesCustomerContactMainTabInCCB(username, pwd);
	}
	
	@Then("User verify Business process section in CC&B")
	public void userVerifiesBusinessProcessSectionInCCB() throws Exception {
		ral.userVerifiesBusinessProcessSectionInCCB();
	}
	
	@And("User verify Process activity history in CC&B")
	public void userVerifiesProcessActivityHistoryInCCB() throws Exception {
		ral.userVerifiesProcessActivityHistoryInCCB();
	}

}
