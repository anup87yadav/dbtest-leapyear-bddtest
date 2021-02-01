package com.db.runnerTest;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "com.db.resource/features",
		         glue={"com/db/stepDefinations"},
				 plugin = {"pretty", 
						   "json:target/test-report/cucumber.json",
						   "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						   "rerun:target/failed.txt"})

public class TesrRunner {
	
	
}

	

