package az.iktlab.groupsipweb.design_patterns.structural.facade;

public class Main {
    public static void main(String[] args) {

//        Shape circle = new Circle();
//        circle.draw();
//
//        Shape square = new Square();
//        square.draw();
//

        ShapeMaker sp = new ShapeMaker();

        sp.drawCircle();

        sp.drawSquare();
    }
}
