package az.iktlab.groupsipweb.model;

import org.springframework.stereotype.Component;

@Component(value = "accountOne")
public class AccountOne extends Account{

    public AccountOne(){
        super(1L,"example","password");
    }
}
