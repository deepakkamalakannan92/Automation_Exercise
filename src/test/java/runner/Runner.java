package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features ="src/test/resources/Feature/automationExe.feature",
				 dryRun = !false, 
				 glue = "step_definition")
public class Runner {

}
