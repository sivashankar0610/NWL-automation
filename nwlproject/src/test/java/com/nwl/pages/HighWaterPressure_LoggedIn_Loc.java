package com.nwl.pages;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class HighWaterPressure_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-report-content wp-water-pressure']/div/div[2]/div[1]") WebElement txtLowOrHighWaterPressureLabel;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline high']") WebElement btnHighPressure;
	@FindBy(xpath="//div[@class='form-row row-issue-affecting water-pressure-high']/div[1]") WebElement txtAffectingCWSLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[7]") WebElement btnAffectingCWSInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[7]") WebElement txtAffectingCWSInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[7]") WebElement btnAffectingCWSInfoIconClose;
	@FindBy(xpath="//div[@class='form-row row-issue-affecting water-pressure-high']/div[2]/div[1]/button") WebElement btnYes_CWS;
	@FindBy(xpath="//div[@class='form-row row-issue-affecting water-pressure-high']/div[2]/div[2]/button") WebElement btnNo_CWS;
	@FindBy(xpath="//div[@class='form-row row-high-issus-no']/p[1]") WebElement txtAffectingCWSTeaser1_No;
	@FindBy(xpath="//div[@class='form-row row-high-issus-no']/p[2]") WebElement txtAffectingCWSTeaser2_No;
	@FindBy(xpath="//div[@class='form-row row-high-issus-no']/p[2]/strong/a") WebElement linkWaterSafe1;
	@FindBy(xpath="//div[@class='form-row row-problem']/div[1]") WebElement txtWhenDidTheProblemStartLabel;
	@FindBy(xpath="//input[@name='wp-problem-start']") List<WebElement> radioProblemStartOptions;
	@FindBy(xpath="//div[@class='form-row row-describe-issus textarea-validation']/div[1]") WebElement txtDescribeTheIssueLabel;
	@FindBy(id="contactus-additional-details-limit200") WebElement txtDescribeTheIssue;
	@FindBy(xpath="//div[@class='form-row row-neighbours']/div[1]") WebElement txtNeighboursAffectedLabel;
	@FindBy(xpath="//div[@class='form-row row-neighbours']/div[2]/div[1]/button") WebElement btnYes_NeighboursAffected;
	@FindBy(xpath="//div[@class='form-row row-neighbours']/div[2]/div[2]/button") WebElement btnNo_NeighboursAffected;
	@FindBy(xpath="//div[@class='neighbours-teaser no']/p[1]") WebElement txtNeighboursAffectedTeaser1_No;
	@FindBy(xpath="//div[@class='neighbours-teaser no']/p[2]") WebElement txtNeighboursAffectedTeaser2_No;
	@FindBy(xpath="//div[@class='neighbours-teaser no']/p[2]/strong/a") WebElement linkWaterSafe2;
	@FindBy(xpath="//div[@class='neighbours-teaser yes']") WebElement txtNeighboursAffectedTeaser_Yes;
	@FindBy(xpath="//div[@class='form-row row-plumbing']/div[1]") WebElement txtPlumbingWorkLabel;
	@FindBy(xpath="//div[@class='form-row row-plumbing']/div[2]/div[1]/button") WebElement btnYes_PlumbingWork;
	@FindBy(xpath="//div[@class='form-row row-plumbing']/div[2]/div[2]/button") WebElement btnNo_PlumbingWork;
	@FindBy(xpath="//div[@class='plumbing-teaser no']/p[1]") WebElement txtPlumbingWorkTeaser1_No;
	@FindBy(xpath="//div[@class='plumbing-teaser no']/p[2]") WebElement txtPlumbingWorkTeaser2_No;
	@FindBy(xpath="//div[@class='plumbing-teaser no']/p[2]/strong/a") WebElement linkWaterSafe3;
	@FindBy(xpath="//div[@class='plumbing-teaser yes']") WebElement txtPlumbingWorkTeaser_Yes;

	public HighWaterPressure_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//HighWaterPressure.properties");
	}

	public void clicksOnHighWaterPressure() throws Exception {
		btnHighPressure.click();
		elementVisible(100, txtAffectingCWSLabel);
		Assert.assertEquals(true, txtAffectingCWSLabel.getText().contains(c.getData("affectingCWSLabel")));
		btnAffectingCWSInfoIcon.click();
		elementVisible(100, txtAffectingCWSInfoIcon);
		Assert.assertEquals(true, txtAffectingCWSInfoIcon.getText().contains(c.getData("affectingCWSInformationText")));
		Thread.sleep(500);
		btnAffectingCWSInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnYes_CWS.isDisplayed());
		Assert.assertEquals(true, btnNo_CWS.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtLowOrHighWaterPressureLabel);
	}

	public void clickOnNoButton_AffectingCWS() throws Exception {
		btnNo_CWS.click();
		elementVisible(100, txtAffectingCWSTeaser1_No);
		Assert.assertEquals(true, txtAffectingCWSTeaser1_No.getText().contains(c.getData("affectingCWSTeaser1_No")));
		Assert.assertEquals(true, txtAffectingCWSTeaser2_No.getText().contains(c.getData("affectingCWSTeaser2_No")));
		Assert.assertEquals(true, linkWaterSafe1.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAffectingCWSLabel);
	}

	public void clickOnYesButton_AffectingCWS() throws Exception {
		btnYes_CWS.click();
		elementVisible(100, txtWhenDidTheProblemStartLabel);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtWhenDidTheProblemStartLabel.getText().contains(c.getData("problemStartLabel")));
	}

	public void selectsAnOptionForWhenTheProblemStarted(String psName) throws Exception {
		for (WebElement radioProblemStartOption : radioProblemStartOptions) {
			if (radioProblemStartOption.getAttribute("title").equalsIgnoreCase(psName)) {
				radioProblemStartOption.findElement(By.xpath("./following-sibling::span[1]")).click();
				Thread.sleep(1000);
				break;
			}
		}
	}

	public void entersTextInTheDescribeTheIssueTextBox() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDescribeTheIssueLabel);
		Assert.assertEquals(true, txtDescribeTheIssueLabel.getText().contains(c.getData("describeIssueLabel")));
		txtDescribeTheIssue.sendKeys(c.getData("describeIssue"));
	}

	public void clicksOnNoButton_NeighboursAffected() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNeighboursAffectedLabel);
		Assert.assertEquals(true, txtNeighboursAffectedLabel.getText().contains(c.getData("neighboursAffectedLabel")));
		Assert.assertEquals(true, btnYes_NeighboursAffected.isDisplayed());
		Assert.assertEquals(true, btnNo_NeighboursAffected.isDisplayed());
		btnNo_NeighboursAffected.click();
		elementVisible(100, txtNeighboursAffectedTeaser1_No);
		Assert.assertEquals(true, txtNeighboursAffectedTeaser1_No.getText().contains(c.getData("neighboursAffectedTeaser1_No")));
		Assert.assertEquals(true, txtNeighboursAffectedTeaser2_No.getText().contains(c.getData("neighboursAffectedTeaser2_No")));
		Assert.assertEquals(true, linkWaterSafe2.isDisplayed());	
	}

	public void clicksOnYesButton_NeighboursAffected() throws Exception {
		btnYes_NeighboursAffected.click();
		elementVisible(100, txtNeighboursAffectedTeaser_Yes);
		Assert.assertEquals(true, txtNeighboursAffectedTeaser_Yes.getText().contains(c.getData("neighboursAffectedTeaser_Yes")));
	}

	public void clicksOnNoButton_PlumbingWorkInYourHome() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtPlumbingWorkLabel);
		Assert.assertEquals(true, txtPlumbingWorkLabel.getText().contains(c.getData("plumbingWorkLabel")));
		Assert.assertEquals(true, btnYes_PlumbingWork.isDisplayed());
		Assert.assertEquals(true, btnNo_PlumbingWork.isDisplayed());
		btnNo_PlumbingWork.click();
		elementVisible(100, txtPlumbingWorkTeaser1_No);
		Assert.assertEquals(true, txtPlumbingWorkTeaser1_No.getText().contains(c.getData("plumbingWorkTeaser1_No")));
		Assert.assertEquals(true, txtPlumbingWorkTeaser2_No.getText().contains(c.getData("plumbingWorkTeaser2_No")));
		Assert.assertEquals(true, linkWaterSafe3.isDisplayed());	
	}

	public void clicksOnYesButton_PlumbingWorkInYourHome() throws Exception {
		btnYes_PlumbingWork.click();
		elementVisible(100, txtPlumbingWorkTeaser_Yes);
		Assert.assertEquals(true, txtPlumbingWorkTeaser_Yes.getText().contains(c.getData("plumbingWorkTeaser_Yes")));
	}

}