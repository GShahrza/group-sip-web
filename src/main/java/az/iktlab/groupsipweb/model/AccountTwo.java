package az.iktlab.groupsipweb.model;

import org.springframework.stereotype.Component;

@Component(value = "accountTwo")
public class AccountTwo extends Account{

    public AccountTwo(){
        super(2L,"example2","password2");
    }
}
