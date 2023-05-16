package co.com.choucair.rest.stepdefinitions;

import co.com.choucair.rest.interactions.LastResponseBody;
import co.com.choucair.rest.models.ModelCreateUserRest;
import co.com.choucair.rest.questions.LastResponseStatusCode;
import co.com.choucair.rest.tasks.CreateUserRest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


import java.util.List;

import static co.com.choucair.rest.utils.Constants.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RestCreateUserStepDefinition {
    @When("create a user")
    public void createAUser(DataTable data) {
        theActorInTheSpotlight().attemptsTo(CreateUserRest.with(data));
    }
    @Then("I should see the user is created")
    public void iShouldSeeTheUserIsCreated() {
        theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(VALUE)));

    }

}
