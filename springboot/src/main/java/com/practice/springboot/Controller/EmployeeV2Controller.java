package com.practice.springboot.Controller;

import com.practice.springboot.Entity.Employee;
import com.practice.springboot.Service.Employee1;
import com.practice.springboot.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping( value = "/v2/employees")
public class EmployeeV2Controller {

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

    @GetMapping("/get-employees")
    public List<Employee> getEmployee(){
        return employeeService.getEmployees();
    }

    @GetMapping("/get-employees/{id}")
    public Employee getEmployeeById(@PathVariable(value = "id") String employeeId){
        return employeeService.getEmployeeByID(employeeId);
    }

    @DeleteMapping("/remove-employee/{id}")
    public String removeEmployeeById(@PathVariable(value = "id") String employeeId){

        return employeeService.removeEmployeeById(employeeId);
    }
}
