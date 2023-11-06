package com.example.practice_2.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

// Model class created

@Document(collection = "employees")
public class Employee {
    @Id
    private Integer employeeId;
    private String employeeName;
    private String email;

    // getters
    public Integer getEmployeeId() {
        return employeeId;
    }
    public String getEmployeeName() {
        return employeeName;
    }
    public String getEmail() {
        return email;
    }

    // setters

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }
    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // Constructors

    public Employee(Integer employeeId, String employeeName, String email) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
    }

    public Employee() {
    }
}
