package com.example.practice_2.repository;

import com.example.practice_2.model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface EmployeeRepository extends MongoRepository<Employee,Integer> {
}
