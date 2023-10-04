package az.iktlab.groupsipweb.design_patterns.creational.builder;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Student {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String address;
    private int age;

//    public Student(StudentBuilder studentBuilder){
//        this.id = studentBuilder.
//    }

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}
