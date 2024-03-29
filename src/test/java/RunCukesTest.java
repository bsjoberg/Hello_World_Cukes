import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = { "pretty", "html:out" },
        features = "src/main/resources",
        snippets = SnippetType.CAMELCASE)

public class RunCukesTest {

}
