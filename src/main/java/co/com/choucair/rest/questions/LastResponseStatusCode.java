package co.com.choucair.rest.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static net.serenitybdd.rest.SerenityRest.lastResponse;

public class LastResponseStatusCode implements Question<Boolean> {
    private final int cod;

    public LastResponseStatusCode(int cod) {
        this.cod = cod;
    }

    public static LastResponseStatusCode is(int cod) {
        return new LastResponseStatusCode(cod);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        int response = lastResponse().statusCode();
        return response == cod;
    }
}
