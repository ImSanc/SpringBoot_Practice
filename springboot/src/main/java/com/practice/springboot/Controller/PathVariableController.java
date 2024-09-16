package com.practice.springboot.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/path")
public class PathVariableController {

    @GetMapping(path = "/variable/{name}")
    public String getUserId(@PathVariable (value = "name") String firstName){
        return  "user id "+firstName;
    }
}
