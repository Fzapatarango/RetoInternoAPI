package co.com.choucair.rest.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Get;

import static co.com.choucair.rest.enums.RestService.GET_ALL_USER;

public class GetUserRest implements Task {
    public static GetUserRest inReqres() {
        return Tasks.instrumented(GetUserRest.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Get.resource(GET_ALL_USER.toString()));
    }
}
