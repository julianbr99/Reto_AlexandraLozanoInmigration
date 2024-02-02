package co.com.utest.web.alexandralozanoimmigrationlaw.taks;

import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagTheLastStep;
import co.com.utest.web.alexandralozanoimmigrationlaw.utils.Constans;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;

public class LastStep implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                SendKeys.of(Constans.PASSWORD).into(PagTheLastStep.PASSWORD),
                SendKeys.of(Constans.PASSWORD_CONFIRM).into(PagTheLastStep.CONFIRM_PASSWORD),
                Click.on(PagTheLastStep.STAY_INFORMED),
                Click.on(PagTheLastStep.UTEST_TERMS),
                Click.on(PagTheLastStep.UTEST_PRIVACY_POLICY)

        );
    }
    public static LastStep toFinishTheForm() {
        return Tasks.instrumented(LastStep.class);

    }
}
