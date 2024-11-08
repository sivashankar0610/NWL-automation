package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Transunion_ForMe_JointPensionCredit_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='form-row for-me-or-someone']/div/p") WebElement txtFirstSomeDetailsAboutYou;
	@FindBy(xpath="//div[@class='form-row for-me-or-someone']/div[2]/div[1]/button") WebElement btnForMe;
	@FindBy(xpath="//div[@class='form-row for-me-or-someone']/div[2]/div[2]/button") WebElement btnForSomeoneElse;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[10]") WebElement btnSingleOrJointPensionCreditInfoIcon;
    @FindBy(xpath="(//span[@class='tooltip-label'])[10]") WebElement txtSingleOrJointPensionCreditInfoIcon;
    @FindBy(xpath="(//a[@class='tooltip-close'])[10]") WebElement btnSingleOrJointPensionCreditInfoIconClose;
    @FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[3]") WebElement btnSingle;
    @FindBy(xpath="(//button[@class='nb-btn de-btn nb-btn-block nb-btn-outline'])[4]") WebElement btnJoint;
    @FindBy(id="for-me-joint-firstname") WebElement txtFirstName;
    @FindBy(id="for-me-joint-surname") WebElement txtSurname;
    @FindBy(id="for-me-joint-day") WebElement txtDOB_Day;
    @FindBy(id="for-me-joint-month") WebElement txtDOB_Month;
    @FindBy(id="for-me-joint-year") WebElement txtDOB_Year;

	public Transunion_ForMe_JointPensionCredit_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Transunion_ForMe_JointPensionCredit.properties");
	}

	public void selectsForMeAndJointPensionCreditButtons() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFirstSomeDetailsAboutYou);
		Assert.assertEquals(true, btnForMe.isDisplayed());
		Assert.assertEquals(true, btnForSomeoneElse.isDisplayed());
		btnForMe.click();
		Thread.sleep(1000);
		btnSingleOrJointPensionCreditInfoIcon.click();
		elementVisible(100, txtSingleOrJointPensionCreditInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtSingleOrJointPensionCreditInfoIcon.getText().contains(c.getData("singleOrJointPensionCreditInformationText")));
		Thread.sleep(500);
		btnSingleOrJointPensionCreditInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnSingle.isDisplayed());
		Assert.assertEquals(true, btnJoint.isDisplayed());
		btnJoint.click();
		Thread.sleep(500);
	}

	public void entersJointHolderDetails() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnSingleOrJointPensionCreditInfoIcon);
		Assert.assertEquals(true, txtFirstName.isDisplayed());
		txtFirstName.sendKeys("Test");
		Assert.assertEquals(true, txtSurname.isDisplayed());
		txtSurname.sendKeys("User");
		Assert.assertEquals(true, txtDOB_Day.isDisplayed());
		txtDOB_Day.sendKeys("01");
		Assert.assertEquals(true, txtDOB_Month.isDisplayed());
		txtDOB_Month.sendKeys("01");
		Assert.assertEquals(true, txtDOB_Year.isDisplayed());
		txtDOB_Year.sendKeys("2001");
		Thread.sleep(500);
	}

}
