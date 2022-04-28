package qa.ithuba.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        plugin = {
                "pretty"
        }
        , features = "src/test/resources/features"
        , glue = "qa/ithuba/step_definitions"
        , snippets = CucumberOptions.SnippetType.CAMELCASE
        , dryRun = (false)
        , monochrome = false
        , tags = "@SportStake_Cricket"
)
public class RunCucumberIT {

}