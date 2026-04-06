package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SignUp extends BaseClass {

	WebDriver driver;

	public SignUp(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	

	@FindBy(xpath = "//input[@placeholder='Name']")
	private WebElement name;

	@FindBy(xpath = "(//input[@name='email'])[2]")
	private WebElement email;

	@FindBy(xpath = "//button[text()='Signup']")
	private WebElement sgnupbtn;

	public void usersgnup(String name, String email) {
		inputkeys(this.name, name);
		inputkeys(this.email, email);
	}

	public void Signupbtn() {
		submit(sgnupbtn);

	}

}
