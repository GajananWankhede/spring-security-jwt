package com.med.jwt.service.controller;

import com.med.jwt.service.entity.User;
import com.med.jwt.service.services.UserService;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("med-jwt-service")
public class UserController {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void initRoleAndUser() {
        userService.initRoleAndUser();
    }

    @PostMapping("/createNewUser")
    public User createNewUser(@RequestBody User user){
        return userService.registerNewUser(user);
    }

    @PostMapping("/forAdmin")
    public String forAdmin(){
        return "this url is only accessible to admin";
    }

    @PostMapping("forUser")
    public String forUser(){
        return "this url is only accessible to user";
    }
}
