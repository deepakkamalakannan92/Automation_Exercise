package step_definition;

import org.openqa.selenium.WebDriver;

import com.base.BaseClass;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.Continue;
import pom.Del_Acc;
import pom.Del_Cont;
import pom.Homepage;
import pom.Login_Details;
import pom.SignUp;

public class TestCase1_Step extends BaseClass {
	// WebDriver driver;
	Homepage hp;
	SignUp sp;
	Login_Details ld;
	Continue cp;
	Del_Acc da;
	Del_Cont dc;

	@Given("user launches the browser")
	public void user_launches_the_browser() {
		browserlaunch();
		hp = new Homepage(driver);
		sp = new SignUp(driver);
		ld = new Login_Details(driver);
		cp = new Continue(driver);
		da = new Del_Acc(driver);
		dc = new Del_Cont(driver);
	}

	@When("user navigates to {string}")
	public void user_navigates_to(String string) {
		geturl(string);
		wait(10);

	}

	@Then("user verifies that home page is visible successfully")
	public void user_verifies_that_home_page_is_visible_successfully() {
		title();
	}

	@When("user clicks on Signup \\/ Login button")
	public void user_clicks_on_signup_login_button() {
		hp.clickSignup();

	}

	@Then("user verifies New User Signup! section is visible")
	public void user_verifies_new_user_signup_section_is_visible() {
		title();
	}

	@When("user enters name as {string} and email address as {string}")
	public void user_enters_name_as_and_email_address_as(String name, String email) {
	    sp.usersgnup(name,email);
	}



	@Then("signup should fail and get error")
	public void signup_should_fail_and_get_error() {
System.out.println("Test case Failed");
	}
	// @When("user enters name and email address")
	//// public void user_enters_name_and_email_address() {
	//

	// }

	@When("user clicks on Signup button")
	public void user_clicks_on_signup_button() {
		sp.Signupbtn();
	}

	@Then("user verifies ENTER ACCOUNT INFORMATION is visible")
	public void user_verifies_enter_account_information_is_visible() {
		ld.gettext();
	}

	@When("user fills account details:")
	public void user_fills_account_details() {
		ld.accountdetails();

	}

	@When("user selects Sign up for our newsletter!")
	public void user_selects_sign_up_for_our_newsletter() {
		ld.newsl();
	}

	@When("user selects Receive special offers from our partners!")
	public void user_selects_receive_special_offers_from_our_partners() {
		ld.opt();
	}

	@When("user fills address details:")
	public void user_fills_address_details() {
		ld.addressdetails();
	}

	@When("user clicks on Create Account button")
	public void user_clicks_on_create_account_button() {
		ld.create();
	}

	@Then("user verifies ACCOUNT CREATED! is visible")
	public void user_verifies_account_created_is_visible() {
		cp.gettxt();
	}

	@When("user clicks on Continue button")
	public void user_clicks_on_continue_button() {
		cp.conti();
	}

	@Then("user verifies Logged in as username is visible")
	public void user_verifies_logged_in_as_username_is_visible() {
		da.txt();
	}

	@When("user clicks on Delete Account button")
	public void user_clicks_on_delete_account_button() {
		da.Delete();
	}

	@Then("user verifies ACCOUNT DELETED! is visible and Clicks continue button")
	public void user_verifies_account_deleted_is_visible_and_clicks_continue_button() {
		dc.txt();
		dc.dc();
	}

}
