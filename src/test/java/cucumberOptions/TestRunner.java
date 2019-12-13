package cucumberOptions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"src/test/java/features"},
		glue = {"stepDefinitions"},
		tags = "@SeleniumTest",
		plugin = {"pretty", "json:target/report.json", "junit:target/cukes.xml", "de.monochromata.cucumber.report.PrettyReports:target/pretty-cucumber"}
		)

public class TestRunner {

}
