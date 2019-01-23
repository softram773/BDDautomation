package org.testingworld.automation.runcukes;

import org.openqa.selenium.WebDriver;
import org.testingworld.automation.base.CreateDriverInstance;
import org.testingworld.automation.pages.LoginPage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateAccount extends CreateDriverInstance{
		
	WebDriver driver;
	LoginPage login;

	@Given("^Account create page$")
	public void account_create_page() throws Throwable {
		CreateDriverInstance driverInstance = new CreateDriverInstance();
		driver = driverInstance.generateDriverInstance();
	  	}

	@When("^Enter user firstName$")
	public void enter_user_firstName() throws Throwable {
		login = new LoginPage(driver);
		login.createAccountFirstname();
	}

	@When("^Enter user LastName$")
	public void enter_user_LastName() throws Throwable {
	   login.createAccountLastName();
	}

	@When("^Enter Mobile Number$")
	public void enter_Mobile_Number() throws Throwable {
	   login.createAccountMobileNumber();
	}

	@When("^Enter new password$")
	public void enter_new_password() throws Throwable {
	    login.createAccountConfirmpassword();
	}

	@When("^Select DOB$")
	public void select_DOB() throws Throwable {
	    login.createAccountDay();
	    login.createAccountMonth();
	    login.createAccountYear();
	}

	@When("^Select gender$")
	public void select_gender() throws Throwable {
	   login.createAccountGender();
	}

	@When("^Click on signUp$")
	public void click_on_signUp() throws Throwable {
	    login.createAccountSignUp();
	}

	@Then("^Account successfully created$")
	public void  account_successfully_created() throws Throwable {
		System.out.println("Sucess");
		
	}

}
