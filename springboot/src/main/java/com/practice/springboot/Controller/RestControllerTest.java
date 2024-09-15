package com.practice.springboot.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//This is @controller + @responsebody
//It automatically does the serialization for http request
@RestController
//Here we are mapping every request which starts with this to this class
@RequestMapping("/hello/v2")
public class RestControllerTest {

    @RequestMapping( path = "/", method = RequestMethod.GET)
    public String sayHello(){
        return "Hello from version 2";
    }
}
