package com.practice.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    //This will return a view name which will fail
    @RequestMapping("/hello")
    public String sayHello(){
        return "hello";
    }

    //if we want to use this then we have to attach response body to let springBoot know that is serialized http response
    @RequestMapping("/hello2")
    @ResponseBody
    public String sayHello2(){
        return "hello";
    }
}
