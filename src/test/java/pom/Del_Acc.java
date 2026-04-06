package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Del_Acc extends BaseClass {
	WebDriver driver;

	public Del_Acc(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()=' Logged in as ']")
	WebElement text;

	@FindBy(xpath = "//a[@href='/delete_account']")
	WebElement del;

	public void txt() {
		getTextt(text);
	}

	public void Delete() {
		submit(del);
	}

}
