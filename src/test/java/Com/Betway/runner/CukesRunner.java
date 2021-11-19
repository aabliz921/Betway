package Com.Betway.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun.txt"},
        glue = "Com/Betway/step_defs",
        features = "src/test/resources/features",
        dryRun = false,
        tags = "@search"


)

public class CukesRunner {
}
