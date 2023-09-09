package com.docker.example;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserController {
    @GetMapping(path = "users")
    public List<User> helloWorld() {
        var userList = new ArrayList<User>();
        userList.add(new User("ahmed","15"));
        userList.add(new User("nader","16"));
        userList.add(new User("alaa","17"));
        userList.add(new User("yousef","18"));
        return userList;
    }

    record User(String name , String age){}
}
