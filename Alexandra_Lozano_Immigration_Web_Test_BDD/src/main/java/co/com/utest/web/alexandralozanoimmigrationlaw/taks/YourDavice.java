package co.com.utest.web.alexandralozanoimmigrationlaw.taks;

import co.com.utest.web.alexandralozanoimmigrationlaw.models.Person;
import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagTellYourDevices;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SendKeys;
import org.openqa.selenium.Keys;

public class YourDavice implements Task {

    Person person;

    public YourDavice(Person person) {
        this.person = person;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Click.on(PagTellYourDevices.CLICK_YOUR_COMPUTER),
                SendKeys.of(person.getDevice().getYourcomputer()).into(PagTellYourDevices.YOUR_COMPUTER).thenHit(Keys.ARROW_DOWN).thenHit(Keys.ENTER),
                Click.on(PagTellYourDevices.VERSION),
                Enter.theValue(person.getDevice().getVersion()).into(PagTellYourDevices.VERSION_SELECT).thenHit(Keys.ENTER),
                Click.on(PagTellYourDevices.LENGUAGE),
                SendKeys.of(person.getDevice().getLenguage()).into(PagTellYourDevices.LENGUAGE_SELECT).thenHit(Keys.ENTER),
                Click.on(PagTellYourDevices.YOUR_MOBILE_DAVICE),
                SendKeys.of(person.getDevice().getMobiledevice()).into(PagTellYourDevices.YOUR_MOBILE_DAVICE_SELECT).thenHit(Keys.ENTER),
                Click.on(PagTellYourDevices.MODEL),
                SendKeys.of(person.getDevice().getModel()).into(PagTellYourDevices.MODEL_SELECT).thenHit(Keys.ENTER),
                Click.on(PagTellYourDevices.OPERATING_SYSTEM),
                SendKeys.of(person.getDevice().getOperatingsystem()).into(PagTellYourDevices.OPERATING_SYSTEM_SELECT).thenHit(Keys.ENTER),
                Click.on(PagTellYourDevices.NEXT_LAST_STEP)

        );
    }

    public static YourDavice recordsTheInformationDavice(Person person) {
        return Tasks.instrumented(YourDavice.class, person);

    }
}
