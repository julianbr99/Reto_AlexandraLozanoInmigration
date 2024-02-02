package co.com.utest.web.alexandralozanoimmigrationlaw.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co.com.utest.web.alexandralozanoimmigrationlaw/features/fill_form.feature",
        glue = "co.com.utest.web.alexandralozanoimmigrationlaw.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class FillForm {
}
