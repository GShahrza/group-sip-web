package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.factory.AbstractFactory;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.factory.FactoryProducer;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Car;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.ECar;

public class Main {
    public static void main(String[] args) {

        AbstractFactory blackAbstractFactory =  FactoryProducer.getFactory(true);


        Car blackBmw = blackAbstractFactory.getCar(ECar.BLACK_BMW);
        blackBmw.drive();

        AbstractFactory abstractFactory = FactoryProducer.getFactory(false);

        Car bmw = abstractFactory.getCar(ECar.BMW);
        bmw.drive();
    }
}
