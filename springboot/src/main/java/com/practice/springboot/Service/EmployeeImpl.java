package com.practice.springboot.Service;

import com.practice.springboot.Entity.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class EmployeeImpl implements EmployeeService{

    public List<Employee> employees = new ArrayList<>();

    public Employee save(Employee employee){

        if(employee.getEmployeeId()==null ||
                employee.getEmployeeId().isEmpty() ){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        employees.add(employee);

        return  employee;
    }
}
