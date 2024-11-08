package com.nwl.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class EnforcedMoveOut_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithoutPage']") WebElement btnNo;
	@FindBy(xpath="//div[@class='enforced-move-out__step1 wp-spacing']/div[1]/h4") WebElement txtYourCurrentAddress;
	@FindBy(xpath="(//p[@class='lbl'])[1]") WebElement txtCongratulationsOnYourBigMove;
	@FindBy(xpath="//div[@class='form-btn form-row']/button") WebElement btnHowHasThisHappened;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtHowHasThisHappenedTooltip;
	@FindBy(xpath="(//div[@class='enforced-move-out__step1 wp-spacing'])/div[4]/div[1]/div[1]") WebElement txtAddressYouAreMovingFrom;
	@FindBy(xpath="(//div[@class='enforced-move-out__step1 wp-spacing'])/div[4]/div[2]") WebElement txtTheDateYouMovedOutLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnTheDateYouMovedOutInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtTheDateYouMovedOutInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnTheDateYouMovedOutInfoIconClose;
	@FindBy(id="enforced-move-out-date") WebElement txtTheDateYouMovedOut;
	@FindBy(xpath="//div[@class='normal']") WebElement txtSendYourPostTeaser;
	@FindBy(xpath="(//div[@class='form-btn'])[1]/button") WebElement btnWhyWeAsk;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtWhyWeAskTooltip;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnYourNewAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtYourNewAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnYourNewAddressInfoIconClose;
	@FindBy(id="data8-address-enforcedmoveout") WebElement txtYourNewAddress;
	@FindBy(xpath="//a[@class='nb-btn-link address-not-list-link']") WebElement linkMyAddressIsNotListed;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step']") WebElement btnNext;
	@FindBy(xpath="//div[@class='enforced-move-out__step2 wp-spacing']/div/h4") WebElement txtYourLastBillFromUs;
	@FindBy(xpath="//label[@class='detailChangedMsg']") WebElement txtYourLastBillFromUsTeaser1;
	@FindBy(xpath="(//strong[@class='confirmNumber'])[2]") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='detail-changed']/div[3]/label") WebElement txtYourLastBillFromUsTeaser2;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:0$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	
	String confirmationNo;

	public EnforcedMoveOut_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//EnforcedMoveOut_NotLoggedIn.properties");
	}

	public void navigateToYourCurrentAddressPage() throws Exception {
		btnNo.click();
		elementVisible(100, txtYourCurrentAddress);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourCurrentAddress);
		Assert.assertEquals(true, txtCongratulationsOnYourBigMove.getText().contains(c.getData("existingPropertyTeaser")));
		Assert.assertEquals(true, btnHowHasThisHappened.isDisplayed());
		btnHowHasThisHappened.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtHowHasThisHappenedTooltip.getText().contains(c.getData("howHasThisHappenedInformationText")));
		btnHowHasThisHappened.click();
		Assert.assertEquals(true, txtAddressYouAreMovingFrom.getText().contains(c.getData("leavingAddressLabel")));
		Assert.assertEquals(true, txtTheDateYouMovedOutLabel.getText().contains(c.getData("moveOutDateLabel")));
	}

	public void fillsTheDateYouMovedOutField(String moveOutDate) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtTheDateYouMovedOutLabel);
		btnTheDateYouMovedOutInfoIcon.click();
		elementVisible(100, txtTheDateYouMovedOutInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtTheDateYouMovedOutInfoIcon.getText().contains(c.getData("moveOutDateInformationText")));
		Thread.sleep(500);
		btnTheDateYouMovedOutInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtTheDateYouMovedOut.isDisplayed());
		txtTheDateYouMovedOut.clear();
		Thread.sleep(500);
		txtTheDateYouMovedOut.sendKeys(moveOutDate);
		Thread.sleep(500);
		txtTheDateYouMovedOutLabel.click();
		Assert.assertEquals(true, txtSendYourPostTeaser.getText().contains(c.getData("sendYourPostTeaser")));
		Assert.assertEquals(true, btnWhyWeAsk.isDisplayed());
		btnWhyWeAsk.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtWhyWeAskTooltip.getText().contains(c.getData("whyWeAskInformationText")));
		btnWhyWeAsk.click();
		Thread.sleep(500);
		btnYourNewAddressInfoIcon.click();
		elementVisible(100, txtYourNewAddressInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtYourNewAddressInfoIcon.getText().contains(c.getData("yourNewAddressInformationText")));
		Thread.sleep(500);
		btnYourNewAddressInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, linkMyAddressIsNotListed.isDisplayed());
		Assert.assertEquals(true, btnNext.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtTheDateYouMovedOutLabel);
	}

	public void redirectedToYourLastBillFromUsPage() throws Exception {
		btnNext.click();
		elementVisible(100, txtYourLastBillFromUs);
		Assert.assertEquals(true, txtYourLastBillFromUsTeaser1.getText().contains(c.getData("yourLastBillFromUsTeaser1")));
		confirmationNo=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtYourLastBillFromUsTeaser2.getText().contains(c.getData("yourLastBillFromUsTeaser2")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourLastBillFromUs);
	}

	public void verifiesMIMOProcessExists(String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBMenu);
		btnCCBMenu.click();
		elementVisible(100, btnCCBCustomerInformation);
		btnCCBCustomerInformation.click();
		elementVisible(100, btnCCBCustomerContact);
		btnCCBCustomerContact.click();
		elementVisible(100, btnCCBSearch);
		btnCCBSearch.click();
		Thread.sleep(3000);
		handleMultipleTabs(2);
		txtCCBCustomerContactID.sendKeys(confirmationNo);
		btnCCBSearch2.click();
		Thread.sleep(1000);
		handleMultipleTabs(1);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		elementVisible(100, tabCharacteristics);
		tabCharacteristics.click();
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		btnCCBMenuSymbol1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBProcessInfo);
		Thread.sleep(2000);	
	}

}
