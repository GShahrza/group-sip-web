package az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model;

import az.iktlab.groupsipweb.design_patterns.creational.abstract_factory.example1.model.Car;

public class Mercedes extends Car {

    @Override
    public void drive(){
        System.out.println("Mercedes is driving");
    }
}
