package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.CheckALeak_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_CheckALeak extends BasePage {
	
	CheckALeak_Loc cal;
	
	@Then("User enters required address {string}")
	public void userEntersRequiredAddress(String address) throws Exception {
	    cal=new CheckALeak_Loc(driver);
	    cal.enterRequiredAddress(address);
	}
	
	@And("User verifies Leaks section")
	public void userVerifiesLeaksSection() throws Exception {
	    cal.verifyLeaksSection();
	}
	
	@And("User verifies Investigating reported leak icon information text")
	public void userVerifiesInvestigatingReportedLeakIconInformationText() throws Exception {
	    cal.verifyInvestigatingReportedLeakIconInformationText();
	}
	
	@When("User clicks on reported leak link and should navigate to check your area tab")
	public void userClicksOnReportedLeakLinkAndShouldNavigateToCheckYourAreaTab() throws Exception {
	    cal.navigateToCheckYourAreaTab();
	}
	
	@Then("User verifies More details and Useful information sections under check your area tab")
	public void userVerifiesMoreDetailsAndUsefulInformationSectionsUnderCheckYourAreaTab() throws Exception {
	    cal.VerifyMoreDetailsAndUsefulInformationSections();
	}
	
	@When("User clicks on What happens when i report a leak button and should redirected to fixing leaks page")
	public void userClicksOnWhatHappensWhenIReportALeakButtonAndShouldNavigateTofixingLeaksPage() throws Exception {
	    cal.navigateToFixingLeaksPage();
	}
	
	@Then("User clicks on How long does it take to fix a leak button and should redirected to who fixes the leak in my home page")
	public void userClicksOnHowLongDoesItTakeToFixALeakButtonAndShouldNavigateToWhoFixesTheLeakInMyHomePage() throws Exception {
	    cal.navigateToWhoFixesTheLeakInMyHomePage();
	}

}
