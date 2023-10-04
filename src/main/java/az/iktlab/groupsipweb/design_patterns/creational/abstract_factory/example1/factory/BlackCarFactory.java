package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.factory;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.BlackBmw;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.BlackMercedes;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Car;
import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.ECar;

public class BlackCarFactory implements AbstractFactory {
    @Override
    public Car getCar(ECar carModel) {
        if(carModel.equals(ECar.BLACK_BMW))
            return new BlackBmw();
        else if (carModel.equals(ECar.BLACK_MERCEDES))
            return new BlackMercedes();
        else
            return null;
    }
}
