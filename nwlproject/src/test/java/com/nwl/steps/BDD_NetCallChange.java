package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.NetCallChange_Loc;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_NetCallChange extends BasePage {
	
	NetCallChange_Loc ncc;
	
	@Then("User verifies change my monthly payment amount section")
	public void userVerifiesChangeMyMonthlyPaymentAmountSection() throws Exception {
		ncc=new NetCallChange_Loc(driver);
		ncc.verifyChangeMyMonthlyPaymentAmountSection();
	}	
	
	@When("User clicks on change my monthly payment amount button and should redirected to netcall page {string}")
	public void userClicksOnChangeMyMonthlyPaymentAmountButtonAndShouldRedirectedToNetcallPage(String accNo) throws Exception {
		ncc.navigateToNetcallPage(accNo);
	}
	
	@Then("User moves the slider to change the payment amount {string}")
	public void userMovesTheSliderToChangeThePaymentAmount(String email) throws Exception {
		ncc.userChangesPaymentAmountViaSlider(email);
	}
	
	@When("User clicks on Done button and should redirected to confirmation screen")
	public void userClicksOnDoneButtonAndShouldRedirectedToConfirmationScreen() throws Exception {
		ncc.navigateToConfirmationScreen();
	}
	

}
