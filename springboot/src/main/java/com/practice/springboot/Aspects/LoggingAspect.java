package com.practice.springboot.Aspects;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {

    @Before("@within(org.springframework.stereotype.Service)")
    public void beforeMethod() {
        System.out.println("inside the Aspect @within");
    }

    @Before("@annotation(org.springframework.web.bind.annotation.GetMapping)")
    public void beforeMethod3() {
        System.out.println("inside the Aspect @annotation");
    }

    @Before("args(String,int)")
    public void beforeMethod2() {
        System.out.println(" inside beforeMethod aspect args");
    }
}
