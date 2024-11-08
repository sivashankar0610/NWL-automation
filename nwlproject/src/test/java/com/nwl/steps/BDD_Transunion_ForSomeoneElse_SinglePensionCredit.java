package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Transunion_ForSomeoneElse_SinglePensionCredit_Loc;
import io.cucumber.java.en.And;

public class BDD_Transunion_ForSomeoneElse_SinglePensionCredit extends BasePage {
	
	Transunion_ForSomeoneElse_SinglePensionCredit_Loc fse;
	
	@And("User selects For someone else button and fills corresponding fields")
	public void user_selects_for_someone_else_button_and_fills_corresponding_fields() throws Exception {
	    fse=new Transunion_ForSomeoneElse_SinglePensionCredit_Loc(driver);
	    fse.selectsForSomeoneElseOption();
	}
	
	@And("User selects Single Pension Credit option")
	public void user_selects_single_pension_credit_option() throws Exception {
	    fse.selectsSinglePensionCreditOption();
	}

}
