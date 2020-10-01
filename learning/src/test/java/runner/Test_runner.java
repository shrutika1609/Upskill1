package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions ( features = {"src/test/resources/Login/login.feature"},
	glue={"StepDefinition"},
	dryRun=false,//To check weather you have missed an steps in the scenario
	monochrome=true,//to make the console output in a better format
	strict = true,//it will check weather any step is not defined in step definition
			plugin = {"html:testoutput.html]","junit:junit_xml/cucumber.xml", "json:json_output/cucumber.jason" }

	)
public class Test_runner {

}