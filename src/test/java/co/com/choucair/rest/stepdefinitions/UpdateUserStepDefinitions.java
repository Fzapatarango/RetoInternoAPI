package co.com.choucair.rest.stepdefinitions;

import co.com.choucair.rest.interactions.LastResponseBody;
import co.com.choucair.rest.tasks.UpdateUser;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class UpdateUserStepDefinitions {

    @Given("I update the user with id")
    public void iUpdateTheUser(DataTable data) {
        theActorInTheSpotlight().attemptsTo(UpdateUser.inReqres(data));

    }

    @Then("see the response body")
    public void seeTheResponseBody() {
        theActorInTheSpotlight().attemptsTo(LastResponseBody.is());
    }

}
