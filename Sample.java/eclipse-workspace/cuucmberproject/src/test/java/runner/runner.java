package runner;

import common.Baseclass;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/java/Feature/login.feature", 
					glue= "stepdefinition", 
					monochrome=true,
					publish= true,
					tags="@smoke")

public class runner extends Baseclass {

	
}
