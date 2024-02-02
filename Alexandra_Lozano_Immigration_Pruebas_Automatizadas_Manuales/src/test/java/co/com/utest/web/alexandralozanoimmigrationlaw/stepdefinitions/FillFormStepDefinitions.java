package co.com.utest.web.alexandralozanoimmigrationlaw.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static co.com.utest.web.alexandralozanoimmigrationlaw.utils.ManualTest.validate;

public class FillFormStepDefinitions {
    private Scenario scenario;
    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void the_user_is_on_the_taxis_reservation_page(String step) {

        validate(step, scenario.getName());

    }

}
