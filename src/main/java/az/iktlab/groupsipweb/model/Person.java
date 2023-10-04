package az.iktlab.groupsipweb.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
//@NoArgsConstructor
@AllArgsConstructor
public class Person {

    public Person() {

        System.out.println("Person");
    }

    private Long id;
    private String name;
    private String surname;
    private int age;
}
