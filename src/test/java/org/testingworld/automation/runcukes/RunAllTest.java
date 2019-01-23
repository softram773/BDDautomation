package org.testingworld.automation.runcukes;

import java.io.File;

import org.testng.annotations.AfterClass;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//@CucumberOptions(features="src/test/resources/featuresFile/createAccount.feature")


@CucumberOptions(features = {"C:\\Users\\ramesh.biradar\\eclipse-workspace\\BDDautomation\\src\\test\\resources\\featuresFile\\createAccount.feature"}, 
glue = {"org.testingworld.automation.runcukes"}, 
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
monochrome = true
)

public class RunAllTest extends AbstractTestNGCucumberTests {
	
	@AfterClass
	public static void reportsetup() {
		Reporter.loadXMLConfig(new File("C:\\Users\\ramesh.biradar\\eclipse-workspace\\BDDautomation\\src\\test\\resources\\extentreport\\extent-report.xml"));
		Reporter.setSystemInfo("User Name",System.getProperty("user.name"));
		Reporter.setSystemInfo("Time zone",System.getProperty("user.timezone"));
		Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
	    Reporter.setSystemInfo("Selenium", "3.4.0");
	    Reporter.setSystemInfo("Maven", "3.3");
	    Reporter.setSystemInfo("Java Version", "1.8.0_151");
		Reporter.setTestRunnerOutput("Cucumber TestNG Test runner");
	}

}
