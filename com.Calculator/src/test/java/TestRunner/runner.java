package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		tags="",
		features="C:\\Users\\Farhan\\Desktop\\testing\\com.Calculator\\src\\test\\resources\\Feature",
		glue="StepDefinition",
		plugin= {"pretty","html:test-outout", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"},
		dryRun= false
		
		
		)
public class runner {

}
