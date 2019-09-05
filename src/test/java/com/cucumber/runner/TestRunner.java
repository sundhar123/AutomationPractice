package com.cucumber.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.cucumber.baseclass.BaseClass;
import com.cucumber.helper.FileDataManager;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		
		plugin = {"pretty","json:\\src\\test\\resource\\com\\selenium\\reports\\CucumberReports\\reports.json",
				           "junit:\\src\\test\\resource\\com\\selenium\\reports\\CucumberReports\\reports.xml",
				           "html:\\src\\test\\resource\\com\\selenium\\reports\\CucumberReports\\"},
		
		features =  "\\src\\test\\java\\com\\cucumber\\feature", glue = "com.cucumber.stepdefinition",
		tags = {"@EndtoEndLogin"}, dryRun = false, strict = true, monochrome = true)
		



public class TestRunner {
	
	public static WebDriver driver;
	@BeforeClass
	public static void SetupInitialisation()throws Throwable{
		String browserName = FileDataManager.fdm.getConfigReader().getBrowsername();
		driver = BaseClass.getBrowser(browserName);
	}
	
	@AfterClass
	public static void Teardown()throws Exception{
		BaseClass.driverQuit();
	}
	}
	
	



