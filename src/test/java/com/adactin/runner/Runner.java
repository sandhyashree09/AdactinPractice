package com.adactin.runner;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;

import com.adactin.utility.ConfigurationReader;
import com.adactin.utility.FileReaderManager;
import com.automation.baseclass.BaseClass;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features="src\\test\\java\\com\\adactin\\feature\\Adactin.feature", //featurefile path
		glue="com\\adactin\\stepdefinition", //stepdefinition path
		//tags= {"@Login"},
		monochrome = true,
		dryRun = false,
		strict=true,
		plugin= {"html:Report\\CucumberReport", "json:Report\\cucumberReport.json",
				"com.cucumber.listener.ExtentCucumberFormatter:Report\\extentReport.html"})
 
public class Runner extends BaseClass {
	public static WebDriver driver; //null driver
	
	@BeforeClass
	public static void browserOpen() throws IOException {
		//ConfigurationReader cr = new ConfigurationReader();
		String browsername = FileReaderManager.getFRMInstance().getCRInstance().getBrowsername();
		driver = browserLaunch(browsername);
	}
	
	@AfterClass
	public static void browserClose() {
    driver.close();
	}

}
