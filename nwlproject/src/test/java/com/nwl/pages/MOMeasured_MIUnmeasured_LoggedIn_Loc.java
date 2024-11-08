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

public class MOMeasured_MIUnmeasured_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block moveWithinPage']") WebElement btnYes;
	@FindBy(xpath="//div[@class='move-within__step1 wp-spacing']/div[1]/h4") WebElement txtYourCurrentAddress;
	@FindBy(xpath="(//p[@class='lbl'])[1]") WebElement txtCongratulationsOnYourBigMove;
	@FindBy(xpath="(//div[@class='move-within__step1 wp-spacing'])/div[3]/div[1]") WebElement txtAddressYouAreMovingFrom;
	@FindBy(xpath="(//div[@class='move-within__step1 wp-spacing'])/div[4]") WebElement labelPhoneNumber;
	@FindBy(xpath="//input[@class='form-control telephone']") WebElement txtPhoneNo;
	@FindBy(xpath="//div[@class='form-group row-moveOutDate form-date']/input") WebElement btnMovingOutDate;
	@FindBy(xpath="//div[@class='form-group row-moveOutDate form-date active show-date']/input") WebElement txtMovingOutDate;
	@FindBy(xpath="(//label[@class='form-lable'])[18]") WebElement labelDateFormat;
	
	@FindBy(xpath="(//div[@class='lbl'])[1]") WebElement txtHowDoWeWorkOutYourBill1;
	@FindBy(xpath="//div[@class='metered normal']") WebElement txtWhenWeDontHaveUpdatedMR;
	@FindBy(xpath="(//div[@class='accordion__item'])[1]") WebElement AccordianWaterMeterDetails;
	@FindBy(xpath="(//span[@class='meter-serial-number'])[2]") WebElement txtSerialNo;
	@FindBy(xpath="(//span[@class='meter-last-reading'])[2]") WebElement txtLastReadingAndDate;
	@FindBy(xpath="(//span[@class='meter-reading-type'])[2]") WebElement txtTypeOfReading;
	
	@FindBy(xpath="(//div[@class='lbl'])[2]") WebElement txtHowDoWeWorkOutYourBill2;
	@FindBy(xpath="//div[@class='metered5days normal']") WebElement txtWeWouldLoveMR;
	
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
	@FindBy(xpath="(//div[@class='normal'])[1]") WebElement txtPlsTellUsName;
	@FindBy(xpath="//input[@class='form-control nub_occupiers futher-occupier-text']") WebElement txtEnterName;
	
	@FindBy(xpath="(//div[@class='form-row'])[19]") WebElement txtPlsCheckInformation1;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block next-step']") WebElement btnNext1;
	@FindBy(xpath="//div[@class='move-within__step2 wp-spacing']/div[1]/h4") WebElement txtYourNewHome;
	@FindBy(xpath="//div[@class='move-within__step2 wp-spacing']/div[3]") WebElement txtWhenMovingIntoNewHome;
	@FindBy(xpath="//div[@class='form-group row-moveInDate form-date']/input") WebElement btnMoveInDate;
	@FindBy(xpath="//div[@class='form-group row-moveInDate form-date active show-date']/input") WebElement txtMoveInDate;
	@FindBy(id="data8-address-move-within") WebElement txtFindMyAddress;
	@FindBy(xpath="(//div[@class='form-select'])[4]") WebElement btnPlsSelect;
	@FindBy(xpath="(//span[@class='sel__box__options'])[4]") WebElement dropdownOccupancyCount;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block yes']") WebElement btnYes1;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[1]") WebElement btnNo1;
	@FindBy(xpath="(//button[@data-toggle='tooltip'])[5]") WebElement btnWhyWeAsk1;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[1]") WebElement btnYes2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block no nb-btn-outline']") WebElement btnNo2;
	@FindBy(xpath="(//button[@data-toggle='tooltip'])[6]") WebElement btnWhyWeAsk2;
	@FindBy(xpath="(//div[@class='normal'])[3]") WebElement txtPSRTeaser;
	@FindBy(xpath="(//div[@class='normal'])[4]") WebElement txtMoneyMattersTeaser;
	@FindBy(xpath="(//div[@class='form-row'])[37]") WebElement txtPlsCheckInformation2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block go-next']") WebElement btnNext2;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline go-back']") WebElement btnGoBack1;
	@FindBy(xpath="//div[@class='move-within__step3 wp-spacing']/div/h4") WebElement txtYourBills;
	@FindBy(xpath="//div[@class='unmetered-teaser']/strong") WebElement txtDoesNotWaterMeter;
	@FindBy(xpath="//div[@class='unmetered-teaser']/p") WebElement txtYourBillsTeaser;
	//@FindBy(xpath="//label[@class='switch-text text-bold']") WebElement txtEBillingTeaser;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkEBillingTermsAndConditions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block  btn-next']") WebElement btnNext3;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack2;
	@FindBy(xpath="//div[@class='move-within__step4 wp-spacing']/div[2]/div/h4") WebElement txtReady;
	@FindBy(xpath="(//div[@class='account-teaser']/div)[3]/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="//p[@class='email']") WebElement txtEmail;
	@FindBy(xpath="(//div[@class='row-bg']/p)[39]") WebElement txtAddress;
	@FindBy(xpath="//p[@class='moveoutdate']") WebElement txtMODate;
	@FindBy(xpath="(//p[@class='meter'])[1]") WebElement txtEstimateYourBill;
	@FindBy(xpath="//p[@class='moveindate']") WebElement txtMIDate;
	@FindBy(xpath="(//p[@class='occupier'])[2]") WebElement txtOccupancy;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block btn-next'])[2]") WebElement btnDone;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back'])[2]") WebElement btnGoBack3;
	@FindBy(xpath="//div[@class='account-teaser']/h4") WebElement txtGreatYouAreDone;
	@FindBy(xpath="//div[@class='account-teaser']/p") WebElement txtEmailYouInformation;
	@FindBy(xpath="//div[@class='sub-title no-margin']") WebElement txtConfirmationNumber;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[1]") WebElement txtYouCanCheckAboutMove;
	@FindBy(xpath="//div[@class='account-page text-center']/div/div[3]/p[3]") WebElement txtUpdateYourAccount;
	@FindBy(xpath="//div[@class='accordion__item']") WebElement accordianShowMeDetails;
	@FindBy(xpath="//p[@class='row-bg editorial__block editorial__block-none']") WebElement txtSuccessMsgTeaser4;
	@FindBy(xpath="//a[@class='nb-btn nb-btn-block nb-btn-outline']") WebElement btnGoToHelpCentre;
	@FindBy(xpath="(//div[@class='row-bg'])[2]/p[2]") WebElement txtEmailID;
	@FindBy(xpath="(//p[@class='small-title'])[3]") WebElement labelAddress;
	@FindBy(xpath="(//div[@class='row-bg'])[4]/p[2]") WebElement txtMoveOutDate;
	@FindBy(xpath="//p[@class='meter']") WebElement txtEstimatedBill;
	@FindBy(xpath="(//div[@class='row-bg'])[6]/p[2]") WebElement txtMovingInDate;
	@FindBy(xpath="(//div[@class='row-bg'])[7]/p[2]") WebElement txtOccupancy1;
	@FindBy(xpath="(//div[@class='row-bg'])[11]/p[2]") WebElement txtFinalBillTeaser;
	
	@FindBy(xpath="//li[@id='CI_MAINMENU_topMenuItem0x1']") WebElement btnCCBCustomerInformation;
	@FindBy(xpath="//li[@id='CI_CUSTOMERINFORMATION_subMenuItem1x8']") WebElement btnCCBCustomerContact;
	@FindBy(xpath="//li[@id='CI0000000001']") WebElement btnCCBSearch;
	@FindBy(id="CC_ID") WebElement txtCCBCustomerContactID;
	@FindBy(id="BU_Main_mainSearch") WebElement btnCCBSearch2;
	@FindBy(xpath="(//td[@class='inactiveTab'])[2]") WebElement tabCharacteristics;
	@FindBy(id="IM_CC_CHAR:3$GOTO_BTN") WebElement btnCCBMenuSymbol1;
	@FindBy(id="title_heading_3") WebElement txtCCBProcessInfo;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[1]") WebElement txtCCBMODate;
	@FindBy(xpath="//label[@oramdlabel='CM_MIMO_AVAIL_STOP_MR_LBL']") WebElement txtCCBAvailableStopMeterReads;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[2]") WebElement txtCCBMIDate;
	@FindBy(xpath="(//span[@class='oraNormal'])[24]") WebElement txtCCBOccupancy;
	
	String lastCCBReading, moDate_App, moDate_CCB, miDate_App, miDate_CCB, accountNumber, eMailID, confirmationNo, ccbUsername, ccbPassword;
	
	public MOMeasured_MIUnmeasured_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//MOMeasured_MIUnmeasured_LoggedIn.properties");
	}
	
	public void navigateToYourCurrentAddress() throws Exception{
		btnYes.click();
		elementVisible(100, txtYourCurrentAddress);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourCurrentAddress);
		Assert.assertEquals(true, txtCongratulationsOnYourBigMove.getText().contains(c.getData("existingPropertyTeaser")));
		Assert.assertEquals(true, txtAddressYouAreMovingFrom.getText().contains(c.getData("leavingAddressLabel")));
		Assert.assertEquals(true, labelPhoneNumber.isDisplayed());
		txtPhoneNo.clear();
	}

	public void enterMovingOutDate(String moveOutdate, String accNo, String username, String pwd) throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", btnMovingOutDate);
		btnMovingOutDate.click();
		Thread.sleep(1000);
		moDate_App = moveOutdate;
		moDate_CCB = moveOutdate.replaceAll("/", "-");
		accountNumber=accNo;
		txtMovingOutDate.sendKeys(moveOutdate);
		labelPhoneNumber.click();
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelDateFormat);
		String moveOutDate = moveOutdate.substring(6)+"-"+moveOutdate.substring(3, 5)+"-"+moveOutdate.substring(0, 2);
		ccbUsername=username;
		ccbPassword=pwd;
		if (moveOutDate.compareTo(LocalDate.now().plusDays(5).toString())>0) {
        	Assert.assertEquals(true, txtHowDoWeWorkOutYourBill1.getText().contains(c.getData("finalizingBillLabel")));
        	Assert.assertEquals(true, txtWhenWeDontHaveUpdatedMR.getText().contains(c.getData("finalizingBillTeaserInAdvance")));
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
    		Assert.assertEquals(true, txtWhoIsMovingIntoThisAddress.getText().contains(c.getData("futureOccupierLabel")));
            Assert.assertEquals(true, txtPlsTellUsName.getText().contains(c.getData("futureOccupierTeaser")));
		}
		else if (moveOutDate.compareTo(LocalDate.now().minusDays(5).toString())<0) {
			Thread.sleep(1000);
		}
        else {
        	Assert.assertEquals(true, txtHowDoWeWorkOutYourBill2.getText().contains(c.getData("finalizingBillLabel")));
        	Assert.assertEquals(true, txtWeWouldLoveMR.getText().contains(c.getData("finalizingBillTeaserFiveDay")));
            Assert.assertEquals(true, txtWhoIsMovingIntoThisAddress.getText().contains(c.getData("futureOccupierLabel")));
            Assert.assertEquals(true, txtPlsTellUsName.getText().contains(c.getData("futureOccupierTeaser")));
        }
        Assert.assertEquals(true, txtPlsCheckInformation1.getText().contains(c.getData("plsCheckAllTheseDetailsText1")));
        Assert.assertEquals(true, btnNext1.isDisplayed());
       ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelDateFormat);
	}
		
	public void navigateToYourNewHomePage(String moveInDate) throws Exception{
		btnNext1.click();
		elementVisible(100, txtYourNewHome);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourNewHome);
        Assert.assertEquals(true, txtWhenMovingIntoNewHome.getText().contains(c.getData("moveInDateLabel")));
		btnMoveInDate.click();
		Thread.sleep(1000);
		miDate_App = moveInDate;
		miDate_CCB = moveInDate.replaceAll("/", "-");
		txtMoveInDate.sendKeys(moveInDate);
		//txtYourNewHome.click();
		txtFindMyAddress.click();
		Thread.sleep(1000);
	}
	
	public void enterMIAddress(String miAddress) throws Exception {
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
		/*Assert.assertEquals(true, btnYes1.isEnabled());
		Assert.assertEquals(true, btnNo1.isDisplayed());
		Assert.assertEquals(true, btnWhyWeAsk1.isDisplayed());*/
		Assert.assertEquals(true, btnYes2.isDisplayed());
		Assert.assertEquals(true, btnNo2.isDisplayed());
		Assert.assertEquals(true, btnWhyWeAsk2.isDisplayed());
		btnNo2.click();
		Assert.assertEquals(true, txtPSRTeaser.getText().contains(c.getData("psrTeaser")));
		Assert.assertEquals(true, txtMoneyMattersTeaser.getText().contains(c.getData("moneyMattersTeaser")));
		Assert.assertEquals(true, txtPlsCheckInformation2.getText().contains(c.getData("plsCheckAllTheseDetailsText2")));
		Assert.assertEquals(true, btnNext2.isDisplayed());
		Assert.assertEquals(true, btnGoBack1.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtFindMyAddress);
	}
	
	public void navigateToYourBillsPage() throws Exception {
		btnNext2.click();
		Thread.sleep(3000);
		//driver.switchTo().alert().accept();
		elementVisible(100, txtYourBills);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
		Assert.assertEquals(true, txtDoesNotWaterMeter.getText().contains(c.getData("yourBillsTitle")));
		String[] str = txtYourBillsTeaser.getText().split("\n");
		Assert.assertEquals(true, str[0].contains(c.getData("yourBillsTeaser1")));
		Assert.assertEquals(true, str[2].contains(c.getData("yourBillsTeaser2")));
		//Assert.assertEquals(true, str[4].contains(c.getData("yourBillsTeaser3")));
		//Assert.assertEquals(true, txtEBillingTeaser.getText().contains(c.getData("eBillingTeaser")));
		Assert.assertEquals(true, linkEBillingTermsAndConditions.isDisplayed());
		Assert.assertEquals(true, btnNext3.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
	}

	public void navigateToReadyPage(String email) throws Exception {
		btnNext3.click();
		elementVisible(100, txtReady);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtReady);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		eMailID=email;
		Assert.assertEquals(true, txtEmail.getText().equalsIgnoreCase(email));
		Assert.assertEquals(true, txtMODate.getText().equalsIgnoreCase(moDate_App));
		Assert.assertEquals(true, txtEstimateYourBill.getText().contains(c.getData("estimateReadingText")));
		Assert.assertEquals(true, txtMIDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy.getText().equalsIgnoreCase("4"));
		Assert.assertEquals(true, btnDone.isDisplayed());
		Assert.assertEquals(true, btnGoBack3.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAddress);
	}
	
	public void navigateToConfirmationScreen() throws Exception{
		btnDone.click();
		elementVisible(200, txtGreatYouAreDone);
		Thread.sleep(2000);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);
		Assert.assertEquals(true, txtEmailYouInformation.getText().contains(c.getData("successMsgTeaser1")+" "+eMailID));
		confirmationNo=txtConfirmationNumber.getText();
		Assert.assertEquals(true, txtYouCanCheckAboutMove.getText().contains(c.getData("successMsgTeaser2")));
		Assert.assertEquals(true, txtUpdateYourAccount.getText().contains(c.getData("successMsgTeaser3")));
		Assert.assertEquals(true, accordianShowMeDetails.isDisplayed());
		Assert.assertEquals(true, txtSuccessMsgTeaser4.getText().contains(c.getData("successMsgTeaser4")));
		Assert.assertEquals(true, btnGoToHelpCentre.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtGreatYouAreDone);
	}
	
	public void clickOnShowMeDetails() throws Exception{
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordianShowMeDetails);
		accordianShowMeDetails.click();
		elementVisible(100, txtEmailID);
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(eMailID));
		Assert.assertEquals(true, txtMoveOutDate.getText().equalsIgnoreCase(moDate_App));
		Assert.assertEquals(true, txtEstimatedBill.getText().equalsIgnoreCase(c.getData("estimateReadingText")));
		Assert.assertEquals(true, txtMovingInDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy1.getText().equalsIgnoreCase("4"));
		Assert.assertEquals(true, txtFinalBillTeaser.getText().contains(c.getData("finalBillTeaser")+" "+eMailID));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelAddress);
	}
	
	public void moProcessInCCB() throws Exception{
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
		Assert.assertEquals(true, txtCCBMODate.getText().contains(moDate_CCB));
	}

	public void miProcessInCCB() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCCBAvailableStopMeterReads);
		Assert.assertEquals(true, txtCCBMIDate.getText().contains(miDate_CCB));
		Assert.assertEquals(true, txtCCBOccupancy.getText().contains("4"));
	}

}
