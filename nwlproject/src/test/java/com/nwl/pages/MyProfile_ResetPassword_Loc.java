package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class MyProfile_ResetPassword_Loc extends BasePage {
    
	@FindBy(xpath="//li[@rel='profile']") WebElement tabMyProfile;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changedetail-btn model']") WebElement btnUpdateMyDetails;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block changepassword-btn']") WebElement btnChangeMyPassword;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block updatemarketing-btn  box-hidden']") WebElement btnUpdateMarketingPreferences;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block add-remove-name-btn']") WebElement btnAddOrRemoveName;
	@FindBy(id="profile-oldpassword") WebElement txtOldPassword;
	@FindBy(xpath="//input[@id='profile-oldpassword']/following-sibling::a") WebElement linkShowPassword1;
	@FindBy(id="profile-newpassword") WebElement txtNewPassword;
	@FindBy(xpath="//input[@id='profile-newpassword']/following-sibling::a") WebElement linkShowPassword2;
	@FindBy(id="profile-confirmpassword") WebElement txtConfirmPassword;
	@FindBy(xpath="//input[@id='profile-confirmpassword']/following-sibling::a") WebElement linkShowPassword3;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block save-btn'])[1]") WebElement btnSaveChanges;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-outline nb-btn-block cancel-btn'])[1]") WebElement btnCancel;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn__cta'])[1]") WebElement btnOk;
	@FindBy(xpath="(//div[@class='alert__content'])[2]/p") WebElement txtSuccessMsgTeaser;
	
	public MyProfile_ResetPassword_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MyProfile_ResetPassword.properties");
	}

	public void redirectedToMyProfileTab() throws Exception {
		elementVisible(100, tabMyProfile);
		Thread.sleep(5000);
		tabMyProfile.click();
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tabMyProfile);
		Assert.assertEquals(true, btnUpdateMyDetails.isDisplayed());
		Assert.assertEquals(true, btnChangeMyPassword.isDisplayed());
		Assert.assertEquals(true, btnUpdateMarketingPreferences.isDisplayed());
		Assert.assertEquals(true, btnAddOrRemoveName.isDisplayed());
	}

	public void redirectedToResetPasswordScreen() throws Exception {
		btnChangeMyPassword.click();
		Thread.sleep(2000);
		Assert.assertEquals(true, txtOldPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword1.isDisplayed());
		Assert.assertEquals(true, txtNewPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword2.isDisplayed());
		Assert.assertEquals(true, txtConfirmPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword3.isDisplayed());
		Assert.assertEquals(true, !btnSaveChanges.isEnabled());
		Assert.assertEquals(true, btnCancel.isDisplayed());
	}

	public void navigateToMyProfileTab() throws Exception {
		btnCancel.click();
		elementVisible(100, btnUpdateMyDetails);
		Thread.sleep(1000);
	}

	public void entersPasswords(String oldPwd, String newPwd) throws Exception {
		txtOldPassword.sendKeys(oldPwd);
		linkShowPassword1.click();
		Thread.sleep(500);
		txtNewPassword.sendKeys(newPwd);
		linkShowPassword2.click();
		Thread.sleep(500);
		txtConfirmPassword.sendKeys(newPwd);
		linkShowPassword3.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSaveChanges.isEnabled());
	}

	public void displaySuccessMsgPopup() throws Exception {
		btnSaveChanges.click();
		elementVisible(100, btnOk);
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, btnOk.isDisplayed());
	}

	public void redirectToMyProfileTab() throws Exception {
	    btnOk.click();
	    elementVisible(100, btnUpdateMyDetails);
	    Thread.sleep(1000);
	}

}
