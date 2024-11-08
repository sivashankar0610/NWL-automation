package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MoveOut_Unmeasured_NotLoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MoveOut_Unmeasured_NotLoggedIn extends BasePage {
	
	MoveOut_Unmeasured_NotLoggedIn_Loc mo;
	
	@When("User clicks on Moving home link and should redirected to Moving home landing page")
	public void redirectedToMovingHomeLandingPage() throws Exception {
	    mo=new MoveOut_Unmeasured_NotLoggedIn_Loc(driver);
	    mo.navigateToMovingHomePage();
	}
	
	@When("User clicks on I am currently a customer button")
	public void userClicksOnIAmCurrentlyCustomerButton() throws Exception {
	    mo.clickOnCurrentlyCustomer();
	}
	
	@Then("User clicks on No button and should redirected to Let's find your account page")
	public void navigateToLetsFindYourAccountPage() throws Exception {
		mo.navigateToLetsFindYourAccountPage();
	}
	
	@When("User clicks on Login button and should redirected to Moving home login page")
	public void navigateToMovingHomeLoginPage() throws Exception {
		mo=new MoveOut_Unmeasured_NotLoggedIn_Loc(driver);
		mo.redirectedToMovingHomePage();
	}
	
	@Then("User clicks on Login button and should redirected to Your current address page")
	public void navigateToYourCurrentAddressPage() throws Exception {
		mo=new MoveOut_Unmeasured_NotLoggedIn_Loc(driver);
	    mo.navigateToYourCurrentAddressScreen();
	}
	
	@When("User enters Move out date {string}")
	public void entersMODate(String moDate) throws Exception {
		mo=new MoveOut_Unmeasured_NotLoggedIn_Loc(driver);
	    mo.entersMODate(moDate);
	}
	
	@Then("User clicks on Next button and should navigate to Your last bill from us page")
	public void navigateToYourLastBillFromUsPage() throws Exception {
	    mo.navigateToYourLastBillFromUsPage();
	}
	
	@And("User enter outside of supply area address in Enter address field {string}")
	public void userEnterOutsideOfSupplyArea(String outsideSupplyAreaAddress) throws Exception {
	    mo.userEnterOutsideOfSupplyArea(outsideSupplyAreaAddress);
	}
	
	@When("User clicks on Next button and should be navigated to Ready page {string}")
	public void navigateToReadyPage(String email) throws Exception {
		mo.navigateToReadyPage(email);
	}
	
	@Then("User clicks on Done button and should navigate to Success screen")
	public void navigateToSuccessScreen() throws Exception {
	    mo.navigateToSuccessScreen();
	}
	
	@And("Verify details under Show me the details accordian {string}")
	public void verifyDetails_ShowMeDetailsSection(String accNo) throws Exception {
	    mo.verifyDetailsShowMeDetailsSection(accNo);
	}
	
	@When("User verify Move in Move Out process exists in CC&B {string} & {string}")
	public void verifyMoveInMoveOutProcessExistsInCCB(String username, String pwd) throws Exception {
	    mo.verifyMoveInMoveOutProcessExistsInCCB(username, pwd);
	}

}
