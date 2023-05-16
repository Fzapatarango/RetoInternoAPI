package co.com.choucair.rest.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseBody implements Interaction {
    public static LastResponseBody is() {
        return Tasks.instrumented(LastResponseBody.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(lastResponse().asString());
    }

}
