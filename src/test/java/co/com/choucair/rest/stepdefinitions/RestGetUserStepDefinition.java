package co.com.choucair.rest.stepdefinitions;

import co.com.choucair.rest.interactions.LastResponseBody;
import co.com.choucair.rest.tasks.GetUserRest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RestGetUserStepDefinition {

    @When("gets the users")
    public void getsTheUsers() {
        theActorInTheSpotlight().attemptsTo(GetUserRest.inReqres());
    }

    @Then("I should see the users")
    public void iShouldSeeTheUsers() {
        theActorInTheSpotlight().attemptsTo(LastResponseBody.is());
        //  theActorInTheSpotlight().should(seeThat(LastResponseStatusCode.is(200)));
    }
}
