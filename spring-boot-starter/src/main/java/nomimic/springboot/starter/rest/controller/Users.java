package nomimic.springboot.starter.rest.controller;

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
    public List<String> getUsers() {
        List<String> users = new ArrayList<String>();

        users.add("KIM");
        users.add("LEE");
        return users;
    }
}
