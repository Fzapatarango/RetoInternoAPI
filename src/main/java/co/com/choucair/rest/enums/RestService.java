package co.com.choucair.rest.enums;

public enum RestService {
    BASE_URL("https://dummy.restapiexample.com/api/v1"),
    GET_ALL_USER("/employees"),

    DELETE_USER("/delete/"),

    UPDATE_USER("/update/"),
    CREATE_USER("/create");


    private final String uri;

    RestService(String uri) {
        this.uri = uri;
    }

    @Override
    public String toString() {
        return uri;
    }
}

