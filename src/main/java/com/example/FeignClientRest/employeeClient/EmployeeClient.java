package com.example.FeignClientRest.employeeClient;

import com.example.FeignClientRest.model.Employee;
import com.example.FeignClientRest.response.EmployeeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "employeeClient", url = "https://dummyjson.com")
public interface EmployeeClient {

    @GetMapping("/users")
    EmployeeResponse getAllEmployees();

    @GetMapping("/users/{id}")
    Employee getEmployeeById(@PathVariable("id") Long id);
}
