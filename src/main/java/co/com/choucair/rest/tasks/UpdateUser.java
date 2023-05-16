package co.com.choucair.rest.tasks;

import co.com.choucair.rest.models.ModelCreateUserRest;
import io.cucumber.datatable.DataTable;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Put;

import java.util.List;

import static co.com.choucair.rest.enums.RestService.UPDATE_USER;


public class UpdateUser implements Task {
    private List<ModelCreateUserRest> modelCreateUserRest;

    public UpdateUser(DataTable data) {
        this.modelCreateUserRest = data.asList(ModelCreateUserRest.class);
    }

    public static UpdateUser inReqres(DataTable data) {
        return Tasks.instrumented(UpdateUser.class, data);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Put.to(UPDATE_USER.toString() + modelCreateUserRest.get(0).getId()).
                with(requestSpecification -> requestSpecification
                        .headers("Content-Type", "application/json")
                        .body(modelCreateUserRest.get(0).toString())));
    }
}
