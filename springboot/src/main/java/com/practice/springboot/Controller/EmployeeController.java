package com.practice.springboot.Controller;

import com.practice.springboot.Service.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( value = "/api/")
public class EmployeeController {

    @Autowired
    Employee employee;

    @GetMapping( path = "/fetchEmployee")
    public  String fetchEmploye() {
        employee.employeeHelperMethod();
        employee.employeeHelperMethod("sanchit",12);
        return "Employee fetched";
    }
}
