package co.com.choucair.rest.stepdefinitions;

import co.com.choucair.rest.interactions.LastResponseBody;
import co.com.choucair.rest.questions.LastResponseStatusCode;
import co.com.choucair.rest.tasks.DeleteUserRest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.choucair.rest.utils.Constants.VALUE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class DeleteUserStepDefinitions {
    @Given("deletes a user with id {int}")
    public void deletesAUser(int id) {
        theActorInTheSpotlight().attemptsTo(DeleteUserRest.inReqres(id));
    }
    @Then("should see the status code is {int}")
    public void shouldSeeTheStatusCodeIs(Integer statusCode) {
        theActorInTheSpotlight().attemptsTo(LastResponseBody.is());
    }
}
