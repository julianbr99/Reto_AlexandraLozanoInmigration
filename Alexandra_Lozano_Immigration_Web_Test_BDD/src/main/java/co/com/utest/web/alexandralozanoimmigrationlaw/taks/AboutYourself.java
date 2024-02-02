package co.com.utest.web.alexandralozanoimmigrationlaw.taks;

import co.com.utest.web.alexandralozanoimmigrationlaw.models.Person;
import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagPrincipalUtest;
import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagTellAboutYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagTellAboutYourself.LANGUAGE;

public class AboutYourself implements Task {
    Person person;

    public AboutYourself(Person person) {
        this.person = person;
    }

    public static AboutYourself FillOutTheForm(Person person) {
        return Tasks.instrumented(AboutYourself.class, person);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PagPrincipalUtest.JOIN_TODAY),
                WaitUntil.the(PagTellAboutYourself.FRIST_NAME, WebElementStateMatchers.
                        isVisible()).forNoMoreThan(3).seconds(),
                Enter.theValue(person.getFristname()).into(PagTellAboutYourself.FRIST_NAME),
                Enter.theValue(person.getFristname()).into(PagTellAboutYourself.FRIST_NAME),
                Enter.theValue(person.getLastname()).into(PagTellAboutYourself.LAST_NAME),
                Enter.theValue(person.getEmail()).into(PagTellAboutYourself.EMAIL).thenHit(Keys.ENTER),
                SendKeys.of(person.getMonth()).into(PagTellAboutYourself.MONTH).thenHit(Keys.ENTER),
                SendKeys.of(person.getDay()).into(PagTellAboutYourself.DAY).thenHit(Keys.ENTER),
                SendKeys.of(person.getYear()).into(PagTellAboutYourself.YEAR).thenHit(Keys.ENTER),
                Enter.theValue(person.getSpekean()).into(LANGUAGE).thenHit(Keys.ENTER)

        );
    }
}
