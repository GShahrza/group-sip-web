package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
