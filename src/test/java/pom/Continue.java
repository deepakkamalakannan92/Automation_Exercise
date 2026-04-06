package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Continue extends BaseClass {
	WebDriver driver;

	public Continue(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//b[text()='Account Created!']")
	WebElement text;
	@FindBy(xpath = "//a[text()='Continue']")
	WebElement cont;

	public void gettxt() {
		getTextt(text);
	}

	public void conti() {
		submit(cont);
	}

}
