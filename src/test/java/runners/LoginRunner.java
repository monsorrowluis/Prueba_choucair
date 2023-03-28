package runners;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberSerenityRunner;
import org.junit.runner.RunWith;

@RunWith(CucumberSerenityRunner.class)
@CucumberOptions(
        glue = "stepdefinitons",
        features = "./src/test/resources/features/Login.feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class LoginRunner {
}
