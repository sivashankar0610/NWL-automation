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

public class EnforcedMoveWithIn_LoggedIn_Loc extends BasePage {
	
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block go-next']") WebElement btnNext2;
	@FindBy(xpath="//div[@class='enforced-move-within__step3 wp-spacing']/div/h4") WebElement txtYourBills;
	@FindBy(xpath="//div[@class='unmetered-teaser']/strong") WebElement txtDoesNotWaterMeter;
	@FindBy(xpath="//div[@class='unmetered-teaser']/p") WebElement txtYourBillsTeaser;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[2]") WebElement btnSDD_Yes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[2]") WebElement btnSDD_No;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[2]") WebElement btnAccountHolder_Yes;
	@FindBy(xpath="(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[3]") WebElement btnAccountHolder_No;
	//@FindBy(xpath="//label[@class='switch-text text-bold']") WebElement txtEBillingTeaser;
	@FindBy(xpath="(//a[@class='nb-btn-link'])[3]") WebElement linkEBillingTermsAndConditions;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block  btn-next']") WebElement btnNext3;
	@FindBy(xpath="//button[@class='nb-btn nb-btn-block nb-btn-outline btn-goback']") WebElement btnGoBack2;
	@FindBy(xpath="//div[@class='enforced-move-within__step4 wp-spacing']/div[2]/div/h4") WebElement txtReady;
	@FindBy(xpath="(//div[@class='account-teaser']/div)[3]/p") WebElement txtCheckOverInformation;
	@FindBy(xpath="//p[@class='email']") WebElement txtEmail;
	@FindBy(xpath="(//div[@class='sub-title'])[15]") WebElement txtAboutYou;
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
	@FindBy(xpath="(//div[@class='sub-title'])[2]") WebElement txtAboutYou2;
	@FindBy(xpath="(//div[@class='row-bg'])[4]/p[2]") WebElement txtMoveInDate;
	@FindBy(xpath="(//div[@class='row-bg'])[5]/p[2]") WebElement txtOccupancy1;
	@FindBy(xpath="(//div[@class='row-bg'])[9]/p[2]") WebElement txtFinalBillTeaser;
	
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
	@FindBy(xpath="//label[@oramdlabel='CM_MIMO_AVAIL_STOP_MR_LBL']") WebElement txtCCBAvailableStopMeterReads;
	@FindBy(xpath="(//span[@class='oraNormal oraDate'])[2]") WebElement txtCCBMIDate;
	@FindBy(xpath="(//span[@class='oraNormal'])[24]") WebElement txtCCBOccupancy;
	
	String eMailID, confirmationNo, miDate_App, miDate_CCB;
	
	
	public EnforcedMoveWithIn_LoggedIn_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//EnforcedMoveWithIn_LoggedIn.properties");
	}
	
	public void navigateToYourBillsScreen() throws Exception {
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
		Assert.assertEquals(true, btnSDD_Yes.isDisplayed());
		Assert.assertEquals(true, btnSDD_No.isDisplayed());
		btnSDD_Yes.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnAccountHolder_Yes.isDisplayed());
		Assert.assertEquals(true, btnAccountHolder_No.isDisplayed());
		btnAccountHolder_No.click();
		//Assert.assertEquals(true, txtEBillingTeaser.getText().contains(c.getData("eBillingTeaser")));
		//Assert.assertEquals(true, linkEBillingTermsAndConditions.isDisplayed());
		Assert.assertEquals(true, btnNext3.isDisplayed());
		Assert.assertEquals(true, btnGoBack2.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtYourBills);
	}

	public void navigateToReadyPage(String email, String moveInDate) throws Exception {
		btnNext3.click();
		elementVisible(100, txtReady);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtReady);
		Assert.assertEquals(true, txtCheckOverInformation.getText().contains(c.getData("reviewTeaser")));
		eMailID=email;
		Assert.assertEquals(true, txtEmail.getText().equalsIgnoreCase(email));
		miDate_App = moveInDate;
		miDate_CCB = moveInDate.replaceAll("/", "-");
		Assert.assertEquals(true, txtMIDate.getText().equalsIgnoreCase(moveInDate));
		Assert.assertEquals(true, txtOccupancy.getText().equalsIgnoreCase("4"));
		Assert.assertEquals(true, btnDone.isDisplayed());
		Assert.assertEquals(true, btnGoBack3.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYou);
	}

	public void navigateToConfirmationPage() throws Exception {
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

	public void verifyShowMeDetails() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", accordianShowMeDetails);
		accordianShowMeDetails.click();
		elementVisible(100, txtEmailID);
		Assert.assertEquals(true, txtEmailID.getText().equalsIgnoreCase(eMailID));
		Assert.assertEquals(true, txtMoveInDate.getText().equalsIgnoreCase(miDate_App));
		Assert.assertEquals(true, txtOccupancy1.getText().equalsIgnoreCase("4"));
		//Assert.assertEquals(true, txtFinalBillTeaser.getText().contains(c.getData("finalBillTeaser")+" "+eMailID));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAboutYou2);
	}

	public void opensMOMIProcessExists(String ccbUsername, String ccbPwd) throws Exception {
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
		Assert.assertEquals(true, txtCCBMIDate.getText().contains(miDate_CCB));
		Assert.assertEquals(true, txtCCBOccupancy.getText().contains("4"));
	}

}
