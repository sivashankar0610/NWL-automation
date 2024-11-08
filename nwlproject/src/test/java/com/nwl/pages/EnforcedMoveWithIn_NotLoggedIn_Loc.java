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

public class EnforcedMoveWithIn_NotLoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithinPage']") WebElement btnYes;
	@FindBy(xpath="//div[@class='enforced-move-within__step2 wp-spacing']/div/h4") WebElement txtYourNewHome;
	@FindBy(xpath="//div[@class='enforced-move-within__step2 wp-spacing']/div[2]") WebElement txtWhenMovingIntoNewHome;
	@FindBy(xpath="//div[@class='form-group row-moveInDate form-date']/input") WebElement btnMoveInDate;
	@FindBy(xpath="//div[@class='form-group row-moveInDate form-date active show-date']/input") WebElement txtMoveInDate;
	@FindBy(id="data8-address-enforcedmovewithin") WebElement txtFindMyAddress;
	@FindBy(xpath="(//div[@class='form-select'])[1]") WebElement btnPlsSelect;
	@FindBy(xpath="(//span[@class='sel__box__options'])[4]") WebElement dropdownOccupancyCount;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[1]") WebElement btnYes1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block no nb-btn-outline']") WebElement btnNo;
	@FindBy(xpath="(//button[@data-toggle='tooltip'])[3]") WebElement btnWhyWeAsk;
	@FindBy(xpath="(//span[@class='tooltip-label'])[17]") WebElement txtWhyWeAskTooltip;
	@FindBy(xpath="(//div[@class='normal'])[4]") WebElement txtPSRTeaser;
	@FindBy(xpath="(//div[@class='normal'])[5]") WebElement txtMoneyMattersTeaser;
	@FindBy(xpath="(//div[@class='form-row'])[21]") WebElement txtPlsCheckInformation;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block go-next']") WebElement btnNext1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline go-back']") WebElement btnGoBack1;
	@FindBy(xpath="//div[@class='enforced-move-within__step3 wp-spacing']/div/h4") WebElement txtYourBills;
	
	@FindBy(xpath="//div[@class='metered-5days-advance-teaser']/p") WebElement txtbillMeterReadAdvanceMsgTeaser;
	@FindBy(xpath="//div[@class='metered-5days-after-teaser']/p") WebElement txtbillMeterRead5daysTeaser;
	
	@FindBy(xpath="//div[@class='metered-teaser']/p") WebElement txtbillMeterReadTeaser;
	@FindBy(xpath="//p[@class='meter-serial-number']") WebElement txtSerialNo;
	@FindBy(xpath="//p[@class='meter-last-reading']") WebElement txtLastReadingAndDate;
	@FindBy(xpath="//p[@class='meter-reading-type']") WebElement txtReadingType;
	
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
	
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[2]") WebElement btnSetupDD_Yes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[3]") WebElement btnAreYouAccountHolder_No;
	@FindBy(xpath="//div[@class='form-row hasEBilling']/p") WebElement txtEBillingTeaser;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkEBillingTermsAndConditions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block  btn-next']") WebElement btnNext2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack2;
	
	@FindBy(xpath="//div[@class='enforced-move-within__step4 wp-spacing']/div[2]/div/h4") WebElement txtReady;
	@FindBy(xpath="(//div[@class='account-teaser']/div)[3]/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="//p[@class='email']") WebElement txtEmail;
	@FindBy(xpath="//div[@class='review-your-detail']/div[2]/div[1]") WebElement txtAboutYou;
	@FindBy(xpath="//p[@class='moveindate']") WebElement txtMIDate;
	@FindBy(xpath="(//p[@class='occupier'])[2]") WebElement txtOccupancy;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-next'])[2]") WebElement btnDone;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back'])[2]") WebElement btnGoBack3;
	@FindBy(xpath="//div[@class='account-teaser']/h1") WebElement txtGreatYouAreDone;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtEmailYouInformation;
	@FindBy(xpath="//div[@class='sub-title no-margin']") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[1]") WebElement txtYouCanCheckAboutMove;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[3]") WebElement txtUpdateYourAccount;
	@FindBy(xpath="//div[@class='accordion__item']/h5/a") WebElement accordianShowMeDetails;
	@FindBy(xpath="//p[@class='row-bg editorial__block editorial__block-none']") WebElement txtSuccessMsgTeaser4;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-outline']") WebElement btnGoToHelpCentre;
	@FindBy(xpath="(//div[@class='row-bg'])[2]/p[2]") WebElement txtEmailID;
	@FindBy(xpath="(//div[@class='sub-title'])[2]") WebElement labelAddress;
	@FindBy(xpath="(//div[@class='row-bg'])[5]/p[2]") WebElement txtMovingInDate;
	@FindBy(xpath="(//div[@class='row-bg'])[6]/p[2]") WebElement txtOccupancy1;
	@FindBy(xpath="(//div[@class='row-bg'])[10]/p[2]") WebElement txtFinalBillTeaser;
	
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[1]") WebElement txtCCBMODate;
	@FindBy(xpath="//label[@oramdlabel='CM_MIMO_MOVE_IN_PREM_LBL']") WebElement txtCCBMIPremise;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[2]") WebElement txtCCBMIDate;
	@FindBy(xpath="(//span[@class='oraNormal'])[24]") WebElement txtCCBOccupancy;
	
	String miDate_App, miDate_CCB, lastCCBReading, eMailID, confirmationNo;

	public EnforcedMoveWithIn_NotLoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//EnforcedMoveWithIn_NotLoggedIn.properties");
	}

	public void navigateToYourCurrentAddressScreen(String moveInDate) throws Exception {
		btnYes.click();
		elementVisible(100, txtYourNewHome);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourNewHome);
        Assert.assertEquals(true, txtWhenMovingIntoNewHome.getText().contains(c.getData("moveInDateLabel")));
        Thread.sleep(1000);
		btnMoveInDate.click();
		Thread.sleep(1000);
		miDate_App = moveInDate;
		miDate_CCB = moveInDate.replaceAll("/", "-");
		txtMoveInDate.sendKeys(moveInDate);
		//txtYourNewHome.click();
		txtFindMyAddress.click();
		Thread.sleep(1000);
	}

	public void fillsYourNewHomeAndRemainingFields(String miAddress) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
		txtFindMyAddress.sendKeys(miAddress);
		Thread.sleep(1000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		btnPlsSelect.click();
		Thread.sleep(1000);
		dropdownOccupancyCount.click();
		Assert.assertEquals(true, btnYes1.isDisplayed());
		Assert.assertEquals(true, btnNo.isDisplayed());
		Assert.assertEquals(true, btnWhyWeAsk.isDisplayed());
		btnWhyWeAsk.click();
	    Thread.sleep(500);
	    Assert.assertEquals(true, txtWhyWeAskTooltip.getText().contains(c.getData("whyWeAskInformationText")));
	    btnWhyWeAsk.click();
	    Thread.sleep(500);
		btnNo.click();
		Assert.assertEquals(true, txtPSRTeaser.getText().contains(c.getData("psrTeaser")));
		Assert.assertEquals(true, txtMoneyMattersTeaser.getText().contains(c.getData("moneyMattersTeaser")));
		Assert.assertEquals(true, txtPlsCheckInformation.getText().contains(c.getData("plsCheckAllTheseDetailsText")));
		Assert.assertEquals(true, btnNext1.isDisplayed());
		Assert.assertEquals(true, btnGoBack1.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
	}

	public void navigateToYourBillsScreen(String miAccNo, String ccbUsername, String ccbPwd) throws Exception {
		btnNext1.click();
		elementVisible(100, txtYourBills);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
		String moveInDate = miDate_App.substring(6)+"-"+miDate_App.substring(3, 5)+"-"+miDate_App.substring(0, 2);
		if (moveInDate.compareTo(LocalDate.now().minusDays(5).toString())<0) {
			Assert.assertEquals(true, txtbillMeterReadAdvanceMsgTeaser.getText().contains(c.getData("billMeterReadAdvanceMsgTeaser")));
		}
		else if (moveInDate.compareTo(LocalDate.now().plusDays(5).toString())>0) {
			Assert.assertEquals(true, txtbillMeterRead5daysTeaser.getText().contains(c.getData("billMeterRead5daysTeaser")));
		}
        else {
        	Assert.assertEquals(true, txtbillMeterReadTeaser.getText().contains(c.getData("billMeterReadTeaser")));
        	Thread.sleep(1000);
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
    		elementVisible(100, btnCCBMeter);
    		btnCCBMeter.click();
    		elementVisible(100, btnCCBMeterORItemSearch);
    		btnCCBMeterORItemSearch.click();
    		Thread.sleep(2000);
    		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
    		elementVisible(100, txtCCBAccountID1);
    		txtCCBAccountID1.sendKeys(miAccNo);
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
    	    	Assert.assertEquals(true, txtReadingType.getText().contains("Estimate"));
    		}
    	    else if (expectedLastReadingType.contains("Regular")) {
    	    	Assert.assertEquals(true, txtReadingType.getText().contains("NWL read"));
    		}
    		else {
    			Assert.assertEquals(true, txtReadingType.getText().toLowerCase().contains(expectedLastReadingType.toLowerCase()));
    		}
        }
		//Assert.assertEquals(true, txtEBillingTeaser.getText().contains(c.getData("eBillingTeaser")));
		btnSetupDD_Yes.click();
		Thread.sleep(2000);
		elementVisible(100, btnAreYouAccountHolder_No);
		btnAreYouAccountHolder_No.click();
		Thread.sleep(2000);
		//Assert.assertEquals(true, linkEBillingTermsAndConditions.isDisplayed());
		Assert.assertEquals(true, btnNext2.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
	}

	public void navigateToReadyPage(String email) throws Exception {
		btnNext2.click();
		elementVisible(100, txtReady);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtReady);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		eMailID=email;
		Assert.assertEquals(true, txtEmail.getText().equalsIgnoreCase(email));
		Assert.assertEquals(true, txtMIDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy.getText().equalsIgnoreCase("4"));
		Assert.assertEquals(true, btnDone.isDisplayed());
		Assert.assertEquals(true, btnGoBack3.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYou);
	}

	public void navigateToSuccessScreen() throws Exception {
		btnDone.click();
		elementVisible(200, txtGreatYouAreDone);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);	
		Assert.assertEquals(true, txtEmailYouInformation.getText().contains(c.getData("successMsgTeaser1")+" "+eMailID));
		confirmationNo=txtConfirmationNumber.getText();
		System.out.println(confirmationNo);
		Assert.assertEquals(true, txtYouCanCheckAboutMove.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtUpdateYourAccount.getText().contains(c.getData("successMsgTeaser3")));
		Assert.assertEquals(true, accordianShowMeDetails.isDisplayed());
		Assert.assertEquals(true, txtSuccessMsgTeaser4.getText().contains(c.getData("successMsgTeaser4")));
		Assert.assertEquals(true, btnGoToHelpCentre.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);
	}

	public void showMeTheDetailsAccordian() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordianShowMeDetails);
		accordianShowMeDetails.click();
		elementVisible(100, txtEmailID);
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(eMailID));
		Assert.assertEquals(true, txtMovingInDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy1.getText().equalsIgnoreCase("4"));
		//Assert.assertEquals(true, txtFinalBillTeaser.getText().contains(c.getData("finalBillTeaser")+" "+eMailID));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelAddress);
	}

	public void miProcessExistsInCCB(String ccbUsername, String ccbPwd) throws Exception {
		Thread.sleep(1000);
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
		driver.switchTo().frame(driver.findElement(By.id("zoneMapFrame_3")));
		//((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBMIPremise);
		Assert.assertEquals(true, txtCCBMIDate.getText().contains(miDate_CCB));
		Assert.assertEquals(true, txtCCBOccupancy.getText().contains("4"));
	}

}
