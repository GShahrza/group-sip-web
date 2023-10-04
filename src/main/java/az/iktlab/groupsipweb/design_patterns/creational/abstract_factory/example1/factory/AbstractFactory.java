package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.factory;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Car;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.ECar;

public interface AbstractFactory {

    Car getCar(ECar carModel);
}
