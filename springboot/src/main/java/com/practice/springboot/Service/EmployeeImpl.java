package com.practice.springboot.Service;

import com.practice.springboot.Entity.Employee;
import com.practice.springboot.Error.EmployeeNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.UUID;

@Service
public class EmployeeImpl implements EmployeeService{

    public List<Employee> employees = new ArrayList<>();

    @Override
    public Employee save(Employee employee){

        if(employee.getEmployeeId()==null ||
                employee.getEmployeeId().isEmpty() ){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        employees.add(employee);

        return  employee;
    }

    @Override
    public List<Employee> getEmployees(){
        return employees;
    }

    @Override
    public Employee getEmployeeByID(String employeeId) {

        if( !employeeId.isEmpty() ){
           var employee = employees.stream().filter(t->t.getEmployeeId().equals(employeeId)).findFirst();

           if(employee.isPresent()){
               return employee.get();
           }
        }

        throw  new EmployeeNotFoundException("Employee not found with ID : "+ employeeId);
    }

    @Override
    public String removeEmployeeById(String employeeId) {

        boolean employeeRemoved = employees.removeIf( employee -> employee.getEmployeeId().equals(employeeId));

        if( employeeRemoved ){
            return "Employee "+ employeeId + " has been removed";
        }
        throw  new EmployeeNotFoundException("Employee not found with ID : "+ employeeId);    }
}
