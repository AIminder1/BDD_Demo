package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/TestCases.html"},
        features = "src/test/java/TestCases",
        glue = "StepDef",
        tags = "@login",
        dryRun = false
)
public class CukesRunner {
}
