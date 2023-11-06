package com.example.practice_2.service.Impl;

import com.example.practice_2.model.Employee;
import com.example.practice_2.repository.EmployeeRepository;
import com.example.practice_2.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImplementation implements EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    // return all entry
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    // return selected data
    public Optional<Employee> getEmployeeById(Integer id) {
        return employeeRepository.findById(id);
    }

    @Override
    // adding data
    public Employee createEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    @Override
    //updating data
    public Employee updateEmployee(Integer id, Employee employee) {
        Optional<Employee> existingEmployee = employeeRepository.findById(id);
        if(existingEmployee.isPresent()){
            employee.setEmployeeId(id);
            return employeeRepository.save(employee);
        }
        else{
            throw new RuntimeException("Exception not found with id: "+id);
        }
    }

    @Override
    // deleting data
    public void deleteEmployee(Integer id) {
        employeeRepository.deleteById(id);
    }
}
