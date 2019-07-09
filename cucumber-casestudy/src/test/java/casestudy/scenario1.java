package casestudy;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class scenario1 {
	WebDriver dri;
	@Given("url of testmeapp {string}")
	public void url_of_testmeapp(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		String cpath="C:\\Users\\a07208trng_b4a.04.26\\Desktop\\SELENIUM WORK BA\\JAR\\chromedriver_win32 (1)\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", cpath);
		dri=new ChromeDriver();
		dri.get(string);
	}

	@When("user click on signup")
	public void user_click_on_signup() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.xpath("//a[contains(@href,'RegisterUser.htm')]")).click();
	}

	@When("user enters {string} as username")
	public void user_enters_as_username(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.name("userName")).sendKeys(string);
	}

	@When("user enters {string} as firstname")
	public void user_enters_as_firstname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.name("firstName")).sendKeys(string);
	}

	@When("user enters {string} as lastname")
	public void user_enters_as_lastname(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		 dri.findElement(By.name("lastName")).sendKeys(string);
	}

	@When("user enters {string} as password")
	public void user_enters_as_password(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.name("password")).sendKeys(string);
	}

	@When("user enters {string} as confirmpassword")
	public void user_enters_as_confirmpassword(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		  dri.findElement(By.name("confirmPassword")).sendKeys(string);
	}

	@When("click gender as male")
	public void click_gender_as_male() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.xpath("//input[@id='gender'][1]")).click();
	}

	@When("user enters {string} as email")
	public void user_enters_as_email(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.name("emailAddress")).sendKeys(string);
	}

	@When("user enters {string} as mobileno")
	public void user_enters_as_mobileno(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.name("mobileNumber")).sendKeys(string);
	}

	@When("user enters {string} as dob")
	public void user_enters_as_dob(String string) {
	    // Write code here that turns the phrase above into concrete actions
	//    throw new cucumber.api.PendingException();
		 dri.findElement(By.name("dob")).sendKeys(string);
	}

	@When("user enters {string} as address")
	public void user_enters_as_address(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		dri.findElement(By.name("address")).sendKeys(string);
	}

	@When("user select birth place as securityques")
	public void user_select_birth_place_as_securityques() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Select place=new Select(dri.findElement(By.name("securityQuestion")));
        place.selectByIndex(0);
	}

	@When("user enters answer as {string}")
	public void user_enters_answer_as(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		dri.findElement(By.name("answer")).sendKeys("covai");
	}

	@When("click on register")
	public void click_on_register() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	     dri.findElement(By.name("Submit")).click();
	}

	@Then("check user in sign-in page")
	public void check_user_in_sign_in_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		Assert.assertTrue(dri.findElement(By.name("Login")).isDisplayed());
	}



}
