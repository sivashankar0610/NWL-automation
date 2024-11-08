package com.nwl.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Login_ESWAccountOnNWL_Loc extends BasePage{

	@FindBy(id = "recaptcha-demo-submit") WebElement btnSubmit;
	@FindBy(xpath = "//div[@class='alert__content']/p/p") WebElement txtErrorMessage;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn__cta']") WebElement btnOK;
	
	public Login_ESWAccountOnNWL_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Login_ESWAccountOnNWL.properties");
	}

	public void errorMessagePopup() throws Exception {
		btnSubmit.click();
		elementVisible(100, btnOK);
		Assert.assertTrue(btnOK.isDisplayed());
		Assert.assertEquals(true, txtErrorMessage.getText().contains(c.getData("errorMessage")));
	}

}

