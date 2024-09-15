package com.practice.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello/v3")
public class RefinedMappingController {

    @GetMapping( path = "/")
    public String sayHello(){
        return "Hello from version 3";
    }
}
