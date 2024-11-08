package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Sewerage_Loc;
import io.cucumber.java.en.And;

public class BDD_Sewerage extends BasePage {
	
	Sewerage_Loc s;
	
	@And("User clicks on Sewerage button")
	public void user_clicks_on_sewerage_button() throws Exception {
	    s=new Sewerage_Loc(driver);
	    s.clicksOnSewerageButton();
	}

}
