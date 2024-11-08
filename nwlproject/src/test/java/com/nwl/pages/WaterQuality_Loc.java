package com.nwl.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.nwl.framework.BasePage;
import com.nwl.framework.Config;

public class WaterQuality_Loc extends BasePage {
	
	@FindBy(id="idwaterquality") WebElement btnWaterQuality;
	@FindBy(xpath="//div[@data-id='idwaterquality']/div[2]/div/div[1]/div/p[1]") WebElement txtWaterQualityTeaser1;
	@FindBy(xpath="//div[@data-id='idwaterquality']/div[2]/div/div[1]/div/p[1]/strong/a") WebElement linkCheckMyArea;
	@FindBy(xpath="//div[@data-id='idwaterquality']/div[2]/div/div[1]/div/p[2]") WebElement txtWaterQualityTeaser2;
	@FindBy(xpath="//div[@data-id='idwaterquality']/div[2]/div/div[2]/div[1]") WebElement txtWhatSeemsToBeTheProblemLabel;
	@FindBy(xpath="//input[@id='tastes-and-smells']/following-sibling::span[1]") WebElement radioTasteAndSmell;
	@FindBy(xpath="//input[@id='appearance']/following-sibling::span[1]") WebElement radioStrangeColourOrBits;
	@FindBy(xpath="//input[@id='hard-water']/following-sibling::span[1]") WebElement radioHardWater;
	@FindBy(xpath="//div[@class='form-row cold-water-tap']/div[1]") WebElement txtCWSAffectingLabel;
	@FindBy(xpath="(//a[@class='tooltip-btn'])[10]") WebElement btnCWSAffectingInfoIcon;
	@FindBy(xpath="(//span[@class='tooltip-label'])[10]") WebElement txtCWSAffectingInfoIcon;
	@FindBy(xpath="(//a[@class='tooltip-close'])[10]") WebElement btnCWSAffectingInfoIconClose;
	@FindBy(xpath="//div[@class='form-row cold-water-tap']/div[2]/div[1]/button") WebElement btnYes_CWSA;
	@FindBy(xpath="//div[@class='form-row cold-water-tap']/div[2]/div[2]/button") WebElement btnNo_CWSA;
	@FindBy(xpath="//div[@class='form-row seek-help-yourself']/p") WebElement txtCWSAffectingTeaser_No;
	@FindBy(xpath="//div[@class='form-row seek-help-yourself']/p/strong/a") WebElement linkWaterSafe;
	@FindBy(xpath="//div[@class='form-row taste-smell-selection']/div[1]/p") WebElement txtDescribeTasteOrSmellOfWaterLabel;
	@FindBy(xpath="//div[@class='form-row taste-smell-selection']/div[2]/div") WebElement dropdownPlsSelect;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span[1]") WebElement btnChlorineOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtChlorineTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtChlorineTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtChlorineTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]") WebElement txtChlorineTeaser4;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]") WebElement txtChlorineTeaser5;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[6]") WebElement txtChlorineTeaser6;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[7]/a") WebElement linkFindOutMore1;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[2]") WebElement btnTCPOrMouthWashOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtTCPOrMouthWashTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtTCPOrMouthWashTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtTCPOrMouthWashTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]") WebElement txtTCPOrMouthWashTeaser4;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]") WebElement txtTCPOrMouthWashTeaser5;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[6]") WebElement txtTCPOrMouthWashTeaser6;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[6]/strong/a") WebElement linkWaterSafeApprovedPlumber;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[7]/a") WebElement linkFindOutMore2;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[3]") WebElement btnStaleOrMustyOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtStaleOrMustyTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtStaleOrMustyTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtStaleOrMustyTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]") WebElement txtStaleOrMustyTeaser4;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]") WebElement txtStaleOrMustyTeaser5;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[6]") WebElement txtStaleOrMustyTeaser6;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[7]/strong/a") WebElement linkFindAnApprovedPlumberAtWaterSafe1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[8]") WebElement txtStaleOrMustyTeaser7;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[9]") WebElement txtStaleOrMustyTeaser8;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[10]/a") WebElement linkFindOutMore3;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[4]") WebElement btnMetalOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtMetalTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtMetalTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtMetalTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]/strong/a") WebElement linkFindAnApprovedPlumberAtWaterSafe2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]/a") WebElement linkFindOutMore4;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[5]") WebElement btnEggOrFishOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtEggOrFishTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtEggOrFishTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtEggOrFishTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]") WebElement txtEggOrFishTeaser4;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]/a") WebElement linkFindAnApprovedPlumberAtWaterSafe3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[6]/a") WebElement linkFindOutMore5;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[6]") WebElement btnDieselOrPetrolOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtDieselOrPetrolTeaser;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]/a") WebElement linkPhoneNumber;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]/a") WebElement linkFindOutMore6;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[7]") WebElement btnWoodyTastesOrSmellsOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtWoodyTastesOrSmellsTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtWoodyTastesOrSmellsTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]/a") WebElement linkFindOutMore7;
	@FindBy(xpath="//div[@class='form-row has-this-resolved-your-problem']/div[1]") WebElement txtTSInformationHelpedLabel;
	@FindBy(xpath="//div[@class='form-row has-this-resolved-your-problem']/div[2]/div[1]/button") WebElement btnYes_TSIH;
	@FindBy(xpath="//div[@class='form-row has-this-resolved-your-problem']/div[2]/div[2]/button") WebElement btnNo_TSIH;
	@FindBy(xpath="//div[@class='form-row has-this-resolved-your-problem-yes']/div/div") WebElement txtThatIsGreatNews;
	@FindBy(xpath="//div[@class='form-row has-this-resolved-your-problem']/div[3]") WebElement txtCallUsLabel;
	@FindBy(xpath="//div[@class='form-btn has-this-resolved-your-problem-no']/a") WebElement btnArrowPhoneNo;
	@FindBy(xpath="//div[@class='form-btn has-this-resolved-your-problem-no']/a/span[1]") WebElement txtPhoneNo;
	
	@FindBy(xpath="//div[@class='form-row appearance-selection']/div[1]/p") WebElement txtWhatColourIsYourWaterLabel;
	@FindBy(xpath="//div[@class='form-row appearance-selection']/div[2]/div") WebElement dropdownPlsSelect2;
	@FindBy(xpath="//div[@class='form-select actived']/div/div/span[1]") WebElement btnWhiteAndCloudyOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtWhiteAndCloudyTeaser;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]/a") WebElement linkFindOutMore_WAC;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[2]") WebElement btnBlackOrangeOrBrownOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtBlackOrangeOrBrownTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtBlackOrangeOrBrownTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]/a") WebElement linkInYourArea_BOB;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtBlackOrangeOrBrownTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]/a") WebElement linkFindOutMore_BOB;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[3]") WebElement btnPinkBlueOrGreenOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtPinkBlueOrGreenTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtPinkBlueOrGreenTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtPinkBlueOrGreenTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]/a") WebElement linkPhoneNo_PBG;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]/a") WebElement linkFindOutMore_PBG;
	@FindBy(xpath="//div[@class='form-select selected actived']/div/div/span[4]") WebElement btnBiofilmAndMouldOption;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtBiofilmAndMouldTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtBiofilmAndMouldTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtBiofilmAndMouldTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]") WebElement txtBiofilmAndMouldTeaser4;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]/a") WebElement linkFindOutMore_BAM;
	
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[1]") WebElement txtHardWaterTeaser1;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[2]") WebElement txtHardWaterTeaser2;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[3]") WebElement txtHardWaterTeaser3;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[4]") WebElement txtHardWaterTeaser4;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]") WebElement txtHardWaterTeaser5;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[5]/a") WebElement linkWaterSafeApprovedPlumber_HardWater;
	@FindBy(xpath="//div[@class='form-row instruction-text']/p[6]/a") WebElement linkFindOutMore_HardWater;
	
	public WaterQuality_Loc(WebDriver driver) throws Exception {
		PageFactory.initElements(driver, this);
		c=new Config(System.getProperty("user.dir")+"//src//test/resources//PropertyFiles//WaterQuality.properties");
	}

	public void clicksOnWaterQualityButton() throws Exception {
		elementVisible(100, btnWaterQuality);
		btnWaterQuality.click();
		elementVisible(100, txtWaterQualityTeaser1);
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterQualityTeaser1);
		Assert.assertEquals(true, txtWaterQualityTeaser1.getText().contains(c.getData("waterQualityTeaser1")));
		Assert.assertEquals(true, linkCheckMyArea.isDisplayed());
		Assert.assertEquals(true, txtWaterQualityTeaser2.getText().contains(c.getData("waterQualityTeaser2")));
		Assert.assertEquals(true, txtWhatSeemsToBeTheProblemLabel.getText().contains(c.getData("whatSeemsToBeTheProblemLabel")));
		Assert.assertEquals(true, radioTasteAndSmell.isDisplayed());
		Assert.assertEquals(true, radioStrangeColourOrBits.isDisplayed());
		Assert.assertEquals(true, radioHardWater.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWaterQualityTeaser1);
	}

	public void selectsTheTasteAndSmellOfMyWaterRadioButton() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatSeemsToBeTheProblemLabel);
		radioTasteAndSmell.click();
		elementVisible(100, txtCWSAffectingLabel);
		Assert.assertEquals(true, txtCWSAffectingLabel.getText().contains(c.getData("CWSAffectingLabel")));
		btnCWSAffectingInfoIcon.click();
		elementVisible(100, txtCWSAffectingInfoIcon);
		Assert.assertEquals(true, txtCWSAffectingInfoIcon.getText().contains(c.getData("CWSAffectingInformationText")));
		Thread.sleep(500);
		btnCWSAffectingInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnYes_CWSA.isDisplayed());
		Assert.assertEquals(true, btnNo_CWSA.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatSeemsToBeTheProblemLabel);
	}

	public void clicksOnNoButton_CWSA() throws Exception {
		btnNo_CWSA.click();
		elementVisible(100, txtCWSAffectingTeaser_No);
		Assert.assertEquals(true, txtCWSAffectingTeaser_No.getText().contains(c.getData("CWSAffectingTeaser_No")));
		Assert.assertEquals(true, linkWaterSafe.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtCWSAffectingLabel);
	}

	public void clicksOnYesButton_CWSA() throws Exception {
		btnYes_CWSA.click();
		elementVisible(100, txtDescribeTasteOrSmellOfWaterLabel);
		Assert.assertEquals(true, txtDescribeTasteOrSmellOfWaterLabel.getText().contains(c.getData("describeTOSOfWaterLabel")));
		Assert.assertEquals(true, dropdownPlsSelect.isDisplayed());
	}

	public void selectsChlorineOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtDescribeTasteOrSmellOfWaterLabel);
		dropdownPlsSelect.click();
		elementVisible(100, btnChlorineOption);
		Thread.sleep(1000);
		btnChlorineOption.click();
		elementVisible(100, txtChlorineTeaser1);
		Assert.assertEquals(true, txtChlorineTeaser1.getText().contains(c.getData("chlorineTeaser1")));
		Assert.assertEquals(true, txtChlorineTeaser2.getText().contains(c.getData("chlorineTeaser2")));
		Assert.assertEquals(true, txtChlorineTeaser3.getText().contains(c.getData("chlorineTeaser3")));
		Assert.assertEquals(true, txtChlorineTeaser4.getText().contains(c.getData("chlorineTeaser4")));
		Assert.assertEquals(true, txtChlorineTeaser5.getText().contains(c.getData("chlorineTeaser5")));
		Assert.assertEquals(true, txtChlorineTeaser6.getText().contains(c.getData("chlorineTeaser6")));
		Assert.assertEquals(true, linkFindOutMore1.isDisplayed());
	}

	public void selectsTCPOrMouthWashOption() throws Exception {
		dropdownPlsSelect.click();
		elementVisible(100, btnTCPOrMouthWashOption);
		Thread.sleep(1000);
		btnTCPOrMouthWashOption.click();
		elementVisible(100, txtTCPOrMouthWashTeaser1);
		Assert.assertEquals(true, txtTCPOrMouthWashTeaser1.getText().contains(c.getData("TCPOrMouthWashTeaser1")));
		Assert.assertEquals(true, txtTCPOrMouthWashTeaser2.getText().contains(c.getData("TCPOrMouthWashTeaser2")));
		Assert.assertEquals(true, txtTCPOrMouthWashTeaser3.getText().contains(c.getData("TCPOrMouthWashTeaser3")));
		Assert.assertEquals(true, txtTCPOrMouthWashTeaser4.getText().contains(c.getData("TCPOrMouthWashTeaser4")));
		Assert.assertEquals(true, txtTCPOrMouthWashTeaser5.getText().contains(c.getData("TCPOrMouthWashTeaser5")));
		Assert.assertEquals(true, txtTCPOrMouthWashTeaser6.getText().contains(c.getData("TCPOrMouthWashTeaser6")));
		Assert.assertEquals(true, linkWaterSafeApprovedPlumber.isDisplayed());
		Assert.assertEquals(true, linkFindOutMore2.isDisplayed());
	}

	public void selectsStaleOrMustyOption() throws Exception {
		dropdownPlsSelect.click();
		elementVisible(100, btnStaleOrMustyOption);
		Thread.sleep(1000);
		btnStaleOrMustyOption.click();
		elementVisible(100, txtStaleOrMustyTeaser1);
		Assert.assertEquals(true, txtStaleOrMustyTeaser1.getText().contains(c.getData("staleOrMustyTeaser1")));
		Assert.assertEquals(true, txtStaleOrMustyTeaser2.getText().contains(c.getData("staleOrMustyTeaser2")));
		Assert.assertEquals(true, txtStaleOrMustyTeaser3.getText().contains(c.getData("staleOrMustyTeaser3")));
		Assert.assertEquals(true, txtStaleOrMustyTeaser4.getText().contains(c.getData("staleOrMustyTeaser4")));
		Assert.assertEquals(true, txtStaleOrMustyTeaser5.getText().contains(c.getData("staleOrMustyTeaser5")));
		Assert.assertEquals(true, txtStaleOrMustyTeaser6.getText().contains(c.getData("staleOrMustyTeaser6")));
		Assert.assertEquals(true, linkFindAnApprovedPlumberAtWaterSafe1.isDisplayed());
		Assert.assertEquals(true, txtStaleOrMustyTeaser7.getText().contains(c.getData("staleOrMustyTeaser7")));
		Assert.assertEquals(true, txtStaleOrMustyTeaser8.getText().contains(c.getData("staleOrMustyTeaser8")));
		Assert.assertEquals(true, linkFindOutMore3.isDisplayed());
	}

	public void selectsMetalOption() throws Exception {
		dropdownPlsSelect.click();
		elementVisible(100, btnMetalOption);
		Thread.sleep(1000);
		btnMetalOption.click();
		elementVisible(100, txtMetalTeaser1);
		Assert.assertEquals(true, txtMetalTeaser1.getText().contains(c.getData("metalTeaser1")));
		Assert.assertEquals(true, txtMetalTeaser2.getText().contains(c.getData("metalTeaser2")));
		Assert.assertEquals(true, txtMetalTeaser3.getText().contains(c.getData("metalTeaser3")));
		Assert.assertEquals(true, linkFindAnApprovedPlumberAtWaterSafe2.isDisplayed());
		Assert.assertEquals(true, linkFindOutMore4.isDisplayed());
	}

	public void selectsEggOrFishOption() throws Exception {
		dropdownPlsSelect.click();
		elementVisible(100, btnEggOrFishOption);
		Thread.sleep(1000);
		btnEggOrFishOption.click();
		elementVisible(100, txtEggOrFishTeaser1);
		Assert.assertEquals(true, txtEggOrFishTeaser1.getText().contains(c.getData("eggOrFishTeaser1")));
		Assert.assertEquals(true, txtEggOrFishTeaser2.getText().contains(c.getData("eggOrFishTeaser2")));
		Assert.assertEquals(true, txtEggOrFishTeaser3.getText().contains(c.getData("eggOrFishTeaser3")));
		Assert.assertEquals(true, txtEggOrFishTeaser4.getText().contains(c.getData("eggOrFishTeaser4")));
		Assert.assertEquals(true, linkFindAnApprovedPlumberAtWaterSafe3.isDisplayed());
		Assert.assertEquals(true, linkFindOutMore5.isDisplayed());
	}

	public void selectsDieselOrPetrolOption() throws Exception {
		dropdownPlsSelect.click();
		elementVisible(100, btnDieselOrPetrolOption);
		Thread.sleep(1000);
		btnDieselOrPetrolOption.click();
		elementVisible(100, txtDieselOrPetrolTeaser);
		Assert.assertEquals(true, txtDieselOrPetrolTeaser.getText().contains(c.getData("dieselOrPetrolTeaser")));
		Assert.assertEquals(true, linkPhoneNumber.isDisplayed());
		Assert.assertEquals(true, linkFindOutMore6.isDisplayed());
	}

	public void selectsWoodyTastesOrSmellsOption() throws Exception {
		dropdownPlsSelect.click();
		elementVisible(100, btnWoodyTastesOrSmellsOption);
		Thread.sleep(1000);
		btnWoodyTastesOrSmellsOption.click();
		elementVisible(100, txtWoodyTastesOrSmellsTeaser1);
		Assert.assertEquals(true, txtWoodyTastesOrSmellsTeaser1.getText().contains(c.getData("woodyTastesOrSmellsTeaser1")));
		Assert.assertEquals(true, txtWoodyTastesOrSmellsTeaser2.getText().contains(c.getData("woodyTastesOrSmellsTeaser2")));
		Assert.assertEquals(true, linkFindOutMore7.isDisplayed());
	}
	
    public void clicksOnYesButton_InformationHelped() throws Exception {
    	((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtTSInformationHelpedLabel);
    	Assert.assertEquals(true, txtTSInformationHelpedLabel.getText().contains(c.getData("TSInformationHelpedLabel")));
		Assert.assertEquals(true, btnYes_TSIH.isDisplayed());
		Assert.assertEquals(true, btnNo_TSIH.isDisplayed());
		btnYes_TSIH.click();
		elementVisible(100, txtThatIsGreatNews);
		Assert.assertEquals(true, txtThatIsGreatNews.getText().contains(c.getData("TSInformationHelpedTeaser_Yes")));
	}

	public void clicksOnNoButton_InformationHelped() throws Exception {
		btnNo_TSIH.click();
		elementVisible(100, txtCallUsLabel);
		Thread.sleep(1000);
		Assert.assertEquals(true, txtCallUsLabel.getText().contains(c.getData("callUsLabel")));
		Assert.assertEquals(true, btnArrowPhoneNo.isDisplayed());
		Assert.assertEquals(true, txtPhoneNo.getText().contains(c.getData("phoneNumber")));
	}

	public void selectsMyWaterHasStrangeColourOrBitsOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatSeemsToBeTheProblemLabel);
		radioStrangeColourOrBits.click();
		elementVisible(100, txtCWSAffectingLabel);
		Assert.assertEquals(true, txtCWSAffectingLabel.getText().contains(c.getData("CWSAffectingLabel")));
		btnCWSAffectingInfoIcon.click();
		elementVisible(100, txtCWSAffectingInfoIcon);
		Assert.assertEquals(true, txtCWSAffectingInfoIcon.getText().contains(c.getData("CWSAffectingInformationText")));
		Thread.sleep(500);
		btnCWSAffectingInfoIconClose.click();
		Thread.sleep(500);
		Assert.assertEquals(true, btnYes_CWSA.isDisplayed());
		Assert.assertEquals(true, btnNo_CWSA.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatSeemsToBeTheProblemLabel);
	}

	public void clickOnYesButton_CWSA() throws Exception {
		btnYes_CWSA.click();
		elementVisible(100, txtWhatColourIsYourWaterLabel);
		Assert.assertEquals(true, txtWhatColourIsYourWaterLabel.getText().contains(c.getData("whatColourIsYourWaterLabel")));
		Assert.assertEquals(true, dropdownPlsSelect2.isDisplayed());
	}

	public void selectsWhiteAndCloudyOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatColourIsYourWaterLabel);
		dropdownPlsSelect2.click();
		elementVisible(100, btnWhiteAndCloudyOption);
		Thread.sleep(1000);
		btnWhiteAndCloudyOption.click();
		elementVisible(100, txtWhiteAndCloudyTeaser);
		Assert.assertEquals(true, txtWhiteAndCloudyTeaser.getText().contains(c.getData("whiteAndCloudyTeaser")));
		Assert.assertEquals(true, linkFindOutMore_WAC.isDisplayed());
		
	}

	public void selectsBlackOrangeOrBrownOption() throws Exception {
		dropdownPlsSelect2.click();
		elementVisible(100, btnBlackOrangeOrBrownOption);
		Thread.sleep(1000);
		btnBlackOrangeOrBrownOption.click();
		elementVisible(100, txtBlackOrangeOrBrownTeaser1);
		Assert.assertEquals(true, txtBlackOrangeOrBrownTeaser1.getText().contains(c.getData("blackOrangeOrBrownTeaser1")));
		Assert.assertEquals(true, txtBlackOrangeOrBrownTeaser2.getText().contains(c.getData("blackOrangeOrBrownTeaser2")));
		Assert.assertEquals(true, linkInYourArea_BOB.isDisplayed());
		Assert.assertEquals(true, txtBlackOrangeOrBrownTeaser3.getText().contains(c.getData("blackOrangeOrBrownTeaser3")));
		Assert.assertEquals(true, linkFindOutMore_BOB.isDisplayed());
	}

	public void selectsPinkBlueOrGreenOption() throws Exception {
		dropdownPlsSelect2.click();
		elementVisible(100, btnPinkBlueOrGreenOption);
		Thread.sleep(1000);
		btnPinkBlueOrGreenOption.click();
		elementVisible(100, txtPinkBlueOrGreenTeaser1);
		Assert.assertEquals(true, txtPinkBlueOrGreenTeaser1.getText().contains(c.getData("pinkBlueOrGreenTeaser1")));
		Assert.assertEquals(true, txtPinkBlueOrGreenTeaser2.getText().contains(c.getData("pinkBlueOrGreenTeaser2")));
		Assert.assertEquals(true, txtPinkBlueOrGreenTeaser3.getText().contains(c.getData("pinkBlueOrGreenTeaser3")));
		Assert.assertEquals(true, linkPhoneNo_PBG.isDisplayed());
		Assert.assertEquals(true, linkFindOutMore_PBG.isDisplayed());
	}

	public void selectsBiofilmAndMouldOption() throws Exception {
		dropdownPlsSelect2.click();
		elementVisible(100, btnBiofilmAndMouldOption);
		Thread.sleep(1000);
		btnBiofilmAndMouldOption.click();
		elementVisible(100, txtBiofilmAndMouldTeaser1);
		Assert.assertEquals(true, txtBiofilmAndMouldTeaser1.getText().contains(c.getData("biofilmAndMouldTeaser1")));
		Assert.assertEquals(true, txtBiofilmAndMouldTeaser2.getText().contains(c.getData("biofilmAndMouldTeaser2")));
		Assert.assertEquals(true, txtBiofilmAndMouldTeaser3.getText().contains(c.getData("biofilmAndMouldTeaser3")));
		Assert.assertEquals(true, txtBiofilmAndMouldTeaser4.getText().contains(c.getData("biofilmAndMouldTeaser4")));
		Assert.assertEquals(true, linkFindOutMore_BAM.isDisplayed());
	}
	
	public void selectsIHaveHardWaterOption() throws Exception {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatSeemsToBeTheProblemLabel);
		radioHardWater.click();
		Thread.sleep(1000);
		elementVisible(100, txtHardWaterTeaser1);
		Assert.assertEquals(true, txtHardWaterTeaser1.getText().contains(c.getData("hardWaterTeaser1")));
		Assert.assertEquals(true, txtHardWaterTeaser2.getText().contains(c.getData("hardWaterTeaser2")));
		Assert.assertEquals(true, txtHardWaterTeaser3.getText().contains(c.getData("hardWaterTeaser3")));
		Assert.assertEquals(true, txtHardWaterTeaser4.getText().contains(c.getData("hardWaterTeaser4")));
		Assert.assertEquals(true, txtHardWaterTeaser5.getText().contains(c.getData("hardWaterTeaser5")));
		Assert.assertEquals(true, linkWaterSafeApprovedPlumber_HardWater.isDisplayed());
		Assert.assertEquals(true, linkFindOutMore_HardWater.isDisplayed());
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", txtWhatSeemsToBeTheProblemLabel);
	}

}
