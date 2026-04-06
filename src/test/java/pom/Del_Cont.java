package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Del_Cont extends BaseClass {
	WebDriver driver;

	public Del_Cont(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//b[text()='Account Deleted!']")
	WebElement text;

	@FindBy(xpath = "//a[text()='Continue']")
	WebElement Delcont;

	public void txt() {
		getTextt(text);
	}

	public void dc() {
		submit(Delcont);
	}

}
