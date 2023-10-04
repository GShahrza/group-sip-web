package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model;

public class RoundedSquare implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}
