package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.factory;


import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.model.Shape;

public abstract class AbstractFactory {
    public abstract Shape getShape(String shapeType);
}
