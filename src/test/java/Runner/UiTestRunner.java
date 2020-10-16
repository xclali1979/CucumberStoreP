package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
 features="src/test/recorcuses/uiFeatures",
 glue="stepDefs",
 dryRun = false,
 tags="  @TECH-1001"
)
public class UiTestRunner {
}
