package co.com.choucair.rest.tasks;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static co.com.choucair.rest.enums.RestService.DELETE_USER;


@AllArgsConstructor
public class DeleteUserRest implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(DELETE_USER.toString()+id);
        actor.attemptsTo(Delete.from(DELETE_USER.toString()+id));
    }
    private int id;
    public static DeleteUserRest inReqres(int id){
        return Tasks.instrumented(DeleteUserRest.class, id);
    }
}
