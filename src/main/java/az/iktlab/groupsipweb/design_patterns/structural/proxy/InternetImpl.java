package az.iktlab.groupsipweb.design_patterns.structural.proxy;

public class InternetImpl implements Internet{
    @Override
    public void connectTo(String hostName) {
        System.out.println("connect to : " + hostName);
    }
}
