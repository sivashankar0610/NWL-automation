package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.ViewBills_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_ViewBills extends BasePage{
	
	ViewBills_Loc vib;
	
	@Then("User Verifies Your Bills and Payment History Section")
	public void User_Verifies_Your_Bills_And_Payment_History_Section() throws Exception {
	  vib = new ViewBills_Loc(driver); 
	  vib.userVerifiesYourBillsAndPaymentHistorySection();
	}
	
	@And("User Clicks on View Bill button and Bill PDF should be opened in a new tab")
	public void User_Clicks_On_ViewBill_Button_And_Bill_PDF_should_Be_Opened_In_A_Newtab() throws Exception {
	    vib.userShouldbeRedirectedToBillPage();
	}


}
