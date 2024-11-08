package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.MoveOut_Measured_LoggedIn_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_MoveOut_Measured_LoggedIn extends BasePage {
	
	MoveOut_Measured_LoggedIn_Loc mo;
	
	@And("Verify moving home section under Account dashboard")
	public void verifyMovingHomeSection() throws Exception {
		mo=new MoveOut_Measured_LoggedIn_Loc(driver);
		mo.verifyMovingHomeSection();
	}
	
	@When("User should redirected to Moving Home page after clicking on Moving Home section under AD tab")
	public void userShouldRedirectedToMovingHomePage() throws Exception {
	    mo.clicksOnMovingHomeSection();
	}
	
	@Then("User clicks on No button and should redirected to Your current address screen")
	public void userShouldRedirectedToYourCurrentAddressScreen() throws Exception {
	    mo.navigateToYourCurrentAddress();
	}
	
	@When("User enters Move out date {string},{string},{string} & {string}")
	public void userEnterMoveOutDate(String moveOutdate, String accNo, String url, String pwd) throws Exception {
		mo=new MoveOut_Measured_LoggedIn_Loc(driver);
	    mo.entersMovingOutDate(moveOutdate, accNo, url, pwd);
	}
	
	@Then("User clicks on Next button and should redirected to Your last bill from us page {string}")
	public void navigateToYourLastBillFromUsPage(String email) throws Exception {
	    mo.navigateToYourLastBillFromUs(email);
	}
	
	@And("User enters outside of supply area address in Enter address field {string}")
	public void userEntersOutsideOfSupplyArea(String outsideSupplyAreaAddress) throws Exception {
	    mo.userEntersOutsideOfSupplyArea(outsideSupplyAreaAddress);
	}
	
	@When("User clicks on Next button and should redirected to Ready page")
	public void navigateToReadyPage() throws Exception {
	    mo.navigateToReadyPage();
	}
	
	@Then("User clicks on Done button and should redirected to Confirmation page")
	public void navigateToConfirmationPage() throws Exception {
	    mo.navigateToConfirmationPage();
	}
	
	@And("Verify details under Show me the details section")
	public void verifyDetails_ShowMeDetailsSection() throws Exception {
	    mo.verifyDetailsShowMeDetailsSection();
	}
	
	@When("User verifies Move in Move Out process exists in CC&B")
	public void opensMoveInMoveOutProcessExistsInCCB() throws Exception {
	    mo.opensMoveInMoveOutProcessExistsInCCB();
	}

}
