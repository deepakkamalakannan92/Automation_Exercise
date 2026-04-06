package com.base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.apache.commons.io.FileUtils;
import org.jspecify.annotations.Nullable;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BaseClass {

	public static WebDriver driver;
	public static Select sl;
	public static Actions act;
	public static Alert at;
	public static TakesScreenshot ss;
	public static WebDriverWait waitt;

	public static void browserlaunch() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}

	public static void geturl(String url) {
		driver.get(url);
	}

	public static void wait(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));

	}

	public void submit(WebElement cl) {
		cl.click();
	}

	public static void inputkeys(WebElement cl, String im) {
		cl.sendKeys(im);

	}

	public static void closetab() {
		driver.close();

	}

	public static void title() {
		System.out.println(driver.getTitle());
		//String acttitle = driver.getTitle();
		//String Extitle = "Automation Exercise";
		//Assert.assertEquals(Extitle, acttitle, "Homepageverified");
		//System.out.println(acttitle+Extitle);
	}

	public void usingindex(WebElement cl, int index) {
		sl = new Select(cl);
		sl.selectByIndex(index);

	}

	public void usingvalue(WebElement cl, String value) {
		sl = new Select(cl);
		sl.selectByValue(value);

	}

	public void usingvisibletext(WebElement cl, String text) {
		sl = new Select(cl);
		sl.selectByVisibleText(text);

	}

	public void notusingindex(WebElement cl, int index) {
		sl = new Select(cl);
		sl.deselectByIndex(index);
	}

	public void notusingvalue(WebElement cl, String value) {
		sl = new Select(cl);
		sl.deselectByValue(value);

	}

	public void notusingvisibletext(WebElement cl, String text) {
		sl = new Select(cl);
		sl.deselectByVisibleText(text);

	}

	public void hover(WebElement cl) {
		act = new Actions(driver);
		act.moveToElement(cl).perform();
	}

	public void doubletap(WebElement cl) {
		act = new Actions(driver);
		act.doubleClick(cl).perform();
	}

	public void pickandput(WebElement se, WebElement te) {
		act = new Actions(driver);
		act.dragAndDrop(se, te).perform();

	}

	public void snip(String path) throws IOException {

		File src = ss.getScreenshotAs(OutputType.FILE);

		File des = new File("path/to/screenshot.png");

		FileUtils.copyFile(src, des);
	}

	public void alertok() {
		at = driver.switchTo().alert();
		at.accept();
	}

	public void alertno() {
		at = driver.switchTo().alert();
		at.dismiss();
	}

	public void clickablewait(WebElement el, int index) {
		waitt = new WebDriverWait(driver, Duration.ofSeconds(index));
		waitt.until(ExpectedConditions.elementToBeClickable(el));
	}

	public void visiblewait(WebElement el, int index) {
		waitt = new WebDriverWait(driver, Duration.ofSeconds(index));
		waitt.until(ExpectedConditions.visibilityOf(el));
	}

	public void presentwait(By locater, int index) {
		waitt = new WebDriverWait(driver, Duration.ofSeconds(index));
		waitt.until(ExpectedConditions.presenceOfElementLocated(locater));
	}
	
	public void getTextt( WebElement cl) {
		System.out.println(cl.getText());

	}
}
