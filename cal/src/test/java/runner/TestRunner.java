package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources",
    glue = "calculator.Bdd.steps",
    plugin = {"pretty", "html:target/cucumber-reports"},
    tags = "@special"
)
public class TestRunner {

}
