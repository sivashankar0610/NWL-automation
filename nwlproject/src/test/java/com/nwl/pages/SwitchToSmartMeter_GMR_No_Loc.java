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

public class SwitchToSmartMeter_GMR_No_Loc extends BasePage {
	
	@FindBy(xpath="//li[@rel='home']") WebElement txtMyUsage;
	@FindBy(xpath="//div[@class='wp-usage-box bgblue-dark text-center ']") WebElement sectionSwitchToMeteredBills;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-white switch-smart-meter-btn']") WebElement btnSwitchToMeteredBills;
    @FindBy(xpath="//div[@class='meter__step1 wp-spacing']/div/h4") WebElement txtSwitchToMeteredBills1;
    @FindBy(xpath="//div[@class='meter__step1 wp-spacing']/div/p") WebElement txtSwitchToMeteredBillsTeaser1;
    
    @FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id = "ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch1;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id = "personId") WebElement txtCCBFullName;
	
	@FindBy(xpath="//input[@class='form-control firstname']/following-sibling::span[1]") WebElement txtYourFirstName;
	@FindBy(xpath="//input[@class='form-control surname']/following-sibling::span[1]") WebElement txtYourSurName;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[1]") WebElement btnYourAccNumberInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[1]") WebElement txtYourAccNumberInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[1]") WebElement btnYourAccNumberInfoIconClose;
	@FindBy(xpath="//input[@id='NWLNo']/following-sibling::span[1]") WebElement txtYourAccNumber;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[2]") WebElement btnYourEmailAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[2]") WebElement txtYourEmailAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[2]") WebElement btnYourEmailAddressInfoIconClose;
	@FindBy(xpath="//input[@class='form-control email no-required']/following-sibling::span[1]") WebElement txtYourEmailAddress;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step1 step1-confirm']") WebElement btnNext;
	@FindBy(xpath="//div[@class='form-row meter__step2 wp-spacing']/h4") WebElement txtSwitchToMeteredBills2;
	@FindBy(xpath="//div[@class='form-row meter__step2 wp-spacing']/div/p") WebElement txtSwitchToMeteredBillsTeaser2;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[3]") WebElement btnYourAddressInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[3]") WebElement txtYourAddressInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[3]") WebElement btnYourAddressInfoIconClose;
	
	@FindBy(xpath="(//a[@class='tooltip-btn'])[4]") WebElement btnSerialNumberInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[4]") WebElement txtSerialNumberInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[4]") WebElement btnSerialNumberInfoIconClose;
	
	@FindBy(xpath="(//div[@class='sub-title'])[3]") WebElement LabelGiveAMeterReading;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[5]") WebElement btnGiveMeterReadingInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[5]") WebElement txtGiveMeterReadingInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[5]") WebElement btnGiveMeterReadingInfoIconClose;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline meterYes']") WebElement btnYes;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline meterNo']") WebElement btnNo;
	@FindBy(xpath="//div[@class='enter-meter-read']/div[1]") WebElement fieldGiveAMeterReading;
	
	@FindBy(xpath="(//a[@class='tooltip-btn'])[6]") WebElement btnOccupancyInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[6]") WebElement txtOccupancyInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[6]") WebElement btnOccupancyInfoIconClose;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement dropdownOccupancy;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span") List<WebElement> dropdownOccupancyOptions;
	@FindBy(xpath="//span[@class='checkbox-label']/p") WebElement txtIAgreeToTermsAndConditions;
	@FindBy(xpath="//span[@class='checkbox-label']/p/strong/a") WebElement linkTermsAndConditions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block meter-confirm']") WebElement btnDone;
	@FindBy(xpath="//div[@class='meter__step3 confirm wp-spacing']/div/h4") WebElement  txtWeHaveGotYourRequestToSwitch;
	@FindBy(xpath="//p[@class='confimation-no']/b") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='meter__step3 confirm wp-spacing']/div[2]/p[2]") WebElement txtSuccessMsgTeaser;
	@FindBy(xpath="//div[@class='meter__step3 confirm wp-spacing']/div[2]/p[2]/a") WebElement linkYourOnlineAccount;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block confirm'])[1]") WebElement btnApplePlayStore;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block confirm'])[2]") WebElement btnGooglePlayStore;
	@FindBy(xpath="//span[@class='we-localnav__title__product']") WebElement txtAppStore;
	@FindBy(xpath="//a[@aria-label='Google Play logo']/span") WebElement txtGooglePlay;
	
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:0$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//img[@id='charFragment'])[6]/following-sibling::label") WebElement txtCCBTermsAndConditions;
	
    String firstName, lastName, confirmationNo, ccb_User, ccb_Pwd;
    
	public SwitchToSmartMeter_GMR_No_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//SwitchToSmartMeter_GMR_No.properties");
	}
	
	public void userVerifiesSwitchToMeteredBillsSection() throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMyUsage);
		if (driver.getCurrentUrl().contains("eswater")) {
			Assert.assertEquals(true, sectionSwitchToMeteredBills.isDisplayed());
			Assert.assertEquals(true, btnSwitchToMeteredBills.isDisplayed());
		}
		else {
			System.out.println("System should not display Switch to Metered Bills section in NWL website");
		}	
	}

	public void redirectedToSwitchToMeteredBillsPage() throws Exception {
		btnSwitchToMeteredBills.click();
		elementVisible(100, txtSwitchToMeteredBills1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSwitchToMeteredBills1);
		Assert.assertEquals(true, txtSwitchToMeteredBillsTeaser1.getText().contains(c.getData("switchToMeteredBillsTeaser1")));
	}

	public void verifiesPersonalDetailsWithCCB(String email, String accNo, String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://tst01ccb.oci.nwl.co.uk/ouaf/loginPage.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		ccb_User=ccbUsername;
		ccb_Pwd=ccbPwd;
		btnCCBUserID.sendKeys(ccb_User);
		btnCCBPwd.sendKeys(ccb_Pwd);
		btnCCBLogin.click();
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		txtCCBAccountID.sendKeys(accNo);
		btnCCBSearch1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabMenu")));
		if (driver.findElement(By.xpath("//td[@class='activeTab']")).getText().contains("Main")) {
			driver.switchTo().defaultContent();
			driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
			driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
			elementVisible(100, btnCCBAccountName);
			btnCCBAccountName.click();
			Thread.sleep(2000);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@title='zoneMapFrame_1']")));
		Thread.sleep(2000);
		String name = txtCCBFullName.getText();
		String[] splitName = name.split(" ");
		firstName = splitName[1];
		lastName = splitName[0].substring(0,splitName[0].length()-1);
		driver.close();
		Thread.sleep(500);
		handleMultipleTabs(0);
		elementVisible(100, txtSwitchToMeteredBills1);
		Assert.assertEquals(txtYourFirstName.getText(), firstName);
		Assert.assertEquals(txtYourSurName.getText(), lastName);
		btnYourAccNumberInfoIcon.click();
		elementVisible(100, txtYourAccNumberInfoIcon);
		Assert.assertEquals(true, txtYourAccNumberInfoIcon.getText().contains(c.getData("yourAccNumberInformationText")));
		Thread.sleep(500);
		btnYourAccNumberInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourAccNumber.getText().contains(accNo));
		btnYourEmailAddressInfoIcon.click();
		elementVisible(100, txtYourEmailAddressInfoIcon);
		Assert.assertEquals(true, txtYourEmailAddressInfoIcon.getText().contains(c.getData("yourEmailAddressInformationText")));
		Thread.sleep(500);
		btnYourEmailAddressInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, txtYourEmailAddress.getText().contains(email));
		Assert.assertEquals(true, btnNext.isDisplayed());
	}

	public void navigateToSwitchToMeteredBillsPage() throws Exception {
		btnNext.click();
		elementVisible(100, txtSwitchToMeteredBills2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSwitchToMeteredBills2);
		Assert.assertEquals(true, txtSwitchToMeteredBillsTeaser2.getText().contains(c.getData("switchToMeteredBillsTeaser2")));
		btnYourAddressInfoIcon.click();
		elementVisible(100, txtYourAddressInfoIcon);
		Assert.assertEquals(true, txtYourAddressInfoIcon.getText().contains(c.getData("yourAddressInformationText")));
		Thread.sleep(500);
		btnYourAddressInfoIconClose.click();
		Thread.sleep(1000);
		btnSerialNumberInfoIcon.click();
		elementVisible(100, txtSerialNumberInfoIcon);
		Assert.assertEquals(true, txtSerialNumberInfoIcon.getText().contains(c.getData("serialNumberInformationText")));
		Thread.sleep(500);
		btnSerialNumberInfoIconClose.click();
		Thread.sleep(1000);
	}

	public void selectsYesOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", LabelGiveAMeterReading);
		btnGiveMeterReadingInfoIcon.click();
		elementVisible(100, txtGiveMeterReadingInfoIcon);
		Assert.assertEquals(true, txtGiveMeterReadingInfoIcon.getText().contains(c.getData("giveMeterReadingInformationText")));
		Thread.sleep(500);
		btnGiveMeterReadingInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		btnYes.click();
		elementVisible(100, fieldGiveAMeterReading);
		Assert.assertEquals(true, fieldGiveAMeterReading.isDisplayed());
		btnOccupancyInfoIcon.click();
		elementVisible(100, txtOccupancyInfoIcon);
		Assert.assertEquals(true, txtOccupancyInfoIcon.getText().contains(c.getData("occupancyInformationText")));
		Thread.sleep(500);
		btnOccupancyInfoIconClose.click();
		Thread.sleep(1000);
		Assert.assertEquals(true, dropdownOccupancy.isDisplayed());
	}

	public void changesFromYesToNoOption(String occupancy) throws Exception {
		btnNo.click();
		Thread.sleep(1000);
		dropdownOccupancy.click();
		Thread.sleep(2000);
		for (WebElement occupancyOption : dropdownOccupancyOptions) {
			if (occupancyOption.getText().equalsIgnoreCase(occupancy)) {
				occupancyOption.click();
				Thread.sleep(1000);
				break;
			}
		}
		Assert.assertEquals(true, txtIAgreeToTermsAndConditions.getText().contains(c.getData("termsAndConditionsTeaserText")));
		Assert.assertEquals(true, linkTermsAndConditions.isDisplayed());
		Assert.assertEquals(true, btnDone.isDisplayed());
	}

	public void navigateToWeHaveGotYourRequestToSwitchPage() throws Exception {
		btnDone.click();
		elementVisible(100, txtWeHaveGotYourRequestToSwitch);
		confirmationNo=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtSuccessMsgTeaser.getText().contains(c.getData("successMsgTeaser")));
		Assert.assertEquals(true, linkYourOnlineAccount.isDisplayed());
		Assert.assertEquals(true, btnApplePlayStore.isDisplayed());
		Assert.assertEquals(true, btnGooglePlayStore.isDisplayed());
	}

	public void verifyWholeAreaMeteringSectionInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccb_User);
		btnCCBPwd.sendKeys(ccb_Pwd);
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

	public void verifyTermsAndConditionsSectionInCCB() throws Exception {
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBTermsAndConditions);
		Thread.sleep(2000);
	}

}
