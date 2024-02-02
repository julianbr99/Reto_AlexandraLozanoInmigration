package co.com.utest.web.alexandralozanoimmigrationlaw.taks;

import co.com.utest.web.alexandralozanoimmigrationlaw.models.Person;
import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagAddYourAddress;
import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagTellAboutYourself;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class DiligenceLocation implements Task {
     Person person;

    public DiligenceLocation(Person person) {
        this.person = person;
        System.out.println("Person " + person.getLocation());
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PagTellAboutYourself.NEXT_LOCATION),
                SendKeys.of(person.getLocation().getCity()).into(PagAddYourAddress.CITY),
                Click.on(PagAddYourAddress.SELEC_CITY),
                SendKeys.of(person.getLocation().getCodepostal()).into(PagAddYourAddress.CODE_POSTAL),
                Click.on(PagAddYourAddress.NEXT_DEVICES)
        );
    }
    public static DiligenceLocation inThePlaceWhereLocated(Person person) {
        return Tasks.instrumented(DiligenceLocation.class, person);

    }
}
