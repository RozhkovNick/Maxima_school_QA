import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources",
        glue = "ru.savkk.test",
        tags = "@withdrawal",
        snippets = SnippetType.CAMELCASE
)

public class RunnerTest {
}
