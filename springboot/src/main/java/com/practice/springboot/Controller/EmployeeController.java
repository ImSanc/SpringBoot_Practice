package com.practice.springboot.Controller;

import com.practice.springboot.Entity.Employee;
import com.practice.springboot.Service.Employee1;
import com.practice.springboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping( value = "/employees")
public class EmployeeController {

    @Autowired
    Employee1 employee;

    @Autowired
    private EmployeeService employeeService;

    @GetMapping( path = "/fetchEmployee")
    public  String fetchEmploye() {
        employee.employeeHelperMethod();
        employee.employeeHelperMethod("sanchit",12);
        return "Employee fetched";
    }

    @PostMapping("/save")
    public Employee saveEmployee(@RequestBody Employee employee)
    {
       return employeeService.save(employee);
    }
}
