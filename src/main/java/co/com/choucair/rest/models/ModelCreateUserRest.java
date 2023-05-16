package co.com.choucair.rest.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ModelCreateUserRest {
    private String name;
    private String salary;

    private String age;

    private String id;

    @Override
    public String toString() {
        return "{" +
                "\"name\":" + '\"' + name + '\"' +
                ",\"salary\":" + '\"' + salary + '\"' +
                ",\"age\":" + '\"' + age + '\"' +
                '}';
    }
}
