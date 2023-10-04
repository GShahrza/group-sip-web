package az.iktlab.groupsipweb.design_patterns.creational.builder;

public class StudentBuilder {

    private Long id;
    private String firstName;
    private String lastName;
    private String username;
    private String password;
    private String address;
    private int age;

    public StudentBuilder id(Long id){
        this.id = id;
        return this;
    }

    public StudentBuilder firstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder lastName(String lastName){
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder username(String username){
        this.username = username;
        return this;
    }

    public StudentBuilder password(String password){
        this.password = password;
        return this;
    }

    public StudentBuilder address(String address){
        this.address = address;
        return this;
    }

    public StudentBuilder firstName(int age){
        this.age = age;
        return this;
    }

    public Student build(){
        return new Student(this.id,this.firstName,this.lastName,this.username,
                this.password,this.address,this.age);
    }
}
