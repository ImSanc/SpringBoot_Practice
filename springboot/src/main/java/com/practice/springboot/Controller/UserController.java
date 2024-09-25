package com.practice.springboot.Controller;

import com.practice.springboot.Entity.User;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/get-user-details/{id}")
    public User getUserById(@PathVariable( value = "id") String userId){
        User user = new User();

        user.setEmail("sanchit@gmail.com");
        user.setId(userId);
        user.setName("Sanchit mishra");

        return user;
    }

    @GetMapping("/request-user")
    public User getRequestParamFromUser( @RequestParam(value = "name") String username,
                                         @RequestParam(value = "email", required = false) String email){
        User user = new User();

        user.setEmail(email);
        user.setId("1");
        user.setName(username);

        return user;
    }
}
