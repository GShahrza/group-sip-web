package az.iktlab.groupsipweb.design_patterns.creational.factory.example2;

public class CarFactory  {

    public static Car getCar(ECar carModel) {
        if(carModel.equals(ECar.BMW))
            return new Bmw();
        else if (carModel.equals(ECar.MERCEDES))
            return new Mercedes();
        else
            return null;
    }
}
