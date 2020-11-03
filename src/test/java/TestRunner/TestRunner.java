package TestRunner;

import org.junit.runner.RunWith;
import org.openqa.selenium.TakesScreenshot;

import cucumber.api.CucumberOptions;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/test/resources/Features"
		 ,glue={"Stepdefinitions"}
		 //,format = {"pretty", "html:target/Destination"} 
		//,plugin = {"pretty", "html:target/Destination"} 
		//,plugin = { "pretty", "html:target/cucumber-reports" }
		 ,plugin = { "pretty", "html:target/cucumber-html-report","json:target/cucumber.json" }
		 ,tags = {"@param"}////or
		// tags = {"@Smoke,@sanity"},////or
		 //tags = {"@Smoke","@sanity"},////and
		 //tags = {"@Smoke","~@Sanity"},////And
		 //tags = {"~@Smoke","~@Sanity"},////And
		 ,monochrome = true
		
		)
	

public class TestRunner {
	
	
}
