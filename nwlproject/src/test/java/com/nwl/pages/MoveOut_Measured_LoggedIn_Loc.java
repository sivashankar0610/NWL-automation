package com.nwl.pages;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.LocalDate;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class MoveOut_Measured_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//div[@class='wp-e-movingHome']/a/div/div/h6") WebElement sectionMovingHome;
	@FindBy(xpath="//div[@class='wp-e-movingHome']/a/div/div/p") WebElement txtMovingHomeTeaser;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]/h1") WebElement txtMovingHome;
	@FindBy(xpath="(//div[@class='account-teaser'])[2]/div") WebElement txtWillYouBeNWBillPayer;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithinPage']") WebElement btnYes;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithoutPage']") WebElement btnNo;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[1]") WebElement linkNotSure;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline addremoveProperty']") WebElement btnAddOrRemoveProperty;
	@FindBy(xpath="//div[@class='move-out__step1 wp-spacing']/div[1]/h4") WebElement txtYourCurrentAddress;
	@FindBy(xpath="(//p[@class='lbl'])[1]") WebElement txtCongratulationsOnYourBigMove;
	@FindBy(xpath="(//div[@class='move-out__step1 wp-spacing'])/div[2]/div[1]") WebElement txtAddressYouAreMovingFrom;
	@FindBy(xpath="(//div[@class='move-out__step1 wp-spacing'])/div[3]") WebElement txtWhenYouAreMovingOut;
	@FindBy(xpath="//div[@class='form-group form-date']/input") WebElement btnMovingOutDate;
	@FindBy(xpath="//div[@class='form-group form-date active show-date']/input") WebElement txtMovingOutDate;
	
	@FindBy(xpath="(//div[@class='lbl'])[1]") WebElement txtHowDoWeWorkOutYourBill1;
	@FindBy(xpath="//div[@class='metered5daysInPast normal']") WebElement txtSorryYouCannotSMR;
	
	@FindBy(xpath="(//div[@class='lbl'])[2]") WebElement txtHowDoWeWorkOutYourBill2;
	@FindBy(xpath="//div[@class='metered5days normal']") WebElement txtWeWouldLoveMR;
	
	@FindBy(xpath="//div[@class='metered5daysInAdvance normal']") WebElement txtComeBackToGiveUsSMR;
	@FindBy(xpath="(//div[@class='accordion__item'])[1]") WebElement AccordianWaterMeterDetails;
	@FindBy(xpath="(//span[@class='meter-serial-number'])[2]") WebElement txtSerialNo;
	@FindBy(xpath="(//span[@class='meter-last-reading'])[2]") WebElement txtLastReadingAndDate;
	@FindBy(xpath="(//span[@class='meter-reading-type'])[2]") WebElement txtTypeOfReading;
	
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(xpath="//span[@id='IM_menuButton']") WebElement btnCCBMenu;
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x7']") WebElement btnCCBMeter;
	@FindBy(xpath="//li[@id='CI_METER_subMenuItem0x7']") WebElement btnCCBMeterORItemSearch;
	@FindBy(xpath="//input[@id='ACCT_NBR']") WebElement txtCCBAccountID1;
	@FindBy(id="BU_section3_search") WebElement btnCCBSearch1;
	@FindBy(id="IM_MTR_ITEM:0$Grid_mtrCntxt") WebElement btnCCBMenuSymbol;
	@FindBy(xpath="//li[@id='CI_CONTEXTMETER_subMenuItem0x4']") WebElement btnCCBGoToReadHistory;
	@FindBy(xpath="//span[@id='MTR_INFO']") WebElement txtCCBSerialNo;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$READ_DTTM']") WebElement txtCCBLastReadingDate;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$REG_READING']") WebElement txtCCBLastReading;
	@FindBy(xpath="//span[@id='MR_BILLHIST:0$READ_TYPE_DESCR']") WebElement txtCCBReadingType;
	@FindBy(xpath="//span[@id='youAreLoggedInAsSpan']") WebElement btnCCBCredentialsName;
	@FindBy(xpath="//li[@id='Logout']") WebElement btnCCBLogout;
	
	@FindBy(xpath="(//div[@class='lbl'])[3]") WebElement txtWhoIsMovingIntoThisAddress;
	@FindBy(xpath="//div[@class='normal']") WebElement txtPlsTellUsName;
	@FindBy(xpath="//input[@class='form-control nub_occupiers futher-occupier-text']") WebElement txtEnterName;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step']") WebElement btnNext1;
	
	@FindBy(xpath="//div[@class='account-teaser  address-container']/h4") WebElement txtYourLastBill;
	@FindBy(xpath="//div[@class='email-notification has-eBilling']/p") WebElement txtWeWillSendConfirmationMail;
	@FindBy(xpath="//div[@class='sub-title no-margin billing-email']") WebElement txtEmail;
	@FindBy(xpath="//div[@class='forwarding-row-address form-row']/div/div/a") WebElement btnForwardingAddressInfoIcon;
	@FindBy(xpath="//div[@class='forwarding-row-address form-row']/div/div/div/span") WebElement txtForwardingAddressInfoIcon;
	@FindBy(xpath="//div[@class='forwarding-row-address form-row']/div[1]/div/div/a") WebElement btnForwardingAddressInfoIconClose;
	@FindBy(id="data8-forward-address-moveout") WebElement txtFindMyAddress;
	@FindBy(xpath="//a[@class='nb-btn-link forwarding-address-not-list-link']") WebElement linkICannotFindMyAddress;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block go-next'])[1]") WebElement btnNext2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline go-back']") WebElement btnGOBack;
	
	@FindBy(xpath="//div[@class='move-out__step3 wp-spacing']/div[1]/h4") WebElement txtReady;
	@FindBy(xpath="//div[@class='move-out__step3 wp-spacing']/div[1]/div/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="//div[@class='move-out__step3 wp-spacing']/div[2]/div[1]") WebElement txtMovingOutFrom;
	@FindBy(xpath="//p[@class='moveoutdate']/p") WebElement txtMODate;
	@FindBy(xpath="//p[@class='meter-read']") WebElement txtEstimateYourFinalBill;
	@FindBy(xpath="//p[@class='occupier']/p") WebElement txtName;
	@FindBy(xpath="//p[@class='billing-email']") WebElement txtEmailID;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block go-next'])[2]") WebElement btnDone;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div/h1") WebElement txtGreatYouAreDone;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[1]/p") WebElement txtsuccessMsgTeaser1;
	@FindBy(xpath="//div[@class='sub-title no-margin']") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[2]") WebElement txtSuccessMsgTeaser2;
	@FindBy(xpath="(//div[@class='accordion__item'])[1]/h5/a") WebElement AccordianShowMeDetails;
	@FindBy(xpath="(//div[@class='sub-title'])[1]") WebElement txtAboutYou;
	@FindBy(xpath="(//div[@class='row-bg'])[2]/p[2]") WebElement txtAccountNumber;
	@FindBy(xpath="(//div[@class='row-bg'])[4]/p[2]") WebElement txtmovingOutDate;
	@FindBy(xpath="(//div[@class='row-bg'])[5]/p[2]") WebElement txtEstimateBill;
	@FindBy(xpath="(//div[@class='row-bg'])[6]/p[2]") WebElement txtName1;
	@FindBy(xpath="//p[@class='billing-email text-bold']") WebElement txtEmailID2;
	
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[1]") WebElement txtCCBMODate;
	@FindBy(xpath="(//span[@class='oraNormal oraDefault'])[4]") WebElement txtCCBName;
	
	String lastCCBReading, moDate_App, moDate_CCB, accountNumber, eMailID, confirmationNumber, ccbUsername, ccbPassword;
	
	public MoveOut_Measured_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MoveOut_Measured_LoggedIn.properties");
	}
	
	public void verifyMovingHomeSection() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", sectionMovingHome);
		Assert.assertEquals(true, txtMovingHomeTeaser.getText().contains(c.getData("movingHomeTeaser")));
	}
	
	public void clicksOnMovingHomeSection() throws Exception{
		Thread.sleep(2000);
		sectionMovingHome.click();
		elementVisible(100, txtMovingHome);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingHome);
		Assert.assertEquals(true, txtWillYouBeNWBillPayer.getText().contains(c.getData("billPaymentTeaser")));
		Assert.assertEquals(true, btnYes.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		Assert.assertEquals(true, linkNotSure.isDisplayed());
	}
	
	public void navigateToYourCurrentAddress() throws Exception{
		btnNo.click();
		elementVisible(100, txtYourCurrentAddress);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourCurrentAddress);
		Assert.assertEquals(true, txtCongratulationsOnYourBigMove.getText().contains(c.getData("existingPropertyTeaser")));
		Assert.assertEquals(true, txtAddressYouAreMovingFrom.getText().contains(c.getData("leavingAddressLabel")));
		Assert.assertEquals(true, txtWhenYouAreMovingOut.getText().contains(c.getData("moveOutDateLabel")));
	}
	
	public void entersMovingOutDate(String modate, String accNo, String username, String pwd) throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenYouAreMovingOut);
		btnMovingOutDate.click();
		Thread.sleep(1000);
		moDate_App = modate;
		moDate_CCB = modate.replaceAll("/", "-");
		accountNumber=accNo;
		txtMovingOutDate.sendKeys(modate);
		txtCongratulationsOnYourBigMove.click();
		String moveOutDate = modate.substring(6)+"-"+modate.substring(3, 5)+"-"+modate.substring(0, 2);	
		ccbUsername=username;
		ccbPassword=pwd;
        if (moveOutDate.compareTo(LocalDate.now().minusDays(5).toString())<0) {
        	Assert.assertEquals(true, txtHowDoWeWorkOutYourBill1.getText().contains(c.getData("finalizingBillLabel")));
        	Assert.assertEquals(true, txtSorryYouCannotSMR.getText().contains(c.getData("finalizingBillTeaserFiveDayInPast")));
		}
        else if (moveOutDate.compareTo(LocalDate.now().plusDays(5).toString())>0) {
        	Assert.assertEquals(true, txtHowDoWeWorkOutYourBill1.getText().contains(c.getData("finalizingBillLabel")));
        	Assert.assertEquals(true, txtComeBackToGiveUsSMR.getText().contains(c.getData("finalizingBillTeaserFiveDayInAdvance")));
        	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AccordianWaterMeterDetails);
        	AccordianWaterMeterDetails.click();
        	Thread.sleep(1000);
        	((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
    		handleMultipleTabs(1);
    		elementVisible(100, btnCCBUserID);
    		btnCCBUserID.sendKeys(ccbUsername);
    		btnCCBPwd.sendKeys(ccbPassword);
    		btnCCBLogin.click();
    		Thread.sleep(3000);
    		driver.switchTo().frame(0);
    		elementVisible(100, btnCCBMenu);
    		btnCCBMenu.click();
    		elementVisible(100, btnCCBMeter);
    		btnCCBMeter.click();
    		elementVisible(100, btnCCBMeterORItemSearch);
    		btnCCBMeterORItemSearch.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
    		elementVisible(100, txtCCBAccountID1);
    		txtCCBAccountID1.sendKeys(accNo);
    		btnCCBSearch1.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataframe']")));
    		elementVisible(100, btnCCBMenuSymbol);
    		btnCCBMenuSymbol.click();
    		Thread.sleep(2000);
    		driver.switchTo().defaultContent();
    		driver.switchTo().frame(0);
    		elementVisible(100, btnCCBGoToReadHistory);
    		btnCCBGoToReadHistory.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
    		elementVisible(100, txtCCBSerialNo);
    		String[] s1 = txtCCBSerialNo.getText().split("/");
    		String expectedSerialNumber = s1[1].toString().replaceAll("\\s", "");
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='dataGrid']")));
    		String date = txtCCBLastReadingDate.getText().substring(0, 10);
    		String expectedLastReadingDate = date.substring(0, 2)+"/"+date.substring(3, 5)+"/"+date.substring(6, 10);
    		String[] s2 = txtCCBLastReading.getText().split("\\.");    		
    		lastCCBReading = s2[0];
    		String expectedLastReadingType = txtCCBReadingType.getText();
    		
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
    		elementVisible(100, txtSerialNo);
    		Assert.assertEquals(true, txtSerialNo.getText().contains(expectedSerialNumber));	
    		String[] reading = txtLastReadingAndDate.getText().split(" ");
    		String expectedLastReading = null;
    		if (reading[0].length()==4) {
    			if (lastCCBReading.length()==3) {
    				expectedLastReading="0"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==2) {
    				expectedLastReading="00"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==1) {
    				expectedLastReading="000"+lastCCBReading;
    			}
    			else {
    				expectedLastReading=lastCCBReading;
    			    Assert.assertEquals(true, txtLastReadingAndDate.getText().contains(expectedLastReading+" on "+expectedLastReadingDate));
    			}
    		}
    		
    		else if (reading[0].length()==5) {
    			if (lastCCBReading.length()==4) {
    				expectedLastReading="0"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==3) {
    				expectedLastReading="00"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==2) {
    				expectedLastReading="000"+lastCCBReading;
    			}
    			else if (lastCCBReading.length()==1) {
    				expectedLastReading="0000"+lastCCBReading;
    			}
    			else {
    				expectedLastReading=lastCCBReading;
    				Assert.assertEquals(true, txtLastReadingAndDate.getText().contains(expectedLastReading+" on "+expectedLastReadingDate));
    			}
    		}	
    		
    		if (expectedLastReadingType.contains("Estimate")) {
    	    	Assert.assertEquals(true, txtTypeOfReading.getText().contains("Estimate"));
    		}
    	    else if (expectedLastReadingType.contains("Regular")) {
    	    	Assert.assertEquals(true, txtTypeOfReading.getText().contains("NWL read"));
    		}
    		else {
    			Assert.assertEquals(true, txtTypeOfReading.getText().toLowerCase().contains(expectedLastReadingType.toLowerCase()));
    		}
		}
        else {
        	Assert.assertEquals(true, txtHowDoWeWorkOutYourBill2.getText().contains(c.getData("finalizingBillLabel")));
        	Assert.assertEquals(true, txtWeWouldLoveMR.getText().contains(c.getData("finalizingBillTeaserFiveDay")));
        }
        Assert.assertEquals(true, txtWhoIsMovingIntoThisAddress.getText().contains(c.getData("futureOccupierLabel")));
        Assert.assertEquals(true, txtPlsTellUsName.getText().contains(c.getData("futureOccupierTeaser")));
        txtEnterName.sendKeys(c.getData("name"));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhenYouAreMovingOut);
	}
	
	public void navigateToYourLastBillFromUs(String email) throws Exception{
		btnNext1.click();
		elementVisible(100, txtYourLastBill);
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourLastBill);
		Assert.assertEquals(true, txtWeWillSendConfirmationMail.getText().contains(c.getData("emailTeaser")));
		eMailID=email;
		Assert.assertEquals(true, txtEmail.getText().equalsIgnoreCase(email));
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
		Assert.assertEquals(true, btnGOBack.isDisplayed());
	}
	
	public void userEntersOutsideOfSupplyArea(String outsideSupplyAreaAddress) throws Exception {
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
	
	public void navigateToReadyPage() throws Exception{
		btnNext2.click();
		elementVisible(100, txtReady);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtMovingOutFrom);
		Assert.assertEquals(true, txtMODate.getText().contains(moDate_App));
		Assert.assertEquals(true, txtEstimateYourFinalBill.getText().contains(c.getData("estimateReadingText")));
		Assert.assertEquals(true, txtName.getText().contains(c.getData("name")));
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(eMailID));
	}

	public void navigateToConfirmationPage() throws Exception {
		btnDone.click();
		elementVisible(200, txtGreatYouAreDone);
		Thread.sleep(3000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);
		//String[] successMsgTeaser = txtsuccessMsgTeaser1.getText().split("\n");
		Assert.assertEquals(true, txtsuccessMsgTeaser1.getText().contains(c.getData("successMsgTeaser1")+" "+eMailID));
		confirmationNumber=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtSuccessMsgTeaser2.getText().contains(c.getData("successMsgTeaser2")));
	}
	
	public void verifyDetailsShowMeDetailsSection() throws Exception{
		Thread.sleep(1000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", AccordianShowMeDetails);
		AccordianShowMeDetails.click();
	    Thread.sleep(2000);
	    ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYou);
	    Assert.assertEquals(true, txtAccountNumber.getText().contains(accountNumber));
	    Assert.assertEquals(true, txtmovingOutDate.getText().contains(moDate_App));
	    Assert.assertEquals(true, txtEstimateBill.getText().contains(c.getData("estimateReadingText")));
	    Assert.assertEquals(true, txtName1.getText().contains(c.getData("name")));
	    Assert.assertEquals(true, txtEmailID2.getText().equalsIgnoreCase(eMailID));
	    Thread.sleep(2000);
	}
	
	public void opensMoveInMoveOutProcessExistsInCCB() throws Exception{
		((JavascriptExecutor) driver).executeScript("window.open('https://preprd01ccb.oci.nwl.co.uk/ouaf/cis.jsp','_blank');");
		handleMultipleTabs(1);
		elementVisible(100, btnCCBUserID);
		btnCCBUserID.sendKeys(ccbUsername);
		btnCCBPwd.sendKeys(ccbPassword);
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
		Assert.assertEquals(true, txtCCBName.getText().contains(c.getData("name")));
	}
	
}
