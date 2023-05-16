package co.com.choucair.rest.tasks;

import co.com.choucair.rest.models.ModelCreateUserRest;
import io.cucumber.datatable.DataTable;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.rest.interactions.Post;

import java.util.List;

import static co.com.choucair.rest.enums.RestService.CREATE_USER;

public class CreateUserRest implements Task {
    private List<ModelCreateUserRest> modelCreateUserRest;
    public CreateUserRest(DataTable data) {
        this.modelCreateUserRest = data.asList(ModelCreateUserRest.class);
    }
    public static CreateUserRest with(DataTable data) {
        return Tasks.instrumented(CreateUserRest.class, data);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        System.out.println(modelCreateUserRest.get(0).toString());
        actor.attemptsTo(Post.to(CREATE_USER.toString())
                .with(requestSpecification -> requestSpecification
                        .headers("Content-Type", "application/json")
                        .body(modelCreateUserRest.get(0).toString())));
    }
}
