package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features="C:\\Users\\RUSHI\\OneDrive\\Desktop\\TaskAutomation\\TaskAutomation\\features",
		glue="StepsDef",
		monochrome=false,
		plugin= {"pretty"}
		
		)


public class TestRunner {

	
	
	
}
