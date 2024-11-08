package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.AccountClosedMsg_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class BDD_AccountClosedMsg extends BasePage {
	
	AccountClosedMsg_Loc acm;
	
	@And("Verify account closed message under Account Dashboard tab")
	public void verifyAccountClosedMessageUnderAD() throws Exception {
		acm=new AccountClosedMsg_Loc(driver);
		acm.verifyAccountClosedMsg_AD();
	}

	@Then("Verify account closed message under My Usage tab")
	public void verifyAccountClosedMessageUnderMyUsage() throws Exception {
		acm=new AccountClosedMsg_Loc(driver);
		acm.verifyAccountClosedMsg_MyUsage();
	}

}
