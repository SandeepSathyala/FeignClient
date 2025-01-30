package com.example.FeignClientRest.service;

import com.example.FeignClientRest.client.EmployeeClient;
import com.example.FeignClientRest.model.EmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeClient employeeClient;

    public EmployeeResponse getAllEmployees() {
        return employeeClient.getAllEmployees();
    }

    public EmployeeResponse.Employee getEmployeeById(Long id) {
        return employeeClient.getEmployeeById(id);
    }
}
