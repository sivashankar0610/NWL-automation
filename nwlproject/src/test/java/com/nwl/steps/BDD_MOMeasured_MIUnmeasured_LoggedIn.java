package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MOMeasured_MIUnmeasured_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MOMeasured_MIUnmeasured_LoggedIn extends BasePage {
	
	MOMeasured_MIUnmeasured_LoggedIn_Loc momi;
	
	@Then("User clicks on Yes button and should redirected to Your current address screen")
	public void userShouldRedirectedToYourCurrentAddressScreen() throws Exception {
	    momi=new MOMeasured_MIUnmeasured_LoggedIn_Loc(driver);
	    momi.navigateToYourCurrentAddress();
	}
	
	@When("User enter Move out date {string},{string},{string} & {string}")
	public void userEnterMoveOutDate(String moveOutdate, String accNo, String username, String pwd) throws Exception {
	    momi.enterMovingOutDate(moveOutdate, accNo, username, pwd);
	}

	@Then("User clicks on Next button and should redirected to Your new home page {string}")
	public void navigateToYourNewHomePage(String moveInDate) throws Exception {
	    momi.navigateToYourNewHomePage(moveInDate);
	}
	
	@And("User enters unmeasured premise address {string}")
	public void userEntersMIAddress(String miAddress) throws Exception {
	    momi.enterMIAddress(miAddress);
	}
	
	@When("User clicks on Next button and should redirected to Your bills page")
	public void navigateToYourBillsPage() throws Exception {
	    momi.navigateToYourBillsPage();
	}
	
	@And("User clicks on Next button and should navigate to Ready page {string}")
	public void navigateToReadyPage(String email) throws Exception {
		momi.navigateToReadyPage(email);
	}
	
	@Then("User clicks on Done button and should navigate to Confirmation page")
	public void navigateToConfirmationPage() throws Exception {
	    momi.navigateToConfirmationScreen();
	}
	
	@And("Verify details under Show me details section")
	public void verifyDetails_ShowMeDetailsSection() throws Exception {
	    momi.clickOnShowMeDetails();
	}
	
	@When("User opens MO process exists in CC&B")
	public void opensMOProcessExistsInCCB() throws Exception {
	    momi.moProcessInCCB();
	}
	
	@And("User opens MI process exists in CC&B")
	public void opensMIProcessExistsInCCB() throws Exception {
	    momi.miProcessInCCB();
	}

}
