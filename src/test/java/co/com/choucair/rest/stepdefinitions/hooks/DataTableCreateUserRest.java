package co.com.choucair.rest.stepdefinitions.hooks;

import co.com.choucair.rest.models.ModelCreateUserRest;
import io.cucumber.java.DataTableType;

import java.util.Map;

public class DataTableCreateUserRest {

    @DataTableType
    public static ModelCreateUserRest transformToMoDelCreateUserRest(Map<String, String> map) {
        return new ModelCreateUserRest(map.get("name"), map.get("salary"), map.get("age"), map.get("id"));
    }
}
