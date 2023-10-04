package az.iktlab.groupsipweb;

import az.iktlab.groupsipweb.model.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GroupSipWebApplication  {


    public static void main(String[] args) {
        SpringApplication.run(GroupSipWebApplication.class, args);
    }

}
