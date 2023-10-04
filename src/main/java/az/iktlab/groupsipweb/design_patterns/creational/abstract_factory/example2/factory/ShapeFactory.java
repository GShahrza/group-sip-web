package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.factory;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.Rectangle;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.Shape;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.Square;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}
