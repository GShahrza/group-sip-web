package az.iktlab.groupsipweb.design_patterns.structural.proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyInternetImpl implements Internet{

    private Internet internetImpl;

    private static List<String> blockHosts;

    static {
        blockHosts = new ArrayList<>();
        blockHosts.add("abc.com");
        blockHosts.add("ab.com");
        blockHosts.add("abd.com");
    }

    {
        internetImpl = new InternetImpl();
    }


    @Override
    public void connectTo(String hostName) {
        if (blockHosts.contains(hostName)){
            System.out.println("Access denied");
        }
        else {
            internetImpl.connectTo(hostName);
        }
    }
}
