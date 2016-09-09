package nomimic.springboot.starter.rest.controller;

import nomimic.springboot.starter.rest.message.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Lucas Yonghee Lee on 2016. 9. 7..
 */
@RestController
public class Users {

    @GetMapping(name = "/api/users")
    public List<User> getUsers() {
        List<User> users = new ArrayList<User>();

        users.add(new User("KIM",10));
        users.add(new User("LEE",10));

        return users;
    }
}
