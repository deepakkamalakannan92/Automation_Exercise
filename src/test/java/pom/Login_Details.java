package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class Login_Details extends BaseClass {
	WebDriver driver;

	public Login_Details(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//b[text()='Enter Account Information']")
	WebElement text;

	@FindBy(id = "id_gender1")
	WebElement Mr;
	@FindBy(id = "password")
	WebElement PassWord;
	@FindBy(id = "days")
	WebElement day;
	@FindBy(id = "months")
	WebElement month;
	@FindBy(id = "years")
	WebElement year;
	@FindBy(id = "newsletter")
	WebElement newsl;
	@FindBy(id = "optin")
	WebElement optin;
	@FindBy(id = "first_name")
	WebElement fname;
	@FindBy(id = "last_name")
	WebElement lname;
	@FindBy(id = "company")
	WebElement comp;
	@FindBy(id = "address1")
	WebElement add1;
	@FindBy(id = "address2")
	WebElement add2;
	@FindBy(id = "country")
	WebElement cntry;
	@FindBy(id = "city")
	WebElement city;
	@FindBy(xpath="//input[@id='state']")
	WebElement state;
	@FindBy(id = "zipcode")
	WebElement pincode;
	@FindBy(id = "mobile_number")
	WebElement num;
	@FindBy(xpath = "//button[text()='Create Account']")
	WebElement create;

	public void gettext() {
		getTextt(text);
	}

	public void accountdetails() {
		submit(Mr);
		inputkeys(PassWord, "SollaMudiyathu");
		usingvalue(day, "15");
		usingvalue(month, "8");
		usingvisibletext(year, "1947");
	}

	public void newsl() {
		submit(newsl);
	}

	public void opt() {
		submit(optin);
	}

	public void addressdetails() {
		inputkeys(fname, "naan thaan");
		inputkeys(lname, "athuvum naan thaan");
		inputkeys(comp, "KekranMekaranCompany");
		inputkeys(add1, "No4 Vevkanandar Theru Dubai Kooruku Sandu");
		inputkeys(add2, "Dubai Main Road Dubai");
		inputkeys(cntry, "Singapore");
		inputkeys(city, "karur");
		inputkeys(state,"Tamil Nadu");
		inputkeys(pincode, "600028");
		inputkeys(num, "9876543210");

	}

	public void create() {
		submit(create);
	}

}
