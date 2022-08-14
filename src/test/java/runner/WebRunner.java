package runner;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import gherkin.formatter.Reporter;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static java.lang.System.getProperty;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/java/FeatureFiles"},
        glue = {"stepdefinitions"},
        tags = {"@Regression"},
        plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json","junit:target/cucumber-reports/Cucumber.xml","html:target/cucumber-reports"},
        dryRun = false)


public class WebRunner {


}




