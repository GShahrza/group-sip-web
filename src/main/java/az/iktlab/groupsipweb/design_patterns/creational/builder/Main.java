package az.iktlab.groupsipweb.design_patterns.creational.builder;

public class Main {
    public static void main(String[] args) {

        Student studentOne = new Student();
        studentOne.setId(1L);
        studentOne.setAge(20);
        studentOne.setFirstName("StudentOne");
        studentOne.setLastName("StudentSurnameOne");
        studentOne.setUsername("student");
        studentOne.setPassword("12345");
        studentOne.setAddress("Baku");

        Student studentTwo = Student
                .builder()
                .id(2L)
                .firstName("StudentTwo")
                .build();

        System.out.println(studentTwo);


    }
}
