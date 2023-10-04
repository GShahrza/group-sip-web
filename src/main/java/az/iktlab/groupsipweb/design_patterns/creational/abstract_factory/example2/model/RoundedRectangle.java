package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model;

public class RoundedRectangle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside RoundedRectangle::draw() method.");
    }
}
