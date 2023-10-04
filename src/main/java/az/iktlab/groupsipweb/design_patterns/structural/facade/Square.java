package az.iktlab.groupsipweb.design_patterns.structural.facade;

public class Square implements Shape{
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
