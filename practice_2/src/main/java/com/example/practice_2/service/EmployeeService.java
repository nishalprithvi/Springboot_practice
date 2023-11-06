package com.example.practice_2.service;

import com.example.practice_2.model.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(Integer id);
    Employee createEmployee(Employee employee);
    Employee updateEmployee(Integer id,Employee employee);
    void deleteEmployee(Integer id);
}
