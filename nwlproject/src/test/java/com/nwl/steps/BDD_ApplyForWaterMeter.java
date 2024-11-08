package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ApplyForWaterMeter_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_ApplyForWaterMeter extends BasePage {
	
	ApplyForWaterMeter_Loc apm;
	
	@Then("User clicks on Apply for a water meter button")
	public void userClicksOnApplyForWaterMeterButton() throws Exception {
		apm=new ApplyForWaterMeter_Loc(driver);
		apm.clicksOnApplyForWaterMeterButton();
	}
	
	@When("User provides number of occupiers and clicks on Why do we ask this? button {string}")
	public void userProvidedNumberOfOccupiersAndClicksOnWhyDoWeAskThisButton(String occupancy) throws Exception {
		apm.clicksOnWhyDoWeAskThisButton(occupancy);
	}
	
	@Then("User selects no for Do you know where your external stop tap is?")
	public void userSelectsNoForDoYouKnowWhereYourExternalStopTapIs() throws Exception {
	    apm.selectsNoForExternalStopTap();
	}
	
	@And("User selects yes for Do you know where your external stop tap is?")
	public void userSelectsYesForDoYouKnowWhereYourExternalStopTapIs() {
		apm.selectsYesForExternalStopTap();
	}
	
	@When("User selects no for Do you live in a flat?")
	public void userSelectsNoForDoYouLiveInAFlat() throws Exception {
	    apm.selectsNoForDoYouLiveInAFlat();
	}
	
	@Then("User selects no for Do you rent your home?")
	public void userSelectsNoForDoYouRentYourHome() throws Exception {
	    apm.selectsNoForDoYouRentYourHome();
	}
	
	@When("User clicks on Terms and conditions link")
	public void userClicksOnTermsAndConditionsLink() throws Exception {
	    apm.userClicksOnTermsAndConditionsLink();
	}
	
	@Then("User clicks on submit my application button and should redirected to confirmation screen")
	public void userClicksOnSubmitMyApplicationButtonAndShouldRedirectedToConfirmationScreen() throws Exception {
	    apm.navigateToConfirmationScreen();
	}  
	
	@When("User clicks on Go back to my account button and should redirected to account dashboard tab")
	public void userClicksOnGoBackToMyAccountButtonAndShouldRedirectedToAccountDashboardTab() throws Exception {
	    apm.navigateToAccountDashboardTab();
	}
	
	@Then("User verifies Your recent activity section under account dashboard tab")
	public void userVerifiesYourRecentActivitySectionUnderAccountDashboardTab() throws Exception {
	    apm.userVerifiesYourRecentActivitySection();
	}
	
	@When("User verifies customer contact main tab in CC&B {string} & {string}")
	public void userVerifiesCustomerContactMainTabInCCB(String username, String pwd) throws Exception {
	    apm.userVerifiesCustomerContactMainTabInCCB(username, pwd);
	}
	
	@Then("User verifies Business process section in CC&B")
	public void userVerifiesBusinessProcessSectionInCCB() throws Exception {
	    apm.userVerifiesBusinessProcessSectionInCCB();
	}
	
	@And("User verifies Process activity history in CC&B")
	public void userVerifiesProcessActivityHistoryInCCB() throws Exception {
	    apm.userVerifiesProcessActivityHistoryInCCB();
	}
	
	@And("User verifies Activity History section in CC&B")
	public void userVerifiesActivityHistoryInCCB() throws Exception {
		apm.userVerifiesActivityHistoryInCCB();
	}

}
