package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.factory;


public class FactoryProducer {

    public static AbstractFactory getFactory(boolean isBlack){
        if(isBlack){
            return new BlackCarFactory();
        }
        else {
            return new CarFactory();
        }
    }
}
