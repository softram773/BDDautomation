package org.testingworld.automation.base;

import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CreateDriverInstance {
	
	public static WebDriver driver;
	
	
	public WebDriver generateDriverInstance() {
		
	ResourceBundle config= ResourceBundle.getBundle("config");
	if(config.getString("browser").equalsIgnoreCase("chrome")) {
		
		System.setProperty("webdriver.chrome.driver","D:\\selenium\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	
	}
	else if(config.getString("browser").equalsIgnoreCase("firefox")){
		System.setProperty("Webdriver.geckodriver.driver", "./Driver/geckodriver.exe");
		driver =new FirefoxDriver();
	}
	
	driver.get(config.getString("applicationURL"));
	return driver;
	
	}
	
public static void closeDriver(WebDriver driver) {
	driver.quit();
}
}
