package com.practice.springboot.Controller;

import com.practice.springboot.Entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping("/get-user")
    public User getUser(){
        User user = new User();

        user.setEmail("sanchit@gmail.com");
        user.setId("1");
        user.setName("Sanchit mishra");

        return user;
    }
}
