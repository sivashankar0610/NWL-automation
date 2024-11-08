package com.nwl.steps;

import com.nwl.framework.BasePage;
import com.nwl.pages.Graph_Loc;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class BDD_Graph extends BasePage {
	
	Graph_Loc g;
	
	@Then("User should be in Daily Graph")
	public void userShouldBeInDailyGraph() throws Exception {
		g = new Graph_Loc(driver);
		g.userInDailyGraph();
	}

	@When("User clicks on toggle button & Daily Graph format should be changed")
	public void clicksOnToggleButton_DailyGraph() throws Exception {
		g.clicksOnToggle_Daily();
	}

	@Then("User clicks on Weekly button & should navigate to Weekly graph")
	public void clicksOnWeeklyButton() throws Exception {
	    g.clicksonWeeklyButton();
	}

	@When("User clicks on toggle button & Weekly Graph format should be changed")
	public void clicksOnToggleButton_WeeklyGraph() throws Exception {
	    g.clicksonToggleButton_Weekly();
	}

	@Then("User clicks on Monthly button & should navigate to Monthly graph")
	public void clicksOnMonthlyButton() throws Exception {
	    g.clicksonMonthlyButton();
	}

	@When("User clicks on toggle button & Monthly Graph format should be changed")
	public void clicksOnToggleButton_MonthlyGraph() throws Exception {
	    g.clicksonToggleButton_Monthly();
	}
	
	@Then("User clicks on Yearly button & should navigate to Yearly graph")
	public void clicksOnYearlyButton() throws Exception {
	    g.clicksOnYearlyButton();
	}
	
	@And("User clicks on toggle button & Yearly Graph format should be changed")
	public void clicksOnToggleButton_YearlyGraph() throws Exception {
	    g.clicksOnToggleButton_Yearly();
	}

}
