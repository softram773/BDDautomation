package org.testingworld.automation.runcukes;

import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testingworld.assertions.Compare;
import org.testingworld.automation.base.CreateDriverInstance;
import org.testingworld.automation.pages.LoginPage;

import cucumber.api.CucumberOptions;
import cucumber.api.java.en.*;
import cucumber.api.junit.Cucumber;
import junit.framework.Assert;


public class steps{
	

	LoginPage login;
	WebDriver driver;
	
	@Given("^user is on the login page$")
	public void user_is_on_the_login_page() throws Throwable {
		driver = CreateDriverInstance.driver;
	}

	@When("^Enter valid User-name \"([^\"]*)\"$")
	public void enter_valid_User_name(String arg1) throws Throwable {
		login = new LoginPage(driver);
		login.enterUsername("ramesh");
		
	}

	@When("^Enter valid password \"([^\"]*)\"$")
	public void enter_valid_password(String arg1) throws Throwable {
	    login.passWord("abc@123");
	}

	@When("^Click on sing-in button$")
	public void click_on_sing_in_button() throws Throwable {
	    login.clickLoginButton();
	}

	@Then("^login should be successful$")
	public void login_should_be_successful() throws Throwable {
		Assert.assertTrue(Compare.validateURL(driver, "https://www.facebook.com/"));
		System.out.println("Login Sucessful");
		CreateDriverInstance.closeDriver(driver);  
	}
	


}
