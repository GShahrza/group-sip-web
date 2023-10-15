package az.iktlab.bookstore.example;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(name = "userFeignClient",url = "https://jsonplaceholder.org/users")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET,path = "/{id}")
    User getUser(@PathVariable Long id);
}
