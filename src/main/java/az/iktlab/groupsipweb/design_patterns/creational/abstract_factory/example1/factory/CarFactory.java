package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.factory;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Bmw;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Car;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.ECar;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Mercedes;

public class CarFactory implements AbstractFactory {

    @Override
    public Car getCar(ECar carModel) {
        if(carModel.equals(ECar.BMW))
            return new Bmw();
        else if (carModel.equals(ECar.MERCEDES))
            return new Mercedes();
        else
            return null;
    }
}
