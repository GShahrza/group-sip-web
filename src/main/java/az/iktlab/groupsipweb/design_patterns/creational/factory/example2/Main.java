package az.iktlab.groupsipweb.design_patterns.creational.factory.example2;

public class Main {
    public static void main(String[] args) {
        Car bmw = CarFactory.getCar(ECar.BMW);
        bmw.drive();

        Car mercedes = CarFactory.getCar(ECar.MERCEDES);
        mercedes.drive();


    }
}
