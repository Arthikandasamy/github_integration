package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
	
@CucumberOptions(features="featurefile/openproject.feature", glue="stepdefinitionclass")
	
	public class runnerclass {
		//It combine the feature files and step definition files.
}
