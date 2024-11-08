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
import io.cucumber.datatable.DataTable;

public class SetupDirectDebit_Loc extends BasePage{

	@FindBy(xpath = "//div[@class='wp-col setup-direct-debit-box']") WebElement columnSetupDirectDebit;
	@FindBy(xpath = "//div[@class='wp-col setup-direct-debit-box']/div/div/div/p") WebElement txtSetupDirectDebit;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block nb-btn-white btn-set-up-dd'])[2]") WebElement btnSetupDirectDebit;
	@FindBy(xpath = "//h5[@class='setup-dd-label']") WebElement labelSetupDD;
	@FindBy(xpath = "//p[@class=\"mandatory-field-teaser\"]") WebElement teaserSetupDD;
	@FindBy(xpath = "//div[@class='form-row setup-dd-question']/div[1]") WebElement txtAreYouTheAccountHolder;
	@FindBy(xpath = "(//a[@class='tooltip-btn'])[18]") WebElement btnAreYouTheAccountHolderInfoIcon;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[18]") WebElement txtAreYouTheAccountHolderInfoIcon;
	@FindBy(xpath = "(//a[@class='tooltip-close'])[18]") WebElement btnAreYouTheAccountHolderInfoIconClose;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block nb-btn-outline yes'])[1]") WebElement btnYes;
	@FindBy(xpath = "(//button[@class='nb-btn nb-btn-block nb-btn-outline no'])[1]") WebElement btnNo;
	@FindBy(xpath = "//div[@class='form-row account-holder-no editorial__block editorial__block-none']/div[1]/p[1]") WebElement txtAccountHolder_NoTeaser1;
	@FindBy(xpath = "//div[@class='form-row account-holder-no editorial__block editorial__block-none']/div[2]/p[1]") WebElement txtAccountHolder_NoTeaser2;
	@FindBy(xpath = "//div[@class='form-row account-holder-no editorial__block editorial__block-none']/div[2]/p[3]") WebElement txtAccountHolder_NoTeaser3;
	@FindBy(xpath = "//div[@class='form-row plink']/p[1]/a[1]") WebElement linkDDIForMetered;
	@FindBy(xpath = "//div[@class='form-row plink']/p[1]/a[2]") WebElement linkDDIForUnmetered;
	@FindBy(xpath = "//div[@class='form-row plink']/p[3]/a[1]") WebElement linkAdobeAcrobat;
	@FindBy(xpath = "//div[@class='form-row choose-frequency']/div[1]") WebElement labelHowoftenDoyouWantToPay;
	@FindBy(xpath = "(//a[@class='tooltip-btn'])[19]") WebElement btnHowoftenDoyouWantToPayInfoIcon;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[19]") WebElement txtHowoftenDoyouWantToPayInfoIcon;
	@FindBy(xpath = "(//a[@class='tooltip-close'])[19]") WebElement btnHowoftenDoyouWantToPayInfoIconClose;	
	@FindBy(xpath = "(//a[@class='tooltip-btn'])[20]") WebElement btnPaymentDateInfoIcon;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[20]") WebElement txtPaymentDateInfoIcon;
	@FindBy(xpath = "(//a[@class='tooltip-close'])[20]") WebElement btnPaymentDateInfoIconClose;	
	@FindBy(xpath = "(//a[@class='tooltip-btn'])[21]") WebElement btnBranchSortCodeInfoIcon;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[21]") WebElement txtBranchSortCodeInfoIcon;
	@FindBy(xpath = "(//a[@class='tooltip-close'])[21]") WebElement btnBranchSortCodeInfoIconClose;	
	@FindBy(xpath = "(//a[@class='tooltip-btn'])[22]") WebElement btnBankAccountNumberInfoIcon;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[22]") WebElement txtBankAccountNumberInfoIcon;
	@FindBy(xpath = "(//a[@class='tooltip-close'])[22]") WebElement btnBankAccountNumberInfoIconClose;
	@FindBy(xpath = "(//a[@class='tooltip-btn'])[23]") WebElement btnHouseOccupancyInfoIcon;
	@FindBy(xpath = "(//span[@class='tooltip-label'])[23]") WebElement txtHouseOccupancyInfoIcon;
	@FindBy(xpath = "(//a[@class='tooltip-close'])[23]") WebElement btnHouseOccupancyInfoIconClose;
	
