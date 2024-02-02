package co.com.utest.web.alexandralozanoimmigrationlaw.taks;

import co.com.utest.web.alexandralozanoimmigrationlaw.models.Person;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class EnterThe implements Task {

     final Person person;


    public EnterThe(Person person) {

        this.person = person;
    }

    public static EnterThe form(Person person) {
        return Tasks.instrumented(EnterThe.class, person);

    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AboutYourself.FillOutTheForm(person),
                DiligenceLocation.inThePlaceWhereLocated(person),
                YourDavice.recordsTheInformationDavice(person),
                LastStep.toFinishTheForm()


        );
    }
}
