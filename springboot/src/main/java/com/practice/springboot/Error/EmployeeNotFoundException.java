package com.practice.springboot.Error;

import com.practice.springboot.Entity.Employee;

public class EmployeeNotFoundException extends RuntimeException{

    public EmployeeNotFoundException(String message){
        super(message);
    }
}
