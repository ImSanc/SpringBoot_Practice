package com.practice.springboot.Service;

import com.fasterxml.jackson.databind.util.BeanUtil;
import com.practice.springboot.DatEntity.EmployeeEntity;
import com.practice.springboot.Entity.Employee;
import com.practice.springboot.Error.EmployeeNotFoundException;
import com.practice.springboot.Repository.EmployeeRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

@Service
public class EmployeeV2Impl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Override
    public Employee save(Employee employee) {

        if(employee.getEmployeeId()==null ||
                employee.getEmployeeId().isEmpty() ){
            employee.setEmployeeId(UUID.randomUUID().toString());
        }

        EmployeeEntity entity = new EmployeeEntity();
        BeanUtils.copyProperties(employee,entity);
        employeeRepository.save(entity);
        return employee;
    }

    @Override
    public List<Employee> getEmployees() {
       var employeeEntityList = employeeRepository.findAll();
       var employeeList = employeeEntityList
               .stream()
               .map( employeeEntity -> {
                   Employee employee = new Employee();
                   BeanUtils.copyProperties(employeeEntity,employee);
                   return employee;
               } ).collect(Collectors.toList());

       return employeeList;
    }

    @Override
    public Employee getEmployeeByID(String employeeId) {
        var employeeEntity = employeeRepository.findById(employeeId);

        if(employeeEntity.isPresent())
        {
            Employee employee = new Employee();
            BeanUtils.copyProperties(employeeEntity.get(),employee);

            return employee;
        }

        throw new EmployeeNotFoundException("Employee with ID : "+employeeId+"doesn't exist");
    }

    @Override
    public String removeEmployeeById(String employeeId) {

        var employeeEntity = employeeRepository.findById(employeeId);

        if(employeeEntity.isPresent())
        {
            employeeRepository.delete(employeeEntity.get());
            return "Employee with ID : " + employeeId + " deleted";
        }

        throw new EmployeeNotFoundException("Employee with ID : "+employeeId+"doesn't exist");
    }
}
