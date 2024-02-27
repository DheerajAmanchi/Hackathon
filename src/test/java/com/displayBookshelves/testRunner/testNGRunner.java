package com.displayBookshelves.testRunner;
//import org.junit.runner.RunWith;

import org.testng.annotations.Test;

//import io.cucumber.junit.Cucumber;
//import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features= {".//featureFiles/"}, 
		glue = "com.displayBookshelves.stepDefinitions", 
		plugin = {"pretty","html:reports/report.html","rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
		dryRun=false,
		monochrome=true,
		publish=true
		)

@Test
public class testNGRunner extends AbstractTestNGCucumberTests{

}
