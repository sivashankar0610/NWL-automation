package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class Pollution_Loc extends BasePage {
	
	@FindBy(id="idpollution") WebElement btnPollution;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[1]") WebElement txtCallOurTeamLabel;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[2]/a") WebElement btnArrowPhoneNo;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[2]/a/span[1]") WebElement txtPhoneNo;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[3]/p") WebElement txtWeNeedToKnowAboutPILabel;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[4]/div[1]/p") WebElement txtWeNeedToKnowAboutPITeaser1;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[4]/div[2]/p") WebElement txtWeNeedToKnowAboutPITeaser2;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[4]/div[3]/p") WebElement txtWeNeedToKnowAboutPITeaser3;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[4]/div[4]/p") WebElement txtWeNeedToKnowAboutPITeaser4;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[6]") WebElement txtWhenWeAreResponsibleForPILabel;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[7]/div[1]/p") WebElement txtWhenWeAreResponsibleForPITeaser1;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[7]/div[2]/p") WebElement txtWhenWeAreResponsibleForPITeaser2;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[7]/div[3]/p") WebElement txtWhenWeAreResponsibleForPITeaser3;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[7]/div[4]/p") WebElement txtWhenWeAreResponsibleForPITeaser4;
	@FindBy(xpath="//div[@data-id='idpollution']/div[2]/div/div[7]/div[5]/p") WebElement txtWhenWeAreResponsibleForPITeaser5;

	public Pollution_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//Pollution.properties");
	}

	public void clicksOnPollutionButton() throws Exception {
		elementVisible(100, btnPollution);
		btnPollution.click();
		elementVisible(100, txtCallOurTeamLabel);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnPollution);
		Assert.assertEquals(true, txtCallOurTeamLabel.getText().contains(c.getData("callOurTeamLabel")));
		Assert.assertEquals(true, btnArrowPhoneNo.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.getText().contains(c.getData("phoneNumber")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnPollution);
	}

	public void verifiesWhatWeNeedToKnowAboutPIS() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWeNeedToKnowAboutPILabel);
		String[] aboutPILabel = txtWeNeedToKnowAboutPILabel.getText().split("\n");
		Assert.assertEquals(true, aboutPILabel[0].contains(c.getData("weNeedToKnowAboutPILabel1")));
		Assert.assertEquals(true, aboutPILabel[2].contains(c.getData("weNeedToKnowAboutPILabel2")));
		Assert.assertEquals(true, txtWeNeedToKnowAboutPITeaser1.getText().contains(c.getData("weNeedToKnowAboutPITeaser1")));
		Assert.assertEquals(true, txtWeNeedToKnowAboutPITeaser2.getText().contains(c.getData("weNeedToKnowAboutPITeaser2")));
		Assert.assertEquals(true, txtWeNeedToKnowAboutPITeaser3.getText().contains(c.getData("weNeedToKnowAboutPITeaser3")));
		Assert.assertEquals(true, txtWeNeedToKnowAboutPITeaser4.getText().contains(c.getData("weNeedToKnowAboutPITeaser4")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWeNeedToKnowAboutPILabel);
	}

	public void verifiesWhenWeAreResponsibleForPIS() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenWeAreResponsibleForPILabel);
		Assert.assertEquals(true, txtWhenWeAreResponsibleForPILabel.getText().contains(c.getData("whenWeAreResponsibleForPILabel")));
		Assert.assertEquals(true, txtWhenWeAreResponsibleForPITeaser1.getText().contains(c.getData("whenWeAreResponsibleForPITeaser1")));
		Assert.assertEquals(true, txtWhenWeAreResponsibleForPITeaser2.getText().contains(c.getData("whenWeAreResponsibleForPITeaser2")));
		Assert.assertEquals(true, txtWhenWeAreResponsibleForPITeaser3.getText().contains(c.getData("whenWeAreResponsibleForPITeaser3")));
		Assert.assertEquals(true, txtWhenWeAreResponsibleForPITeaser4.getText().contains(c.getData("whenWeAreResponsibleForPITeaser4")));
		Assert.assertEquals(true, txtWhenWeAreResponsibleForPITeaser5.getText().contains(c.getData("whenWeAreResponsibleForPITeaser5")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenWeAreResponsibleForPILabel);
	}

}
