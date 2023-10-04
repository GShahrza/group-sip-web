package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.factory;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.RoundedRectangle;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.RoundedSquare;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.Shape;

public class RoundedShapeFactory extends AbstractFactory{
    @Override
    public Shape getShape(String shapeType) {
        if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new RoundedRectangle();
        }
        else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new RoundedSquare();
        }
        return null;
    }
}
