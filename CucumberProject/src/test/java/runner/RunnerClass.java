package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFiles/Adactin.feature",
				glue = "stepDefinitions",
				dryRun = false,
				monochrome = true
				
				)

public class RunnerClass {
	
}
