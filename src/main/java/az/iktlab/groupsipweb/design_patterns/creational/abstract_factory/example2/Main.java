package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.factory.*;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.*;
public class Main {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory(false);

        Shape shape1 = shapeFactory.getShape("RECTANGLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();

        AbstractFactory roundedShapeFactory = FactoryProducer.getFactory(true);

        Shape roundedShape1 = roundedShapeFactory.getShape("RECTANGLE");
        roundedShape1.draw();

        Shape roundedShape2 = roundedShapeFactory.getShape("SQUARE");
        roundedShape2.draw();
    }
}
