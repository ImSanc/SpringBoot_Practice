package com.practice.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/param")
public class RequestParamController {

    @GetMapping(path = "/fetchUser")
    public String getUserDetails(@RequestParam (name = "firstname") String firstname ,
                                 @RequestParam (name = "lastname" , required = false)  String lastname){
        return "hello there "+firstname+ " "+ lastname;
    }
}
