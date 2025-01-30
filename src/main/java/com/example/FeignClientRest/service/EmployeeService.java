package com.example.FeignClientRest.service;

import com.example.FeignClientRest.employeeClient.EmployeeClient;
import com.example.FeignClientRest.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    private final EmployeeClient employeeClient;

    public EmployeeService(EmployeeClient employeeClient) {
        this.employeeClient = employeeClient;
    }

    public List<Employee> getAllEmployees() {
        return employeeClient.getAllEmployees().getUsers();
    }

    public Employee getEmployeeById(Long id) {
        return employeeClient.getEmployeeById(id);
    }
}
