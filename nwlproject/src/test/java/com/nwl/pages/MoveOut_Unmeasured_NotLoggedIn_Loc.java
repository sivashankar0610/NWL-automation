package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class MoveOut_Unmeasured_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="(//span[@class='btn-arrow'])[4]") WebElement linkMovingHome;
	@FindBy(xpath="//nav[@id='nonLoginedMenu']/ul/li[1]/a") WebElement txtServices;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/h1") WebElement txtMovingHome1;
	@FindBy(xpath="(//div[@class='account-teaser'])[1]/p") WebElement txtTellingUsAbout1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-newcustomer']") WebElement btnIAmNewCustomer;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block btn-existingcustomer']") WebElement btnIAMCurrentlyCustomer;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block nb-btn-outline'])[1]") WebElement btnCheckOurSupplyArea;
	@FindBy(xpath="(//a[@class='nb-btn nb-btn-block nb-btn-outline'])[2]") WebElement btnAreYouLandlord;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]/h4") WebElement txtMovingHome2;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]/div") WebElement txtWillYouBeNWBillPayer;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithinPage']") WebElement btnYes;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithoutPage']") WebElement btnNo;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[1]") WebElement linkNotSure;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline addremoveProperty']") WebElement btnAddOrRemoveProperty;
	@FindBy(xpath="(//div[@class='account-teaser'])[4]/h4") WebElement txtLetsFindYourAccount;
	@FindBy(xpath="//p[@class='movewithout']") WebElement txtYouCanLoginAndSkip;
	@FindBy(xpath="(//span[@class='btn-arrow'])[1]") WebElement linkLogin;
	@FindBy(xpath="(//span[@class='btn-arrow'])[2]") WebElement linkFindMyAccount;
	@FindBy(xpath="//h4[@class='move-home']") WebElement txtMovingHome3;
	@FindBy(xpath="//p[@class='move-home']") WebElement txtTellingUsAbout2;
	@FindBy(xpath="(//input[@class='form-control email'])[1]") WebElement txtEmail;
	@FindBy(xpath="//input[@class='form-control loginpassword']") WebElement txtPassword;
	@FindBy(xpath="//a[@class='form-show']") WebElement linkShowPassword;
	@FindBy(xpath="//span[@class='checkbox']") WebElement checkRememberMe;
	@FindBy(id="recaptcha-demo-submit") WebElement btnLogin;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkIHaveForgottenEmail_Pwd;
	@FindBy(xpath="//div[@class='move-out__step1 wp-spacing']/div[1]/h4") WebElement txtYourCurrentAddress;
	@FindBy(xpath="(//p[@class='lbl'])[1]") WebElement txtCongratulationsOnYourBigMove;
	@FindBy(xpath="(//div[@class='sub-title'])[7]") WebElement txtAddressYouAreMovingFrom;
	@FindBy(xpath="(//div[@class='sub-title'])[8]") WebElement txtWhenYouAreMovingOut;
	@FindBy(xpath="//div[@class='form-group form-date']/input") WebElement btnMovingOutDate;
	@FindBy(xpath="//div[@class='form-group form-date active show-date']/input") WebElement txtMovingOutDate;
	@FindBy(xpath="(//div[@class='lbl'])[3]") WebElement txtWhoIsMovingIntoThisAddress;
	@FindBy(xpath="//div[@class='normal']") WebElement txtPlsTellUsName;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step']") WebElement btnNext1;
	@FindBy(xpath="//div[@class='account-teaser  address-container']/h4") WebElement txtYourLastBill;
	@FindBy(xpath="//div[@class='form-row row-how-received-bill has-not-eBilling']/div[1]") WebElement txtfinalBillLabel;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block by-online-btn']") WebElement btnOnMyOnlineAccount;
    @FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline by-post-btn']") WebElement btnByPost;
    @FindBy(xpath="//span[@class='verified']") WebElement txtWeWillEmailYou;
	@FindBy(xpath="//div[@class='forwarding-row-address form-row']/div/div/a") WebElement btnForwardingAddressInfoIcon;
	@FindBy(xpath="//div[@class='forwarding-row-address form-row']/div/div/div/span") WebElement txtForwardingAddressInfoIcon;
	@FindBy(xpath="//div[@class='forwarding-row-address form-row']/div[1]/div/div/a") WebElement btnForwardingAddressInfoIconClose;
	@FindBy(id="data8-forward-address-moveout") WebElement txtFindMyAddress;
	@FindBy(xpath="//a[@class='nb-btn-link forwarding-address-not-list-link']") WebElement linkICannotFindMyAddress;
    
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block go-next'])[1]") WebElement btnNext2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline go-back']") WebElement btnGoBack1;
	@FindBy(xpath="//div[@class='move-out__step3 wp-spacing']/div[1]/h4") WebElement txtReady;
	@FindBy(xpath="//div[@class='move-out__step3 wp-spacing']/div[1]/div/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="//div[@class='account__box bg__box no-margin row-properties']/div[1]") WebElement txtMovingOutFrom;
	@FindBy(xpath="//p[@class='moveoutdate']/p") WebElement txtMODate;
	@FindBy(xpath="//p[@class='billing-email']") WebElement txtEmailID;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block go-next'])[2]") WebElement btnDone;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack2;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div/h1") WebElement txtGreatYouAreDone;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[1]/p") WebElement txtsuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='sub-title no-margin']") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="(//div[@class='accordion__item'])[1]/h5/a") WebElement AccordianShowMeDetails;
	@FindBy(xpath="(//div[@class='sub-title'])[1]") WebElement txtAboutYou;
	@FindBy(xpath="(//div[@class='row-bg'])[2]/p[2]") WebElement txtAccountNumber;
	@FindBy(xpath="(//div[@class='row-bg'])[4]/p[2]") WebElement txtmovingOutDate;
	@FindBy(xpath="(//div[@class='row-bg'])[5]/p[2]") WebElement txtEmailID1;
	
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
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[1]") WebElement txtCCBMODate;
	
	String moDate_App, moDate_CCB, accountNumber, eMailID, confirmationNumber;
	
	public MoveOut_Unmeasured_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MoveOut_Unmeasured_NotLoggedIn.properties");
	}
	
	public void navigateToMovingHomePage() throws Exception{
		linkMovingHome.click();
		elementVisible(100, txtServices);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingHome1);
		Assert.assertEquals(true, txtTellingUsAbout1.getText().contains(c.getData("moveHomeLandingPageTeaser")));
		Assert.assertEquals(true, btnIAmNewCustomer.isDisplayed());
		Assert.assertEquals(true, btnIAMCurrentlyCustomer.isDisplayed());
		Assert.assertEquals(true, btnCheckOurSupplyArea.isDisplayed());
		Assert.assertEquals(true, btnAreYouLandlord.isDisplayed());
	}
	
	public void clickOnCurrentlyCustomer() throws Exception{
		btnIAMCurrentlyCustomer.click();
		elementVisible(100, txtMovingHome2);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingHome2);
		Assert.assertEquals(true, txtWillYouBeNWBillPayer.getText().contains(c.getData("billPaymentTeaser")));
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		Assert.assertEquals(true, linkNotSure.isDisplayed());
	}
	
	public void navigateToLetsFindYourAccountPage() throws Exception{
		btnNo.click();
		elementVisible(100, txtLetsFindYourAccount);
		Assert.assertEquals(true, txtYouCanLoginAndSkip.getText().contains(c.getData("loginExtCustMwTeaser")));
		Assert.assertEquals(true, linkLogin.isDisplayed());
		Assert.assertEquals(true, linkFindMyAccount.isDisplayed());
	}
	
	public void redirectedToMovingHomePage() throws Exception{
		linkLogin.click();
		elementVisible(100, txtMovingHome3);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingHome3);
		Assert.assertEquals(true, txtTellingUsAbout2.getText().contains(c.getData("moveHomeLoginPageTeaser")));
		Assert.assertEquals(true, txtEmail.isDisplayed());
		Assert.assertEquals(true, txtPassword.isDisplayed());
		Assert.assertEquals(true, linkShowPassword.isDisplayed());
		Assert.assertEquals(true, checkRememberMe.isDisplayed());
		Assert.assertEquals(true, btnLogin.isDisplayed());
		Assert.assertEquals(true, linkIHaveForgottenEmail_Pwd.isDisplayed());
	}
	
	public void navigateToYourCurrentAddressScreen() throws Exception{
		btnLogin.click();
		elementVisible(100, txtYourCurrentAddress);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourCurrentAddress);
		Assert.assertEquals(true, txtCongratulationsOnYourBigMove.getText().contains(c.getData("existingPropertyTeaser")));
		Assert.assertEquals(true, txtAddressYouAreMovingFrom.getText().contains(c.getData("leavingAddressLabel")));
		Assert.assertEquals(true, txtWhenYouAreMovingOut.getText().contains(c.getData("moveOutDateLabel")));
	}

	public void entersMODate(String moDate) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenYouAreMovingOut);
		btnMovingOutDate.click();
		Thread.sleep(1000);
		moDate_App = moDate;
		moDate_CCB = moDate.replaceAll("/", "-");
		txtMovingOutDate.sendKeys(moDate);
		txtCongratulationsOnYourBigMove.click();
		//txtWhenYouAreMovingOut.click();
		Assert.assertEquals(true, txtWhoIsMovingIntoThisAddress.getText().contains(c.getData("futureOccupierLabel")));
        Assert.assertEquals(true, txtPlsTellUsName.getText().contains(c.getData("futureOccupierTeaser")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenYouAreMovingOut);
	}

	public void navigateToYourLastBillFromUsPage() throws Exception {
		btnNext1.click();
		elementVisible(100, txtYourLastBill);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourLastBill);
		Assert.assertEquals(true, txtfinalBillLabel.getText().contains(c.getData("finalBillLabel")));
		Assert.assertEquals(true, btnOnMyOnlineAccount.isDisplayed());
		Assert.assertEquals(true, btnByPost.isDisplayed());
		Assert.assertEquals(true, txtWeWillEmailYou.getText().contains(c.getData("finalBillTeaser")));
		btnForwardingAddressInfoIcon.click();
		elementVisible(100, txtForwardingAddressInfoIcon);
		Thread.sleep(500);
		Assert.assertEquals(true, txtForwardingAddressInfoIcon.getText().contains(c.getData("forwardingAddressInformationText")));
		Thread.sleep(500);
		btnForwardingAddressInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, txtFindMyAddress.isDisplayed());
		Assert.assertEquals(true, linkICannotFindMyAddress.isDisplayed());
		Assert.assertEquals(true, btnNext2.isDisplayed());
		Assert.assertEquals(true, btnGoBack1.isDisplayed());
	}
	
	public void userEnterOutsideOfSupplyArea(String outsideSupplyAreaAddress) throws Exception{
		txtFindMyAddress.sendKeys(outsideSupplyAreaAddress);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
	}
	
	public void navigateToReadyPage(String email) throws Exception {
		btnNext2.click();
		elementVisible(100, txtReady);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingOutFrom);
		Assert.assertEquals(true, txtMODate.getText().contains(moDate_App));
		eMailID=email;
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(eMailID));
		Assert.assertEquals(true, btnDone.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
	}

	public void navigateToSuccessScreen() throws Exception {
		btnDone.click();
		elementVisible(200, txtGreatYouAreDone);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);
		//String[] successMsgTeaser = txtsuccessMsgTeaser1.getText().split("\n");
		Assert.assertEquals(true, txtsuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")+" "+eMailID));
		confirmationNumber=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
	}

	public void verifyDetailsShowMeDetailsSection(String accNo) throws Exception {
		AccordianShowMeDetails.click();
	    Thread.sleep(2000);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYou);
	    accountNumber=accNo;
	    Assert.assertEquals(true, txtAccountNumber.getText().contains(accountNumber));
	    Assert.assertEquals(true, txtmovingOutDate.getText().contains(moDate_App));
	    Assert.assertEquals(true, txtEmailID1.getText().equalsIgnoreCase(eMailID));
	    Thread.sleep(2000);
	}

	public void verifyMoveInMoveOutProcessExistsInCCB(String username, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(username);
		btnCCBPwd.sendKeys(pwd);
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
		txtCCBCustomerContactID.sendKeys(confirmationNumber);
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
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		Assert.assertEquals(true, txtCCBMODate.getText().contains(moDate_CCB));		
	}	

}
