package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Homepage extends BaseClass {
	WebDriver driver;

	public WebDriver getDriver() {
		return driver;
	}

	public Homepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	//public void gettitle() {
	//	title();
	//}

	@FindBy(xpath = "//a[text()=' Signup / Login']")
	private WebElement signup;

	public WebElement getSignup() {
		return signup;
	}

	

	public void clickSignup() {

		submit(getSignup());
	}

}
