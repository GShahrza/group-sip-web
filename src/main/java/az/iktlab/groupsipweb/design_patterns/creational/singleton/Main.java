package az.iktlab.groupsipweb.design_patterns.creational.singleton;

public class Main {
    public static void main(String[] args) {

        SingletonPattern one = SingletonPattern.getInstance();

        SingletonPattern two = SingletonPattern.getInstance();
    }
}
