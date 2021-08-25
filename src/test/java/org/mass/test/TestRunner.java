package org.mass.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
//test runner class
@RunWith(Cucumber.class)
	@CucumberOptions(features = "src/test/resources/feature",glue= {"StepDefinitions"},dryRun=true, 
	monochrome=true,plugin= {"json:target/cucumber-json.report","html:target/cucumber-html.report"})
  public class TestRunner {

	
}


