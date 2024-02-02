package co.com.utest.web.alexandralozanoimmigrationlaw.stepdefinitions;

import co.com.utest.web.alexandralozanoimmigrationlaw.exceptions.Excepcion;
import co.com.utest.web.alexandralozanoimmigrationlaw.questions.Message;
import co.com.utest.web.alexandralozanoimmigrationlaw.taks.EnterThe;
import co.com.utest.web.alexandralozanoimmigrationlaw.utils.GenerateData;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static co.com.utest.web.alexandralozanoimmigrationlaw.utils.Constans.JULIAN;
import static co.com.utest.web.alexandralozanoimmigrationlaw.utils.Constans.URL;
import static net.serenitybdd.screenplay.actors.OnStage.*;

public class FillFormUtestStepDefinitions {
    @Before

    public void preparation() {
        setTheStage(new OnlineCast());
        theActorCalled(JULIAN);
        WebDriverManager.chromedriver().setup();
    }

    @Given("^el  user, entry the utest web$")
    public void asAUserIEnterTheUtestWebsite() {
        theActorInTheSpotlight().wasAbleTo(Open.url(URL));
    }

    @When("^user fills out form$")
    public void iFillOutTheForm() {

        OnStage.theActorInTheSpotlight().attemptsTo(EnterThe.form(GenerateData.newPerson()));

    }

    @Then("^the user will be shown the message(.*)")
    public void viewMessage(String message) {

        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Message.method(), Matchers.is(message)).orComplainWith(Excepcion.class));


    }
}
