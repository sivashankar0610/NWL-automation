package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.InYourArea_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_InYourArea extends BasePage {
	
	InYourArea_Loc iya;
	
	@When("User clicks on Your Local Area link from Ribbon and should navigate to Check my area tab")
	public void userClicksOnYourLocalAreaLinkAndShouldNavigateToCheckMyAreaTab() throws Exception {
		iya=new InYourArea_Loc(driver);
		iya.navigateToCheckMyAreaTab();
	}
	
	@Then("User enters required address and verify Water disruption section {string}")
	public void userEntersRequiredAddressAndVerifyWaterDisruptionSection(String address) throws Exception {
	    iya.userEntersRequiredAddress(address);
	}

	@And("User verify Leaks section")
	public void userVerifyLeaksSection() throws Exception {
	    iya.verifyLeaksSection();
	}

	@And("User verify Road works section")
	public void userVerifyRoadWorksSection() throws Exception {
		iya.verifyRoadWorksSection();
	}

	@And("User verify Water quality information")
	public void userVerifyWaterQualityInformation() {
		iya.verifyWaterQualityInformation();
	}
	
	@When("User clicks on Northumbrian Water link and should redirected to NWL home page")
	public void userClicksOnNorthumbrianWaterLinkAndShouldRedirectedToNWLHomePage() throws Exception {
		iya.navigateToNWLHomePage();
	}

}
