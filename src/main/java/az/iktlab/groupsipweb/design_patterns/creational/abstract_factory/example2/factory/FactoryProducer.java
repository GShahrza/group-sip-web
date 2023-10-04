package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example2.factory;

public class FactoryProducer {

    public static AbstractFactory getFactory(boolean rounded){
        if(rounded){
            return new RoundedShapeFactory();
        }
        else {
            return new ShapeFactory();
        }
    }
}
