package com.practice.springboot.Service;

import org.springframework.stereotype.Service;

@Service
public class Employee1 {

    public void employeeHelperMethod() {
        System.out.println("Employee constructor");
    }

    public void employeeHelperMethod(String name , Integer id) {
        System.out.println("Employee constructor :"+name +" - "+id);
    }
}
