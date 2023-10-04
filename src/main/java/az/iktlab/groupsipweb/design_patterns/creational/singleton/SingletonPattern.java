package az.iktlab.groupsipweb.design_patterns.creational.singleton;

public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern(){
        System.out.println("created object");
    }

    public  static SingletonPattern getInstance(){
        if (instance == null) {
            synchronized (SingletonPattern.class){
                if (instance == null){
                    instance = new SingletonPattern();
                }
            }
        }
        return instance;
    }

    public void check(){
        System.out.println("run");
    }
}
