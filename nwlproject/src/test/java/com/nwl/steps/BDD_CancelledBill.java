package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.CancelledBill_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_CancelledBill extends BasePage {
	
	CancelledBill_Loc cb;
	
	@Then("User scroll to Your Bills and Payment History section and clicks on Show More button")
	public void user_scroll_to_your_bills_and_payment_history_section_and_clicks_on_show_more_button() throws Exception {
	    cb=new CancelledBill_Loc(driver);
	    cb.clicksOnShowMoreButton();
	}
	
	@And("User verifies Cancelled text with date is displaying or not")
	public void user_verifies_cancelled_text_with_date_is_displaying_or_not() {
	    cb.verifiesCancelledBillTextWithDate();
	}

}
