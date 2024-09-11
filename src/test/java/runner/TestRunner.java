package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/test/resources/features",
            glue = {"StepDefinition", "util"},
            plugin = {"pretty", "html:target/cucumber-html-report", "json:cucumber.json"},
            tags = "@Registration_E2E"
    )

    public class TestRunner {
    }