package com.nwl.framework;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BasePage {
	
    public static WebDriver driver;
    public static Config c;
	
	public void browserLaunch(String browser, String url) throws Exception {
			if(browser.equalsIgnoreCase("chrome")){	
			    WebDriverManager.chromedriver().setup();
				driver=new ChromeDriver();
			}
			else if(browser.equalsIgnoreCase("edge")){
				WebDriverManager.edgedriver().setup();
				driver=new EdgeDriver();
			}
			else if(browser.equalsIgnoreCase("firefox")){
				WebDriverManager.firefoxdriver().setup();
			    driver=new FirefoxDriver();
			}
			driver.get(url);
			driver.manage().window().maximize();
			Thread.sleep(3000);
			if (url.contains("dev")) {
                Thread.sleep(2000);
                driver.findElement(By.xpath("//input[@name='loginfmt']")).sendKeys("PerformanceTest1@nwgcloud.onmicrosoft.com");
                pic("//screen1.png");
                driver.findElement(By.id("idSIButton9")).click();
                Thread.sleep(3000);
                driver.findElement(By.name("passwd")).sendKeys("Wednesda55&");
                pic("//screen2.png");
                driver.findElement(By.id("idSIButton9")).click();
                Thread.sleep(3000);
                pic("//screen3.png");
                driver.findElement(By.id("idSIButton9")).click();
                Thread.sleep(3000);	
			}
			else if (url.contains("prep")) {
				/*JavascriptExecutor jse = (JavascriptExecutor)driver;
				WebElement acceptCookies=(WebElement) jse.executeScript("return document.querySelector('mon-cb-main').shadowRoot.querySelector('div > mon-cm-focus-trap > div > div.body > mon-cb-home').shadowRoot.querySelector('div > div > mon-cb-button:nth-child(2)').shadowRoot.querySelector('button')");
				((JavascriptExecutor)driver).executeScript("arguments[0].click();", acceptCookies);*/
				Thread.sleep(1000);
			}
			else if (url.contains("int.nwl")) {
			    driver.findElement(By.xpath("//button[@id='CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll']")).click();
			}
			Thread.sleep(1000);
	}
	
	public void elementVisible(int time,WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void selectOption(WebElement element,int option){
		Select s = new Select(element);
		s.selectByIndex(option);
	}
	
	public void handleMultipleTabs(int index){
		Set<String> windows = driver.getWindowHandles();
		Object[] s = windows.toArray();
		driver.switchTo().window(s[index].toString());
	}
	
	public static File createDirectory(String directoryPath) throws IOException {
		File dir = new File(directoryPath);
		if (dir.exists()) {
			return dir;
		}
		if (dir.mkdirs()) {
			return dir;
		}
		throw new IOException("Failed to create directory '" + dir.getAbsolutePath() + "' for an unknown reason.");
	}
	
	public void pic(String path) throws Exception {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src, new File(System.getProperty("user.dir")+"//Screenshots//"+path));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
