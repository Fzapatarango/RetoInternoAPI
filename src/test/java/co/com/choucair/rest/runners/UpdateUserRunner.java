package co.com.choucair.rest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/updateUser.feature",
        glue = "co.com.choucair.rest.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE
)
public class UpdateUserRunner {
}
