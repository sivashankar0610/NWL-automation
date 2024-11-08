package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MOUnmeasured_MIMeasured_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MOUnmeasured_MIMeasured_NotLoggedIn extends BasePage {
	
	MOUnmeasured_MIMeasured_NotLoggedIn_Loc momi;
	
	@Then("User clicks on Yes button and should redirected to Let's find your account page")
	public void shouldRedirectedToLetsFindYourAccountPage() throws Exception {
		momi=new MOUnmeasured_MIMeasured_NotLoggedIn_Loc(driver);
		momi.navigateToLetsFindYourAccountPage();
	}
	
	@Then("User clicks on Login button and should navigate to Your current address page")
	public void shouldNavigateToYourCurrentAddressPage() throws Exception {
		momi=new MOUnmeasured_MIMeasured_NotLoggedIn_Loc(driver);
		momi.navigateToYourCurrentAddressPage();
	}
	
	@When("User enter Move out date {string}")
	public void userEnterMoveOutDate(String moDate) throws Exception {
		momi=new MOUnmeasured_MIMeasured_NotLoggedIn_Loc(driver);
	    momi.enterMODate(moDate);
	}
	
	@Then("User clicks on Next button and should navigate to Your new home page {string}")
	public void navigateToYourNewHomePage(String moveInDate) throws Exception {
	    momi.navigateToYourNewHomePage(moveInDate);
	}
	
	@And("User enters measured premise address {string}")
	public void userEnterMIAddress(String miAddress) throws Exception {
	    momi.enterMIAddress(miAddress);
	}
	
	@When("User clicks on Next button and should navigate to Your bills page {string},{string} & {string}")
	public void navigateToYourBillsPage(String miAccNo, String username, String pwd) throws Exception {
	    momi.navigateToYourBillsPage(miAccNo, username, pwd);
	}
	
	@And("User clicks on Next button and should redirected to Ready page {string}")
	public void navigateToReadyPage(String email) throws Exception {
		momi.navigateToReadyPage(email);
	}
	
	@Then("User clicks on Done button and should redirected to Success screen")
	public void navigateToConfirmationPage() throws Exception {
	    momi.navigateToConfirmationScreen();
	}
	
	@And("Verify details under Show me the details accordian")
	public void verifyDetails_ShowMeDetailsSection() throws Exception {
	    momi.clickOnShowMeDetails();
	}
	
	@When("User open MO process exists in CC&B")
	public void opensMOProcessExistsInCCB() throws Exception {
	    momi.moProcessInCCB();
	}
	
	@And("User open MI process exists in CC&B")
	public void opensMIProcessExistsInCCB() throws Exception {
	    momi.miProcessInCCB();
	}

}
