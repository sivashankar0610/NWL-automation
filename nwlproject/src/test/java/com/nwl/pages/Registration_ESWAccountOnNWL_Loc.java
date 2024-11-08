package com.nwl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Registration_ESWAccountOnNWL_Loc extends BasePage{

	@FindBy(xpath = "(//button[@class=\"nb-btn nb-btn-block\"])[1]") WebElement btnNextPersonalDetails;
	@FindBy(xpath = "(//div[@class=\"alert__content\"]/p/p)[1]") WebElement txtErrorMessage1;
	@FindBy(xpath = "(//div[@class=\"alert__content\"]/p/p)[2]") WebElement txtErrorMessage2;
	@FindBy(xpath = "//button[@class=\"nb-btn nb-btn__cta btn-close\"]") WebElement btnOK;
	@FindBy(xpath = "(//input[@class=\"searchQuery\"])[2]") WebElement txtSearchQuery;
	
	public Registration_ESWAccountOnNWL_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test//resources//PropertyFiles//Registration_ESWAccountOnNWL.properties");
	}
	
	public void errorMessage() throws Exception {
		btnNextPersonalDetails.click();
		elementVisible(100, btnOK);
		Assert.assertEquals(true, txtErrorMessage1.getText().contains(c.getData("errorMessage1")));
		Assert.assertEquals(true, txtErrorMessage2.getText().contains(c.getData("errorMessage2")));
	}
	
	public void redirectsToHelpCentre() throws Exception {
		btnOK.click();
		elementVisible(100, txtSearchQuery);
		Assert.assertEquals(driver.getCurrentUrl(), c.getData("urlHelpCentre"));
	}
}

	