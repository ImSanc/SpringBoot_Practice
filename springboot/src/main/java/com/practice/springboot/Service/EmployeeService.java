package com.practice.springboot.Service;

import com.practice.springboot.Entity.Employee;

import java.util.List;

public interface EmployeeService {

    Employee save(Employee employee);

    List<Employee> getEmployees();
}
