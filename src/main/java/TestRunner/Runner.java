package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/", glue= {"addtariff"}, plugin= {"html:target"},tags= {"@tag"},monochrome=true)
public class Runner {
}
