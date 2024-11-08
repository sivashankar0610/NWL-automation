package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Transunion_ForSomeoneElse_JointPensionCredit_Loc;
import io.cucumber.java.en.And;

public class BDD_Transunion_ForSomeoneElse_JointPensionCredit extends BasePage {
	
	Transunion_ForSomeoneElse_JointPensionCredit_Loc fse;
	
	@And("User selects Joint Pension Credit option and fills corresponding fields")
	public void user_selects_joint_pension_credit_option_and_fills_corresponding_fields() throws Exception {
		fse=new Transunion_ForSomeoneElse_JointPensionCredit_Loc(driver);
		fse.selectsJointPensionCreditOption();
	}

}
