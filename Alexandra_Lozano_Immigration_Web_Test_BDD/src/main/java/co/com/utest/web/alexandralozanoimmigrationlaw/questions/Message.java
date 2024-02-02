package co.com.utest.web.alexandralozanoimmigrationlaw.questions;

import co.com.utest.web.alexandralozanoimmigrationlaw.userinterfaces.PagTheLastStep;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Message implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(PagTheLastStep.MESAGGE_FINAL).viewedBy(actor).asString();
    }

    public static Message method(){

        return new Message();
    }
}
