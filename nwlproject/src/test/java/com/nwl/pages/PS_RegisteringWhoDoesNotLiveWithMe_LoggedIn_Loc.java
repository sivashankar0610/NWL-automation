package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
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

public class PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-psregisterother']") WebElement btnPSRegisterWhoDoesNotLivesWithMe;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]/h2") WebElement txtSignUpToPriorityServices;
	@FindBy(xpath="(//div[@class='account-teaser'])[3]/p") WebElement txtSignUpToPriorityServicesTeaser;
	@FindBy(xpath="//input[@class='form-control other-person-your-telno telephone required']") WebElement txtYourPhoneNo;
	@FindBy(xpath="(//div[@class='form-group active completed'])[4]/span[1]") WebElement txtYourEmailAddress;
	@FindBy(xpath="(//div[@class='sub-title'])[3]") WebElement txtWhoAreYouRegisteringOnBehalfOf;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id = "BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(id="personId") WebElement txtCCBName;
	@FindBy(id="birthDate") WebElement txtCCBDateOfBirth;
	@FindBy(xpath="//td[@orafield='contactDetailValue']") List<WebElement> txtCCBEmail;	
	@FindBy(xpath="//div[@id='data_3']/table/tbody/tr[2]/td[1]") WebElement txtCCBAddress;
	@FindBy(xpath="//span[@id='youAreLoggedInAsSpan']") WebElement btnCCBCredentialsName;
	@FindBy(xpath="//li[@id='Logout']") WebElement btnCCBLogout;
	
	@FindBy(xpath="//input[@class='form-control their-firstname firstname']") WebElement txtTheirFirstName;
	@FindBy(xpath="//input[@class='form-control their-lastname surname']") WebElement txtTheirSurname;
	@FindBy(xpath="//div[@id='dobBorderNone_for_someone']") WebElement txtDOB;
	@FindBy(xpath="//input[@class='form-control their-day day']") WebElement txtDOBDate;
	@FindBy(xpath="//input[@class='form-control their-month month']") WebElement txtDOBMonth;
	@FindBy(xpath="//input[@class='form-control their-year year']") WebElement txtDOBYear;
	@FindBy(xpath="//input[@class='form-control address psr-their-address-other ui-autocomplete-input']") WebElement txtTheirAddress;
	@FindBy(xpath="//a[@class='nb-btn-link address-not-list-link-their']") WebElement linkMyAddressIsNotListed;
	@FindBy(xpath="//input[@class='form-control their-phone-number telephone required']") WebElement txtTheirPhoneNo;
	@FindBy(xpath="//input[@class='form-control their-email email no-required']") WebElement txtTheirEmail;
	@FindBy(xpath="(//div[@class='normal'])[1]") WebElement txtRegPersonPayNWBill;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[14]") WebElement btnRegPersonPayNWBillInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[14]") WebElement txtRegPersonPayNWBillInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[14]") WebElement btnRegPersonPayNWBillInfoIconClose;
	@FindBy(xpath="(//label[@class='chk-button'])[1]") WebElement btnRegPersonPayNWBill_Yes;
	@FindBy(xpath="(//label[@class='chk-button'])[2]") WebElement btnRegPersonPayNWBill_No;
	@FindBy(xpath="//input[@class='form-control their-account-number nwlnumber']") WebElement txtTheirAccountNo;
	@FindBy(xpath="//div[@class='normal']") WebElement txtNominatedContact;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[16]") WebElement btnNominatedContactInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[16]") WebElement txtNominatedContactInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[16]") WebElement btnNominatedContactInfoIconClose;
	@FindBy(xpath="(//label[@class='chk-button'])[3]") WebElement btnNominatedContact_Yes;
	@FindBy(xpath="(//label[@class='chk-button'])[4]") WebElement btnNominatedContact_No;
	@FindBy(xpath="(//div[@class='sub-title consent-box'])/label/span[1]") WebElement checkBoxConsent1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-next-who']") WebElement btnNext;
	@FindBy(xpath="(//div[@class='sub-title'])[12]") WebElement txtHearAboutThePriorityServicesRegister;
	@FindBy(xpath="(//div[@class='form-select selected'])[2]") WebElement dropdownHearAboutThePriorityServicesRegister;
	@FindBy(xpath="//span[@class='sel__box__options']") List<WebElement> dropdownHearAboutThePSROptions;
	@FindBy(xpath="//label[@class='form-checkbox consent']/span[1]") WebElement checkBoxConsent2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-submit']") WebElement btnNext2;
	
	@FindBy(id="logoImage") WebElement txtCCBOracle;
	@FindBy(id="IM_USER_HOME") WebElement btnCCBHome;
	@FindBy(xpath="//span[@id='personId']/a") WebElement linkCCBPersonName;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBCharacteristics;
	/*@FindBy(id="IM_GOBACK") WebElement btnCCBHistory;
	@FindBy(id="IM_CC_CHAR:0$GOTO_BTN") WebElement btnCCBCharacteristicsValueMenu1;
	@FindBy(xpath="(//a[@class='normal oraLink'])[2]") WebElement linkCCBAccountID;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCCBPersons;
	@FindBy(id="IM_Section1_gotoPer") WebElement btnCCBPersonIDMenu;
	@FindBy(id="CI_CONTEXTPERSON_subMenuItem0x0") WebElement btnCCBGoToPerson;*/
	
	String accNo2;

	public PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//PS_RegisteringWhoDoesNotLiveWithMe_LoggedIn.properties");
	}

	public void navigateToSignUpToPriorityServicesPage(String email) throws Exception {
		btnPSRegisterWhoDoesNotLivesWithMe.click();
		elementVisible(100, txtSignUpToPriorityServices);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtSignUpToPriorityServices);
		Assert.assertEquals(true, txtSignUpToPriorityServicesTeaser.getText().contains(c.getData("signUpToPriorityServicesTeaser")));
		txtYourPhoneNo.clear();
		Thread.sleep(500);
		txtYourPhoneNo.sendKeys("09876543210");
		Thread.sleep(500);
		Assert.assertEquals(true, txtYourEmailAddress.getText().contains(email));
	}

	public void userFillsWhoAreYouRegisteringOnBehalfOfSectionDetails(String accNo, String ccbUsername, String ccbPwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhoAreYouRegisteringOnBehalfOf);
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		Thread.sleep(1000);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPwd);
		btnCCBLogin.click();
	    Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("srch_frame")));
		accNo2=accNo;
		txtCCBAccountID.sendKeys(accNo);
		btnCCBSearch.click();
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
		String[] name = txtCCBName.getText().split(" ");
		String firstName_CCB = name[1];
		String last = name[0];
		String lastName_CCB = last.substring(0,last.length()-1); 
		String[] dob = txtCCBDateOfBirth.getText().split("-");
		String dobDate_CCB = dob[0];
		String dobMonth_CCB = dob[1];
		String dobYear_CCB = dob[2];
		String email_CCB = null;
		for (WebElement eMail : txtCCBEmail) {
			if (eMail.getText().contains(".com")) {
				email_CCB = eMail.getText();
			}
			else if (eMail.getText().contains(".co.uk")) {
				email_CCB = eMail.getText();
			}
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		String address_CCB = txtCCBAddress.getText();
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBCredentialsName);
		btnCCBCredentialsName.click();
		elementVisible(100, btnCCBLogout);
		btnCCBLogout.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		elementVisible(100, btnCCBUserID);
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, txtTheirFirstName);
		txtTheirFirstName.sendKeys(firstName_CCB);
		txtTheirSurname.sendKeys(lastName_CCB);
		txtDOB.click();
		elementVisible(100, txtDOBDate);
		txtDOBDate.sendKeys(dobDate_CCB);
		txtDOBMonth.sendKeys(dobMonth_CCB);
		txtDOBYear.sendKeys(dobYear_CCB);
		Assert.assertEquals(true, linkMyAddressIsNotListed.isDisplayed());
		txtTheirAddress.sendKeys(address_CCB);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		txtTheirPhoneNo.sendKeys("09876543210");
		txtTheirEmail.sendKeys(email_CCB);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhoAreYouRegisteringOnBehalfOf);
	}

	public void userClicksOnYesButtonForDoesThePersonYouAreRegisteringPayNWBillSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonPayNWBill);
		btnRegPersonPayNWBillInfoIcon.click();
		elementVisible(100, txtRegPersonPayNWBillInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtRegPersonPayNWBillInfoIcon.getText().contains(c.getData("regPersonPayNWBillInformationText")));
		btnRegPersonPayNWBillInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnRegPersonPayNWBill_Yes.isDisplayed());
		Assert.assertEquals(true, btnRegPersonPayNWBill_No.isDisplayed());
		btnRegPersonPayNWBill_Yes.click();
		elementVisible(100, txtTheirAccountNo);
		txtTheirAccountNo.sendKeys(accNo2);
		Thread.sleep(500);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtRegPersonPayNWBill);
	}

	public void userClicksOnYesButtonForWouldYouLikeToBeNominatedContactForThisAccountSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtNominatedContact);
		btnNominatedContactInfoIcon.click();
		elementVisible(100, txtNominatedContactInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtNominatedContactInfoIcon.getText().contains(c.getData("nominatedContactInformationText")));
		btnNominatedContactInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnNominatedContact_Yes.isDisplayed());
		Assert.assertEquals(true, btnNominatedContact_No.isDisplayed());
		btnNominatedContact_Yes.click();
		Thread.sleep(500);
		checkBoxConsent1.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnNext.isDisplayed());
	}

	public void userSelectsAnyOptionForHearAboutThePriorityServicesRegisterDropdown(String option) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtHearAboutThePriorityServicesRegister);
		dropdownHearAboutThePriorityServicesRegister.click();
		Thread.sleep(2000);
		for (int i = 1; i <= dropdownHearAboutThePSROptions.size(); i++) {
			if (option.equalsIgnoreCase(Integer.toString(i))) {
				dropdownHearAboutThePSROptions.get(i-1).click();
				Thread.sleep(500);
				break;
			}
		}
		checkBoxConsent2.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnNext2.isDisplayed());
	}

	public void userVerifiesPSR_PersonMainTabInCCB(String accNo) throws Exception {
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBOracle);
		btnCCBHome.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='srch_frame']")));
		txtCCBAccountID.sendKeys(accNo);
		btnCCBSearch.click();
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
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_1']")));
		elementVisible(100, linkCCBPersonName);
		linkCCBPersonName.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBCharacteristics);
		Thread.sleep(1000);
		/*btnCCBHistory.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("CC_CHAR_GRID")));
		elementVisible(100, btnCCBCharacteristicsValueMenu1);
		btnCCBCharacteristicsValueMenu1.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		elementVisible(100, linkCCBAccountID);
		linkCCBAccountID.click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_MINUS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_MINUS);
		}
		Thread.sleep(500);
		for (int i = 0; i < 5; i++) {
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_EQUALS);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_EQUALS);
		}
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
	    elementVisible(100, tabCCBPersons);
	    tabCCBPersons.click();
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.id("tabPage")));
	    elementVisible(100, btnCCBPersonIDMenu);
	    btnCCBPersonIDMenu.click();
	    Thread.sleep(2000);
	    driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		elementVisible(100, btnCCBGoToPerson);
		btnCCBGoToPerson.click();
		Thread.sleep(2000);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		elementVisible(100, tabCCBCharacteristics);*/
	}

}
