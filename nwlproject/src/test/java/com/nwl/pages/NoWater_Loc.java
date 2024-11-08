package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class NoWater_Loc extends BasePage {
	
	@FindBy(id="idnowater") WebElement btnNoWater;
	@FindBy(xpath="//div[@data-id='idnowater']/div[2]/div/div[1]/div/p") WebElement txtHaveYouChecked;
	@FindBy(xpath="//div[@data-id='idnowater']/div[2]/div/div[1]/div/p/a") WebElement linkYourLocalArea;
	@FindBy(xpath="//div[@data-id='idnowater']/div[2]/div/div[2]/div[1]") WebElement txtAnyWaterComingOutOfYourTap;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline waterComeOut-no-btn']") WebElement btnNoIHaveWater;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline waterComeOut-trickle-btn']") WebElement btnYesTrickleWater;
    @FindBy(xpath="//div[@data-id='idnowater']/div[2]/div/div[3]/div/div/p") WebElement txtTrickleOfWaterTeaser;
    @FindBy(xpath="//div[@data-id='idnowater']/div[2]/div/div[4]/div[1]/div[1]") WebElement txtColdWaterSupplyLabel;
    @FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnColdWaterSupplyInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtColdWaterSupplyInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnColdWaterSupplyInfoIconClose;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline waterTap-yes-btn']") WebElement btnYes_CWS;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline waterTap-no-btn']") WebElement btnNo_CWS;
	@FindBy(xpath="//div[@class='form-row waterTap-no-content']/p[1]") WebElement txtNo_CWSTeaser1;
	@FindBy(xpath="//div[@class='form-row waterTap-no-content']/p[1]/strong/a") WebElement linkWaterSafe;
	@FindBy(xpath="//div[@class='form-row waterTap-no-content']/p[2]") WebElement txtNo_CWSTeaser2;
	@FindBy(xpath="//div[@class='form-row waterTap-yes-content']/div[1]/div[1]") WebElement txtYourStopTapLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[6]") WebElement btnYourStopTapInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[6]") WebElement txtYourStopTapInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[6]") WebElement btnYourStopTapInfoIconClose;
	@FindBy(xpath="//div[@class='form-row waterTap-yes-content']/div[1]/div[2]") WebElement txtYourStopTapTeaser;
	@FindBy(xpath="//div[@class='form-row waterTap-yes-content__options']/div[1]") WebElement txtFixTheProblemLabel;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline resolvedProblem-yes-btn']") WebElement btnYes_FTP;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline resolvedProblem-no-btn']") WebElement btnNo_FTP;
	@FindBy(xpath="//div[@class='form-row resolvedProblem-yes-content']/div/div/p") WebElement txtGreatNews;
	@FindBy(xpath="//div[@class='form-row resolvedProblem-no-content']/p") WebElement txtFixTheProblemTeaser_No;
	@FindBy(xpath="//div[@class='form-row resolvedProblem-no-content']/div[1]") WebElement txtCallUsLabel;
	@FindBy(xpath="//div[@class='form-row resolvedProblem-no-content']/div[2]/a") WebElement btnArrowPhoneNo;
	@FindBy(xpath="//div[@class='form-row resolvedProblem-no-content']/div[2]/a/span[1]") WebElement txtPhoneNo;
	
	public NoWater_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//NoWater.properties");
	}

	public void userClicksOnNoWaterButton() throws Exception {
		elementVisible(100, btnNoWater);
		btnNoWater.click();
		elementVisible(100, txtHaveYouChecked);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHaveYouChecked);
		Assert.assertEquals(true, txtHaveYouChecked.getText().contains(c.getData("haveYouCheckedText")));
		Assert.assertEquals(true, linkYourLocalArea.isDisplayed());
		Assert.assertEquals(true, txtAnyWaterComingOutOfYourTap.getText().contains(c.getData("waterComingOutOfTapText")));
		Assert.assertEquals(true, btnNoIHaveWater.isDisplayed());
		Assert.assertEquals(true, btnYesTrickleWater.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnNoWater);
	}

	public void clicksOnYesTrickleOfWaterButton() throws Exception {
		btnYesTrickleWater.click();
		elementVisible(100, txtTrickleOfWaterTeaser);
		Assert.assertEquals(true, txtTrickleOfWaterTeaser.getText().contains(c.getData("trickleOfWaterTeaser")));
		Thread.sleep(1000);
	}

	public void clicksOnNoIHaveNoWaterButton() throws Exception {
		btnNoIHaveWater.click();
		elementVisible(100, txtColdWaterSupplyLabel);
		Assert.assertEquals(true, txtColdWaterSupplyLabel.getText().contains(c.getData("coldWaterSupplyLabel")));
		btnColdWaterSupplyInfoIcon.click();
		elementVisible(100, txtColdWaterSupplyInfoIcon);
		Assert.assertEquals(true, txtColdWaterSupplyInfoIcon.getText().contains(c.getData("coldWaterSupplyInformationText")));
		Thread.sleep(500);
		btnColdWaterSupplyInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnYes_CWS.isDisplayed());
		Assert.assertEquals(true, btnNo_CWS.isDisplayed());
	}

	public void clicksOnNoButton_CWS() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtColdWaterSupplyLabel);
		btnNo_CWS.click();
		elementVisible(100, txtNo_CWSTeaser1);
		Assert.assertEquals(true, txtNo_CWSTeaser1.getText().contains(c.getData("CWS_NoTeaser1")));
		Assert.assertEquals(true, linkWaterSafe.isDisplayed());
		Assert.assertEquals(true, txtNo_CWSTeaser2.getText().contains(c.getData("CWS_NoTeaser2")));
	}

	public void clicksOnYesButton_CWS() throws Exception {
		btnYes_CWS.click();
		elementVisible(100, txtYourStopTapLabel);
		Assert.assertEquals(true, txtYourStopTapLabel.getText().contains(c.getData("yourStopTapLabel")));
		btnYourStopTapInfoIcon.click();
		elementVisible(100, txtYourStopTapInfoIcon);
		Assert.assertEquals(true, txtYourStopTapInfoIcon.getText().contains(c.getData("yourStopTapInformationText")));
		Thread.sleep(500);
		btnYourStopTapInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtYourStopTapTeaser.getText().contains(c.getData("yourStopTapTeaser")));
		Assert.assertEquals(true, txtFixTheProblemLabel.getText().contains(c.getData("fixTheProblemLabel")));
		Assert.assertEquals(true, btnYes_FTP.isDisplayed());
		Assert.assertEquals(true, btnNo_FTP.isDisplayed());
	}

	public void clicksOnYesButton_FTP() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFixTheProblemLabel);
		btnYes_FTP.click();
		elementVisible(100, txtGreatNews);
		Assert.assertEquals(true, txtGreatNews.getText().contains(c.getData("fixTheProblemTeaser_Yes")));
	}

	public void clicksOnNoButton_FTP() throws Exception {
		btnNo_FTP.click();
		elementVisible(100, txtFixTheProblemTeaser_No);
		Thread.sleep(1000);
		String[] teaser = txtFixTheProblemTeaser_No.getText().split("\n");
		Assert.assertEquals(true, teaser[0].contains(c.getData("fixTheProblemTeaser1_No")));
		Assert.assertEquals(true, teaser[2].contains(c.getData("fixTheProblemTeaser2_No")));
		Assert.assertEquals(true, teaser[4].contains(c.getData("fixTheProblemTeaser3_No")));
		Assert.assertEquals(true, txtCallUsLabel.getText().contains(c.getData("callUsLabel")));
		Assert.assertEquals(true, btnArrowPhoneNo.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.getText().contains(c.getData("phoneNumber")));
	}

}