	@FindBy(xpath = "(//div[@class='form-select selected'])[7]") WebElement drpdownPaymentDate;
	@FindBy(xpath = "//input[@class='form-control account-holder-name']") WebElement txtAccountHolderName;
	@FindBy(xpath = "//input[@name='sort-code-box-1']") WebElement txtSortCode1;
	@FindBy(xpath = "//input[@name='sort-code-box-2']") WebElement txtSortCode2;
	@FindBy(xpath = "//input[@name='sort-code-box-3']") WebElement txtSortCode3;
	@FindBy(xpath = "//input[@class='form-control bank-account-number']") WebElement txtBankAccountNumber;
	@FindBy(xpath = "(//div[contains(@class,'form-select selected')])[3]") WebElement pleaseselectHowOftenDoYouWantToPay;
	@FindBy(xpath = "(//div[@class='sel__box_inner'])[3]/span") List<WebElement> drpdownHowOftenDoYouWantToPay;
	@FindBy(xpath = "//div[@class='form-select selected actived']/div/div/span") List<WebElement> ListOfPaymentdates;
	@FindBy(xpath = "(//div[@class='nb-col-6 number-occupant-align-center mw-100'])[1]/div/div") WebElement pleaseselectDrpdownOccupancyValue;
	@FindBy(xpath = "(//div[@class='sel__box_inner'])[9]/span") List<WebElement> drpdownHouseOccupancy;
	@FindBy(xpath = "(//a[@class='nb-btn-link'])[5]") WebElement linkReadDirectDebitGuarantee;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-set-up-dd']") WebElement btnSetupDD;
	@FindBy(xpath = "//div[@class='wp-twocol--style setup-dd-step2']/div/div/h5") WebElement txtCheckYourDDDetails;
	@FindBy(xpath = "(//div[@class='form-row editorial__block editorial__block-none'])[1]") WebElement txtReviewDD;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-to-step1']") WebElement btnGoBack;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block btn-confirm-setup-dd']") WebElement btnConfirmDD;
	@FindBy(xpath = "//a[@href='/help/ddg/']") WebElement linkReadDDGuarantee;
	@FindBy(xpath = "//div[@class='wp-twocol--style setup-dd-step3']/div/div/h5") WebElement txtDDSuccessHeading;
	@FindBy(xpath = "//div[@class='form-row thank-you-teaser']/p") WebElement txtDDSuccessDescription;
	@FindBy(xpath = "//strong[@class='confirmation-number']") WebElement txtConfirmationNumber;
	@FindBy(xpath = "//button[@class='nb-btn nb-btn-block nb-btn-outline btn-back-to-my-account']") WebElement btnGoBackToMyAccount;
	@FindBy(xpath = "(//a[@class=\"nb-btn nb-btn-block nb-btn-white\"])[2]") WebElement btnHelp;
	
	@FindBy(xpath="(//td[@class='oraNormal oraTableData']/a)[1]") WebElement linkCCBAccountName;
	@FindBy(id="userId") WebElement btnCCBUserID;
	@FindBy(id="password") WebElement btnCCBPwd;
	@FindBy(id="loginButton") WebElement btnCCBLogin;
	@FindBy(id="ACCT_ID") WebElement txtCCBAccountID;
	@FindBy(id="BU_ALT1_accntSrc") WebElement btnCCBSearch;
	@FindBy(xpath="(//td[@id='SEARCH_RESULTS|0'])[1]") WebElement btnCCBAccountName;
	@FindBy(xpath="//td[@id='AUTOPAY_TLBL']") WebElement tabAutopay;
	@FindBy(xpath="//*[@id='ACCT_APAY$ENTITY_NAME']") WebElement txtName;
	@FindBy(xpath="//span[@id='ACCT_APAY$DESCR']") WebElement txtAutoPaySourceCode;
	@FindBy(xpath="//input[@id='ACCT_APAY$START_DT']") WebElement txtStartDate;

	String confirmationNo, customerName;
	
	public SetupDirectDebit_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//SetupDirectDebit.properties");
	}

    public void userVerifiesSetupDirectDebitSection() throws Exception {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", columnSetupDirectDebit);
    	Assert.assertEquals(true, txtSetupDirectDebit.getText().contains(c.getData("infoSetupDD")));
    	Assert.assertTrue(btnSetupDirectDebit.isDisplayed());
    }

    public void redirectsToSetupDirectDebitPage() throws Exception {
    	elementVisible(100, btnSetupDirectDebit);
    	btnSetupDirectDebit.click();
    	elementVisible(100, labelSetupDD);
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelSetupDD);
    	Assert.assertEquals(true, labelSetupDD.getText().contains(c.getData("labelSetupDD")));
    	Assert.assertEquals(true, teaserSetupDD.getText().contains(c.getData("teaserSetupDD")));	
    	Assert.assertEquals(true, txtAreYouTheAccountHolder.getText().contains(c.getData("questionSetupDD")));
    	btnAreYouTheAccountHolderInfoIcon.click();
    	elementVisible(100, txtAreYouTheAccountHolderInfoIcon);
    	Assert.assertEquals(true, txtAreYouTheAccountHolderInfoIcon.getText().contains(c.getData("areYouTheAccountHolderInformationText")));
    	btnAreYouTheAccountHolderInfoIconClose.click();
    	Thread.sleep(1000);
    	Assert.assertTrue(btnYes.isDisplayed());
    	Assert.assertTrue(btnNo.isDisplayed());
    }
    
    public void clicksOnNoBtn() throws Exception {	
    	btnNo.click();
    	elementVisible(100, txtAccountHolder_NoTeaser1);	
    	Assert.assertEquals(true, txtAccountHolder_NoTeaser1.getText().contains(c.getData("accountHolder_NoTeaser1")));
    	Assert.assertEquals(true, txtAccountHolder_NoTeaser2.getText().contains(c.getData("accountHolder_NoTeaser2")));
    	Assert.assertEquals(true, txtAccountHolder_NoTeaser3.getText().contains(c.getData("accountHolder_NoTeaser3")));
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtAreYouTheAccountHolder);
    }
    
    public void ddiMeteredProperty() throws Exception {
		linkDDIForMetered.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
	}

	public void ddiUnmeteredProperty() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, linkDDIForUnmetered);
		linkDDIForUnmetered.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
	}

	public void userClicksOnAdobeAcrobatLink() throws Exception {
		driver.close();
		handleMultipleTabs(0);
		elementVisible(100, linkDDIForUnmetered);
		linkAdobeAcrobat.click();
		Thread.sleep(2000);
		handleMultipleTabs(1);
	}
    
    public void clicksOnYesBtn() throws Exception {
    	driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnYes);
    	btnYes.click();
    	elementVisible(100, labelHowoftenDoyouWantToPay);
        Assert.assertEquals(true, labelHowoftenDoyouWantToPay.getText().trim().contains(c.getData("labelHowOftenDoyouWantToPay")));
        btnHowoftenDoyouWantToPayInfoIcon.click();
    	elementVisible(100, txtHowoftenDoyouWantToPayInfoIcon);
    	Assert.assertEquals(true, txtHowoftenDoyouWantToPayInfoIcon.getText().contains(c.getData("tooltipDDHowOften")));
    	Thread.sleep(1000);
    	btnHowoftenDoyouWantToPayInfoIconClose.click();
    	Thread.sleep(1000);
    	btnPaymentDateInfoIcon.click();
    	elementVisible(100, txtPaymentDateInfoIcon);
    	Assert.assertEquals(true, txtPaymentDateInfoIcon.getText().contains(c.getData("tooltipPaymentDate")));
    	Thread.sleep(1000);
    	btnPaymentDateInfoIconClose.click();
    	Thread.sleep(1000);
    	btnBranchSortCodeInfoIcon.click();
    	elementVisible(100, txtBranchSortCodeInfoIcon);
    	Assert.assertEquals(true, txtBranchSortCodeInfoIcon.getText().contains(c.getData("tooltipBranchSortCode")));
    	Thread.sleep(1000);
        btnBranchSortCodeInfoIconClose.click();
    	Thread.sleep(1000);
    	btnBankAccountNumberInfoIcon.click();
    	elementVisible(100, txtBankAccountNumberInfoIcon);
    	Assert.assertEquals(true, txtBankAccountNumberInfoIcon.getText().contains(c.getData("tooltipBankAccNo")));
    	Thread.sleep(1000);
    	btnBankAccountNumberInfoIconClose.click();
    	Thread.sleep(1000);
    	btnHouseOccupancyInfoIcon.click();
    	elementVisible(100, txtHouseOccupancyInfoIcon);
    	Assert.assertEquals(true, txtHouseOccupancyInfoIcon.getText().contains(c.getData("tooltipHouseOccupancy")));
    	Thread.sleep(1000);
    	btnHouseOccupancyInfoIconClose.click();
    	Thread.sleep(1000);
    }
   
    public void userEntersBankDetails(DataTable table) throws Exception {
       	List<List<String>> data = table.cells();
           	if(!pleaseselectHowOftenDoYouWantToPay.getAttribute("class").contains("selected")){
    		pleaseselectHowOftenDoYouWantToPay.click();
    	    Thread.sleep(1000);
 		    for (WebElement frequency : drpdownHowOftenDoYouWantToPay) {
 			    if(frequency.getText().equalsIgnoreCase(data.get(1).get(1))) {
 			    	frequency.click();
 				break;
 			  } 
 		   }
 		  }
    	elementVisible(100, drpdownPaymentDate);
    	drpdownPaymentDate.click();
		   Thread.sleep(2000);
		   for (WebElement date : ListOfPaymentdates) {
			   if(date.getText().equalsIgnoreCase(data.get(5).get(1))) {
				   date.click();
				break;
			  }
		   }
		Thread.sleep(2000);
		customerName = data.get(1).get(1);
    	txtAccountHolderName.sendKeys(data.get(2).get(1));
    	String s = data.get(3).get(1);
    	String[] sortCode = s.split(" ");
    	txtSortCode1.sendKeys(sortCode[0]);
    	txtSortCode2.sendKeys(sortCode[1]);
    	txtSortCode3.sendKeys(sortCode[2]);
    	Thread.sleep(1000);
    	txtBankAccountNumber.sendKeys(data.get(4).get(1));
    	Thread.sleep(1000);
    	if(!pleaseselectDrpdownOccupancyValue.getAttribute("class").contains("selected")){
    		pleaseselectDrpdownOccupancyValue.click();
    	    Thread.sleep(1000);
 		    for (WebElement people : drpdownHouseOccupancy) {
 			    if(people.getText().equalsIgnoreCase(data.get(6).get(1))) {
 				people.click();
 				break;
 			  } 
 		   }
 		  }
    	Assert.assertTrue(linkReadDirectDebitGuarantee.isDisplayed());
    	Assert.assertTrue(btnSetupDD.isDisplayed());
      }	
	
    public void redirectedToCheckYourDirectDebitdetailsPage() {
    	btnSetupDD.click();
    	elementVisible(100, txtCheckYourDDDetails);
    	Assert.assertTrue(linkReadDDGuarantee.isDisplayed());
    	Assert.assertTrue(btnGoBack.isDisplayed());
    	Assert.assertTrue(btnConfirmDD.isDisplayed());
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCheckYourDDDetails);
    }
    
    public void clicksOnReadTheDDGuaranteeLink() throws Exception {
    	linkReadDDGuarantee.click();
    	Thread.sleep(3000);
		handleMultipleTabs(1);
	}

    public void clicksOnGoBackBtn() throws Exception {
    	driver.close();
		handleMultipleTabs(0);
		elementVisible(100, btnGoBack);
		btnGoBack.click();
		Thread.sleep(3000);
    	elementVisible(100, labelSetupDD);
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", labelSetupDD);
	}

    
    public void redirectedToConfirmationScreen() throws Exception {
    	elementVisible(100, btnConfirmDD);
    	Thread.sleep(1000);
    	btnConfirmDD.click();
    	elementVisible(100, txtDDSuccessHeading);
    	Assert.assertEquals(true, txtDDSuccessHeading.getText().contains(c.getData("successDDHeading")));
    	Assert.assertEquals(true, txtDDSuccessDescription.getText().contains(c.getData("successDDdescription")));
    	confirmationNo = txtConfirmationNumber.getText();
    	Assert.assertTrue(btnGoBackToMyAccount.isDisplayed());
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtConfirmationNumber);
    }
  
    public void clicksOnGoBackToMyAccountBtn() throws Exception {
    	btnGoBackToMyAccount.click();
    	Thread.sleep(3000);
    	elementVisible(100, btnHelp);
    }
    
    public void userVerifiesAutopayTabInCCB( ) throws Exception {
   		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='zoneMapFrame_2']")));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", linkCCBAccountName);
		linkCCBAccountName.click();
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
		Thread.sleep(1000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabMenu']")));
		Thread.sleep(1000);
		elementVisible(200, tabAutopay);
		tabAutopay.click();
		Thread.sleep(2000);
		driver.switchTo().defaultContent();
		driver.switchTo().frame(0);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='tabPage']")));
		elementVisible(200, txtName);
	    Assert.assertEquals(true, txtAutoPaySourceCode.getText().trim().equalsIgnoreCase("Direct Debit"));
    }

}
