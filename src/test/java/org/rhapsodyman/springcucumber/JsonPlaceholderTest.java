package org.rhapsodyman.springcucumber;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/json_placeholder.feature", plugin = { "pretty",
		"html:target/cucumber", "json:target/cucumber/cucumber.json" })
public class JsonPlaceholderTest {
}
