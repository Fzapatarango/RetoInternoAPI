package co.com.choucair.rest.stepdefinitions.hooks;

import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.rest.abilities.CallAnApi;

import static co.com.choucair.rest.enums.RestService.BASE_URL;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;

public class BeforeHook {
    @Before
    public void prepareStage(){
        OnStage.setTheStage(new OnlineCast());
        theActorCalled("brandon").whoCan(CallAnApi.at(BASE_URL.toString()));
    }

}
