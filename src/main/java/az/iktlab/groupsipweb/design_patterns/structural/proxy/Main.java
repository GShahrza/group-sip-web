package az.iktlab.groupsipweb.design_patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {

        Internet internet = new ProxyInternetImpl();

        internet.connectTo("example.com");
        internet.connectTo("abc.com");

    }
}
