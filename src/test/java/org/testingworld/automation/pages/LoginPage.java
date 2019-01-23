package org.testingworld.automation.pages;

import java.util.ResourceBundle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginPage {
	
	ResourceBundle element;
	WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		element= ResourceBundle.getBundle("Elements");
	}

	public void enterUsername(String uname) {
				
		driver.findElement(By.id(element.getString("login_username_id"))).sendKeys(uname);
	}
	public void passWord(String pass) {
		driver.findElement(By.id(element.getString("login_password_id"))).sendKeys(pass);
	}
	public void clickLoginButton() {
		driver.findElement(By.id(element.getString("login_button_id"))).click();
	}
	
	public void createAccountFirstname() {
		driver.findElement(By.xpath(element.getString("create_account_firstname_xpath"))).sendKeys("user1");
	}
	public void createAccountLastName() {
		driver.findElement(By.xpath(element.getString("create_account_lastname_xpath"))).sendKeys("usersurname");
	}
	public void createAccountMobileNumber() {
		driver.findElement(By.xpath(element.getString("create_account_mobile_number_xpath"))).sendKeys("8095131187");
	}
	
	public void createAccountConfirmpassword() {
		driver.findElement(By.xpath(element.getString("create_account_new_password_xpath"))).sendKeys("Pass&3891402");
	}
	public void createAccountDay() {
		Select dropdown = new Select(driver.findElement(By.id(element.getString("create_account_day_id"))));
		dropdown.selectByVisibleText("20");
	}
	public void createAccountMonth() {
		Select dropdown = new Select(driver.findElement(By.id(element.getString("create_account_month_id"))));
		dropdown.selectByVisibleText("Feb");
		
	}
	public void createAccountYear() {
		Select dropdown = new Select(driver.findElement(By.id(element.getString("create_account_year_id"))));
		dropdown.selectByVisibleText("2019");
		
	}
	public void createAccountGender() {
		driver.findElement(By.xpath(element.getString("create_account_gender_xpath"))).click();
		
	}
	public void createAccountSignUp() {
		driver.findElement(By.xpath(element.getString("create_account_signup_xpath"))).click();
		
	}
	
}
